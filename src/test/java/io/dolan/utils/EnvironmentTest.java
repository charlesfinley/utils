package io.dolan.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnvironmentTest {

    @Test
    public void invalidEnvironmentShouldThrowIllegalArgumentException() {
        Execute.run(() -> Environment.fromString("asdf")).shouldThrow(IllegalArgumentException.class);
        Execute.run(() -> Environment.fromString("")).shouldThrow(IllegalArgumentException.class);
        Execute.run(() -> Environment.fromString(null)).shouldThrow(IllegalArgumentException.class);
    }

}