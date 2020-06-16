package AbstractLecture.Appliance;

public class Refrigerator extends Appliance{

    public Refrigerator(String color, String brand){
        super(color, brand);
    }

    @Override
    public void makeSound() {
        System.out.println("**Silence: If you can hear me, there's a problem...");
    }

    @Override
    public void doWork() {
        System.out.println("Keeping groceries cool!");
    }

//    @Override
//    public String toString() {
//        return "Refrigerator: " + brand + "  " + color
//    }
}
