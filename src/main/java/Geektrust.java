package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Geektrust {

    public static void main(String[] args) throws FileNotFoundException {

        List<String> listOfInputMessages = new ArrayList<>();
        String filePath = args[0];
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            listOfInputMessages.add(s);
        }
        MessageClient messageClient = new MessageClient(listOfInputMessages);
        messageClient.messageEvaluator();
    }
}
