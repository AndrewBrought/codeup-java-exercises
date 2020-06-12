public class ServerNameGenerator {

    public static String nameGenerator(){
    String[] adjectivesList = {"Fast", "beautiful", "sleeveless", "edible", "meaningless", "breakable", "incredible", "gorgeous", "smelly", "adorable"};

    String[] nounsList = {"tiger", "bear", "shelf", "feather", "computer", "teacher", "chair", "glass", "book", "pencil"};

    int adjLength = adjectivesList.length;
    int nounsLength = nounsList.length;

    int rand1 = (int) (Math.random() * adjLength);
    int rand2 = (int) (Math.random() * nounsLength);

        String generator = adjectivesList[rand1] + "-" + nounsList[rand2];
        System.out.println(generator); //this prints the outcome
        return generator; //this completes the method by returning the value of our variable...
    }

    public static void main(String[] args) {
        nameGenerator();
    }

}
