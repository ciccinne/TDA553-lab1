
import java.awt.*;
import java.util.ArrayList;

public class Transporter extends Truck {
    private Loadable load = new Loadable(); 
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
    

    public void useFlatbed(double amount){   // Delegerar                          
        if (getCurrentSpeed() == 0) {
            flatbed.inUse(amount);
        }
    }



    private boolean carClose(Car a){
        if (this.getX() - a.getX() > 0 && this.getX() - a.getX() < 5 && this.getY() - a.getY() > 0 && this.getY() - a.getY() < 5){ // Transporter:s position minus bilens position är mindre än 5 men större än 0.
            return true;
        }else {
            return false;
        }
    }

   

