package AbstractLecture.Appliance;

public class Blender extends Appliance{

    public Blender(String color, String brand){
        super(color, brand);
    }

    @Override
    public void makeSound() {
        System.out.println("BUZZZZZZZZ!!!");
    }

    @Override
    public void doWork() {
        System.out.println("Blending food!");
    }
}
