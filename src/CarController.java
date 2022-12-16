
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
 
import java.util.List;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController extends JPanel {
    List<MotorVehicle> vehicles;
    int gasAmount = 0;

    JSpinner gasSpinner = new JSpinner();
    JLabel gasLabel = new JLabel("Amount of gas");

    JButton gasButton = new JButton("Gas");
    JButton brakeButton = new JButton("Brake");
    JButton turboOnButton = new JButton("Saab Turbo on");
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");


    public CarController(List<MotorVehicle> vehicleCollection) {             //Ändrat så att parametern kräver typen vehicleCollection ist för "ArrayList<MotorVehicle> vehicles"
        this.vehicles = vehicleCollection;
        addButtons(700, 200);

   

    SpinnerModel spinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        gasSpinner = new JSpinner(spinnerModel);
        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner)e.getSource()).getValue();
            }
        });


        // This actionListener is for the gas button only
        // TODO: Create more for each component as necessary
        gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (MotorVehicle vehicle : vehicles) {
                    vehicle.gas(gasAmount / 100);
                }                             //Kallar på "vehicles.gasAllVehicles(gasAmount);" ist för "gas(gasAmount);"
            }
        });
        
    }
 
    public void addButtons(int X, int Y) {

        JSpinner gasSpinner = new JSpinner();
        JLabel gasLabel = new JLabel("Amount of gas");
    
         gasButton = new JButton("Gas");
         brakeButton = new JButton("Brake");
         turboOnButton = new JButton("Saab Turbo on");
         turboOffButton = new JButton("Saab Turbo off");
         liftBedButton = new JButton("Scania Lift Bed");
         lowerBedButton = new JButton("Lower Lift Bed");
    
         startButton = new JButton("Start all cars");
         stopButton = new JButton("Stop all cars");

        JPanel controlPanel = new JPanel();
        JPanel gasPanel = new JPanel();
    
    
        gasPanel.setLayout(new BorderLayout());                              //Flyttat från precis under "public class DrawPanel extends JPanel{" men fortfarande rödmarkerade grejer ??
        //gasPanel.add(gasPanel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);
    
        this.add(gasPanel);
    
        controlPanel.setLayout(new GridLayout(2,4));
    
        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);
        controlPanel.setPreferredSize(new Dimension((X/2)+4, 200));
        this.add(controlPanel);
        controlPanel.setBackground(Color.CYAN);
    
    
        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(X/5-15,200));
        this.add(startButton);
    
    
        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(X/5-15,200));
        this.add(stopButton);
    }
}
