import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1 = read.nextDouble();

        System.out.println("Enter second number : ");
        double num2 = read.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = read.next();

        double output;

        switch (operator){
            case "+":
                output = num1 + num2;
                System.out.println("The Sum = "+output);
                break;
            case "-":
                output = num1 - num2;
                System.out.println("The Subtraction = "+output);
                break;
            case "*":
                output = num1 * num2;
                System.out.println("The Multiplication = "+output);
                break;
            case "/":
                output = num1 / num2;
                System.out.println("The Division = "+output);
                break;
            default:
                System.out.println("Error : Choose from this operation (+, -, *, /)");

        }
    }
}