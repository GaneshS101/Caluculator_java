import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float num1;
        float num2;
        float Final;
        char operation;
        char Confirm;
        boolean On = true;


        while(On) {
            try {

                System.out.println("This is a calculator");
                System.out.print("Do you want to enter or quit e/q: ");
                Confirm = scanner.next().charAt(0);

                if (Confirm == 'q') {
                    On = false;
                }
                else if (Confirm == 'e') {

                    System.out.print("Please give your first number: ");
                    num1 = scanner.nextFloat();

                    System.out.print("Please give your second number: ");
                    num2 = scanner.nextFloat();

                    System.out.print("Please give the operation you want, +, -, x, /, or %: ");
                    operation = scanner.next().charAt(0);

                    if (operation == '+') {
                        Final = num1 + num2;
                        System.out.printf("The sum of %.2f and %.2f is %.3f %n", num1, num2, Final);
                    }

                    else if (operation == '-') {
                        Final = num1 - num2;
                        System.out.printf("The difference of %.2f and %.2f is %.3f %n", num1, num2, Final);
                    }

                    else if (operation == 'x') {
                        Final = num1 * num2;

                        System.out.printf("The product of %.2f and %.2f is %.3f %n", num1, num2, Final);
                    }

                    else if (operation == '/') {
                        Final = num1 / num2;
                        System.out.printf("The quotient of %.2f and %.2f is %.3f %n", num1, num2, Final);
                    }

                    else if (operation == '%') {
                        Final = num1 % num2;
                        System.out.printf("The remainder of %.2f divided by %.2f is %.3f %n", num1, num2, Final);
                    }

                    else {
                        System.out.println("That is not a valid operator");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid numbers");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
