package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,-2018));
    }

    private static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return (year % 400 == 0);
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /*
    January – 31 days
    February – 28 days in a common year and 29 days in leap years
    March – 31 days
    April – 30 days
    May – 31 days
    June – 30 days
    July – 31 days
    August – 31 days
    September – 30 days
    October – 31 days
    November – 30 days
    December – 31 days
     */
    private static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {

            if (isLeapYear(year)) {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        return 31;
                    }
                    case 2 -> {
                        return 29;
                    }
                    case 4, 6, 9, 11 -> {
                        return 30;
                    }
                }
            }
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return 31;
                }
                case 2 -> {
                    return 28;
                }
                case 4, 6, 9, 11 -> {
                    return 30;
                }
            }

        }
        return -1;
    }

}
