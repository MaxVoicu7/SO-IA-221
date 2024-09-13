import ingredients.Ingredients;
import moldavianCuisine.MoldovanCuisineServiceImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Option: ");
            System.out.println("1. Moldovan Cuisine");
            System.out.println("2. Italian Cuisine");
            System.out.println("3. Available ingredients");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = myObj.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Recipes from Moldovan cuisine \n");
                        MoldovanCuisineServiceImpl recipe1 = new MoldovanCuisineServiceImpl();
                        System.out.println("1. " + recipe1.cheeseAndHerbPies());

                        MoldovanCuisineServiceImpl recipe2 = new MoldovanCuisineServiceImpl();
                        System.out.println("2. " + recipe2.chickenSoupWithHomemadeNoodles());

                        MoldovanCuisineServiceImpl recipe3 = new MoldovanCuisineServiceImpl();
                        System.out.println("3. " + recipe3.polentaWithCheeseAndSourCream());

                        MoldovanCuisineServiceImpl recipe4 = new MoldovanCuisineServiceImpl();
                        System.out.println("4. " + recipe4.stuffedCabbageRolls());

                        System.out.print("Do you want to return to the main menu? (yes/no): ");
                        String response = myObj.next();
                        if (response.equalsIgnoreCase("yes")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("Italian Cuisine recipes will be displayed here.");
                        // Adaugă ingredientele pentru bucătăria italiană aici

                        System.out.print("Do you want to return to the main menu? (yes/no): ");
                        String response = myObj.next();
                        if (response.equalsIgnoreCase("yes")) {
                            break;
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        Ingredients availableIngredients = new Ingredients();
                        System.out.println(availableIngredients.SpicesAndHerbs());
                        System.out.println(availableIngredients.OilAndFats());
                        System.out.println(availableIngredients.BasicStaples());
                        System.out.println(availableIngredients.VegetablesAndFruits());
                        System.out.println(availableIngredients.CannedGoodsAndPantryStaples());
                        System.out.println(availableIngredients.LiquidSeasoningsAndCondiments());
                        System.out.println(availableIngredients.Proteins());

                        System.out.print("Do you want to return to the main menu? (yes/no): ");
                        String response = myObj.next();
                        if (response.equalsIgnoreCase("yes")) {
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    myObj.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
                    break;
            }
        }
    }
}
