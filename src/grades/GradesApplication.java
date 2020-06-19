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

//        Refactor this as a method that can be used over and over
//        for (Map.Entry mapElement : students.entrySet()) {
//            String key = (String) mapElement.getKey();
//            Student value = ((Student) mapElement.getValue());
//        }

        Input in = new Input();
        Input response = new Input();
        boolean loop;


        do {
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students: ");

//          Second way of displaying user keys
            System.out.println(keyset);

//                System.out.println("|" + key + "|  ");


            System.out.print("1 - view all student grades\n" +
                    "2 - look up specific student\n" +
                    "3 - print csv report\n");

            int keyR = response.getInt();

            if (keyR == 1) {
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
//                System.out.println("\n");
            } else if (keyR == 2) {

                System.out.println("What student would you like to see more information on?");
                String input = in.getString();

                if (students.containsKey(input)) {
                    Student student = students.get(input);
                    System.out.println("Name: " + student.getName() + " - GitHub username: " + input + "\nGrades: " + student.getGrades() + "\nCurrent Average: " + student.getGradeAverage());

                } else {
                    System.out.println("Sorry, no student found with the GitHub username of: \"" + input + "\"");
                }

            } else if (keyR == 3) {
                System.out.println("Name, github_username, average");
//                for (Map.Entry mapElement : students.entrySet()) {
//                    String key = (String) mapElement.getKey();
//                    Student value = ((Student) mapElement.getValue());
//                    Student student = value;
//                }

                //Check this
                getKeyAndValue(students);



            }
                System.out.println("Would you like to continue?");
                loop = in.yesNo();

        }while (loop);
        System.out.println("Goodbye, have a wonderful day!");

        }

    private static void getKeyAndValue(HashMap<String, Student> students) {
    }
}
