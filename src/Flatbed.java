package src;

public class Flatbed implements IPlatform {
    private int state;                               // State = 1; platformen är uppe, state = 0; plattformen är nere.

    public Flatbed() {
        this.state = 1;                    // Plattformen är uppe från start.
    }

    @Override
    public void up(double amount) {
        state = 1;
    }

    @Override
    public void down() {
        state = 0;
    }

    @Override
    public boolean isDown() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
