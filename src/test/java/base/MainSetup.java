package base;

import example.homePageFront;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class MainSetup {
    public WebDriver driver;

    protected homePageFront homePageFront;
    //protected homePageBack;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void goHomeFo(){
        homePageFront = new homePageFront(driver);
       // homePageBack = new homePageBack(driver);
        driver.get("http://etec-fo.comptechco.com:81/service-catalog");
    }
}
