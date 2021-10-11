package Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan f1 = new Fan();

        f1.switchOn();

//        f1.switchOff();

        System.out.println(f1.isOn());
    }
}
