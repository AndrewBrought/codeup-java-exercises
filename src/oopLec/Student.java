package oopLec;

public class Student {


    public String name;
    public String cohort;

//    ctrl + enter -brings up generate menu to generate different constructors and more

//    If you only need the empty constructor you don't need to instantiate anything in the class

    public Student() { //allows us to create an object that doesn't take arguments
        //if you dont' add a constructor, there is still a constructor, it's just empty
    }

//    public Student(String name){
//        this.name = name;
//    }
//
//    public Student(String name, String cohort) {
//        this.name = name;
//        this.cohort = cohort;
//    }

//     ===== Here we're using a constructor to fill in the info of another constructor =====
    public Student(String name){
        this(name, "Unassigned");
    }

    public Student(String name, String cohort){
        this.name = name;
        this.cohort = cohort;
    }


}
