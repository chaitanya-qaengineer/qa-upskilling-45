package day07;

public class Main {
	 public static void main(String[] args) {

	        // Person object
	        Person p1 = new Person("Chaitanya", 30);

	        p1.introduce();

	        p1.setAge(31);

	        System.out.println("Updated Age: " + p1.getAge());

	        System.out.println("------------------");

	        // BankAccount object
	        BankAccount acc1 =
	                new BankAccount("Chaitanya", 5000);

	        acc1.deposit(1000);

	        acc1.withdraw(2000);

	        System.out.println("Current Balance: "
	                + acc1.getBalance());
	    }
}
