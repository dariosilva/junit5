package com.dams.chap4;

public class PasswordValidator {

    public boolean isValid(String string) {
        return string.length() >= 8
            && string.matches(".*\\d+.*")
            && string.contains("_")
            && string.contains("#")
            && string.matches(".*[a-z]+.*")
            && string.matches(".*[A-Z]+.*");
    }

}
