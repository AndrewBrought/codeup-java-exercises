public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    private static void toUpperCase() {
    }
    public static void shoutDishName(String Dish){
        System.out.print("\n" + Dish.toUpperCase());
    }

    public static void analyzeDishCost(int dish){
        if(dish < AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("Less expensive than average");
        } else{
            System.out.println("More expensive than average");
        }
    }

    public static void flipRecommendation(boolean dish){
        if(!dish){
            System.out.println(dish);
        } else{
            System.out.println(!dish);
        }
    }


}
