package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean validatePassword(String password) {

            Pattern PasswordPattern = Pattern.compile("((?=.*\\d)(?=.*[a-z]?)(?=.*[A-Z])(?=.*[@#$%]){1}.{8,})$");

            Matcher matcher = PasswordPattern.matcher(password);


            if (matcher.matches())
                return true;
            else
                return false;

        }
    }

