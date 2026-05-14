package day04;

public class Utils {

	static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Find maximum of three numbers
    static int maxOfThree(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    // Reverse string
    static String reverseString(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }
	}


