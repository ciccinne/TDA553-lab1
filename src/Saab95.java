
import java.awt.*;

public class Saab95 extends Car {  
    private boolean turboOn;                                        // Flyttat från konstruktorn
    
    public Saab95(double X, double Y) {     
        super(2, Color.red, 125, "Saab95", X, Y);              
	    turboOn = false;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){   
	    turboOn = false;
    }
    @Override 
    protected double speedFactor(){  // Ska overridea
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }
}

    