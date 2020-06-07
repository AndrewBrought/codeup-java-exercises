public class phraseOMatic {
    public static void main(String[] args){

//        Three sets of words to choose from
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic", "magnanimous", "epic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core-competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

//        Find out how many words in each list:
        int oneLength = wordListOne.length;
//        System.out.println(oneLength);
        int twoLength = wordListTwo.length;
//        System.out.println(twoLength);
        int threeLength = wordListThree.length;
//        System.out.println(threeLength);


//        Generate three random numbers:
        //The math.random method returns a random number between 0 and not quite-1, so we have to multiply it by the array length in the list we're using. We have to force the result to be an integer so we have to put in a cast
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

//        npw build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);

    }
}
