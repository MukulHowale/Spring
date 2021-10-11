package Recipe;

abstract class MasterChef {

    //prepare
    //cleanup

    public void execute(){
        getReady();
        createRecipe();
        int score = cleanUp();
        System.out.println("My Score is "+score);
    }

    abstract void getReady();

    abstract void createRecipe();

    abstract int cleanUp();
}
