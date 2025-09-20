import java.util.Scanner;

class MathOperations {

    public static void checkSign(int num) {
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is NOT Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is NOT Prime");
        }
    }

    public static void sumOfDigits(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + num + " = " + sum);
    }

    public static void reverseNumber(int num) {
        int reverse = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reverse of " + num + " = " + reverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        checkSign(num);
        checkEvenOdd(num);
        checkPrime(num);

        if (num >= 100 && num <= 999) {
            sumOfDigits(num);
            reverseNumber(num);
        } else {
            System.out.println("Skipping digit operations (not a 3-digit number).");
        }

        scanner.close();
    }
}
