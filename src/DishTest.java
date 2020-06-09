public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.setCostInCents(1100);
        dish1.setNameOfDish("10 pc. Cajun Wings");
        dish1.setWouldRecommend(true);

        dish1.printSummary();

    }
}
