package day04;

public class Day2refactor {
	 static double calculateBMI(double weight, double height) {
	        return weight / (height * height);
	    }

	    public static void main(String[] args) {

	        double bmi = calculateBMI(57, 1.57);

	        System.out.println("BMI: " + bmi);

	        System.out.println(Utils.isEven(10));

	        System.out.println(Utils.maxOfThree(10, 20, 5));

	        System.out.println(Utils.reverseString("Java"));
	    }
}
