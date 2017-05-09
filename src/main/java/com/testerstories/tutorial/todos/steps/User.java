package com.testerstories.tutorial.todos.steps;

import com.testerstories.tutorial.todos.pages.HomePage;
import com.testerstories.tutorial.todos.pages.MMBPage;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by dhinesh.dillum on 09/05/17.
 */
public class User extends ScenarioSteps{

    MMBPage mmbPage;
    HomePage homePage;

    public void opens_loveholidays_application() {
        homePage.opens_loveholidays_homePage();
    }

    public void goToMMBPage() {
        homePage.clickOnManageMyBookingPage();
    }

    public void enterBookingRef(String reference) {
        mmbPage.enterRefIntoField(reference);
    }

    public void assertWarningMessage(String warningMessage) {
        mmbPage.assertWarningMessage(warningMessage);
    }

    public void givePassengerSurname(String surname) {
        mmbPage.enterPassengerSurname(surname);
    }

    public void assertErrorMessage(String errorMessage) {
        mmbPage.assertErrorMessage(errorMessage);
    }
}
