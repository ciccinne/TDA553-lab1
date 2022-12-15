import java.util.ArrayList;


public class VehicleCollection {
    ArrayList<MotorVehicle> vehicles;
    
    
    public VehicleCollection(ArrayList<MotorVehicle> vehicles){
        this.vehicles = vehicles;
    }


    // Calls the gas method for each car once
    void gasAllVehicles(int amount) {
        double gas = ((double) amount) / 100;
        for (MotorVehicle motorVehicle : vehicles) {
            motorVehicle.gas(gas);
        }
    }
}
