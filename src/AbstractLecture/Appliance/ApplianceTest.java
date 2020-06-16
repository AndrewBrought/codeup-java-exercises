package AbstractLecture.Appliance;

public class ApplianceTest {

    public static void main(String[] args) {
        Appliance myF= new Refrigerator("GE", "Silver");
        Appliance myB = new Blender("Hamilton Beach", "black");
        Appliance myC = new CoffeeMaker("Mr. Coffee", "black");

        System.out.println(myF.getBrand() + " " + myF.getColor());
        myF.doWork();
        myF.makeSound();

        System.out.println(myB.getBrand() + " " + myB.getColor());
        myB.doWork();
        myB.makeSound();

        System.out.println(myC.getBrand() + " " + myC.getColor());
        myC.doWork();
        myC.makeSound();






    }
}
