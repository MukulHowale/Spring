package Publications;

public class Journals extends Publication{

    void addDetails(int noOfPages, int price, String publisherName) {
        setNoOfPages(noOfPages);
        setPrice(price);
        setPublisherName(publisherName);
    }

}
