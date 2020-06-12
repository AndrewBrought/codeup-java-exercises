import java.util.Arrays;


public class ArrayExercises {

    public static Person[] addPerson(Person[] people, Person person){
        Person[] oneMorePerson = Arrays.copyOf(people, people.length + 1);
        oneMorePerson[people.length - 1] = person;
        return oneMorePerson;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,4};
        System.out.println(Arrays.toString(numbers));

//        Person[] newPerson = new Person[3];
//        newPerson[0] = new Person("James");
//        newPerson[1] = new Person("Thomas");
//        newPerson[2] = new Person("Michelle");
//
////        newPerson[0].setName("James");
////        newPerson[1].setName("Thomas");
////        newPerson[2].setName("Michelle");
//        System.out.println(newPerson[0].getName());
//        System.out.println(newPerson[1].getName());
//        System.out.println(newPerson[2].getName());
//        String[] people = {"Person1", "Person2", "Person3"};
//
//        System.out.println(Arrays.toString(Person.peopleCopy(people, "Taylor")));


//        ======= Sophie Walkthrough ======

        Person[] people = new Person[3];
        people[0] = new Person("Justin");
        people[1] = new Person("Sophie");
        people[2] = new Person("David");

        people = addPerson(people, new Person("Vivian"));
        for(Person instructor: people){
            System.out.println(instructor.getName());
        }









    }



}

