package src;
import java.awt.*;

public class Transporter extends Truck{
    private IPlatform flatbed;

    public Transporter(int nrDoors, Color color, int enginePower, String modelString, double X, double Y) {
        super(nrDoors, color, enginePower, modelString, X, Y);
        this.flatbed = new Flatbed();                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania 
    }

    @Override
    public void gas(double amount){
        if (flatbed.isNotInUse()) {
            if (amount >= 0 && amount <= 1) {
                incrementSpeed(amount);
            } 
        }
    }

    public void useFlatbed(double amount){   // Delegerar
        if (getCurrentSpeed() == 0) {
            flatbed.inUse(amount);
        }
    }
}
