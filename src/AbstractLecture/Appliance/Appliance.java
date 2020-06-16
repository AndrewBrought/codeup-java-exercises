package AbstractLecture.Appliance;

abstract class Appliance {
        private String brand;
        private String color;

        public Appliance(){

        }

        public Appliance(String brand, String color){
            this.brand = brand;
            this.color = color;
        }

        public void setBrand(String brand){
            this.brand = brand;
        }

        public String getBrand(){
            return brand;
        }

        public void setColor(String color){
            this.color = color;
        }

        public String getColor(){
            return color;
        }

        public abstract void makeSound();
        public abstract void doWork();

//        public abstract String toString();

//      - package-private brand;
//    - package-private color;
//    - an empty constructor and a constructor that sets the properties.
//            - getters and setters for properties.
//    - an abstract method named makeSound() - when implemented, prints the sound the appliance makes
//    - an abstract method named doWork()- when implemented, prints what the appliance does

}
