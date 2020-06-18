package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }


    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grades : grades){
                sum += grades;
            }
            return sum.doubleValue() / grades.size();
         }
        return sum;
    }

//    private double calculateAverage(List <Integer> marks) {
//        Integer sum = 0;
//        if(!marks.isEmpty()) {
//            for (Integer mark : marks) {
//                sum += mark;
//            }
//            return sum.doubleValue() / marks.size();
//        }
//        return sum;
//    }


    public static void main(String[] args) {

        ArrayList<Integer> grade1 = new ArrayList<>();
        System.out.println(grade1.add(50));
        System.out.println(grade1.add(100));
        System.out.println(grade1.add(100));
        System.out.println(grade1.size());

        Student dude = new Student("Dude", grade1);
        System.out.println(dude.getGradeAverage());


    }

}
