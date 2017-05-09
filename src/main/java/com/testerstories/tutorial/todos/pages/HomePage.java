package com.testerstories.tutorial.todos.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by dhinesh.dillum on 09/05/17.
 */
@DefaultUrl("https://www.loveholidays.com/")
public class HomePage extends PageObject {

    String mmboption = "//span[contains(text(), 'Manage')]";

    public void opens_loveholidays_homePage() {
        open();
    }

    public void clickOnManageMyBookingPage() {
        $(mmboption).click();
    }
}
