package Basic;

public class InstanceVarible {

    // Instance variables must be declared here
    String name;
    int age;

    // Constructor to initialize instance variables
    public InstanceVarible(String x, int y) {
        this.name = x;
        this.age = y;
    }

    public static void main(String[] args) {
        // create objects
        InstanceVarible person1 = new InstanceVarible("Alice", 30);
        InstanceVarible person2 = new InstanceVarible("Bob", 32);

        // Print info
        System.out.println("Your Name : " + person1.name);
        System.out.println("Your Age  : " + person1.age);

        System.out.println("Your Name : " + person2.name);
        System.out.println("Your Age  : " + person2.age);

        // modify
        person1.age = 32;
        System.out.println("\nAfter modifying person1 age:");
        System.out.println("Your Name : " + person1.name);
        System.out.println("Your Age  : " + person1.age);
    }
}
