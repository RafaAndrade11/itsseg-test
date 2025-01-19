package tests;

import exercises.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseFiveTest {
    UtilityMethods utilityMethods = new UtilityMethods();

    @Test
    public void shouldReverseWordsInSentenceWithSingleSpaces() {
        UtilityMethods utilityMethods = new UtilityMethods();
        String input = "This is an example!";

        assertEquals("sihT si na !elpmaxe", utilityMethods.reverseWordsInASentence(input).toString());
    }

    @Test
    public void shouldReverseWordsInSentenceWithDoubleSpaces() {
        UtilityMethods utilityMethods = new UtilityMethods();
        String input = "double  spaces";

        assertEquals("elbuod  secaps", utilityMethods.reverseWordsInASentence(input).toString());
    }


}
