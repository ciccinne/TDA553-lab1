package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.jupiter.api.Test;

import src.Car;
import src.Saab95;

public class testSaab95 {
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
    public void turnLeft() {

    }

    @Test
    public void turnRight() {
    
    }

    @Test
    protected double getAngle() {

    }

    @Test
    protected double getX() {

    }

    @Test
    protected double getY() {

    }

    @Test
    protected void setX(double x) {

    }

    @Test
    protected void setY(double y) {

    }

    @Test
    protected void setAngle(double angle) {

    }
}
