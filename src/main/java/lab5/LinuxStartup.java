import java.io.*;
import java.util.Locale;

public class AutoStart {

    public static void main(String[] args) {
        try {
            String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
            if (args.length > 0 && args[0].equals("--startup")) {
                // Programul a fost pornit automat
                System.out.println("Hello World!");
            } else {
                // Configurăm pornirea automată și repornim sistemul
                setupAutostart(os);
                restartSystem(os);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setupAutostart(String os) throws IOException {
        String appPath = new File(AutoStart.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getAbsolutePath();
        if (os.contains("win")) {
            setupWindowsRegistry(appPath);
        } else if (os.contains("nux")) {
            setupLinuxService(appPath);
        } else {
            System.out.println("Sistemul de operare nu este suportat!");
        }
    }

    private static void setupWindowsRegistry(String appPath) {
        String batFilePath = System.getProperty("user.home") + "\\AppData\\Roaming\\start_cmd.bat";

        String batContent = """
                @echo off
                java -jar "%s" --startup
                """.formatted(appPath);

        String registryCommand = "reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run /v MyCmdApp /t REG_SZ /d \"" + batFilePath + "\" /f";

        try {
            FileWriter fileWriter = new FileWriter(batFilePath);
            fileWriter.write(batContent);
            fileWriter.close();

            Process process = new ProcessBuilder("cmd.exe", "/c", registryCommand).start();
            process.waitFor();

            System.out.println("Programul a fost adăugat la autostart în Windows.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Eroare la configurarea autostart-ului în Windows: " + e.getMessage());
        }
    }

    private static void setupLinuxService(String appPath) throws IOException {
        String serviceFilePath = "/etc/systemd/system/AutoStartApp.service";
        String serviceContent =
                "[Unit]\n" +
                "Description=Auto Start App\n" +
                "After=multi-user.target\n\n" +
                "[Service]\n" +
                "ExecStart=/usr/bin/java -jar " + appPath + " --startup\n" +
                "Restart=on-failure\n" +
                "RestartSec=10\n" +
                "User=" + System.getProperty("user.name") + "\n\n" +
                "[Install]\n" +
                "WantedBy=multi-user.target\n";

        try (FileWriter writer = new FileWriter(serviceFilePath)) {
            writer.write(serviceContent);
        }

        Process chmodProcess = Runtime.getRuntime().exec("sudo chmod 644 " + serviceFilePath);
        try {
            chmodProcess.waitFor();
        } catch (InterruptedException e) {
            throw new IOException("A apărut o problemă la schimbarea permisiunilor fișierului .service.", e);
        }

        Process enableProcess = Runtime.getRuntime().exec("sudo systemctl enable AutoStartApp.service");
        try {
            enableProcess.waitFor();
            System.out.println("Autostart configurat cu systemd pentru Linux.");
        } catch (InterruptedException e) {
            throw new IOException("A apărut o problemă la activarea serviciului pe Linux.", e);
        }
    }

    private static void restartSystem(String os) throws IOException {
        if (os.contains("win")) {
            Runtime.getRuntime().exec("shutdown -r -t 0");
        } else if (os.contains("nux")) {
            Runtime.getRuntime().exec("sudo reboot");
        } else {
            System.out.println("Sistemul de operare nu suportă comanda de restart!");
        }
    }
}
