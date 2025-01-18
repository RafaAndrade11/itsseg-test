import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UtilityMethods utilityMethods = new UtilityMethods();

        System.out.print("Digite a primeira string: ");
        String firstString = scan.next();
        System.out.print("Digite a segunda string: ");
        String secondString = scan.next();

        System.out.println("Primeira string termina com a segunda: " + utilityMethods.checkFirsStringEndsWithSecondString(firstString,secondString));
    }
}
