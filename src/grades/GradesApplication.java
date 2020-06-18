package grades;

import util.Input;

import java.util.*;


public class GradesApplication {

    public static void main(String[] args) {



        ArrayList<Integer> marysGrades = new ArrayList<>();
        marysGrades.add(88);
        marysGrades.add(96);
        marysGrades.add(100);
        marysGrades.add(92);
        marysGrades.add(100);

        Student MaryCatherine = new Student("Mary Catherine", marysGrades);
        System.out.println(MaryCatherine.getGradeAverage());

        ArrayList<Integer> jeffsGrades = new ArrayList<>();
        jeffsGrades.add(94);
        jeffsGrades.add(98);
        jeffsGrades.add(86);
        jeffsGrades.add(88);
        jeffsGrades.add(92);

        Student JeffLebowski = new Student("Jeff Lebowski", jeffsGrades);
        System.out.println(JeffLebowski.getGradeAverage());

        ArrayList<Integer> issacsGrades = new ArrayList<>();
        issacsGrades.add(100);
        issacsGrades.add(100);
        issacsGrades.add(88);
        issacsGrades.add(96);
        issacsGrades.add(94);

        Student IssacNewton = new Student("Issac Newton", issacsGrades);
        System.out.println(IssacNewton.getGradeAverage());

        ArrayList<Integer> devonsGrades = new ArrayList<>();
        devonsGrades.add(78);
        devonsGrades.add(86);
        devonsGrades.add(89);
        devonsGrades.add(72);
        devonsGrades.add(75);

        Student DevonSlade = new Student("Devon Slade", devonsGrades);
        System.out.println(DevonSlade.getGradeAverage());

        ArrayList<Integer> johnsGrades = new ArrayList<>();
        johnsGrades.add(96);
        johnsGrades.add(92);
        johnsGrades.add(99);
        johnsGrades.add(88);
        johnsGrades.add(91);

        Student JohnWick = new Student("John Wick", johnsGrades);
        System.out.println(JohnWick.getGradeAverage());
//        System.out.println(JohnWick.getGrades());

        HashMap<String, Student> students = new HashMap<>();
        students.put("mCatheter", MaryCatherine);
        students.put("dudeAbides62", JeffLebowski);
        students.put("noRelation42", IssacNewton);
        students.put("dSlade82", DevonSlade);
        students.put("thatJohnW", JohnWick);
//        JohnWick.getName();
        Set keyset = students.keySet();



        Input in = new Input();
        boolean loop;

        do {
          System.out.println("Welcome!");
          System.out.println("Here are the GitHub usernames of our students: ");

          System.out.println(keyset);

            System.out.printf("1 - view all student grades\n" +
                              "2 - look up specific student\n");

            int key = in.getInt();
            if(key == 1){
                System.out.println("Student Grades:");
                System.out.println("Mary Catherine: " + marysGrades);
                System.out.println("Mary's Average: " + MaryCatherine.getGradeAverage());
                System.out.println("Jeff Lebowski: " + jeffsGrades);
                System.out.println("Jeff's Average: " + JeffLebowski.getGradeAverage());
                System.out.println("Issac Newton: " + issacsGrades);
                System.out.println("Issac's Average: " + IssacNewton.getGradeAverage());
                System.out.println("Devon Slade: " + devonsGrades);
                System.out.println("Devon's Average: " + DevonSlade.getGradeAverage());
                System.out.println("John Wick: " + johnsGrades);
                System.out.println("John's Average: " + JohnWick.getGradeAverage());
                System.out.println("\n");
            } else if(key == 2) {

                System.out.println("What student would you like to see more information on?");

                String input = in.getString();

                if (students.containsKey(input)) {
                    Student student = students.get(input);
                    System.out.println("Name: " + student.getName() + " - GitHub username: " + input + "\nCurrent Average: " + student.getGrades() + "\n" + student.getGradeAverage());
                } else {
                    System.out.println("Sorry, no student found with the GitHub username of: \"" + input + "\"");
                }
            }

            System.out.println("Would you like to continue?");

            loop = in.yesNo();

      }while (loop);
        System.out.println("Goodbye, have a wonderful day!");
    }
}
