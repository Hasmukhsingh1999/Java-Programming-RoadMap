import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        /**
         * && (AND)-> if both operands are 'true' and 'false' otherwise.
         * || (OR)-> it returns 'true' if at least one of the operands is 'true'
         * and 'false' .
         * ! (NOT)-> it reverses the boolean value of its operands.
         * **/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        boolean isEligibleToVote = age >= 18;
        boolean isEligibleToDonate = age >= 18 && income >= 1000000;

        if (isEligibleToVote) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        if (isEligibleToDonate) {
            System.out.println("You are eligible to donate to a political campagin.");
        } else {
            System.out.println("You are not eligible to donate to a political campagin.");
        }

    }
}
