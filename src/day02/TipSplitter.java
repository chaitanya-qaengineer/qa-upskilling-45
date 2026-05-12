package day02;

public class TipSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill = 1200;
        double tip = 200;
        int people = 4;

        System.out.println("Bill Amount: " + bill);
        System.out.println("Tip Amount: " + tip);
        System.out.println("People: " + people);

        double total = bill + tip;

        System.out.println("Total Bill: " + total);

        double perPerson = total / people;

        System.out.println("Each person pays: " + perPerson);

	}

}
