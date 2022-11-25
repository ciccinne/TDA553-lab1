package src;

public class Platform implements IPlatform {
    private double platformAngle = 0;
    
    public Platform() {
    
    }

    public double getAngle() {
        return platformAngle;
    }

    @Override
    public void up() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void down() {
        // TODO Auto-generated method stub
        
    }

    public void raisePlatform(double amount) {                             // amount ska anges i grader
        platformAngle = amount;                       //RÄCKER DETTA???
    }
}
