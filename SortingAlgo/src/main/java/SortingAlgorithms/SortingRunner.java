package SortingAlgorithms;

public class SortingRunner {
    public static void main(String[] args) {
        //Abstract Class field
        SortingAlgorithms SortAlgo;

        SortAlgo = new SelectionSort();
        SortAlgo.sort(new int[]{9, 8 , 4, 7}, 4);

        SortAlgo = new InsertionSort();
        SortAlgo.sort(new int[]{3, 4, 5, 1, 8, 10},6);

        SortAlgo = new BubbleSort();
        SortAlgo.sort(new int[]{9,82,10},3);

    }
}
