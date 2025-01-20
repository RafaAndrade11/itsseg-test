package exercises;

public class UtilityMethods {
    //declarando essas variaveis como final para testarmos se estarão corretas utilizando os Getters
    private final String allAlphabetLetters = "abcdefghijklmnopqrstuvwyxz";
    private final String vowels = "aeiouAEIOU";

    public String getAllAlphabetLetters() {
        return allAlphabetLetters;
    }

    public String getVowels() {
        return vowels;
    }

    //EXERCICIO UM
    public boolean checkSentenceIsPangrammatic(String sentence) {
        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("A sentença não pode ser vazia.");
        }

        sentence = sentence.toLowerCase();

        for (char letter : allAlphabetLetters.toCharArray()) {
            if (sentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    //EXERCICIO DOIS
    public String removingVowelsInOffensiveComments(String sentence) {
        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("A sentença não pode ser vazia.");
        }

        StringBuilder newSentence = new StringBuilder();

        for (char letter : sentence.toCharArray()) {
            if (vowels.indexOf(letter) == -1) {
                newSentence.append(letter);
            }
        }

        return newSentence.toString();
    }

    //EXERCICIO TRES
    public String findHighestAndLowestNumber(String sentenceNumbers) {
        if (sentenceNumbers.trim().isEmpty()) {
            throw new IllegalArgumentException("A sentença não pode ser vazia.");
        }

        String[] numbers = sentenceNumbers.split(" ");

        int highestNumer = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;

        for (String num : numbers) {
            int currentNumber = Integer.parseInt(num);

            if (currentNumber > highestNumer) {
                highestNumer = currentNumber;
            }
            if (currentNumber < lowestNumber) {
                lowestNumber = currentNumber;
            }
        }
        return (highestNumer + " " + lowestNumber);
    }

    //EXERCICIO QUATRO
    public boolean checkFirsStringEndsWithSecondString(String firstString, String secondString) {
        if (firstString.trim().isEmpty() || secondString.trim().isEmpty()) {
            throw new IllegalArgumentException("As strings não podem ser vazias.");
        }
        if (secondString.length() > firstString.length()) {
            return false;
        }

        String lastPartOfFirstString = firstString.substring(firstString.length() - secondString.length());

        return lastPartOfFirstString.equals(secondString);
        // usar .equalsIgnoreCase caso queira igualar maiusculas e minusculas
    }

    //EXERCICIO CINCO
    public StringBuilder reverseWordsInASentence(String sentence) {
        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("A sentença não pode ser vazia.");
        }

        StringBuilder newSentence = new StringBuilder();
        String[] wordsSeparete = sentence.split(" ");

        boolean firstWord = true;

        for (String word : wordsSeparete) {
            if (!firstWord) {
                newSentence.append(" ");
            }
            newSentence.append(new StringBuilder(word).reverse());
            firstWord = false;
        }
        return newSentence;
    }

    //EXERCICIO SEIS
    public int returnSumOfDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }

        String numberStr = Integer.toString(number);

        int sum = 0;
        int start = 0;
        int end = numberStr.length() - 1;

        while (start <= end) {
            if (start != end) {
                int firstLastPair = Integer.parseInt(numberStr.charAt(start) + "" + numberStr.charAt(end));
                sum += firstLastPair;
            } else {
                sum += Character.getNumericValue(numberStr.charAt(start));
            }
            start++;
            end--;
        }
        return sum;
    }

    //DIGITE SUA FRASE
    public void typeYourSentence() {
        System.out.print("Digite sua frase: ");
    }
}
