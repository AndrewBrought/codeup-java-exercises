package inheritanceLecture;

public class Cat extends Animal {

    private int noOfLivesLeft;

    public Cat(String species, int age, int noOfLivesLeft){
        super(species, age);
        this.noOfLivesLeft = noOfLivesLeft;
    }

    //this will also work as a reference to the super constructor
//    public Cat(){
//        super("feline", 4);
//    }


    public int getNoOfLivesLeft() {
        return noOfLivesLeft;
    }

    public void setNoOfLivesLeft(int noOfLivesLeft) {
        this.noOfLivesLeft = noOfLivesLeft;
    }

   @Override
    public void makeNoise() {
       System.out.println("Meow, meow!!");
    }
}
