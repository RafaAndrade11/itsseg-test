package tests;

import exercises.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFourTest {
    UtilityMethods utilityMethods = new UtilityMethods();

    @Test
    public void shouldReturnTrueWhenFirstStringEndsWithSecondString() {
        String input = "abc";
        String expected = "bc";
        assertTrue(expected, utilityMethods.checkFirsStringEndsWithSecondString(input,expected));
    }

    @Test
    public void shouldReturnFalseWhenFirstStringDoesNotEndWithSecondString() {
        String input = "abc";
        String expected = "d";
        assertFalse(expected, utilityMethods.checkFirsStringEndsWithSecondString(input,expected));
    }
}
