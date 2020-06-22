package grades;

import util.Input;

import java.util.HashMap;

public class SophiesGradesApplication {
    static HashMap<String,SophiesStudent> students = new HashMap<>();
    static Input input = new Input();

    public static void studentList(){
        for (String username : students.keySet()) {
            System.out.println(username);
        }
        System.out.println();
    }
    public static void viewIndividualStudent(){
        String studentKey = input.getString("Which student would you like more info on?");

        if(students.containsKey(studentKey)){
            System.out.println("Name" + students.get(studentKey).getName() + " - GitHub Username: " + studentKey);
            System.out.printf("Current Average: %.2f\n", students.get(studentKey).getGradeAverage());
            System.out.println("All grades: " + students.get(studentKey).getGrades());
            System.out.println("Attendance Percentage: " + students.get(studentKey).attendancePercentage());
        }else{
            System.out.println("Sorry, no student found with the GitHub username of \"" + studentKey + "\"");
        }
    }

    public static void viewAllGrades(){
        for(String username : students.keySet()){
            System.out.println(username + " : " + students.get(username).getGrades());
        }
    }

    public static void viewClassAverage(){
        double sumOfAverages = 0;
        for(String username : students.keySet()){
            sumOfAverages += students.get(username).getGradeAverage();
        }
        System.out.printf("%.2f\n",sumOfAverages / students.size());
    }

    public static void viewReport(){
        System.out.println("name,github_username,average");
        for(String username : students.keySet()){
            System.out.printf("%s,%s,%.2f\n",students.get(username).getName(), username, students.get(username).getGradeAverage());
        }
    }
    public static void gradesApp(){
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        studentList();

        boolean keepAsking = true;
        do{
            System.out.println("Please view the following options: ");
            System.out.println("1 - Choose a student for more information.");
            System.out.println("2 - View all grades for all students");
            System.out.println("3 - View overall class average");
            System.out.println("4 - View a CSV report of all students");
            System.out.println("5 - Exit");

            System.out.println("What would you like to do? Please enter a number from 1-4");
            int userInput = input.getInt();
            input.getString();

            switch(userInput){
                case 1:
                    viewIndividualStudent();
                    System.out.println("Would you like to continue?");
                    keepAsking = input.yesNo();
                    break;
                case 2:
                    viewAllGrades();
                    System.out.println("Would you like to continue?");
                    keepAsking = input.yesNo();
                    break;
                case 3:
                    viewClassAverage();
                    System.out.println("Would you like to continue?");
                    keepAsking = input.yesNo();
                    break;
                case 4:
                    viewReport();
                    System.out.println("Would you like to continue?");
                    keepAsking = input.yesNo();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    keepAsking = false;
            }
        }while(keepAsking);
        System.out.println("Thanks for using the Grades Application!");
    }
    public static void main(String[] args) {

        SophiesStudent louise = new SophiesStudent("Louise");
        louise.addGrade(100);
        louise.addGrade(98);
        louise.addGrade(100);
        louise.recordAttendance("2020-06-18", "A");
        louise.recordAttendance("2020-06-19", "P");
        louise.recordAttendance("2020-06-20", "P");
        louise.recordAttendance("2020-06-21", "P");
        louise.recordAttendance("2020-06-22", "P");

        SophiesStudent tina = new SophiesStudent("Tina");
        tina.addGrade(80);
        tina.addGrade(75);
        tina.addGrade(70);

        SophiesStudent gene = new SophiesStudent("Gene");
        gene.addGrade(70);
        gene.addGrade(75);
        gene.addGrade(90);

        System.out.println(louise.getGradeAverage());
        System.out.println(tina.getGradeAverage());
        System.out.println(gene.getGradeAverage());

        students.put("bunnyears", louise);
        students.put("zombieslayer", tina);
        students.put("musicalchairs", gene);

        System.out.println(students);

//        Start of the CLI
        gradesApp();
    }
}