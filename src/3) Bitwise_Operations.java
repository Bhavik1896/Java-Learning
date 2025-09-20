import java.util.Scanner;

class BitwiseAndLogicalOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum of a and b = " + sum);

        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND of a and b = " + bitwiseAnd);

        int bitwiseOr = a | b;
        System.out.println("Bitwise OR of a and b = " + bitwiseOr);

        int bitwiseXor = a ^ b;
        System.out.println("Bitwise XOR of a and b = " + bitwiseXor);

        int leftShift = a << 2;
        System.out.println("a left shifted by 2 bits = " + leftShift);

        int rightShift = b >> 3;
        System.out.println("b right shifted by 3 bits = " + rightShift);

        boolean logicalAnd = (a > 10) && (b < 20);
        System.out.println("(a > 10) AND (b < 20) = " + logicalAnd);

        boolean logicalOr = (a < 5) || (b > 15);
        System.out.println("(a < 5) OR (b > 15) = " + logicalOr);

        scanner.close();
    }
}
