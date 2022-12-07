
import java.awt.*;

public class Volvo240 extends Car  {
    private Trimfactor trimFactor;
    
    public Volvo240(double x, double y, double trim){
        super(4, Color.black, 100, "Volvo240", x, y);
        this.trimFactor = new Trimfactor(trim);
    }

    @Override 
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor.getTrimfactor();                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }
}
