package Publications;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();

        Publication bookPublication = new Books();
        bookPublication.addDetails(100, 250, "King William");
        library.addBooks(bookPublication);

        bookPublication.addDetails(250, 500, "Thanos");
        library.addBooks(bookPublication);

        bookPublication.addDetails(500,900,"Iron Man");
        library.addBooks(bookPublication);

        Publication journalPublication = new Journals();
        journalPublication.addDetails(200,300,"David Hasselhoff");
        library.addBooks(journalPublication);

        journalPublication.addDetails(1500,9000,"Uchiha Itachi");
        library.addBooks(journalPublication);

        library.printDetails();
    }
}
