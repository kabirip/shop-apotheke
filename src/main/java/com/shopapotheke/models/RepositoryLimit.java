package com.shopapotheke.models;

import com.shopapotheke.exceptions.InvalidRequestException;

import java.util.Arrays;

public enum RepositoryLimit {
    TEN(10), FIFTY(50), HUNDRED(100);

    private int value;

    RepositoryLimit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public static RepositoryLimit toRepositoryLimit(int limit) {
        return Arrays.stream(RepositoryLimit.values())
                .filter(val -> val.value == limit)
                .findFirst()
                .orElseThrow(
                        () -> new InvalidRequestException(String.format("Limit value of %s does not exists", limit))
                );
    }
}
