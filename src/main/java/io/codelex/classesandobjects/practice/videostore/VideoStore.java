package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void addVideo(String title) {
        Video video = new Video(title);
        inventory.add(video);
    }

    public void checkOutVideo(String title) {
        Video video = findVideo(title);
        if (video != null && !video.isCheckedOut()) {
            video.checkOut();
        }
    }

    public void returnVideo(String title) {
        Video video = findVideo(title);
        if (video != null && video.isCheckedOut()) {
            video.returnVideo();
        }
    }

    public void receiveRating(String title, int rating) {
        Video video = findVideo(title);
        if (video != null) {
            video.receiveRating(rating);
        }
    }

    public void listInventory() {
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
