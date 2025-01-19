package exercises;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UtilityMethods utilityMethods = new UtilityMethods();

        System.out.print("Digite um número: ");
        int number = scan.nextInt();

        System.out.println("Fechando em soma: " + utilityMethods.returnSumOfDigits(number));
    }

}
