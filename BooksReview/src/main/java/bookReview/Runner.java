package bookReview;

public class Runner {
    public static void main(String[] args) {
        Book b1 = new Book(01,"DSA","Robert Lafore");

        b1.addReview(1,"Nice","5");
        b1.addReview(2,"great","9");
        b1.addReview(3,"Its OK","1");

        b1.printReview();
    }
}
