package com.dams;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringReverseTest {

    @ParameterizedTest
    @CsvSource({
        "USD, DSU",
        "EUR, RUE",
        "CHF, FHC"
        })
    void testReversetring(String str, String reversedStr) {
        assertThat(StringReverse.reverse(str)).isEqualTo(reversedStr);
    }

    @ParameterizedTest
    @CsvSource({
        "USD, DSUa",
        "EUR, RUEd",
        "CHF, FHCfd"
        })
    void testReversetringFail(String str, String reversedStr) {
        assertThat(StringReverse.reverse(str)).isNotEqualTo(reversedStr);
    }

    @Test
    void testException() {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> {
                StringReverse.reverse(null);
            });
    }
}
