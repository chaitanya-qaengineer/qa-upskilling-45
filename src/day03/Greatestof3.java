package day03;

public class Greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		int c = 9;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest number");
		} else if(b>c && b>a)
		{
			System.out.println("b is the greatest number");

		}else if(c> a&& c>b) {
			System.out.println("c is the greatest number");

		}

	}

}
