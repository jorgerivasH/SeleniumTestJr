package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void loginWithValidCredentials() {

        //Scenario: Login With Valid Credentials
        //"Go to the Login Page"
        driver.get("https://the-internet.herokuapp.com/login");

        //"Login with a valid username and password"
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button.radius")).click();

        String successMessage = driver.findElement(By.cssSelector("#flash")).getText();
        Assert.assertTrue(successMessage.contains("You logged into a secure area!"));
        //"Login with a valid username and password successfully"
    }

    @Test(priority = 2)
    public void loginWithInvalidCredentials() {
        //"Go to the Login Page"
        driver.get("https://the-internet.herokuapp.com/login");

        //"Login with a wrong username and password"
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("wrongPass");
        driver.findElement(By.cssSelector("button.radius")).click();

        String errorMessage = driver.findElement(By.cssSelector("#flash")).getText();
        Assert.assertTrue(errorMessage.contains("Your username is invalid!"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
