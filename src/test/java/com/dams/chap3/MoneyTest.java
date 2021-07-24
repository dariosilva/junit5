package com.dams.chap3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    private static final String VALID_CURRENCY = "EUR";

    @Test
    void testSetMoney() {
        Money money = new Money(10, VALID_CURRENCY);
        assertThat(money.amount()).isEqualTo(10);
        assertThat(money.currency()).isEqualTo(VALID_CURRENCY);
    }

    @Test
    void learnAssertJ() {
        double var = 2.5;
        assertThat(var).isLessThanOrEqualTo(5);
    }

}
