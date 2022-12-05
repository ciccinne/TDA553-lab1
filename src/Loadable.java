import java.util.ArrayList;

public class Loadable {

    private ArrayList<Car> carsLoaded = new ArrayList<>();
    private int lastIndex = carsLoaded.size() - 1;
    private Car currentCar;
    private int maxCars;


    public Loadable(int x){
        this.maxCars =  x;

    }

    public boolean maxCars(){ //ge felmeddelande eller sluta load
        if (carsLoaded.size() == maxCars){
            return true;
        }else{
            return false;

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





    //void load(Car a);
    //void unLoad();


}
    
