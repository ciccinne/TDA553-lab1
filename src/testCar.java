package src;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.jupiter.api.Test;

public class testCar {
    @Test
    public void does_startEngine_start_the_engine() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        saab.startEngine();
        assertEquals(0.1, saab.getCurrentSpeed());

        /* MOVE:
         * ex. sätt increament speed till 12
         * Kalla på x, som nu borde vara -12 eller +12 beroende på om vi åker öst eller väst (cos 0, resp cos 180)
         */
    }

    @Test
    public void can_move_move() {
    Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
    saab.incrementSpeed(12);
    saab.move();
    assertEquals(12, saab.getX());
    }

    @Test
    public void turnLeft() {

    }

    @Test
    public void turnRight() {
    
    }
}
