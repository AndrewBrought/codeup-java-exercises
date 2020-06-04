import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        //================
//        Create a class named Bob with a main method for the following exercise.
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.


        System.out.println(" Welcome, to Bob:\n      \\\\\\\\\\\\      \n" +
                                            "        *   *       \n" +
                                            "      |    _\\         \n" +
                                            "       \\     =  ...yo   \n" +
                                            "         \\__ "

        );


            System.out.print("You may say \"bye\" anytime you wish to leave...\n");
            System.out.println("Talk to Bob...");

            Scanner sc = new Scanner(System.in);
            String answer = "";
            boolean greeting;

        do {
              answer = sc.next();
              greeting = (!answer.equals("bye"));

            if (answer.endsWith("?")) {
                System.out.println("Bob says: \"Sure.\"");
            } else if (answer.endsWith("!")) {
                System.out.println("Bob says: \"Whoa, chill out!\"");
            } else if (answer.equals("")) {
                System.out.println("Bob says: \"Fine. Be that way!\"");
            } else {
                System.out.println("Bob says: \"...whatever\"");
            }

       }while(greeting);

//         =========== Sophie's Solution ===========
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");  //instantiate scanner
//        System.out.println("If you want to talk to Bob, say hi!"); //prompt to participate
//
//        String userInput;
//        boolean greeting;
//
//        do{
//            userInput = sc.next(); //Once the program starts, that's when we ask for user input
//            greeting = (!userInput.equals("bye")); //This allows us to keep going until we say a keyword.  If the input is not equal to "bye" the program will continue
//
//            if (userInput.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (userInput.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if(userInput.equals("")){
//                System.out.println("Fine, be that way!");
//            } else{
//                System.out.println("Whatever.");
//            }
//
//        }while(greeting);





    }
}

