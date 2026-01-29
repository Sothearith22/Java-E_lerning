package Basic.Function;

public class function1 {
    // Method to add two integers
     static int add(int x, int y) {
        int sum = x + y;      // Performs the specific task
        return sum;           // Returns the result
    }

    // The main method (entry point of the program)
     static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        // Calling the "add" method
        int result = add(num1, num2);
        System.out.println("The sum is: " + result); // Output: The sum is: 15
    }
}