package src;
import java.util.List;

public class Main {

    List<Movable> objectsInWorld;

    public static void main(String[] args) {

    }

    void updateAll()  {
        for (Movable object : objectsInWorld) {
            object.move();
        }
    }
}
