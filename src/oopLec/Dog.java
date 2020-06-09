package oopLec;

public class Dog {

    public String name;
    public String breed;
    public final String animalType = "Canine"; //final is how we create a const in java
    public int age;
    public boolean canBreed;

    public void callForDog(String name) {
        if(name.equalsIgnoreCase(this.name)){
            System.out.println(this.name + " is now walking toward you!");
        } else {
            System.out.println(this.name + " ignores you.");
        }
    }
}
