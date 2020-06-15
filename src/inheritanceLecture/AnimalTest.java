package inheritanceLecture;

public class AnimalTest {

    public static void makeAnimalsNoisy(Animal[] animals) {
        for (Animal a : animals) {
            a.makeNoise();
        }
    }

    public static void main(String[] args) {
//        Animal a = new Animal();
//        Dog d = new Dog();
//        Cat c = new Cat();
//        a.setAge(3);
//        a.setSpecies("Primate");
//
//        d.setAge(7);
//        d.setSpecies("Canine");
//
//        c.setAge(2);
//        c.setSpecies("Feline");
//
//
//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();
//        System.out.println(a.toString());
//        System.out.println("===============");
//        System.out.println(d.toString());
//        System.out.println("===============");
//        System.out.println(c.toString());


//        Dog d = new Dog();
//        d.setSpecies("Canine");
//        d.setAge(3);
//        d.setBreed("Pug");


//        System.out.println(d.makeNoise(4));
//        d.makeGenericAnimalNoise();
//        System.out.println(d.toString());

//        Animal a = new Animal();
//        a.setSpecies("Primate");
//        a.setAge(100);
//        a.makeNoise();

        Dog d3 = new Dog(
                "Canine",
                4,
                "Doberman",
                "Lance",
                "Dude"
        );

        Cat c = new Cat("Feline", 7, 9);

        // Creating an array to hold any object that extends from type animal
        Animal[] animals = new Animal[2];
        animals[0] = d3; //assign dog obj
        animals[1] = c; // assign cat obj

//        d3.makeNoise();
//        c.makeNoise();
//
//        d3.protectedProp();

//        animals[0].fetchBall();
//        example of casting to use a subtype specific field
        Dog dog = (Dog) animals[0];
        dog.fetchBall();

        makeAnimalsNoisy(animals); // calling a method that uses array of animals

// collection type called ArrayList -

    }

}
