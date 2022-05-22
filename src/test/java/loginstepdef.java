import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ISelect;

import java.security.Key;

public class loginstepdef {
    public WebDriver driver;

    @Given("open browser")
    public void open_Browser() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/fikri/IdeaProjects/evermostc/src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("open login page evermos")
    public void open_Login_Page_Evermos() {
        driver.get("https://evermos.com/login");
    }

    @When("input valid username and password")
    public void input_Valid_Username_And_Password() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[1]")).sendKeys("6281223334444");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[2]")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/button")).click();
        Thread.sleep(6000);



    }

    @Then("logged in succesfully")
    public void logged_In_Succesfully() {

        driver.close();
    }

    @Given("click daftar produk")
    public void clickDaftarProduk() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/fikri/IdeaProjects/evermostc/src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

    }

    @And("open page evermos and login")
    public void openPageEvermosAndLogin() {
        driver.get("https://evermos.com/login");
    }

    @When("lakukan purchasing")
    public void lakukanPurchasing() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[1]")).sendKeys("6281223334444");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[2]")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/button")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[5]/div[2]/div/div[1]/a/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div/div[1]/div[1]/div/div[1]/div[1]/a/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div[3]/div[25]/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[5]/div/div[2]/div[1]/div[2]/div/label/div[1]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[5]/div/div[2]/div[2]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[5]/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[4]/div/div[2]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[9]/div/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[10]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[10]/div/div[3]/button")).click();
        Thread.sleep(2000);

    }


    @Then("sampai ke checkout")
    public void sampaiKeCheckout() {
        driver.close();
    }


    @Given(": open evermos")
    public void openEvermos() {
        System.setProperty("webdriver.chrome.driver","C:/Users/fikri/IdeaProjects/evermostc/src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("login with invalid username")
    public void loginWithInvalidUsername() throws InterruptedException {
        driver.get("https://evermos.com/login");
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[1]")).sendKeys("6281223334444");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[2]")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/button")).click();
        Thread.sleep(6000);

    }

    @When("lakukan copy paste di tab chrome baru")
    public void lakukanCopyPasteDiTabChromeBaru() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[17]/div/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div[2]/a[2]")).click();
        Thread.sleep(2000);

        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://berikhtiar.com/huhuhuh.ce6");
        Thread.sleep(2000);

    }

    @Then("paste link toko di tab baru")
    public void pasteLinkTokoDiTabBaru() {
        driver.close();
    }
}
