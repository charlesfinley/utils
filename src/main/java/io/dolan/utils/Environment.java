package io.dolan.utils;

import java.util.Arrays;

public enum Environment {
    DEV("D"),
    QA("Q"),
    PROD("P");

    private String env;

    Environment(String env) {
        this.env = env;
    }

    public String prependEnv(String userId) {
        return this.env + userId;
    }

    public static Environment fromString(String envString) {
        return Arrays.stream(Environment.values())
                .filter(environment -> environment.name().equalsIgnoreCase(envString))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unable to map environment."));
    }
}
