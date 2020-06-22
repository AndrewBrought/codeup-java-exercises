package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private static HashMap<String, String> attendance;


    public Student(){  //???
        this.name = "no name";
        this.grades = new ArrayList<>();
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }


//
//    public void setAttendance(HashMap<String, String> attendance) {
//        Student.attendance = attendance;
//    }

    ////    public static void recordAttendance(String date, String value){
////        attendance.put(date, value);
////    }
//
//    public HashMap<String, String> getAttendance() {
//        return attendance;
//    }


//    public ArrayList<Integer> getGrades() {
//        return grades;
//    }


 // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int grade : grades){
             total += grade;
    }
        double average = (double) total/grades.size();
        return average;
    }

    //Keep cleaning from this point...

////    private double calculateAverage(List <Integer> marks) {
////        Integer sum = 0;
////        if(!marks.isEmpty()) {
////            for (Integer mark : marks) {
////                sum += mark;
////            }
////            return sum.doubleValue() / marks.size();
////        }
////        return sum;
////    }
//
////    public void getKeyAndValue(HashMap<String, Student> students){
////        for (Map.Entry mapElement : students.entrySet()) {
////            String key = (String) mapElement.getKey();
////            Student value = ((Student) mapElement.getValue());
////            System.out.println(key + ", " + value.getName() + ", " + value.getGradeAverage());
////        }
////    }
//
//    public static void main(String[] args) {
//
////        ArrayList<Integer> grade1 = new ArrayList<>();
////        System.out.println(grade1.add(50));
////        System.out.println(grade1.add(100));
////        System.out.println(grade1.add(100));
////        System.out.println(grade1.size());
////
//////        Student dude = new Student("Dude", grade1);
////        System.out.println(dude.getGradeAverage());
//
//        recordAttendance(getDate(), "a");
//
//
//
//    }
//
}
