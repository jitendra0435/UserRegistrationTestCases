package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidator {

    public boolean checkLastName(String lastName) {

        Pattern lastNamePattern = Pattern.compile("^[A-Z][a-z]{3,}");

        Matcher matcher=lastNamePattern.matcher(lastName);

        if (matcher.matches())
            return true;
        else
            return false;
    }
}
