import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

@Test
    public void deletePlaylist() throws InterruptedException{
    String expectedPlaylistDeleteMessage = "DeletedPlaylist\"Playlist PUT.\"";
    provideEmail("elena.min@testpro.io");
    providePassword("te$t$tudent");
    clickSubmit();
    openPlaylist();
    clickDeletePlaylistBtn();
    Assert.assertEquals(getDeletedPlaylistMsg(),expectedPlaylistDeleteMessage);
}

public void openPlaylist(){
    WebElement emptyPlaylist = driver.findElement(By.cssSelector(".playlist:nth-child(6)"));
    emptyPlaylist.click();
}

public void  clickDeletePlaylistBtn() throws InterruptedException{
    WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
    deletePlaylist.click();
    Thread.sleep((2000));
}

public String getDeletedPlaylistMsg(){
    WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
    return notificationMsg.getText();
}
}