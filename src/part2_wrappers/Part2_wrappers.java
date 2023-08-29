package part2_wrappers;
import java.util.Scanner;

public class Part2_wrappers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to my fist java Calculator!");
        // variable list entry
        System.out.print("Please, enter your first number: ");
        double number1 = in.nextDouble();

        System.out.print("Enter your second number: ");
        double number2 = in.nextDouble();
        //transaction list submission
        System.out.println("Select an operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square Root");
        System.out.println("6.Third degree: ");
        System.out.print("Enter the operation number: ");
        int operation = in.nextInt();
        //number manipulation
        double Result = 0;

        switch (operation) {
            case 1:
                Result = number1 + number2;
                break;
            case 2:
                Result = number1 - number2;
                break;
            case 3:
                Result = number1 * number2;
                break;
            case 4:
                if (number2 != 0) {
                    Result = number1 / number2;
                } else {

                    System.out.println("Cannot be divided by zero.");
                    return;
                }
                break;
            case 5:
                Result = Math.sqrt(number1);
                break;
            case 6:
                Result = Math.pow(number1, 3);
                break;
            default:
                System.out.println("Incorrect operation.");
                return;
        }

        System.out.println("Result: " + Result);
        System.out.println("Thanks for using this calculator!");
    }
}

