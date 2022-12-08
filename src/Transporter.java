
import java.awt.*;
import java.util.ArrayList;

public class Transporter extends Truck { 
    private IPlatform flatbed;
    private Loadable load;
    

    public Transporter(int nrDoors, Color color, int enginePower, String modelString, double X, double Y, int maxNrCars) {
        super(nrDoors, color, enginePower, modelString, X, Y);
        this.flatbed = new Flatbed();                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania
        this.load = new Loadable(maxNrCars, X, Y);
        
    }

    @Override
    public void gas(double amount){
        if (!(flatbed.isInUse())) {
            super.gas(amount);
            } 
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

    public void useFlatbed(double amount){   // Delegerar                          
        if (getCurrentSpeed() == 0) {
            flatbed.inUse(amount);
        }
    }

    public void unLoad(){
        load.unLoad();
    }
}

