package org.example.methods;

import org.example.utilities.LocatorType;
import org.example.utilities.Locators;
import org.openqa.selenium.*;

public class Methods {

    public Methods() {

    }

    public WebElement txtSearchBox() {
        Locators locators = new Locators(LocatorType.name, "q");

        return Locators.element;

    }

    public WebElement txt_searchBox() {
        Locators locators = new Locators(LocatorType.name, "search_query");

        return Locators.element;

    }

    //------------------------------------------Locators for TC1 ---------------------------------------------------------------

    public WebElement fromOption() {
        Locators locators = new Locators(LocatorType.xpath, "(//span[@class='airport-code d-block'])[1]");

        return Locators.element;
    }

    //used for both inputs (FROM and TO in Delta page)
    public WebElement fromToInput() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@id='search_input']");

        return Locators.element;
    }

    public WebElement fromClose() {
        Locators locators = new Locators(LocatorType.xpath, "//img[@alt='close']");

        return Locators.element;
    }

    public WebElement toOption() {
        Locators locators = new Locators(LocatorType.xpath, "(//span[@class='airport-code d-block'])[2]");

        return Locators.element;
    }

    public WebElement typeOption() {
        Locators locators = new Locators(LocatorType.xpath, "//span[@id='selectTripType-val']");

        return Locators.element;
    }

    public WebElement selectTypeOption(String type) {
        Locators locators = new Locators(LocatorType.xpath, "//Li[contains(text(),'"+ type + "')]");

        return Locators.element;
    }


    public WebElement departureClick() {
        Locators locators = new Locators(LocatorType.xpath, "//span[@id='calDepartLabelCont']");

        return Locators.element;
    }

    //used for first DATE
    public WebElement departureSelect(String departD) {
        Locators locators = new Locators(LocatorType.xpath, "//a[contains(@data-date,'" + departD +"')]");

        return Locators.element;
    }

    //used for second DATE
    public WebElement returnSelect(String returnD) {
        Locators locators = new Locators(LocatorType.xpath, "//a[contains(@data-date,'" + returnD +"')]");

        return Locators.element;
    }

    //used between select dates
    public WebElement clickClearDatesButton(){
        Locators locators = new Locators(LocatorType.xpath,"//button[@value='clear']");
        return Locators.element;
    }

    public WebElement clickDoneDates(){
        Locators locators = new Locators(LocatorType.xpath, "//button[@value='done']");
        return Locators.element;
    }

    public WebElement passengersClick() {
        Locators locators = new Locators(LocatorType.xpath, "//span[@id='passengers-val']");

        return Locators.element;
    }

    public WebElement passengersSelect(String numPassengers) {
        Locators locators = new Locators(LocatorType.xpath, "//Li[contains(text(),'" + numPassengers +"')]");

        return Locators.element;
    }

    public WebElement submitFlightButton() {
        Locators locators = new Locators(LocatorType.xpath, "//button[@id='btn-book-submit']");

        return Locators.element;
    }

    //------------------------------------------Locators for TC2 ---------------------------------------------------------------
    public WebElement clickPopUp(){
        Locators locators = new Locators(LocatorType.xpath,"//button[contains(text(),'I UNDERSTAND')]");

        return Locators.element;
    }

    public WebElement clickLogin() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@class='signup-container ng-star-inserted']//a");

        return Locators.element;
    }

    public WebElement typeFirstName() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='First Name']");

        return Locators.element;
    }

    public WebElement typeMiddleName() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Middle Name (As applicable)']");

        return Locators.element;
    }

    public WebElement typeLastName() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Last Name']");

        return Locators.element;
    }

    public WebElement clickMM() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@id='idp-month__selected']");

        return Locators.element;
    }

    public WebElement selectMM() {
        Locators locators = new Locators(LocatorType.xpath, "//Li[@data-label='Mar']");

        return Locators.element;
    }

    public WebElement clickDD() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@id='idp-date__selected']");

        return Locators.element;
    }


    public WebElement selectDD() {
        Locators locators = new Locators(LocatorType.xpath, "//Li[@data-label='8']");

        return Locators.element;
    }

    public WebElement clickYYYY() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@id='idp-year__selected']");

        return Locators.element;
    }

    public WebElement selectYYYY() {
        Locators locators = new Locators(LocatorType.xpath, "//Li[@data-label='2000']");

        return Locators.element;
    }

    public WebElement clickGender() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@id='idp-gender__selected']");

        return Locators.element;
    }

    public WebElement selectGender() {
        Locators locators = new Locators(LocatorType.xpath, "//Li[@id='genderoption-1']");

        return Locators.element;
    }

    public WebElement clickNextSection1() {
        Locators locators = new Locators(LocatorType.xpath, "//button[@id='basic-info-next']");

        return Locators.element;
    }

    //----------------------------------------- locators for 2 second section TC2 --------------------------------------
    public WebElement clickCountry() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@id='idp-addresscountry__selected']");

        return Locators.element;
    }

    public WebElement selectCountry() {
        Locators locators = new Locators(LocatorType.xpath, "//Li[@id='addresscountryoption-127']");

        return Locators.element;
    }

    public WebElement clickTypeAddress() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Address Line 1']");

        return Locators.element;
    }

    public WebElement clickTypeCity() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='City']");

        return Locators.element;
    }

    public WebElement clickTypeState() {
        Locators locators = new Locators(LocatorType.xpath, "//div[@id='idp-countrySubdivisionCode__selected']");

        return Locators.element;
    }

    public WebElement selectState() {
        Locators locators = new Locators(LocatorType.xpath, "//Li[@id='countrySubdivisionCodeoption-1']");

        return Locators.element;
    }

    public WebElement clickTypePostalCode() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Postal Code']");

        return Locators.element;
    }

    public WebElement clickTypeAreaCode() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Area Code + Phone #']");

        return Locators.element;
    }

    public WebElement clickTypeEmailAddress() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Email Address']");

        return Locators.element;
    }

    public WebElement clickTypeConfirmEmail() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Confirm Email Address']");

        return Locators.element;
    }

    public WebElement clickNextSection2() {
        Locators locators = new Locators(LocatorType.xpath, "//button[@id='contact-info-next']");

        return Locators.element;
    }

    //----------------------------------------- locators for 3 third section TC2 --------------------------------------
    public WebElement clickTypeUsername() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Enter a Username']");

        return Locators.element;
    }

    public WebElement clickTypePassword() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Enter  a Password']");

        return Locators.element;
    }

    public WebElement clickTypeConfirmPassword() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@aria-label='Confirm Password']");

        return Locators.element;
    }

    public WebElement clickSubmitFORM() {
        Locators locators = new Locators(LocatorType.xpath, "//button[@id='login-info-submit']");

        return Locators.element;
    }

    public WebElement validateSuccessMessage() {
        Locators locators = new Locators(LocatorType.xpath, "//button[@id='login-info-submit']");

        return Locators.element;
    }

    public WebElement okFinishButton() {
        Locators locators = new Locators(LocatorType.xpath, "//button[@id='login-info-submit']");

        return Locators.element;
    }
    //------------------------------------------Locators for TC3 ---------------------------------------------------------------

    public WebElement clickSearchIcon() {
        Locators locators = new Locators(LocatorType.xpath, "(//a[@aria-label='search-button'])[2]");

        return Locators.element;
    }

    public WebElement clickTypeSearchInput() {
        Locators locators = new Locators(LocatorType.xpath, "//input[@id='search_input']");

        return Locators.element;
    }

    public WebElement verifyTextTopic() {
        Locators locators = new Locators(LocatorType.xpath, "//h1[contains(text(),'Search Results')]");

        return Locators.element;
    }

    public WebElement clickHelpCO() {
        Locators locators = new Locators(LocatorType.xpath, "//a[contains(text(), ' Help Center Overview ')]");

        return Locators.element;
    }

    public WebElement verifyTitle() {
        Locators locators = new Locators(LocatorType.xpath, "//h1[contains(text(), 'Help Center')]");

        return Locators.element;
    }


}





















