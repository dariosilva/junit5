package com.dams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeDigitsTest {
    
    @ParameterizedTest
    @CsvSource(value = {
        "abc 12;''",
        "cdefg 345 12bb23;345",
        "cdefg 345 12bbb33 678tt;345, 678"
        }, delimiter = ';')
    void test3DigitsInARow(String input, String correctOutput) {
        assertThat(ThreeDigits.parse(input)).isEqualTo(correctOutput);
    }
    
}
