package io.codelex.numberstriviaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class NumbersTriviaGame {
    private static final int MAX_QUESTIONS = 20;
    private static final String API_BASE_URL = "http://numbersapi.com";

    private final List<String> questions;
    private final List<String> answers;
    private int currentQuestionIndex;
    private int score;

    public NumbersTriviaGame() {
        questions = new ArrayList<>();
        answers = new ArrayList<>();
        currentQuestionIndex = 0;
        score = 0;
    }

    public void startGame() {
        if (!fetchQuestions()) {
            System.out.println("Failed to fetch questions.");
            return;
        }

        System.out.println("Welcome to Numbers Trivia Game! Lets start!");

        while (currentQuestionIndex < MAX_QUESTIONS) {
            String question = getNextQuestion();
            System.out.println("Question: " + (currentQuestionIndex + 1) + ": " + question);

            List<String> options = generateOptions();
            displayOptions(options);

            int userAnswer = getUserAnswer(options.size());
            int optionsCount = 4;
            int correctAnswerIndex = generateCorrectAnswerIndex(optionsCount);
            String correctAnswer = getCorrectAnswer(options, correctAnswerIndex);

            if (isAnswerCorrect(userAnswer, correctAnswerIndex)) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer! The correct answer was: " + correctAnswer);
                break;
            }

            currentQuestionIndex++;
        }

        System.out.println("Game over!");
        System.out.println("Your score: " + score + " out of " + currentQuestionIndex);

        if (score == 0) {
            System.out.println("Too bad, better luck next time.");
        } else if (score > 0 && score <= 10) {
            System.out.println("Keep improving and you will get there!");
        } else if (score > 10 && score <= 15) {
            System.out.println("Not too bad, but can you do better?");
        } else if (score > 15 && score <= 19) {
            System.out.println("Wow you are really good at this!");
        } else {
            System.out.println("You are the king of this Numbers Trivia Game!");
        }
    }

    private boolean fetchQuestions() {
        Random random = new Random();

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            int number = random.nextInt(100) + 1;
            String apiUrl = API_BASE_URL + "/" + number;

            try {
                URL url = new URL(apiUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String response = reader.readLine();
                    reader.close();

                    questions.add(response.substring(response.indexOf(' ') + 1));
                    answers.add(String.valueOf(number));
                } else {
                    return false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return true;
    }

    private String getNextQuestion() {
        return questions.get(currentQuestionIndex);
    }

    private List<String> generateOptions() {
        List<String> options = new ArrayList<>();

        options.add(answers.get(currentQuestionIndex));

        Random random = new Random();
        while (options.size() < 4) {
            int number = random.nextInt(100) + 1;
            if (!options.contains(String.valueOf(number))) {
                options.add(String.valueOf(number));
            }
        }

        Collections.shuffle(options);

        return options;
    }

    private void displayOptions(List<String> options) {
        for (int i = 0; i < options.size(); i++) {
            String option = options.get(i);
            System.out.println((i + 1) + ". " + option);
        }
    }

    private int getUserAnswer(int maxOptions) {
        Scanner scanner = new Scanner(System.in);
        int answer = -1;

        while (answer < 1 || answer > maxOptions) {
            System.out.println("Enter your answer 1-" + maxOptions + ": ");
            try {
                answer = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }

            if (answer < 1 || answer > maxOptions) {
                System.out.println("Invalid answer! Please enter number 1-" + maxOptions + "!");
            }
        }

        return answer;
    }

    private int generateCorrectAnswerIndex(int optionsCount) {
        Random random = new Random();
        return random.nextInt(optionsCount);
    }

    private String getCorrectAnswer(List<String> options, int correctAnswerIndex) {
        if (correctAnswerIndex >= 0 && correctAnswerIndex < options.size()) {
            return options.get(correctAnswerIndex);
        } else {
            return null;
        }
    }

    private boolean isAnswerCorrect(int userAnswer, int correctAnswer) {
        return userAnswer == correctAnswer;
    }
}
