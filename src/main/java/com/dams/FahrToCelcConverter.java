package com.dams;

public class FahrToCelcConverter {
    public static int toFahrenheit(int celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static int toCelcius(int fahren) {
        return 5 * (fahren - 32) / 9;
    }
}
