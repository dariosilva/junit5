package com.dams.chap3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

public class HashMapTest {

    HashMap<String, String> hashMap;

    @BeforeEach
    void setUp() {
        hashMap = new HashMap<>();
    }

    @Test
    void testPutValue() {
        hashMap.put("key1", "value1");
        assertThat(hashMap.get("key1")).isEqualTo("value1");
    }

    @Test
    void testPutSecondValue() {
        hashMap.put("key1", "value1");
        hashMap.put("key1", "newValue1");
        assertThat(hashMap.get("key1")).isEqualTo("newValue1").isNotEqualTo("value1");
    }

    @Test
    void testCleanHash() {
        hashMap.clear();
        assertThat(hashMap.size()).isEqualTo(0);
    }

    @Test
    void testNullKey() {
        hashMap.put(null, "nullValue1");
        assertThat(hashMap.get(null)).isEqualTo("nullValue1");
    }
}