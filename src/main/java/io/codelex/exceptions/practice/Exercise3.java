package io.codelex.exceptions.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) {

        RandomAccessFile input = null;

        try {
            input = new RandomAccessFile(file, "r");
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error reading file " + file.getAbsolutePath());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Error closing file " + file.getAbsolutePath());
                }
            }
        }
    }
}
