import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class App {
        // The delay (ms) corresponds to 20 updates a sec (hz)
        private final static int delay = 50;
        // A list of cars, modify if needed
        static ArrayList<MotorVehicle> vehicles = new ArrayList<>();
        static VehicleCollection vehicleCollection;

        private static Timer timer;
        static CarView frame;
        static DrawPanel drawpanel;

        public App() {
        // The timer is started with an listener (see below) that executes the statements
        // each step between delays.
        this.timer = new Timer(delay, new TimerListener());
    }


//methods:
public static void main(String[] args) {
    // Instance of this class

    vehicles.add(new Volvo240(0, 0, 1.3));
    vehicles.add(new Saab95(0, 0));
    vehicles.add(new Scania(0, 0, 1.3));
    vehicleCollection = new VehicleCollection(vehicles);                //Skapar en vehicleCollection och lägger in vehicles-listan där pga. själva anropningen till på motorVechicles gas-metoden skulle (enligt Martin tror jag?) vara i en egen klass som tillhör Model ??

    
    CarController cc = new CarController(vehicleCollection);            //Skickar in vechicleCollection istället för vehicles-listan


    // Start a new view and send a reference of self
    frame = new CarView("CarSim 1.0");
    drawpanel.getCarList(vehicles);

    // Start the timer
    timer.start();

    }

     /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (MotorVehicle motorVehicle : vehicles) {
                motorVehicle.move();
                int x = (int) Math.round(motorVehicle.getX());
                int y = (int) Math.round(motorVehicle.getY());
                drawpanel.updateImageCoord(x, y);
                // repaint() calls the paintComponent method of the panel
                drawpanel.repaint();
            }
        }
    }
}
