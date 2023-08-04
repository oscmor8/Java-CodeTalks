public class JavaCodeTalks {
    public static int factorial(int n) {
        // that takes an integer parameter n. It's designed to calculate and return the factorial of the given number
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            // This for loop iterates from i = 1 to i being less than or equal to the input n.
            // It calculates the factorial by multiplying the result with the current value of i.
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        // runs the method utilizing the number 5, the end display will show 120 is the factorial of 5
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

