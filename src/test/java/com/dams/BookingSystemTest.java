package com.dams;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class BookingSystemTest {
    
    @Test
    void testGetAllBookings() {
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.addHour(10);
        bookingSystem.addHour(11);
        bookingSystem.addHour(12);

        assertThat(bookingSystem.getHours())
            .as("Check all hours")
            .hasSize(3);
        
        assertThat(bookingSystem.getHours().get(0)).isEqualTo(10);
        assertThat(bookingSystem.getHours().get(1)).isEqualTo(11);
        assertThat(bookingSystem.getHours().get(2)).isEqualTo(12);
    }

    @Test
    void testNotAllowSameHour() {
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.addHour(10);
        
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> { bookingSystem.addHour(10); });
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, 25 })
    void testNotAllowOffsetHour(int hour) {
        BookingSystem bookingSystem = new BookingSystem();
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> { bookingSystem.addHour(hour); });
    }
}
