package AbstractClass;

public class AnimalRunner {
    public static void main(String[] args) {

        AbstractAnimal animal = new Cat();
        animal.animalSound();

        AbstractAnimal animal1 = new Dog();
        animal1.animalSound();
    }
}
