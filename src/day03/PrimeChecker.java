package day03;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 13;
	        boolean isPrime = true;

	        if(num <= 1) {
	            isPrime = false;
	        }

	        for(int i = 2; i < num; i++) {

	            if(num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if(isPrime) {
	            System.out.println("Prime");
	        } else {
	            System.out.println("Not Prime");
	        }

	}

}
