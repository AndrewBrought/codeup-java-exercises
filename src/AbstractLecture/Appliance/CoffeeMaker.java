package AbstractLecture.Appliance;

public class CoffeeMaker extends Appliance{

    public CoffeeMaker(String color, String brand){
        super(color, brand);
    }

    @Override
    public void makeSound() {
        System.out.println("Girgle, girgle...");
    }

    @Override
    public void doWork() {
        System.out.println("Making your coffee!");
    }
}
