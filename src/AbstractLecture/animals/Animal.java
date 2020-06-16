package AbstractLecture.animals;

abstract class Animal {

    int age;
    String habitat;
    String species;

    public void sayHello(){
        System.out.println("You greet the animal");
    }


    public abstract void eat();
    public abstract void sleep();



}
