import java.util.Scanner;

class MultiplicationTableGenerator {


    public static void printTable(int number) {

        for (int i = 1; i <= 10; i++) {
            int result = number * i;

            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number to generate its multiplication table: ");
        int num = scanner.nextInt();
        printTable(num);

    }
}
