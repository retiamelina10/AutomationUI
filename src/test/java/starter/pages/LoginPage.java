package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By fieldUserName(){
        return By.id("userName");
    }
    private By fieldPassword(){
        return By.id("password");
    }
    private By loginButton(){
        return By.xpath("//xpath=//button[@type='button']");
    }
    private By succsessLogin(){
        return By.id("output");
    }
    private By errorMessage() {
        return By.xpath("//mb-1");
    }
    private By redUsernameField(){
        return By.xpath ("//mr-sm-2 is-invalid form-control");
    }
    private By redPasswordField() {
        return By.xpath("//mr-sm-2 is-invalid form-control");
    }
    private By headerProduct() {
        return By.xpath("//span[@class = 'group-header']");
    }
    public void openUrl(){
        openAt("/");
    }
    public void inputUserName(String username) {
        $(fieldUserName()).type(username);
    }

    public void inputPassword(String password) {
        $(fieldPassword()).type(password);
    }

    public void clickLoginBtn () {
        $(loginButton()).click();
        }

    public void headerDisplayed() {
        $(headerProduct()).isDisplayed();
    }

    public void errorMessageDisplayed() {
        $(errorMessage()).isDisplayed();
    }

    public void inputInvalidPassword() {
        String password = ("");
        $(fieldUserName()).type(password);
    }

    public void inputInvalidUsername() {
        String username = ("");
        $(fieldUserName()).type(username);
    }

    public void redFieldPassword() {
        $(redPasswordField()).isDisplayed();
    }

    public void redFieldUsername() {
        $(redUsernameField()).isDisplayed();
    }

    public void redFieldUsernameAndPassword() {
        $(redUsernameField()).isDisplayed();
    }
}
