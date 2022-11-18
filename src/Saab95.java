package src;
import java.awt.*;

public class Saab95 extends Car  {  
    private boolean turboOn;                                        // Flyttat från konstruktorn
    
    public Saab95(int nrDoors, Color color, int enginePower, String modelName, double X, double Y) {     
        super(nrDoors, color, enginePower, modelName, X, Y);              
	    turboOn = false;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){   
	    turboOn = false;
    }
    @Override 
    public double speedFactor(){  // Ska overridea
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }
}

    