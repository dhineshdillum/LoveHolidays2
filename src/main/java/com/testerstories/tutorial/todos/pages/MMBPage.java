package com.testerstories.tutorial.todos.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

/**
 * Created by dhinesh.dillum on 09/05/17.
 */
public class MMBPage extends PageObject {

    String BOOKING_REF_FIELD = "//*[@name='referenceWithLetters']";
    String SIGN_IN_BUTTON = "//*[@type='submit']";
    String WARNINGMESSAGE = "//*[@class='mmb-login__form__field']//*[@name='referenceWithLetters']";
    String ERRORMESSAGE = "//*[@class='error'][contains(text(), 'Sorry')]";
    String PASSENGER_SURNAME_FIELD = "//*[@name='surname']";

    public void enterRefIntoField(String reference) {
        $(BOOKING_REF_FIELD).type(reference);
        $(SIGN_IN_BUTTON).click();
    }

    public void assertWarningMessage(String expectedWarningMessage) {
        String actualWarningMessage =  $(WARNINGMESSAGE).getAttribute("oninvalid").toString();
        String trimmedMessage = actualWarningMessage.substring(actualWarningMessage.indexOf("y")+3, 105).trim();
        System.out.println("trimmedMessage = " + trimmedMessage);
        Assert.assertTrue(trimmedMessage.contains(expectedWarningMessage));
    }

    public void enterPassengerSurname(String surname) {
        $(PASSENGER_SURNAME_FIELD).type(surname);
        $(SIGN_IN_BUTTON).click();
    }

    public void assertErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = $(ERRORMESSAGE).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
