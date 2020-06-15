package inheritanceLecture;

public class Animal {

    private String species;
    private int age;
    protected String protectedProp = "Protected Prop Value";

    public Animal(){

    }

    public Animal(String species, int age) {
       this.species = species;
       this.age = age;
    }

    public void makeNoise(){
        System.out.println("This animal is making some noise...");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Animal a = new Animal("Primate", 7);


//    public String printSummary() {
//    return "Species: " + this.species + "\nAge: " + this.age;
//
//    public String toString() {
//            return "Species: " + this.species + "\nAge: " + this.age;
//        }



    }

}
