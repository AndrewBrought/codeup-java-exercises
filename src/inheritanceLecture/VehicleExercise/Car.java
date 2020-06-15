package inheritanceLecture.VehicleExercise;

import inheritanceLecture.VehicleExercise.Vehicle;

public class Car extends Vehicle {

    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon){
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon){
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon(){
        return milesPerGallon;
    }

    public void deployAirBag(){
        System.out.println("Deploying airbag...");
    }

    public void turnOn(){
        System.out.println("Cranking engine...");
    }

    public void genericTurnOn(){
        super.turnOn();
    }

            public String carToString() {
            return "Car: \n" + super.vehicleToString() + " " + "\nMilesPerGallon: " + milesPerGallon + "\n========================";
        }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                "} " + super.toString();
    }
}
