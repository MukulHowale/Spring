package Recipe;

public class Recipe1 extends MasterChef{
    @Override
    void getReady() {
        System.out.println("I am Ready");
    }

    @Override
    void createRecipe() {
        System.out.println("Prepared Dosa");
    }

    @Override
    int cleanUp() {
        System.out.println("Done with cleaning");
        return 50;
    }
}
