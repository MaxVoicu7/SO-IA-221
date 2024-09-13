package ingredients;

public class Ingredients {

    public String spicesAndHerbs;
    public String oilAndFats;
    public String basicStaples;
    public String vegetablesAndFruits;
    public String cannedGoodsAndPantryStaples;
    public String liquidSeasoningsAndCondiments;
    public String proteins;

    public String getSpicesAndHerbs() {
        return spicesAndHerbs;
    }

    public void setSpicesAndHerbs(String spicesAndHerbs) {
        this.spicesAndHerbs = spicesAndHerbs;
    }

    public String getOilAndFats() {
        return oilAndFats;
    }

    public void setOilAndFats(String oilAndFats) {
        this.oilAndFats = oilAndFats;
    }

    public String getBasicStaples() {
        return basicStaples;
    }

    public void setBasicStaples(String basicStaples) {
        this.basicStaples = basicStaples;
    }

    public String getVegetablesAndFruits() {
        return vegetablesAndFruits;
    }

    public void setVegetablesAndFruits(String vegetablesAndFruits) {
        this.vegetablesAndFruits = vegetablesAndFruits;
    }

    public String getCannedGoodsAndPantryStaples() {
        return cannedGoodsAndPantryStaples;
    }

    public void setCannedGoodsAndPantryStaples(String cannedGoodsAndPantryStaples) {
        this.cannedGoodsAndPantryStaples = cannedGoodsAndPantryStaples;
    }

    public String getLiquidSeasoningsAndCondiments() {
        return liquidSeasoningsAndCondiments;
    }

    public void setLiquidSeasoningsAndCondiments(String liquidSeasoningsAndCondiments) {
        this.liquidSeasoningsAndCondiments = liquidSeasoningsAndCondiments;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public String SpicesAndHerbs(){
        setSpicesAndHerbs("Black pepper,Black pepper ,Thyme, Basil, Oregano,Paprika, Turmeric, Coriander, Rosemary, Garlic powder ");
        return "Spice and herbs: " + getSpicesAndHerbs();
    }

    public  String OilAndFats(){
        setOilAndFats("Olive oil, Canola oil, Butter, Coconut oil, Avocado oil");
        return "Oil and Fats: " + getOilAndFats();
    }

    public  String BasicStaples(){
        setBasicStaples("Salt, Sugar, Flour, Rice, Pasta, Baking soda, Baking powder");
        return "Basic Staples: " + getBasicStaples();
    }
    public  String VegetablesAndFruits(){
        setVegetablesAndFruits("Tomatoes, Carrots, Potatoes, Onions, Bell peppers, Apples, Bananas, Lemons");
        return "Vegetables And Fruits: " + getVegetablesAndFruits();
    }
    public  String CannedGoodsAndPantryStaples(){
        setCannedGoodsAndPantryStaples("Canned tomatoes, Canned beans, Canned tuna, Canned peas, Olives");
        return "Canned Goods And Pantry Staples" + getCannedGoodsAndPantryStaples();
    }
    public  String LiquidSeasoningsAndCondiments(){
        setLiquidSeasoningsAndCondiments("Soy sauce, Balsamic vinegar, Mustard, Ketchup, Worcestershire sauce");
        return "Liquid Seasonings And Condiments" + getLiquidSeasoningsAndCondiments();
    }
    public  String Proteins(){
        setProteins("Chicken, Beef, Fish, Eggs, Tofu, Chickpeas, Lentils");
        return "Proteins: " + getProteins();
    }

}
