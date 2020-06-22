import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
//    nio allows for asynchronus path call
//    using this path to check for existence of src directory
    Path myDirectory = Paths.get("src"); //returns true
//    using  this path to check for a file called info.txt in a file called data
//    we separate the arguments so that java will search for a specific target from a given location without having to get specific as this changes from different OS
    Path myFile = Paths.get("data","info.txt");  //returns false
    Path bobFile = Paths.get("Bob.java");

    //In order to use Files.exist we have to pass an object Path into it...That's we we create them and then pass the Object name as the argument for Files.exist

    public static void main(String[] args) throws IOException {
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("data","info.txt");
        Path bobFile = Paths.get("Bob.java"); //returns false because it only checks the path defined
        Path bobFileT = Paths.get("src","Bob.java"); //returns true
        Path gitignore = Paths.get( ".gitignore");

//        System.out.println(Files.exists(myDirectory));
//        System.out.println(Files.exists(bobFile));
//        System.out.println(Files.exists(bobFileT));
//        System.out.println(Files.exists(gitignore));


        String directory = "test";
        Path myTest = Paths.get( directory);
        Path helloFile = Paths.get(directory, "hello.txt");

        if(Files.notExists(myTest)){
            try {
                Files.createDirectory(myTest);
                System.out.println("File created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(Files.notExists(helloFile)){
            try {
                Files.createFile(helloFile);
                System.out.println("File created...");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    String directory2 = "test2";
        Path myTest2 = Paths.get(directory2);
        Path helloFile2 = Paths.get(directory2, "hello2.txt");

        if(Files.notExists(myTest2)){
            try {
                Files.createDirectory(myTest2);
                System.out.println("File myTest2 has been created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(Files.notExists(helloFile2)){
            try {
                Files.createFile(helloFile2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        Writing to hello.txt
        String[] names = {"justin", "sophie", "vivian"};
        List<String> instructors = Arrays.asList(names);
//        instructors.add("casey"); // Arrays.asList turns an array into an arraylist (rather creates an arraylist of an existing array).
//        List<String> students = new ArrayList<>();
//        students.add("Laura");
//        students.add("Andrew");
//        students.add("Mark");
//        students.add("Aaron");
//        students.add("Jay");
//        try {
        //overwrites everything
//            Files.write(helloFile,students);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//ReadAllLines is assuming we don't know what's in the list...this is redundant because we have it above, this assumes we didn't create the list or update ourselves...
//        try {
//            List<String> myStudents = Files.readAllLines(helloFile);
////            System.out.println(myStudents);
//    for(String student : myStudents){
//        System.out.println(student);
//    }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


            List<String> myStudents = Files.readAllLines(helloFile);
//            System.out.println(myStudents);
            for(String student : myStudents){
                System.out.println(student);
            }


//        String newStudent = "Ramon";
        List<String> newStudents = Arrays.asList("Ramon", "Justin", "Augustine");
        try {
            Files.write(helloFile,newStudents, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

       List<String> newClass = new ArrayList<>();

        for(String student: myStudents){
            if(student.equals("Justin")){
                newClass.add("Shelby");
                continue;
            }
            newClass.add(student);
        }

        Files.write(helloFile,newClass);
        System.out.println(newClass);


    }

}
