package NumberProgram;

import java.util.Scanner;

public class DenominationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Define available denominations
        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Input amount
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println("Denomination breakdown:");
        
        for (int denom : denominations) {
            if (amount >= denom) {
                int count = amount / denom; // Number of notes/coins
                amount =amount % denom; // Remaining amount
                System.out.println(denom + " x " + count+" = "+(denom*count));
            }
        }
        
        scanner.close();

	}

}
