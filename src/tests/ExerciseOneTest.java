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
        String pangram3 = "";
        assertFalse(utilityMethods.checkSentenceIsPangrammatic(pangram3));
    }
}
