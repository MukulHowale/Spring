package Publications;

import java.util.ArrayList;

public abstract class Publication {
    private int noOfPages;
    private int price;
    private String publisherName;
    private Library library;

    abstract void addDetails(int noOfPages, int price, String publisherName);

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
