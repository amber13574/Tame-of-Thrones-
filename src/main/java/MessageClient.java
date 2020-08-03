package main.java;

import java.util.*;

public class MessageClient {
    private static final int MINIMUM_NUMBERS_OF_KINGDOM_REQUIRED = 3;
    private final List<String> listOfInputMessages;

    MessageClient(List<String> listOfInputMessages) {
        this.listOfInputMessages = listOfInputMessages;
    }

    public void messageEvaluator() {
        Set<String> listOfAcquiredKingdoms = new LinkedHashSet<>();

        for (String message : listOfInputMessages) {
            String[] splitMessage = message.split(" ", 2);
            for (Kingdoms kingdom : Kingdoms.values()) {
                if (kingdom.getKingdomName().equals(splitMessage[0])) {
                    if (evaluateSecretMessage(kingdom, splitMessage[1])) {
                        listOfAcquiredKingdoms.add(kingdom.getKingdomName());
                    }
                }
            }
        }
        printListOfAcquiredKingdoms(listOfAcquiredKingdoms);
    }

    private void printListOfAcquiredKingdoms(Set<String> listOfAcquiredKingdoms) {
        if (listOfAcquiredKingdoms.size() >= MINIMUM_NUMBERS_OF_KINGDOM_REQUIRED) {
            System.out.print(Kingdoms.SPACE_EMBLEM.getKingdomName() + " ");
            for (String nameOfAcquiredKingdom : listOfAcquiredKingdoms) {
                System.out.print(nameOfAcquiredKingdom + " ");
            }
        } else {
            System.out.print("NONE");
        }
    }

    public boolean evaluateSecretMessage(Kingdoms kingdom, String message) {
        String decryptMessage = new Seasor(message, kingdom.getCipherFactor()).decryptMessage();
        return new MessageValidator(decryptMessage, kingdom.getKingdomEmblem()).checkMessageValidityToAcquireKingdom();
    }
}
