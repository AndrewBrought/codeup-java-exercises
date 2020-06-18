package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

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

        HashMap<Student, String> students = new HashMap<>();
        students.put(MaryCatherine, "mCatheter");
        students.put(JeffLebowski, "dudeAbides62");
        students.put(IssacNewton, "noRelation42");
        students.put(DevonSlade, "dSlade82");
        students.put(JohnWick, "thatJohnW");



        Input in = new Input();
        boolean loop;
        do {
          String input = in.getString();

          System.out.println("Welcome!");
          System.out.println("Here are the GitHub usernames of our students: ");

          System.out.println("|" + students.get(MaryCatherine) + "|  " + "|" + students.get(JeffLebowski) + "|  " + "|" + students.get(IssacNewton) + "|  " + "|" + students.get(DevonSlade) + "|  " + "|" + students.get(JohnWick) + "|");

          System.out.println("What student would you like to see more information on?");

          if(students.containsValue(input)){
              System.out.println("Name: " + students.get(input) + " - GitHub username: " + input + "\nCurrent Average: " + students.containsKey(input));

          }

          loop = in.yesNo();

      }while (loop);

    }
}
