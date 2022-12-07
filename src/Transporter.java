
import java.awt.*;
import java.util.ArrayList;

public class Transporter extends Truck {
    private Loadable load = new Loadable(6); 
    private IPlatform flatbed;
    

    public Transporter(int nrDoors, Color color, int enginePower, String modelString, double X, double Y) {
        super(nrDoors, color, enginePower, modelString, X, Y);
        this.flatbed = new Flatbed();                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania 
        
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

        for (int i = 0; i < load.getCarsLoaded().size(); i++) {
            Car currentCar = load.getCarsLoaded().get(i);
            currentCar.setX(newX);
            currentCar.setY(newY);
        }
    }
    
    

    public void useFlatbed(double amount){   // Delegerar                          
        if (getCurrentSpeed() == 0) {
            flatbed.inUse(amount);
        }
    }


    public void load(Car a) {
        if (flatbed.isInUse()) {      // flatbed inUse
            if (!(maxCars())) {             // carsLoaded är inte full.
                if (carClose(a)) {          // carClose() true.
                    carsLoaded.add(a);
                }
            }
        }
    }
   

    
    public void unLoad() {
        if (flatbed.isInUse()) {
            if (!(carsLoaded.size() == 0)) {                //Kan inte unload om carsLoaded är tom
                currentCar = carsLoaded.get(lastIndex);
                currentCar.setX(this.getX() - 5);
                currentCar.setY(this.getY() - 5);

                carsLoaded.remove(lastIndex);
            }
        }
    }
   
}
}

