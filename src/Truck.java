
import java.awt.*;

public abstract class Truck extends MotorVehicle {
    private final static double trimFactor = 1.25;
        
    public Truck(int nrDoors, Color color, int enginePower, String modelName, double X, double Y) {
        super(nrDoors, color, enginePower, modelName, X, Y);
    }

    @Override                                                              // Kopierade direkt från Volvo240
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}