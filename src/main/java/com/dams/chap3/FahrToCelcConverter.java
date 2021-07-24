package com.dams.chap3;

public class FahrToCelcConverter {
    public static int toFahrenheit(int celsius) {
        return ((9 * celsius) / 5)  + 32;
    }

    public static int toCelcius(int fahren) {
        return 5 * (fahren - 32) / 9;
    }
}
