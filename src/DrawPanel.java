import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    /*  Just a single image, TODO: Generalize
    */
    BufferedImage volvoImage, saabImage, scaniaImage;
    ArrayList<MotorVehicle> vehicles;
    
    // To keep track of a singel cars position
    private Point volvoPoint = new Point();
    private Point saab95Point= new Point();
    private Point scaniaPoint = new Point();

    public void getCarList(ArrayList<MotorVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // TODO: Make this genereal for all cars
    void updateImageCoord(int x, int y){
        volvoPoint.x = x;
        volvoPoint.y = y;
        saab95Point.x = x;
        saab95Point.y = y + 100;
        scaniaPoint.x = x;
        scaniaPoint.y = y + 200;
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg"));
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(volvoImage, volvoPoint.x, volvoPoint.y, null); // see javadoc for more info on the parameters
        g.drawImage(saabImage, saab95Point.x, saab95Point.y, null);
        g.drawImage(scaniaImage, scaniaPoint.x, scaniaPoint.y, null);
    }
}
