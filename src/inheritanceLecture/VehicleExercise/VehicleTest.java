package inheritanceLecture.VehicleExercise;

public class VehicleTest {

        public static void turnOnVehicles(Vehicle[] vehicles){
                for(Vehicle a : vehicles){
                    a.turnOn();
                }
        }


    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
//        Jet j1 = new Jet();
//        Car c1 = new Car();
//
//        v1.setOperable(true);
//        v1.setPassengerCapacity(8);
//        v1.setPowerSource("electric");
//
//        j1.setOperable(false);
//        j1.setPassengerCapacity(2);
//        j1.setPowerSource("nuclear");
//
//        c1.setOperable(true);
//        c1.setPassengerCapacity(4);
//        c1.setPowerSource("human-effort");
//
//        System.out.println(v1.vehicleToString());
//        System.out.println(j1.vehicleToString());
//        System.out.println(c1.vehicleToString());



        Car c2 = new Car(true, 4, "gas", 26);
        Jet j2 = new Jet(true, 2, "Jet Fuel", 45000);

//        System.out.println(c2.toString());
//        System.out.println(c2.carToString());
//
//        System.out.println(j2.toString());
//        System.out.println(j2.jetToString());
//
//        c2.deployAirBag();
//        j2.takeOff();

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = c2;
        vehicles[1] = j2;

        turnOnVehicles(vehicles);

        c2.genericTurnOn();
        j2.genericTurnOn();
    }
}
