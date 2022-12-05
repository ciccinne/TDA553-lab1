
import java.awt.*;
import java.util.ArrayList;

public class Transporter extends Truck implements ILoadable {
    private IPlatform flatbed;
    private ArrayList<Car> carsLoaded = new ArrayList<>();
    private int lastIndex = carsLoaded.size() - 1;
    private Car currentCar;

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
    

    public void useFlatbed(double amount){   // Delegerar                          
        if (getCurrentSpeed() == 0) {
            flatbed.inUse(amount);
        }
    }

    public boolean maxCars(){ //ge felmeddelande eller sluta load
        if (carsLoaded.size() == 6){
            return true;
        }else{
            return false;
        }
    }

    private boolean carClose(Car a){
        if (this.getX() - a.getX() > 0 && this.getX() - a.getX() < 5 && this.getY() - a.getY() > 0 && this.getY() - a.getY() < 5){ // Transporter:s position minus bilens position är mindre än 5 men större än 0.
            return true;
        }else {
            return false;
        }
    }

    @Override                            
    public void load(Car a) {
        if (flatbed.isInUse()) {      // flatbed inUse
            if (!(maxCars())) {             // carsLoaded är inte full.
                if (carClose(a)) {          // carClose() true.
                    carsLoaded.add(a);
                }
            }
        }
    }
    /*
        if (state.flatbed() == 0){  //har inte returnat state än?
            carsLoaded += 1; // vill kolla att carClose sen load?
        }  
        
    } */

    @Override
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

    public int getCarsLoaded(){
        return carsLoaded.size();
    }

}
