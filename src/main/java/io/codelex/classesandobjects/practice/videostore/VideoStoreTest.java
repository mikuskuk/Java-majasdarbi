package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final VideoStore videoStore = new VideoStore();
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate video (as user)");
            System.out.println("Choose 5 to show all videos");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    receiveRating(keyboard);
                case 5:
                    videoStore.getInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name: ");
            String movieName = scanner.next();
            scanner.nextLine();

            System.out.println("Enter rating: ");
            int rating = scanner.nextInt();

            videoStore.addToInventory(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name: ");
        String movieName = scanner.next();
        videoStore.checkOutVideo(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name: ");
        String movieName = scanner.next();
        videoStore.returnVideo(movieName);
    }

    public static void receiveRating(Scanner scanner) {
        System.out.println("Enter title of the movie you want to rate?: ");
        scanner.nextLine();
        String movieName = scanner.nextLine();

        System.out.println("Enter rating 1-10: ");
        int rating = scanner.nextInt();
        videoStore.receiveRating(movieName, rating);
    }
}
