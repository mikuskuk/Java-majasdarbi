package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut = true;
    private int totalRatings;

    public Video(String title, int totalRatings) {
        this.title = title;
        this.totalRatings = totalRatings;
    }

    public void addRating(int rating) {
        this.totalRatings = (this.totalRatings + rating) / 2;
    }

    public void setCheckedOut() {
        checkedOut = true;
    }

    public void setCheckedIn() {
        checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title" + title + " | rating: " + totalRatings + " | is available: " + checkedOut;
    }
}
