package com.user;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

public class PasswordValidation {

    private String password;
    private boolean expectedValue;
    private static PasswordValidator passwordValidator;

    public PasswordValidation(String password, boolean expectedValue) {
        this.password = password;
        this.expectedValue = expectedValue;
    }

    @BeforeClass
    public static void initialization()
    {

        passwordValidator=new PasswordValidator();

    }


    @Parameterized.Parameters
    public static Collection<Object[]> checkPasswords()
    {
        Object[][] checkPasswords=new Object[][]{

                {"jkli",false},
                {"xyzAB12abcAB654",false},
                {"hhjdghf", false},
                {"Nghfughj",false},
                {"Xyzd@123",true},
                {"@1567asdfZ",true}

        };

        return Arrays.asList(checkPasswords);

    }

    @Test
    public void checkPasswordValidOrNot() {

        boolean result=passwordValidator.validatePassword(this.password);
        Assert.assertEquals(this.expectedValue,result);

    }
}
