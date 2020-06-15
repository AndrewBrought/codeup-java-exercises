package inheritanceLecture.VehicleExercise;

public class Vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public Vehicle(){

    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource){
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public boolean getIsOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        this.isOperable = operable;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void turnOn() {
        System.out.println("Vehicle is turning on...");
    }

        public String vehicleToString() {
            return "Operational: " + this.isOperable + "\nPassengerCapacity: " + this.passengerCapacity + "\nSource of Power: " + this.powerSource;
        }


    @Override
    public String toString() {
        return "Vehicle{" +
                "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource + '\'' +
                '}';
    }
}
