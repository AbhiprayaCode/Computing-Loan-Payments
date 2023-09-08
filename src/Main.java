import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print("Monthly interest rate: ");
        Scanner input1 = new Scanner(System.in);
        double monthlyInterestRate = input1.nextDouble();

        System.out.print("Number of years: ");
        Scanner input2 = new Scanner(System.in);
        double numberOfYears = input2.nextDouble();

        System.out.print("Loan Amount: ");
        Scanner input3 = new Scanner(System.in);
        double loanAmount = input3.nextDouble();

        double monthlyPayment;
        monthlyPayment = (int) (loanAmount * monthlyInterestRate / (1 - (1 / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)))));
        System.out.println("You must pay: Rp " + monthlyPayment + "per month");

        System.out.println(monthlyPayment);
    }
}