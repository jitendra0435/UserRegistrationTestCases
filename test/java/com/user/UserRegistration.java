package com.user;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    FirstNameValidator firstNameValidator=new FirstNameValidator();
    LastNameValidator lastNameValidator=new LastNameValidator();
    MobileNumberValidator mobileNumberValidator=new MobileNumberValidator();

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

    @Test
    public void checkLastName_ifValid_returnTrue(){

        boolean result=lastNameValidator.checkLastName("Bachhav");
        Assert.assertTrue("true",result);

    }
    @Test
    public void checklastName_isShort_then_returnFalse(){

        boolean result=lastNameValidator.checkLastName("Bac");
        Assert.assertFalse("false",result);
    }
    @Test
    public void check_if_lastName_isOnly_Contain_smallLetter_(){
        boolean result=lastNameValidator.checkLastName("bachhav");
        Assert.assertFalse("false",result);
    }
    @Test
    public void check_if_LastName_isOnly_Conatain_CapsLetter(){
        boolean result=lastNameValidator.checkLastName("BACHHAV");
        Assert.assertFalse("false",result);

    }

    @Test
    public void check_ifMobile_Number_isValid_Format_returnTrue_(){
        boolean result=mobileNumberValidator.checkMobileNumber("91 9832569812");
        Assert.assertTrue("true",result);
    }
    @Test
    public void check_if_Mobile_Number_isShort_returnFalse(){
        boolean result=mobileNumberValidator.checkMobileNumber("91 098989");
        Assert.assertFalse("false",result);

    }
}
