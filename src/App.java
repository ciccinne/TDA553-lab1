import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class App {
        // The delay (ms) corresponds to 20 updates a sec (hz)
        private final static int delay = 50;
        // The timer is started with an listener (see below) that executes the statements
        // each step between delays.
        private static Timer timer = new Timer(delay, new TimerListener());
        // A list of cars, modify if needed
        static ArrayList<MotorVehicle> vehicles = new ArrayList<>();

        static CarView frame;


//methods:
public static void main(String[] args) {
    // Instance of this class

    vehicles.add(new Volvo240(0, 0, 1.3));
    vehicles.add(new Saab95(0, 0));
    vehicles.add(new Scania(0, 0, 1.3));

    CarController cc = new CarController(vehicles);



    // Start a new view and send a reference of self
    frame = new CarView("CarSim 1.0", cc);

    // Start the timer
    timer.start();

    }
}