package bookReview;

public class Review {
    private int idReview;
    private String description;
    private String rating;

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String toString(){
        return String.format("Review ID : %d, Description : %s, Rating : %s/10",idReview,description,rating);
    }
}
