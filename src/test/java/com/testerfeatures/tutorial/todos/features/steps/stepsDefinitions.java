package com.testerfeatures.tutorial.todos.features.steps;

import com.testerstories.tutorial.todos.steps.User;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by dhinesh.dillum on 09/05/17.
 */
public class stepsDefinitions {

    @Steps
    User user;

    @Before
    public void configureDrivers() {
        user.opens_loveholidays_application();
    }

    @Given("^that a user goes to MMB page$")
    public void that_a_user_goes_to_MMB_page() throws Throwable {
            user.goToMMBPage();
    }

    @When("^the user enters a reference number like \"([^\"]*)\"$")
    public void the_user_enters_a_reference_number_like(String reference) throws Throwable {
            user.enterBookingRef(reference);
    }

    @Then("^the message should contain this text \"([^\"]*)\"$")
    public void the_message_should_contain_this_text(String warningMessage) throws Throwable {
        user.assertWarningMessage(warningMessage);
    }

    @When("^the user enters \"([^\"]*)\" in the surname$")
    public void the_user_enters_Test_in_the_surname(String surname) throws Throwable {
        user.givePassengerSurname(surname);
    }

    @Then("^we show the error message that contains \"([^\"]*)\"$")
    public void we_show_the_error_message_that_contains_Sorry_this_is_not_a_valid_booking_reference_If_you_have_booked_within_the_last_hours_please_wait_until_you_receive_your_LOV_or_LVE_reference_number_by_email_before_logging_in(String errorMessage) throws Throwable {
        user.assertErrorMessage(errorMessage);
    }
}
