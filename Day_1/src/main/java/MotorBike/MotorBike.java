package MotorBike;

public class MotorBike {
    // State
    //other classes cannot access this member
    private int speed;
    private String color = "Green";
    private  int gears;

    MotorBike(int gears, String color) {
        this.gears = gears;
        this.color = color;
    }

    //Behaviour
    void start(){
        System.out.println("Bike Started");
    }

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }

    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }

    int getSpeed(){
        return this.speed;
    }

    void setSpeed(int speedX){
//        System.out.println(this.speed);
//        System.out.println(speed);
        if(speedX >= 0) {
            this.speed = speedX;
        }
//        System.out.println(this.speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return String.format("speed - [%d],  color - [%s],  gears - [%d]",speed,color,gears);
    }

}
