package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void checkOutVideo(String title) {
        Video video = findVideo(title);
        video.setCheckedIn();
    }

    public void returnVideo(String title) {
        Video video = findVideo(title);
        video.setCheckedOut();
    }

    public void receiveRating(String title, int rating) {
        Video video = findVideo(title);
        video.addRating(rating);
    }

    public void addToInventory(String title, int rating) {
        Video video2 = new Video(title, rating);
        inventory.add(video2);
    }

    public void getInventory() {
        for (Video video : inventory) {
            System.out.println(video);
        }
    }

    public Video findVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        return null;
    }
}
