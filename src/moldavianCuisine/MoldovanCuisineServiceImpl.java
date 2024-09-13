package moldavianCuisine;

import ingredients.Ingredients;

public class MoldovanCuisineServiceImpl extends Ingredients implements MoldovanCuisineService {

    @Override
    public String cheeseAndHerbPies() {
        setProteins("cottage cheese");
        setSpicesAndHerbs("dill, parsley");
        setOilAndFats("sunflower oil");
        setBasicStaples("flour, eggs");

        return "Cheese and Herb Pies: Mix " + getProteins() + " with " + getSpicesAndHerbs() +
                ". Prepare the dough using " + getBasicStaples() + " and fry in " + getOilAndFats() + ".";
    }

    @Override
    public String chickenSoupWithHomemadeNoodles() {
        setProteins("chicken");
        setVegetablesAndFruits("carrots, onion, celery");
        setBasicStaples("eggs, flour (for noodles)");

        return "Chicken Soup with Homemade Noodles: Cook the " + getProteins() +
                " with " + getVegetablesAndFruits() + ". Make noodles from " + getBasicStaples() +
                " and add them to the soup.";
    }

    @Override
    public String polentaWithCheeseAndSourCream() {
        setBasicStaples("cornmeal");
        setProteins("cheese");
        setLiquidSeasoningsAndCondiments("sour cream");

        return "Polenta with Cheese and Sour Cream: Cook the " + getBasicStaples() +
                " to make polenta, then serve with " + getProteins() + " and " + getLiquidSeasoningsAndCondiments() + ".";
    }

    @Override
    public String stuffedCabbageRolls() {
        setProteins("minced meat");
        setVegetablesAndFruits("cabbage, onion");
        setBasicStaples("rice");
        setSpicesAndHerbs("pepper, thyme");

        return "Stuffed Cabbage Rolls: Mix " + getProteins() + " with " + getBasicStaples() +
                ", " + getVegetablesAndFruits() + ", and season with " + getSpicesAndHerbs() +
                ". Roll the mixture in cabbage leaves and cook.";
    }
}
