package src;

public class Platform implements IPlatform {
    private double platformAngle;

    public Platform() {
        this.platformAngle = 0;
    }

    public double getAngle() {
        return platformAngle;
    }
    
    @Override
    public void down() {
        platformAngle = 0;
        
    }

    @Override
    public void up(double amount) {                                   // Amount är hur stor vilkel användaren vill att plattformen ska ha
        if (amount > 0 && amount <= 70)
        platformAngle = amount;
        
    }
    @Override
    public boolean isDown() {
        if (getAngle() == 0) {
            return true;
        }else{
            return false;
        }
    }
}
