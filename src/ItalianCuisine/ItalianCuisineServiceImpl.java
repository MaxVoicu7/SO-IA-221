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
}
