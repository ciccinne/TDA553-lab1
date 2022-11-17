import java.awt.*;
import java.lang.Math;

public abstract class Car implements Movable  {                               
    protected boolean turboOn;                         
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car                     // typ color?
    protected String modelName; // The car model name

    protected double x;
    protected double y;
    
    public Car(int nrDoors, Color color, int enginePower, String modelName){                        
        this.nrDoors = nrDoors;     
        this.color = color;     // kalla på Color ?
        this.enginePower = enginePower;
        this.modelName = modelName;
        stopEngine();
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

    
    protected abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);
    

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    public void move() {
        setX(getX() + (getCurrentSpeed() * Math.cos(getDirectionAngle())));
        setY(getY() + (getCurrentSpeed() * Math.sin(getDirectionAngle())));
    }

    public void turnLeft() {
        setAngle(getDirectionAngle() - 90 * (Math.PI / 180));
    }

    public void turnRight() {
        setAngle(getDirectionAngle() + 90 * (Math.PI / 180));
    }
}