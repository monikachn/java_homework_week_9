package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c='N' ;
        do {

            System.out.println("Enter the first number : ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number : ");
            int b = scanner.nextInt();
            System.out.println("Please select the calculation symbol +, -, *, / : ");
            char symbol = scanner.next().charAt(0);

            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);

            System.out.println("Would you like to do more calculation Please enter “Y” or “N” " );
            c= scanner.next().charAt(0);
        } while (c=='Y');
        System.out.println("Thank you ");
        //Closing the scanner object
        scanner.close();
    }
}