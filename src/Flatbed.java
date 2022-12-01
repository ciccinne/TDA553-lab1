package src;

public class Flatbed implements IPlatform {
    private int state;                               // State = 1; platformen är uppe, state = 0; plattformen är nere.

    public Flatbed() {
        this.state = 1;                    // Plattformen är uppe från start.
    }

    @Override
    public void notInUse() {
        state = 1;
    }

    @Override
    public void inUse(double amount) {
        state = 0;
    }

    @Override
    public boolean isNotInUse() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
