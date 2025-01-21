package tests;

import exercises.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseOneTest {
    UtilityMethods utilityMethods = new UtilityMethods();

    @Test
    public void shouldReturnTrueWhenSentenceContainsAllAlphabetLetters() {
        String pangram1 = "Quero faxina nas locadoras de video: jogue blitz com whisky PM";
        assertTrue(utilityMethods.checkSentenceIsPangrammatic(pangram1));
    }
    @Test
    public void shouldReturnFalseWhenSentenceDontContainsAllAlphabetLetters() {
        String pangram2 = "You shall not pass!";
        assertFalse(utilityMethods.checkSentenceIsPangrammatic(pangram2));
    }

    @Test
    public void shouldReturnFalseWhenSentenceIsEmpty() {
        String allAlphabetLetters = utilityMethods.getAllAlphabetLetters();
        String pangram3 = "";
        assertThrows(IllegalArgumentException.class, () -> utilityMethods.checkSentenceIsPangrammatic(pangram3));
    }

    @Test
    public void testVariableAllAlphabetLettersContainAllAlphabetLetters() {
        String allAlphabetLetters = utilityMethods.getAllAlphabetLetters();

        assertEquals(String.valueOf(26), 26, allAlphabetLetters.length());

        for (char letter = 'a'; letter <= 'z'; letter++) {
            assertTrue("A variável allAlphabetLetters deve conter a letra: " + letter,
                    allAlphabetLetters.contains(String.valueOf(letter)));
        }
    }
}
