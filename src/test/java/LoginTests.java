import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

//    @Test (enabled = true, priority = 0, description = "Login with invalid email and valid password")
//    public void loginInvalidEmailValidPassword(){
//
//        navigateToPage();
//        provideEmail("invalid@class.com");
//        providePassword("te$t$tudent");
//        clickSubmit();
//
//        Assert.assertEquals(driver.getCurrentUrl(), url); //https://qa.koel.app/
//    }
//    @Test (enabled = true, priority = 1, description = "Login with valid email and valid password")
//    public void loginValidEmailPassword(){
//        navigateToPage();
//        provideEmail("elena.min@testpro.io");
//        providePassword("te$t$tudent");
//        loginWithCorrectCreds();
//        isAvatarDisplayed();
//    }
//    @Test (enabled = true, priority = 3, description = "Login with valid email and empty password")
//    public void loginValidEmailEmptyPassword() {
//        navigateToPage();
//        provideEmail("elena.min@testpro.io");
//        providePassword("");
//        clickSubmit();
//        Assert.assertEquals(driver.getCurrentUrl(), url); //https://qa.koel.app/
//    }

    //lesson19
    public void loginInvalidCredentials() throws InterruptedException{
        navigateToPage();
        provideEmail("incorrectEmail@testpro.io");
        provideCurrentPassword("incorrectPassword");
        clickSubmit();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), url); //https://qa.koel.app/

    }
}