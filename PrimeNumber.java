public class PrimeNumber {
    public static boolean isPrime(int number) {
        // takes a number as a parameter
        if (number <= 1) {
            return false;
            // if the number is less than or equal to 1 it returns false
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
            // The for loop runs from i = 2 to i < number, checking if the number is divisible by any i.
            // If number % i == 0, it means the number has a divisor, and the method returns false,
            // meaning it's not prime.
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        // The isPrime() method is called with the number as an argument.
        // If the isPrime() method returns true, the program prints that the number is a prime number.
        // Otherwise, it prints that the number is not a prime number.
    }
}

