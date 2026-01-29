package Basic;
import java.util.Scanner;
public class DemoIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter true or false: ");
        boolean b = Boolean.parseBoolean(scanner.nextLine().trim());

        if (b) {
            System.out.println("Repaired or Change Now");
            System.out.println("This is the Test of if condition in From 1");
        } else {
            System.out.println("Condition is false.");
        }

        scanner.close();
    }
}
