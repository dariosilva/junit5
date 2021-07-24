package com.dams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = { "test", "12345" })
    void testLengthPasswordFail(String str) {
        assertThat(passwordValidator.isValid(str))
            .as("Password length test - fail")
            .isEqualTo(false);
    }

    @ParameterizedTest
    @ValueSource(strings = { "testtest", "abcdeabcde" })
    void testLengthPasswordPassed(String str) {
        assertThat(passwordValidator.isValid(str))
            .as("Password length test - passed")
            .isEqualTo(false);
    }

    @Test
    void testDigitPassword() {
        assertThat(passwordValidator.isValid("testtest123"))
            .as("Password if contains digits")
            .isEqualTo(false);
    }

    @Test
    void testPasswordWithUnderscore() {
        assertThat(passwordValidator.isValid("_testtest1"))
            .as("Password if contains uderscore")
            .isEqualTo(false);
    }

    @Test
    void testPasswordWithHash() {
        assertThat(passwordValidator.isValid("_test#test1"))
            .as("Password if contains hash")
            .isEqualTo(false);
    }

    @Test
    void testPasswordWithLowerAndCapitalLetters() {
        assertThat(passwordValidator.isValid("_test#TEST1"))
            .as("Password if contains Lower and Capital Letters")
            .isEqualTo(true);
    }
}
