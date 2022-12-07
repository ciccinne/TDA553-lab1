import java.util.ArrayList;

public class Loadable {
    private ArrayList<Car> carsLoaded = new ArrayList<>();
    private int lastIndex = carsLoaded.size() - 1;
    private Car currentCar;
    private int maxCars;


    public Loadable(int x){
        this.maxCars =  x;

    }

    public ArrayList<Car> getCarsLoaded() {
        return carsLoaded;
    }

    public boolean maxCars(){ //ge felmeddelande eller sluta load
        if (carsLoaded.size() == maxCars){
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

                               
    public void load(Car a) {      // flatbed inUse
            if (!(maxCars())) {             // carsLoaded är inte full.
                carsLoaded.add(a);
        }
    }
   

    
    public void unLoad() {
            if (!(carsLoaded.size() == 0)) {                //Kan inte unload om carsLoaded är tom
                currentCar = carsLoaded.get(lastIndex);
                currentCar.setX(this.getX() - 5);
                currentCar.setY(this.getY() - 5);

                carsLoaded.remove(lastIndex);
            }
    }

   
}





    //void load(Car a);
    //void unLoad();



    
