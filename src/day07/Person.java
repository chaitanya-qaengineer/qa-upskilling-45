package day07;

public class Person {
	  // private fields
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    // method
    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
    }
}
