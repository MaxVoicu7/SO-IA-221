package ItalianCuisine;

import ingredients.Ingredients;

public class ItalianCuisineServiceImpl extends Ingredients implements ItalianCuisineService {

    @Override
    public String lasagna() {
        setProteins("ground beef, ricotta cheese");
        setBasicStaples("lasagna sheets, eggs, flour");
        setVegetablesAndFruits("tomatoes, onions, garlic");
        setOilAndFats("olive oil");
        setSpicesAndHerbs("basil, oregano");

        return "Lasagna: Cook " + getProteins() + " with " + getVegetablesAndFruits() + ". Layer " +
                getBasicStaples() + " with the meat mixture, top with cheese, and bake.";
    }


    @Override
    public String pizzaMargherita() {
        setBasicStaples("pizza dough");
        setVegetablesAndFruits("tomatoes");
        setProteins("mozzarella cheese");
        setSpicesAndHerbs("basil");
        setOilAndFats("olive oil");

        return "Pizza Margherita: Spread " + getVegetablesAndFruits() + " on " + getBasicStaples() +
                ", top with " + getProteins() + " and " + getSpicesAndHerbs() +
                ". Drizzle with " + getOilAndFats() + " and bake.";
    }

    @Override
    public String risotto() {
        setBasicStaples("arborio rice");
        setProteins("parmesan cheese");
        setVegetablesAndFruits("mushrooms, onions, garlic");
        setOilAndFats("olive oil");
        setLiquidSeasoningsAndCondiments("vegetable broth");

        return "Risotto: Cook " + getBasicStaples() + " in " + getLiquidSeasoningsAndCondiments() +
                ", sauté " + getVegetablesAndFruits() + " in " + getOilAndFats() + ", and mix in with " + getProteins() + ".";
    }

    @Override
    public String spaghettiAglioEOlio() {
        setBasicStaples("spaghetti");
        setOilAndFats("olive oil");
        setSpicesAndHerbs("garlic, red pepper flakes");
        setVegetablesAndFruits("parsley");

        return "Spaghetti Aglio e Olio: Cook " + getBasicStaples() + " in boiling water. Sauté " + getSpicesAndHerbs() + " in " +
                getOilAndFats() + ", then toss with " + getBasicStaples() + " and finish with " + getVegetablesAndFruits() + ".";
    }


    @Override
    public String penneAllaArrabbiata() {
        setBasicStaples("penne");
        setCannedGoodsAndPantryStaples("canned tomatoes");
        setOilAndFats("olive oil");
        setSpicesAndHerbs("garlic, red pepper flakes");
        setVegetablesAndFruits("parsley");

        return "Penne alla Arrabbiata: Cook " + getBasicStaples() + " in boiling water. Prepare a sauce with " + getCannedGoodsAndPantryStaples() +
                ", sautéed with " + getSpicesAndHerbs() + " in " + getOilAndFats() + ". Toss with cooked " + getBasicStaples() + " and garnish with " +
                getVegetablesAndFruits() + ".";
    }

    @Override
    public String frittata() {
        setBasicStaples("eggs");
        setVegetablesAndFruits("tomatoes, bell peppers, onions");
        setOilAndFats("olive oil");
        setProteins("cheese (optional)");
        setSpicesAndHerbs("salt, pepper");

        return "Frittata: Whisk " + getBasicStaples() + " with " + getSpicesAndHerbs() + ". Sauté " + getVegetablesAndFruits() +
                " in " + getOilAndFats() + ", then pour in the egg mixture. Cook until set and add " + getProteins() + " if desired.";
    }

}
