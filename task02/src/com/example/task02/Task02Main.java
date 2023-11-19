package com.example.task02;

public class Task02Main {

    public static void main(String[] args)
    {
        System.out.println(getSeason(99));
    }

    static String getSeason(int monthNumber)
    {
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12)
            return "зима";
        if (monthNumber > 2 && monthNumber < 6)
            return "весна";
        if (monthNumber > 5 && monthNumber < 9)
            return "лето";
        if (monthNumber > 8 && monthNumber < 12)
            return "осень";
        else
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
    }
}