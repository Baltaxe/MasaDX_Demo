package masaSoftware.step_definitions;

import io.cucumber.java.en.And;
import masaSoftware.pages.*;
import masaSoftware.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MasaSoftwareStepDefinitions {

    MasaSoftwarePage masaSoftwarePage = new MasaSoftwarePage();

    @Given("User is on MasaSoftware home page")
    public void user_is_on_MasaSoftware_home_page() {
        Driver.getDriver().get("https://www.masadx.com/");
    }

    @When("User clicks Company button")
    public void user_clicks_company_button() {
        masaSoftwarePage.companyButton.click();
    }

    @Then("User sees Company in the header")
    public void user_sees_is_in_the_header() {
        String expectedHeader = "Company";
        String actualTitle = masaSoftwarePage.headerTitle.getText();

        if (expectedHeader.equalsIgnoreCase(actualTitle)) {
            System.out.println("The page of " + expectedHeader + " is verified");
        } else {
            System.out.println("The page of " + expectedHeader + " is NOT verified");
        }
    }

    @When("User clicks Services button")
    public void user_clicks_services_button() {
        masaSoftwarePage.servicesButton.click();
    }

    @When("User clicks Consultancy segment")
    public void user_clicks_consultancy_segment() {
        masaSoftwarePage.consultancySegment.click();
    }

    @Then("User sees Consultancy segment in the page")
    public void user_Sees_Consultancy_Segment_In_The_Page() {
        String expectedTitle = "Consultancy";
        String actualTitle = masaSoftwarePage.consultancySegment.getText();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("The page of " + expectedTitle + " is verified");
        } else {
            System.out.println("The page of " + expectedTitle + " is NOT verified");
        }
    }

    @When("User clicks Globe icon")
    public void user_Clicks_Globe_Icon() {
        masaSoftwarePage.globeIcon.click();
    }

    @And("User clicks Turkce in dropdown menu")
    public void user_Clicks_Turkce_In_Dropdown_Menu() {
        masaSoftwarePage.turkceIcon.click();
    }

    @Then("User sees Hakkımızda title in the page")
    public void user_Sees_Hakkimizda_Title_In_The_Page() {
        String expectedTitle = "Hakkımızda";
        String actualTitle = masaSoftwarePage.hakkimizdaTitle.getText();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("The page of " + expectedTitle + " is verified");
        } else {
            System.out.println("The page of " + expectedTitle + " is NOT verified");
        }
    }
}
