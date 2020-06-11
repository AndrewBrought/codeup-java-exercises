package util;
import java.util.Scanner;

//scanner is set to private because there isn't any reason the rest of code needs to access it (power supply) - it's internal.
//Think of this as one tool that has a lot of different things it can do...or behaviors. Therefore it is not static it is an instance
public class Input {


    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return sc.nextLine();
    }

    public boolean yesNo() {
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else{
            return false;
        }
    }


    public int getInt(int min, int max) {
        boolean state = false;
        int userInput;
        do {
            userInput = sc.nextInt();
            if (userInput <= max && userInput >= min) {
                state = true;
            } else{
                System.out.println("You entered a wrong number, please enter a valid number: ");
            }
        } while (!state);
        System.out.println("Thanks for a valid number!");
        return userInput;
    }

//    public int getInt(){
//        int userInput = sc.nextInt();
//        return userInput;
//    }

    public double getDouble(double min, double max){
        boolean state = false;
        double userInput;
        do{
            userInput = sc.nextDouble();
            if(userInput <= max && userInput >= min){
                state = true;
            } else{
                System.out.println("You entered an invalid input, please enter a decimal: ");
            }
        }while(!state);
            System.out.println("Thanks for a valid decimal!");
            return userInput;
    }

//    public double getDouble(){
//        double userInput = sc.nextDouble();
//        return userInput;
//    }

//        This is what triggers the program AND this is where we tell them it's ended
//        "separation of concerns"





}
