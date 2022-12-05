
import java.awt.*;

public class Volvo240 extends Car  {
    public final static double trimFactor = 1.25;
  
    
    public Volvo240(int nrDoors, Color color, int enginePower, String modelName, int x, int y){
        super(nrDoors, color, enginePower, modelName, x, y);
    }

    @Override 
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }
}
