package src;
import java.awt.*;

public class Scania extends MotorVehicle{
    private final static double trimFactor = 1.25;                          // Kopierade direkt från Volvo240
    private double platformAngle = 0;


    public Scania(int nrDoors, Color color, int enginePower, String modelString, double X, double Y) {
        super(nrDoors, color, enginePower, modelString, X, Y);
    }

    @Override                                                              // Kopierade direkt från Volvo240
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public double getPlatformAngle() {
        return platformAngle;
    }

    public void raisePlatform(double amount) {                             // amount ska anges i grader
        platformAngle = amount;                       //RÄCKER DETTA???
    }
}
