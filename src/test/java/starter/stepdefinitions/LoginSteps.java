package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        String username = "";
        loginPage.inputUserName(username);
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        String password = "";
        loginPage.inputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I go to dashboard")
    public void iGoToDashboard() {
        loginPage.headerDisplayed();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputInvalidUsername();
    }

    @Then("I get error message")
    public void iGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputInvalidPassword();
    }

    @Then("I get red field username")
    public void iGetRedfieldUsername() {
        loginPage.redFieldUsername();
    }

    @Then("I get red field password")
    public void iGetRedFieldPassword() {
        loginPage.redFieldPassword();
    }

    @Then("I get red field username and password")
    public void iGetRedFieldUsernameAndPassword() {
        loginPage.redFieldUsernameAndPassword();
    }
}
