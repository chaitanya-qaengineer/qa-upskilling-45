package day04;

public class Day3refactor {
	 static void printNumbers(int limit) {

	        for (int i = 1; i <= limit; i++) {

	            if (Utils.isEven(i)) {
	                System.out.println(i + " is Even");
	            } else {
	                System.out.println(i + " is Odd");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        printNumbers(10);
	    }
}
