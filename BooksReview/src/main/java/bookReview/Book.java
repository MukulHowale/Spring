package bookReview;

import java.util.ArrayList;

public class Book {
        private int idBook;
        private String bookName;
        private String author;
        private Review review;
        private int count = 0;
        private ArrayList<Review> arrayList = new ArrayList<>();

        public Book(int idBook, String bookName, String author) {
                this.idBook = idBook;
                this.bookName = bookName;
                this.author = author;
        }

        public void addReview(int id, String dec, String rate){
                review = new Review();

                review.setIdReview(id);
                review.setDescription(dec);
                review.setRating(rate);

                arrayList.add(count++,review);
        }

        public int getIdBook() {
                return idBook;
        }

        public void setIdBook(int idBook) {
                this.idBook = idBook;
        }

        public String getBookName() {
                return bookName;
        }

        public void setBookName(String bookName) {
                this.bookName = bookName;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public void printReview(){
                System.out.println(toString() + "\nReview : ");
                for (int i = 0; i < count; i++) {
                        System.out.println(arrayList.get(i));
                }
        }

        public String toString(){
                return String.format("Book ID : %d,\nBook name : %s,\nBook author : %s",idBook,bookName,author);
        }
}
