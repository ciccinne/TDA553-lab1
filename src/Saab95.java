package src;
import java.awt.*;

public class Saab95 extends Car  {  

    
    public Saab95(int nrDoors, Color color, int enginePower, String modelName, double X, double Y) {     
        super(nrDoors, color, enginePower, modelName, X, Y);              
        private boolean turboOn;
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
        return enginePower * 0.01 * turbo;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

}

    