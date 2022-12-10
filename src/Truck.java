
import java.awt.*;

public abstract class Truck extends MotorVehicle {
    private Trim trim;
        
    public Truck(int nrDoors, Color color, int enginePower, String modelName, double X, double Y,double trimFactor) {
        super(nrDoors, color, enginePower, modelName, X, Y);
        this.trim = new Trim(trimFactor, 100);
    }

 
    @Override 
    protected double speedFactor(){
        return trim.speedFactor();
    }
}