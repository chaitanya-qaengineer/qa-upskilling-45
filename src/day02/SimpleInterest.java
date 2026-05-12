package day02;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1000;
        double rate = 5;
        double time = 2;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + si);
	}

}
