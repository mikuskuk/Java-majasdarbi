package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private int averageRating;
    private int totalRatings;

    public Video(String title) {
        this.title = title;
        checkedOut = false;
        averageRating = 0;
        totalRatings = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnVideo() {
        checkedOut = false;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void receiveRating(int rating) {
        averageRating = (averageRating * totalRatings + rating) / (totalRatings + 1);
        totalRatings++;
    }

    @Override
    public String toString() {
        String status = checkedOut ? "Checked out" : "On shelves";
        return "Title: " + title + ", Average Rating: " + averageRating + ", Status: " + status;
    }
}
