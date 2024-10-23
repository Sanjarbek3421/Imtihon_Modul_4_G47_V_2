package org.example.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z, A-Z, 0-9] {8}");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Password.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
