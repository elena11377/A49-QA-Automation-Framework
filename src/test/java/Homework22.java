public class Homework22 extends BaseTest{

    @test
    public void renamePlaylist(){
        String newPlaylistName = "Elena Edited Playlist";
        String updatedPlaylistMsg = "Updated Playlist \"Elena Edited Playlist.\"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage = homepage = new HomePage(driver);

        LoginPage.login();
        homePage.doubleClickPlaylist();
        homePage.enterNewPlaylistName(newPlaylistName);
        Assert.assertEquals(homePage.getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);


    }


}
