/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex21;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int monthNum = myApp.readMonth();
        String month = myApp.monthName(monthNum);

        String output = myApp.generateOutput(month);
        myApp.outputString(output);
    }

    public int readMonth() {
        System.out.print("Please enter the number of the month: ");

        int num = in.nextInt();

        while (num < 1 || num > 12) {
            System.out.print("Invalid month. Enter again: ");
            num = in.nextInt();
        }

        return num;
    }

    public String monthName(int monthNum) {
        String month = null;

        switch (monthNum) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> System.out.print("Invalid month.\n");
        }

        return month;
    }

    public String generateOutput(String month) {
        return String.format("The name of the month is %s.", month);
    }

    public void outputString(String output) {
        System.out.print(output);
    }

}
