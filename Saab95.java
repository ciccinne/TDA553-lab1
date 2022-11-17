import java.awt.*;

public class Saab95 extends Car  {  

    
    public Saab95(int nrDoors, Color color, int enginePower, String modelName) {     

        super(nrDoors, color, enginePower, modelName);              

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
    @Override
    public void incrementSpeed(double amount){   //Override
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }
    @Override
    public void decrementSpeed(double amount){  //Override
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    