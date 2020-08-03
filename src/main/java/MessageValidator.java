package main.java;

import java.util.HashMap;
import java.util.Map;

public class MessageValidator {

    private final String decryptMessage;
    private final String kingdomEmblem;

    public MessageValidator(String decryptMessage, String kingdomEmblem) {
        this.decryptMessage = decryptMessage;
        this.kingdomEmblem = kingdomEmblem;
    }

    public boolean checkMessageValidityToAcquireKingdom() {
        Map<Character, Integer> messageMap = new HashMap<>();
        Map<Character, Integer> kingdomEmblemMap = new HashMap<>();
        for (Character c : decryptMessage.toCharArray()) {
            messageMap.put(c, messageMap.getOrDefault(c, 0) + 1);
        }
        for (Character c : kingdomEmblem.toCharArray()) {
            kingdomEmblemMap.put(c, kingdomEmblemMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> it : kingdomEmblemMap.entrySet()) {
            if (!messageMap.containsKey(it.getKey()) || messageMap.get(it.getKey()) < it.getValue()) {
                return false;
            }
        }
        return true;
    }
}
