package io.dolan.utils;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Utility class borrowed from a Co-worker (JT) that is useful for testing exceptions.
 */

public class Execute {
    private final Executable executable;

    public Execute(Executable executable) {
        this.executable = executable;
    }

    public static Execute run(Executable executable) {
        return new Execute(executable);
    }

    public void shouldThrow(Class<? extends Throwable> exceptionClass) {
        try {
            executable.run();
            fail("Should have thrown " + exceptionClass + " but did not throw an exception.");
        } catch (Throwable e) {
            if (!exceptionClass.isInstance(e)) {
                fail("Expected throwable of type " + exceptionClass + " but received " + e);
            }
        }
    }

    public interface Executable {
        void run() throws Throwable;
    }
}