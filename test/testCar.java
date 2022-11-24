package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.jupiter.api.Test;

import src.Car;
import src.Saab95;

public class testCar {
    @Test
    public void does_startEngine_start_the_engine() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);  // car saab har en stastic typ eftersom en car kommer alltid vara en car, new saab är av typen dynamic då saab 
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
    public void does_turnLeft_turn_left() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        saab.turnLeft();
        assertEquals(-90 * (Math.PI / 180), saab.getAngle());
    }

    @Test
    public void does_turnRight_turn_right() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        saab.turnLeft();
        assertEquals(+90 * (Math.PI / 180), saab.getAngle());
    }

    @Test
    public void does_an_out_of_range_value_result_in_no_speed_increase() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        saab.gas(2);
        assertEquals(0, saab.getCurrentSpeed());
    }

    @Test
    public void does_an_out_of_range_value_result_in_no_speed_decrease() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        saab.brake(2);
        assertEquals(0, saab.getCurrentSpeed());
    }

    @Test
    public void does_currentSpeed_exceed_enginePower() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        for (int i = 0; i < 105; i++) {
            saab.gas(1);
        }
        assertEquals(saab.getEnginePower(), saab.getCurrentSpeed());
    }

    @Test
    public void does_currentSpeed_go_below_zero() {
        Car saab = new Saab95(2, Color.red, 125, "Saab95", 50, 50);
        saab.decrementSpeed(5);
        assertEquals(0, saab.getCurrentSpeed());
    }

}
