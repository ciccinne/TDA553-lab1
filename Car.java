import java.awt.*;

public abstract class Car implements Movable  {                               
    public boolean turboOn;                         
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car                     // typ color?
    public String modelName; // The car model name
    
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

    protected abstract double  incrementSpeed(double amount);

     decrementSpeed(double amount){
       
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    public void move() {

    this.y += this.dy
    this.x += this.dx

    }

    public void turnLeft() {

    }

    public void turnRight() {

    }
}