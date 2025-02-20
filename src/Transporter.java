
import java.awt.*;
import java.util.ArrayList;

public class Transporter extends Truck { 
    private Flatbed flatbed;
    private Loadable load;
    

    public Transporter(int nrDoors, Color color, int enginePower, String modelString, double X, double Y, int maxNrCars, double trimFactor, Flatbed flatbed) {
        super(nrDoors, color, enginePower, modelString, X, Y, trimFactor, flatbed);
        this.flatbed = flatbed;                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania
        this.load = new Loadable(maxNrCars, X, Y);
        
    }

    public Transporter(int nrDoors, Color color, int enginePower, String modelString, double X, double Y, int maxNrCars, double trimFactor) {
        this(nrDoors, color, enginePower, modelString, X, Y, maxNrCars, trimFactor, new Flatbed());
    }
    
    @Override
    public void move() {
        double newX = getX() + this.getCurrentSpeed() * Math.cos(this.getAngle());
        this.setX(newX);
        double newY = getY() + this.getCurrentSpeed() * Math.sin(this.getAngle());
        this.setY(newY);

        load.setX(newX);
        load.setY(newY);

        load.moveLoadedCars();
    }

    public ArrayList<Car> getCarsLoaded() {
        return load.getCarsLoaded();
    }
    
    public void load(Car a) {
        if (flatbed.isInUse()) {      // flatbed inUse
            load.load(a);
        }
    }

    public void useFlatbed(){   // Delegerar                          
        if (getCurrentSpeed() == 0) {
            flatbed.lowerFlatbed();
        }
    }
    
    public void notUseFlatbed(){
        flatbed.notInUse();

    }
    
    public void unLoad(){
        load.unLoad();
    }
}

