package src;
import java.awt.*;
import java.lang.Math;

public abstract class Car implements Movable  {              /* Abstract class skapas då vi har gemensamma metoder och variabler  i saab och volvo som dka utföra samma sak    */            
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car                     / color är en typ här 
    private String modelName; // The car model name

    private double X;
    private double Y;
    private double angle;

    
    public Car(int nrDoors, Color color, int enginePower, String modelName, double X, double Y) {          // parameter               
        this.nrDoors = nrDoors;                                         
        this.color = color;     
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.X = X;
        this.Y = Y;
        this.angle = 0;
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
    
    protected abstract double speedFactor();            // abstract double, ange typ på metode   

    public void incrementSpeed(double amount){     
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        if (currentSpeed > enginePower) {
            currentSpeed = enginePower;
        }
    }

    public void decrementSpeed(double amount){                          
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }

    /*
     Ändrar X
     */
    public void move() {
        setX(getX() + (getCurrentSpeed() * Math.cos(getAngle())));
        setY(getY() + (getCurrentSpeed() * Math.sin(getAngle())));
    }

    public void turnLeft() {
        setAngle(getAngle() - 90 * (Math.PI / 180));
    }

    public void turnRight() {
        setAngle(getAngle() + 90 * (Math.PI / 180));
    }

    public double getAngle() {                                              // public pga. get
        return this.angle;
    }

    public double getX() {                                                  // public pga. get
        return this.X;
    }

    public double getY() {                                                  // public pga. get
        return this.Y;
    }

    protected void setX(double x) {
        this.X = x;
    }

    protected void setY(double y) {
        this.Y = y;
    }

    protected void setAngle(double angle) {
        this.angle = angle;
    }

}