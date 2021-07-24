package com.dams;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

    private List<Integer> hours;

    public BookingSystem() {
        hours = new ArrayList<>();
    }

    public void addHour(int hour) {
        if (hour < 0 || hour >= 23) {
            throw new IllegalArgumentException("Ilegal hour!");
        }

        if (hours.contains(hour)) {
            throw new IllegalArgumentException("Already booked!");
        }

        hours.add(hour);
    }

    public List<Integer> getHours() {
        return hours;
    }


}
