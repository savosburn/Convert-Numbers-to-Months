/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Having a number that's too high or two low results in being stuck in a while loop until user enters
    //  a valid number. As a result, no final output is printed until user enters correct number.

    @Test
    public void output_january(){
        App myApp = new App();

        String month = myApp.monthName(1);
        String expectedOutput = "The name of the month is January.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void output_february(){
        App myApp = new App();

        String month = myApp.monthName(2);
        String expectedOutput = "The name of the month is February.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_march() {
        App myApp = new App();

        String month = myApp.monthName(3);
        String expectedOutput = "The name of the month is March.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_april() {
        App myApp = new App();

        String month = myApp.monthName(4);
        String expectedOutput = "The name of the month is April.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_may() {
        App myApp = new App();

        String month = myApp.monthName(5);
        String expectedOutput = "The name of the month is May.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_june() {
        App myApp = new App();

        String month = myApp.monthName(6);
        String expectedOutput = "The name of the month is June.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_july() {
        App myApp = new App();

        String month = myApp.monthName(7);
        String expectedOutput = "The name of the month is July.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_aug(){
        App myApp = new App();

        String month = myApp.monthName(8);
        String expectedOutput = "The name of the month is August.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_sep() {
        App myApp = new App();

        String month = myApp.monthName(9);
        String expectedOutput = "The name of the month is September.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_oct(){
        App myApp = new App();

        String month = myApp.monthName(10);
        String expectedOutput = "The name of the month is October.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_nov(){
        App myApp = new App();

        String month = myApp.monthName(11);
        String expectedOutput = "The name of the month is November.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_dec() {
        App myApp = new App();

        String month = myApp.monthName(12);
        String expectedOutput = "The name of the month is December.";
        String actualOutput = myApp.generateOutput(month);

        assertEquals(expectedOutput, actualOutput);
    }
}