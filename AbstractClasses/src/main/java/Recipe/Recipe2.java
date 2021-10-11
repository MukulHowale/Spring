package Recipe;

public class Recipe2 extends MasterChef {

    @Override
    void getReady() {
        System.out.println("I am Ready");
    }

    @Override
    void createRecipe() {
        System.out.println("Prepared Pav Bhaji");
    }

    @Override
    int cleanUp() {
        System.out.println("Clean up Done");
        return 80;
    }
}
