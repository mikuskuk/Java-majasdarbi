package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static final Map<String, List<String>> flights = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        loadFlights();

        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("What would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press #");

            String in = input.nextLine();

            switch (in) {
                case "1" -> displayCities();
                case "#" -> exit = true;
                default -> System.out.println("Invalid input, try again.");
            }
        }
    }

    private static void loadFlights() throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        for (String item : Files.readAllLines(path, charset)) {
            item = item.trim();
            if (!item.isEmpty()) {
                String[] cities = item.split("->");
                String from = cities[0].trim();
                String to = cities[1].trim();

                flights.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
            }
        }
    }

    private static void displayCities() {
        Set<String> cities = flights.keySet();
        System.out.println("Cities available:");
        for (String city : cities) {
            System.out.println(city);
        }

        Scanner input = new Scanner(System.in);
        boolean validCity = false;
        String cityFrom = "";

        while (!validCity) {
            System.out.println("Enter the city name you would like to fly from:");
            cityFrom = input.nextLine();

            if (flights.containsKey(cityFrom)) {
                validCity = true;
            } else {
                System.out.println("Invalid city, try again.");
            }
        }

        List<String> trip = new ArrayList<>();
        trip.add(cityFrom);

        String currentCity = cityFrom;
        String cityTo;

        while (true) {
            List<String> destinations = flights.get(currentCity);
            System.out.println("From " + currentCity + " you can fly directly to:");

            for (String destination : destinations) {
                System.out.println(destination);
            }

            System.out.println("Enter name for next city or # to finish:");
            cityTo = input.nextLine();

            if (cityTo.equals("#")) {
                if (trip.size() > 1 && trip.get(0).equals(trip.get(trip.size() - 1))) {
                    System.out.println("Round-trip route chosen:");
                    for (String city : trip) {
                        System.out.println(city);
                    }
                } else {
                    System.out.println("Invalid route, no round trip selected!");
                }
                break;
            } else if (destinations.contains(cityTo)) {
                trip.add(cityTo);
                currentCity = cityTo;
            } else {
                System.out.println("Invalid city, try again.");
            }

        }
    }
}
