package io.codelex.knowledgecheck.exercise4;

import java.io.*;

public class ReverseFile {

    public static void reverseFile(String filePath) {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            String newContent = content.toString().trim();
            String reversedContent = new StringBuilder(newContent).reverse().toString();

            reader.close();

            String fileName = file.getName();
            int index = fileName.lastIndexOf(".");
            String extension = fileName.substring(index);
            String reverseFileName = new StringBuilder(fileName.substring(0, index))
                    .reverse()
                    .append(extension)
                    .toString();

            FileWriter fileWriter = new FileWriter(reverseFileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(reversedContent);

            writer.close();

        } catch (IOException e) {
            System.out.println("Error reading file " + filePath);
        }
    }

}
