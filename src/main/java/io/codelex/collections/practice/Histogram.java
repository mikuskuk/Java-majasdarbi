package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        displayHistogram(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void displayHistogram(String scores) {
        int[] range = new int[11];

        String[] scoreStrings = scores.split(" ");
        for (String scoreString : scoreStrings) {
            int score = Integer.parseInt(scoreString);
            range[score / 10]++;
        }

        for (int i = 0; i < range.length; i++) {
            int lower = i * 10;
            int upper = (i == 10) ? 100 : i * 10 + 9;

            String histogram = String.format("%02d-%02d: %s", lower, upper, getHistogramStars(range[i]));
            System.out.println(histogram);
        }
    }

    private static String getHistogramStars(int count) {
        return "*".repeat(Math.max(0, count));
    }
}
