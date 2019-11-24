package com.user;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    FirstNameValidator firstNameValidator=new FirstNameValidator();

    @Test
    public void checkFirstName_ifValid_returnTrue(){

        boolean result=firstNameValidator.checkFirstName("Jitendra");
        Assert.assertTrue("true",result);

    }
    @Test
    public void checkFirstName_isShort_then_returnFalse(){

        boolean result=firstNameValidator.checkFirstName("Jit");
        Assert.assertFalse("false",result);
    }
    @Test
    public void check_if_FirstName_isOnly_Contain_smallLetter_(){
        boolean result=firstNameValidator.checkFirstName("jitendra");
        Assert.assertFalse("false",result);
    }
    @Test
    public void check_if_FirstName_isOnly_Conatain_CapsLetter(){
        boolean result=firstNameValidator.checkFirstName("JITENDRA");
        Assert.assertFalse("false",result);

    }
}
