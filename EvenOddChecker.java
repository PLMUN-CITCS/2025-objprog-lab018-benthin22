import java.util.Scanner;

public class EvenOddChecker {
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static String checkEvenOrOdd(int number) {
        return number + (number % 2 == 0 ? " is an Even number." : " is an Odd number.");
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOrOdd(getIntegerInput()));
    }
}

