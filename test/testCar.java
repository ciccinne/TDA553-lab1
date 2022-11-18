package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.jupiter.api.Test;

import src.Car;
import src.Saab95;

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
    saab.incrementSpeed(6);
    saab.move();
    assertEquals(57.5, saab.getX());                         // Måste ta 50 + amount * 1.25. (50 är X-värdet för punkten vi placerade bilen i när vi skapade den, amount är vad vi ökar hastigheten med, 1.25 är speedfactorn för Saab95)
    }

    @Test
    public void turnLeft() {

    }

    @Test
    public void turnRight() {
    
    }
}
