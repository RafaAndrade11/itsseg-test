package tests;

import exercises.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExerciseTwoTest {
    UtilityMethods utilityMethods = new UtilityMethods();

    @Test
    public void shouldRemoveVowelsFromSentenceWithSimpleOffensiveComment() {
        String input = "This website is for losers LOL!";
        String expected = "Ths wbst s fr lsrs LL!";
        assertEquals(expected, utilityMethods.removingVowelsInOffensiveComments(input));
    }

    @Test
    public void shouldRemoveVowelsFromSentenceWithComplexOffensiveComment() {
        String input = "No offense but, Your writing is among the worst I've ever read";
        String expected = "N ffns bt, Yr wrtng s mng th wrst 'v vr rd";
        assertEquals(expected, utilityMethods.removingVowelsInOffensiveComments(input));
    }

    @Test
    public void shouldRemoveVowelsFromSentenceWithQuestion() {
        String input = "What are you, a communist?";
        String expected = "Wht r y,  cmmnst?";
        assertEquals(expected, utilityMethods.removingVowelsInOffensiveComments(input));
    }

    @Test
    public void testVariableVowelsContainAllAlphabetVowels() {
        String allVowels = utilityMethods.getVowels();
        String vowels = "aeiouAEIOU";

        assertEquals(String.valueOf(10), 10, allVowels.length());

        for (char vowel : vowels.toCharArray()) {
            assertTrue(allVowels.contains(String.valueOf(vowel)));
        }
    }
}
