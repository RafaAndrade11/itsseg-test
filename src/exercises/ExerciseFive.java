package exercises;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UtilityMethods utilityMethods = new UtilityMethods();

        utilityMethods.typeYourSentence();
        String sentence = scan.nextLine();

        System.out.println(utilityMethods.reverseWordsInASentence(sentence));
    }
}
