public class VehicleCollection {
    
    public 


    // Calls the gas method for each car once
    void gasAllVehicles(int amount) {
        double gas = ((double) amount) / 100;
        for (MotorVehicle motorVehicle : vehicles) {
            motorVehicle.gas(gas);
        }
    }
}
