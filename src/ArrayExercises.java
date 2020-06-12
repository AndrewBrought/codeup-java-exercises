import java.util.Arrays;


public class ArrayExercises {


    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,4};
        System.out.println(Arrays.toString(numbers));

        Person[] newPerson = new Person[3];
        newPerson[0] = new Person("James");
        newPerson[1] = new Person("Thomas");
        newPerson[2] = new Person("Michelle");
//        newPerson[0].setName("James");
//        newPerson[1].setName("Thomas");
//        newPerson[2].setName("Michelle");
        System.out.println(newPerson[0].getName());
        System.out.println(newPerson[1].getName());
        System.out.println(newPerson[2].getName());
        String[] people = {"Person1", "Person2", "Person3"};

        System.out.println(Arrays.toString(Person.peopleCopy(people, "Taylor")));





    }



}

