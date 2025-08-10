package org.Assign;

public class SubstringSearch {
    public static void main(String[] args) {
        String bigString = "hellotherefriend";
        String searchString = "there";

        boolean found = isSubstring(bigString, searchString);

        if (found) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring NOT found.");
        }
    }

    public static boolean isSubstring(String big, String small) {
        int bigLen = big.length();
        int smallLen = small.length();

        if (smallLen > bigLen) return false;

        for (int i = 0; i <= bigLen - smallLen; i++) {
            boolean match = true;

            for (int j = 0; j < smallLen; j++) {
                if (big.charAt(i + j) != small.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) return true;
        }

        return false;
    }
}
