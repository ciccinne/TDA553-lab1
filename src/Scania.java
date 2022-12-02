package src;
import java.awt.*;

public class Scania extends Truck{                        // Static gör att det tillhör hela klassen. Ändrar vi värdet så ändras det för alla instanser av klassen, alltså inte unikt för varje instans.
    private IPlatform platform;

    public Scania(int nrDoors, Color color, int enginePower, String modelString, double X, double Y) {
        super(nrDoors, color, enginePower, modelString, X, Y);
        this.platform = new Platform();                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania 
    }

    @Override
    public void gas(double amount){
        if (!(platform.isInUse())) {
            if (amount >= 0 && amount <= 1) {
                incrementSpeed(amount);
            } 
        }
    }

    public void platformUp(double amount){   // Delegerar
        if (getCurrentSpeed() == 0) {
            platform.inUse(amount);
        }
    }

}
