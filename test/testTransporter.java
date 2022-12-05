

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.jupiter.api.Test;


public class testTransporter {
    @Test
    public void does_load_load_cars() {
        Transporter transporter = new Transporter(2, Color.red, 125, "Transformer", 50, 50);
        Saab95 saab95 = new Saab95(46, 46);
        transporter.useFlatbed(0);
        transporter.load(saab95);
        assertEquals(1,transporter.getCarsLoaded());
    }
}
