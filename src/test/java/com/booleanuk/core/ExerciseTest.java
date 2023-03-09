package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    @Order(1)
    public void oneShouldBe24() {
        Assertions.assertEquals(24, this.exercise.numOnePlusTwo);
    }

    @Test
    @Order(2)
    public void twoShouldBe512() {
        Assertions.assertEquals(512, this.exercise.numThreeTimesNumTwo);
    }

    @Test
    @Order(3)
    public void threeShouldBe4() {
        Assertions.assertEquals(4, this.exercise.numThreeDividedByNumOne);
    }

    @Test
    @Order(4)
    public void fourShouldBe24() {
        Assertions.assertEquals(24, this.exercise.numThreeMinusNumOne);
    }

    @Test
    @Order(5)
    public void fiveShouldBe56() {
        Assertions.assertEquals(56, this.exercise.sum);
    }

    @Test
    @Order(6)
    public void sixShouldBe7() {
        Assertions.assertEquals(7, this.exercise.numBytes);
    }

    @Test
    @Order(7)
    public void sevenShouldBeZ() {
        Assertions.assertEquals('Z', this.exercise.lastLetter);
    }

    @Test
    @Order(8)
    public void eightShouldBe3p14() {
        Assertions.assertEquals(3.14f, this.exercise.pi);
    }

    @Test
    @Order(9)
    public void nineShouldBe3p14159() {
        Assertions.assertEquals(3.14159d, this.exercise.piD);
    }

    @Test
    @Order(10)
    public void tenShouldBeJaneSmith() {
        Assertions.assertEquals("Jane Smith", this.exercise.fullName);
    }

    @Test
    @Order(11)
    public void elevenShouldBeJ() {
        Assertions.assertEquals('J', this.exercise.tenthLetter);
    }

    @Test
    @Order(12)
    public void twelveShouldBeLowerAlphabet() {
        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", this.exercise.lowerAlphabet);
    }

    @Test
    @Order(13)
    public void thirteenShouldBe26() {
        Assertions.assertEquals(26, this.exercise.alphabetLength);
    }

    @Test
    @Order(14)
    public void fourteenShouldBe7() {
        Assertions.assertEquals(7, this.exercise.remainder);
    }
}
