package inheritanceLecture;

 public class Dog extends Animal {

     private String breed;
     private String name;
     private String nameOfOwner;

     //order of parameters matters when referencing the super constructor
     public Dog(String species, int age, String breed, String name, String nameOfOwner){
         super(species, age);
         this.breed = breed;
         this.name = name;
         this.nameOfOwner = nameOfOwner;
     }

     public void protectedProp(){
         System.out.println(protectedProp);
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getNameOfOwner() {
         return nameOfOwner;
     }

     public void setNameOfOwner(String nameOfOwner) {
         this.nameOfOwner = nameOfOwner;
     }

     public String getBreed() {
         return breed;
     }

     public void setBreed(String breed) {
         this.breed = breed;
     }

//     unique method to the Dog class
     public void fetchBall() {
         System.out.println("Dog is fetching ball...");
     }

     // When we change the parameters but keep the method name and return type the same - we using method overloading
public void makeNoise(String noise){
    System.out.println(noise);
}

     //Overriding makeNoise method - this is overriding because the method is the exact same as the parent 'makeNoise' method
     public void makeNoise(){
         System.out.println("Bark, Bark, Bark!!");
     }

     //because of overloading we can leave both open to be called
     //Ex:   This is a valid method overload because the parameters are unique...
     public int makeNoise(int x){
         return x;
     }

     public void makeGenericAnimalNoise() {
         super.makeNoise();
     }

     @Override
     public String toString() {
         return "Dog{" +
                 "species = '" + this.getSpecies() + '\'' +
                 ", age = " + this.getAge()  +
                 ", breed = '" + breed + '\'' +
                 '}';
     }


//     @Override
//     public String toString() {
//         return "Dog{" +
//                 "breed='" + breed + '\'' +
//                 "} " + super.toString();
//     }
 }