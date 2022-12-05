
import java.awt.*;

public class Volvo240 extends Car  {
    public final static double trimFactor = 1.25;
    
    public Volvo240(double x, double y){
        super(4, Color.black, 100, "Volvo240", x, y);
    }

    @Override 
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }
}
