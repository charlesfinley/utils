package io.dolan.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvironmentTest {

    @Test
    public void invalidEnvironmentShouldThrowIllegalArgumentException() {
        Execute.run(() -> Environment.fromString("asdf")).shouldThrow(IllegalArgumentException.class);
        Execute.run(() -> Environment.fromString("")).shouldThrow(IllegalArgumentException.class);
        Execute.run(() -> Environment.fromString(null)).shouldThrow(IllegalArgumentException.class);
    }

    @Test
    public void testPrependEnv() {
        final String userId = "1234";
        assertEquals("D1234", Environment.fromString("dev").prependEnv(userId));
        assertEquals("Q1234", Environment.fromString("qa").prependEnv(userId));
        assertEquals("P1234", Environment.fromString("prod").prependEnv(userId));
    }
}