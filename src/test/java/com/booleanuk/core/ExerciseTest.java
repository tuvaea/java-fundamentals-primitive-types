package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void oneShouldBe24() {
        Assertions.assertEquals(24, this.exercise.numOnePlusTwo);
    }

    @Test
    public void twoShouldBe512() {
        Assertions.assertEquals(512, this.exercise.numThreeTimesNumTwo);
    }

    @Test
    public void threeShouldBe4() {
        Assertions.assertEquals(4, this.exercise.numThreeDividedByNumOne);
    }

    @Test
    public void fourShouldBe24() {
        Assertions.assertEquals(24, this.exercise.numThreeMinusNumOne);
    }

    @Test
    public void fiveShouldBe56() {
        Assertions.assertEquals(56, this.exercise.sum);
    }

    @Test
    public void sixShouldBe7() {
        Assertions.assertEquals(7, this.exercise.numBytes);
    }

    @Test
    public void sevenShouldBeZ() {
        Assertions.assertEquals('Z', this.exercise.lastLetter);
    }

    @Test
    public void eightShouldBe3p14() {
        Assertions.assertEquals(3.14f, this.exercise.pi);
    }

    @Test
    public void nineShouldBe3p14159() {
        Assertions.assertEquals(3.14159d, this.exercise.piD);
    }

    @Test
    public void tenShouldBeJaneSmith() {
        Assertions.assertEquals("Jane Smith", this.exercise.fullName);
    }

    @Test
    public void elevenShouldBeJ() {
        Assertions.assertEquals('J', this.exercise.tenthLetter);
    }

    @Test
    public void twelveShouldBeLowerAlphabet() {
        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", this.exercise.lowerAlphabet);
    }

    @Test
    public void thirteenShouldBe26() {
        Assertions.assertEquals(26, this.exercise.alphabetLength);
    }

    @Test
    public void fourteenShouldBe7() {
        Assertions.assertEquals(7, this.exercise.remainder);
    }
}
