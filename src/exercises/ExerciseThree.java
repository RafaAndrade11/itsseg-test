package exercises;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UtilityMethods utilityMethods = new UtilityMethods();

        System.out.print("Digite aqui os números separados por espaços: ");
        String numbersWithSpace = scan.nextLine();

        System.out.println(utilityMethods.findHighestAndLowestNumber(numbersWithSpace));
    }
}
