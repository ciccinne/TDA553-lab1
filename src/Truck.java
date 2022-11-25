package src;
import java.awt.*;

public abstract class Truck extends MotorVehicle {
        
    public Truck(int nrDoors, Color color, int enginePower, String modelName, double X, double Y) {
        super(nrDoors, color, enginePower, modelName, X, Y);
    }
}