import org.openqa.selenium.support.ui.ExpectedCondition;

public class Homework20 {
    import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class Homework20 extends BaseTest {

        @Test
        public void deletePlaylist() {

            String expectedPlaylistDeleteMessage = "Deleted playlist \"Playlist PUT.\"";

            provideEmail("elena.min@testpro.io");
            providePassword("te$t$tudent");
            clickSubmit();
            openPlaylist();
            clickDeletePlaylistBtn();
            Assert.assertEquals(getDeletedPlaylistMsg(),expectedPlaylistDeleteMessage);
        }

        public void openPlaylist(){
            //WebElement emptyPlaylist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
            WebElement emptyPlaylist =  wait.until(ExpectedCondition.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
            emptyPlaylist.click();
        }

        public void  clickDeletePlaylistBtn(){
            //WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
            WebElement deletePlaylist = wait.until(ExpectedCondition.visibilityOfElementLocated(By.cssSelector(".btn-delete-playlist")));
            deletePlaylist.click();
            Thread.sleep((2000));
        }

        public String getDeletedPlaylistMsg(){
            //WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
            WebElement notificationMsg = wait.until(ExpectedCondition.visibilityOfElementLocated(By.cssSelector("div.success.show")));
            return notificationMsg.getText();
        }
    }
}
