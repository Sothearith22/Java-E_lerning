package Basic;

public class StaticVarible {

    static String schoolName = "ABC High School"; // static variable
    String name;   // instance variable

    // constructor
    public StaticVarible(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // create 2 objects
        StaticVarible s1 = new StaticVarible("Dara");
        StaticVarible s2 = new StaticVarible("Sok");

        // access static variable
        System.out.println("Student 1 School: " + StaticVarible.schoolName);
        System.out.println("Student 2 School: " + StaticVarible.schoolName);

        // change static variable
        StaticVarible.schoolName = "New Generation School";

        // both objects see updated value
        System.out.println("Student 1 School: " + StaticVarible.schoolName);
        System.out.println("Student 2 School: " + StaticVarible.schoolName);
    }
}
