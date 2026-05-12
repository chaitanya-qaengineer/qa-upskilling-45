package day02;

public class BMIcalculator {
	public static void main(String[] args) {
	
	double height = 1.67;
	double weight = 60;
	
	System.out.println("Weight: " + weight);
    System.out.println("Height: " + height);
    
	double bmi = weight/(height*height);
	System.out.println("BMI is : " + bmi);
		
	}

}
