package com.dams.chap3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FahrenheitCelciusConverterTest {

    @ParameterizedTest
    @CsvSource({
        "0, 32",
        "37, 98",
        "100, 212"
        })
    void shouldConvertCelciusToFahrenheit(int fahren, int celsius) {
        assertThat(FahrToCelcConverter.toFahrenheit(fahren)).isEqualTo(celsius);
    }

    @ParameterizedTest
    @CsvSource({
        "32, 0",
        "100, 37",
        "212, 100"
        })
    void shouldConvertFahrenheitToCelcius(int celsius, int fahren) {
        assertThat(FahrToCelcConverter.toCelcius(celsius)).isEqualTo(fahren);
    }
    
}
