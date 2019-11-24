package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidator {
    public boolean validateEmail(String email) {

            Pattern EmailPattern=Pattern.compile("^([a-zA-Z0-9]+)([+_,-,.][a-zA-Z0-9]+)?[@][a-zA-Z]+([.][a-z]{2,3})([.][a-z]{2})?$");

            Matcher matcher=EmailPattern.matcher(email);

            if (matcher.matches())
                return true;
            else
                return false;
    }
}
