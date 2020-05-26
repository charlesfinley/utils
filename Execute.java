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
        } catch {
            if (!exceptionClass.isInstance(e)) {
                fail("Expected throwable of type " + exceptionClass + " but received " + e);
            }
        }
    }

    public interface Executable() {
        void run() throws Throwable;
    }
}