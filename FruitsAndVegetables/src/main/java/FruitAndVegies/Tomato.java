package FruitAndVegies;

public class Tomato implements Fruit, Vegetable{

    @Override
    public void hasAPeel() {
        System.out.println("Yes it can be peeled");
    }

    @Override
    public void hasARoot() {
        System.out.println("It does not have a root");
    }
}