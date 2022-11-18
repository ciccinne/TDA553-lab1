package src;
import java.awt.*;

public class Volvo240 extends Car  {

    public final static double trimFactor = 1.25;
  
    
    public Volvo240(int nrDoors, Color color, int enginePower, String modelName, int x, int y){
        super(nrDoors, color, enginePower, modelName, x, y);
        
    
    }
    
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    @Override 
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
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
