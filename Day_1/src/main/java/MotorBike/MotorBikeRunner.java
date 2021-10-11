package MotorBike;

public class MotorBikeRunner {
    public static void main(String[] args) {
//        default constructor
//        MotorBike ducati = new MotorBike();
//        MotorBike honda = new MotorBike();

        MotorBike ducati = new MotorBike(5, "green");
        MotorBike honda = new MotorBike(5, "red");

//        System.out.println(ducati.getSpeed());
//
//        System.out.println(honda.getSpeed());
//
//        honda.setSpeed(50);
//
//        System.out.println(honda.getSpeed());

        ducati.setSpeed(10);
        honda.setSpeed(500);

        ducati.increaseSpeed(100);

        honda.decreaseSpeed(-200);

//        System.out.println(honda.getSpeed());

        //gets(calling toString function) member info through object instance
        System.out.println(ducati);
        System.out.println(honda);
    }
}
