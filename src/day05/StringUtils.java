package day05;

import java.util.HashMap;

public class StringUtils {
	static String reverseString(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    static int countVowels(String text) {

        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

                count++;
            }
        }

        return count;
    }

    static boolean isAnagram(String str1, String str2) {

        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }

    static String capitalizeWords(String text) {

        String[] words = text.split(" ");

        String result = "";

        for (String word : words) {

            result +=
                word.substring(0,1).toUpperCase() +
                word.substring(1).toLowerCase() +
                " ";
        }

        return result.trim();
    }

    static HashMap<Character, Integer> characterFrequency(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }
}
