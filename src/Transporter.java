package src;
import java.awt.*;
import java.util.ArrayList;

public class Transporter extends Truck implements Iloadable {
    private IPlatform flatbed;
    private ArrayList<Car> carsLoaded;

    public Transporter(int nrDoors, Color color, int enginePower, String modelString, double X, double Y) {
        super(nrDoors, color, enginePower, modelString, X, Y);
        this.flatbed = new Flatbed();                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania 
        this.carsLoaded = new ArrayList<>();
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

    public void maxCars(){
        if (amountOfCars() == 6){
            //ge felmeddelande eller sluta load
        }
    }

    private boolean carClose(Car a){
        if (this.getX() - a.getX() > 0 && this.getX() - a.getX() < 5 && this.getY() - a.getY() > 0 && this.getY() - a.getY() < 5){                       // Transporter:s position minus bilens position är mindre än 5 men större än 0.
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void load(Car a) {
        // flatbed inUse
        if (!(flatbed.notInUse()));
        // carsLoaded är inte full.

        // carClose() true.
        if (carClose(a)){
            carsLoaded.add(a);
        }
        if (state.flatbed() == 0){  //har inte returnat state än?
            carsLoaded += 1; // vill kolla att carClose sen load?
        }  
        
    }

    @Override
    public void unLoad() {
        // TODO Auto-generated method stub
        
    }
}
