package Recipe;

public class WhoIsTheWinner {
    public static void main(String[] args) {

//        MasterChef masterChef1 = new Recipe1();
//        masterChef1.execute();
//
//        System.out.println();
//
//        MasterChef masterChef2 = new Recipe2();
//        masterChef2.execute();

        MasterChef[] masterChefs = {new Recipe1(), new Recipe2()};

        for(MasterChef i : masterChefs){
            i.execute();
            System.out.println();
        }
    }
}
