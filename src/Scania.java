package src;
import java.awt.*;

public class Scania extends Truck{
    private final static double trimFactor = 1.25;                          // Kopierade direkt från Volvo240 
    private IPlatform platform;

    public Scania(int nrDoors, Color color, int enginePower, String modelString, double X, double Y) {
        super(nrDoors, color, enginePower, modelString, X, Y);
        this.platform = new Platform();                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania 
    }

    @Override                                                              // Kopierade direkt från Volvo240
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void gas(double amount){
        if (platform.isDown()) {
            if (amount >= 0 && amount <= 1) {
                incrementSpeed(amount);
            } 
        }
    }
}
