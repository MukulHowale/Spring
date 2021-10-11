package Fan;

public class Fan {
    private boolean isOn;
    private int speed;

    public boolean isOn(){
        return this.isOn;
    }

    public void switchOn(){
        this.isOn = true;
        this.speed = 5;
    }

    public void switchOff(){
        this.isOn = false;
        this.speed = 0;
    }
}
