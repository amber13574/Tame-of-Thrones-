package main.java;

public class Seasor implements Cipher {

    private final String message;
    private final int cipherFactor;
    private final char[] MESSAGE_CHAR = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Seasor(String message, int cipherFactor) {
        this.message = message;
        this.cipherFactor = cipherFactor;
    }

    @Override
    public String decryptMessage() {
        char[] messageCharArray = message.toCharArray();
        for (int idx = 0; idx < messageCharArray.length; idx++) {
            if (messageCharArray[idx] != ' ') {
                messageCharArray[idx] = MESSAGE_CHAR[(messageCharArray[idx] - 'A' - cipherFactor + 26) % 26];
            }
        }
        return String.valueOf(messageCharArray);
    }
}
