package day05;

public class StringUtilsTest {
	public static void main(String[] args) {

        System.out.println(
            StringUtils.reverseString("Java")
        );

        System.out.println(
            StringUtils.countVowels("Automation")
        );

        System.out.println(
            StringUtils.isAnagram("listen", "silent")
        );

        System.out.println(
            StringUtils.capitalizeWords("hello world")
        );

        System.out.println(
            StringUtils.characterFrequency("banana")
        );
    }
}
