package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class SophiesStudent {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String,String> attendance = new HashMap<>();

    public SophiesStudent(){
        this.name = "no name";
        this.grades = new ArrayList<>();
    }
    public SophiesStudent(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for(int grade : grades){
            total += grade;
        }

        double average = (double) total/grades.size();
        return average;
    }

    public String getGrades(){
        StringBuilder str = new StringBuilder();
        for(int grade : grades){
            str.append(grade + ",");
        }
        return str.toString();
    }

    public void recordAttendance(String date, String value){
        if(value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")){
            attendance.put(date,value);
        }else{
            System.out.println("Please either enter P - Present, or A - Absent.");
        }
    }

    public void getAttendance(){
        System.out.println(attendance);
    }

    public double attendancePercentage(){
        int days = 0;
        int absences = 0;
        for(String date : attendance.keySet()){
            if(attendance.get(date).equalsIgnoreCase("P")){
                days++;
            }else{
                absences++;
            }
        }

        double average = (double)(days - absences)/days * 100;
        return average;
    }

    public static void main(String[] args) {
        SophiesStudent sophie = new SophiesStudent("sophie");
        sophie.addGrade(100);
        sophie.addGrade(70);
        System.out.println(sophie.getGradeAverage());

        sophie.recordAttendance("2020-06-18", "A");
        sophie.getAttendance();
        sophie.recordAttendance("2020-06-19", "P");
        sophie.recordAttendance("2020-06-20", "P");
        sophie.recordAttendance("2020-06-21", "P");
        sophie.recordAttendance("2020-06-22", "P");
        sophie.getAttendance();
        System.out.println(sophie.attendancePercentage());

    }
}