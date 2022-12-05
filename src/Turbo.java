public class Turbo {
    private boolean turboOn;

    public Turbo() {
        this.turboOn = false;
    }

    public boolean getTurboState() {
        return turboOn;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){   
	    turboOn = false;
    }
}
