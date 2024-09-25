package src;

import src.forme.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;

    public Main() {
        frame = new JFrame("Figuri Geometrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(2, 2));

        // Buton Patrat
        JButton btnPatrat = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Apelăm metoda super pentru a desena corect fundalul
                // Asigurăm că fundalul este desenat
                g.setColor(Color.GREEN); // Setăm culoarea pentru desenarea formei
                g.drawRect(50, 50, 100, 100); // Desenează un pătrat
            }
        };

        btnPatrat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaPatrat();
            }
        });

        // Buton Dreptunghi
        JButton btnDreptunghi = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Apelăm metoda super pentru a desena corect fundalul
                setOpaque(true);
                g.setColor(Color.BLUE);
                g.drawRect(30, 50, 140, 80); // Desenează un dreptunghi
            }
        };

        btnDreptunghi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaDreptunghi();
            }
        });

        // Buton Cerc
        JButton btnCerc = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Apelăm metoda super pentru a desena corect fundalul
                setOpaque(true);
                g.setColor(Color.RED);
                g.drawOval(50, 50, 100, 100); // Desenează un cerc
            }
        };

        btnCerc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaCerc();
            }
        });

        // Buton Triunghi
        JButton btnTriunghi = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Apelăm metoda super pentru a desena corect fundalul
                setOpaque(true);
                g.setColor(Color.black);
                int[] xPoints = {75, 125, 100};
                int[] yPoints = {100, 100, 50};
                g.drawPolygon(xPoints, yPoints, 3); // Desenează un triunghi
            }
        };

        btnTriunghi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaTriunghi();
            }
        });

        // Adăugare butoane în fereastră
        frame.add(btnPatrat);
        frame.add(btnDreptunghi);
        frame.add(btnCerc);
        frame.add(btnTriunghi);

        frame.setVisible(true);
    }
    // Metoda pentru adăugare și calculare date pentru Patrat
    private void adaugaPatrat() {
        String input = JOptionPane.showInputDialog("Introdu lungimea laturii patratului:");
        double latura = Double.parseDouble(input);
        Patrat patrat = new Patrat(latura);
        JOptionPane.showMessageDialog(frame, "Suprafata: " + patrat.calculeazaSuprafata() +
                "\nPerimetrul: " + patrat.calculeazaPerimetru());
    }

    // Metoda pentru Dreptunghi
    private void adaugaDreptunghi() {
        String lungime = JOptionPane.showInputDialog("Introdu lungimea dreptunghiului:");
        String latime = JOptionPane.showInputDialog("Introdu latimea dreptunghiului:");
        double lungimeDreptunghi = Double.parseDouble(lungime);
        double latimeDreptunghi = Double.parseDouble(latime);
        Dreptunghi dreptunghi = new Dreptunghi(lungimeDreptunghi, latimeDreptunghi);
        JOptionPane.showMessageDialog(frame, "Suprafata: " + dreptunghi.calculeazaSuprafata() +
                "\nPerimetrul: " + dreptunghi.calculeazaPerimetru());
    }

    // Metoda pentru Cerc
    private void adaugaCerc() {
        String input = JOptionPane.showInputDialog("Introdu raza cercului:");
        double raza = Double.parseDouble(input);
        Cerc cerc = new Cerc(raza);
        JOptionPane.showMessageDialog(frame, "Suprafata: " + cerc.calculeazaSuprafata() +
                "\nPerimetrul: " + cerc.calculeazaPerimetru());
    }

    // Metoda pentru Triunghi
    private void adaugaTriunghi() {
        String baza = JOptionPane.showInputDialog("Introdu baza triunghiului:");
        String inaltime = JOptionPane.showInputDialog("Introdu inaltimea triunghiului:");
        String l1 = JOptionPane.showInputDialog("Introdu prima latura a triunghiului:");
        String l2 = JOptionPane.showInputDialog("Introdu a doua latura a triunghiului:");
        String l3 = JOptionPane.showInputDialog("Introdu a treia latura a triunghiului:");
        double bazaTriunghi = Double.parseDouble(baza);
        double inaltimeTriunghi = Double.parseDouble(inaltime);
        double latura1 = Double.parseDouble(l1);
        double latura2 = Double.parseDouble(l2);
        double latura3 = Double.parseDouble(l3);
        Triunghi triunghi = new Triunghi(bazaTriunghi, inaltimeTriunghi, latura1, latura2, latura3);
        JOptionPane.showMessageDialog(frame, "Suprafata: " + triunghi.calculeazaSuprafata() +
                "\nPerimetrul: " + triunghi.calculeazaPerimetru());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}