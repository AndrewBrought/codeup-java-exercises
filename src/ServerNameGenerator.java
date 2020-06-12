import java.util.Random;

public class ServerNameGenerator {


//    String[] adjectivesList = {"Fast", "beautiful", "sleeveless", "edible", "meaningless", "breakable", "incredible", "gorgeous", "smelly", "adorable"};
//
//    String[] nounsList = {"tiger", "bear", "shelf", "feather", "computer", "teacher", "chair", "glass", "book", "pencil"};
//
//    int adjLength = adjectivesList.length;
//    int nounsLength = nounsList.length;
//
//    int rand1 = (int) (Math.random() * adjLength);
//    int rand2 = (int) (Math.random() * nounsLength);
//
    //    public static String nameGenerator(){
//        return = "Your new server name is : adjectivesList[rand1] + "-" + nounsList[rand2];
//        System.out.println(generator); //this prints the outcome
//        return generator; //this completes the method by returning the value of our variable...
//    }

//    =====Sophie's Walkthrough ========
    public static String[] adjectives = {"funny", "pink",
"groovy", "sharp", "short", "bouncy", "happy", "tall", "nice", "sleeveless"};

    public static String[] nouns = {"dog", "cat", "virus", "computer", "duck", "chair", "book", "exterminator", "desk", "IDE"};

    static Random randomizer = new Random();

    public static String randomElement(String[] words){
        return words[randomizer.nextInt(words.length)];
    }

    public static String serverName(String a, String b){
        return "Your new server name is: " + a + " -- " + b;
    }

    public static void main(String[] args) {

//        nameGenerator();

        System.out.println(serverName(randomElement(adjectives),randomElement(nouns)));
        System.out.println(serverName(randomElement(adjectives),randomElement(nouns)));
        System.out.println(serverName(randomElement(adjectives),randomElement(nouns)));


    }

}
