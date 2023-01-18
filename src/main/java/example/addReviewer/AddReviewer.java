package example.addReviewer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddReviewer {
    private final WebDriver driver;
    public AddReviewer(WebDriver driver){
        this.driver = driver;
    }

    private final By StartService = By.xpath("/html/body/app-root/div/div/div[2]/app-service-details/div/app-page/div/div/div/div/div[1]/div[2]/button");
    private final By NameInEnglish = By.id("englishName");
    private final By NameInArabic = By.id("arabicName");
    private final By ResidencePlace = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[1]/div/div");
    private final By ResidenceCity = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[3]/div[2]/div[1]/div/div[1]");
    private final By Nationality = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[1]/div[2]/div/div[1]/div[1]");
    private final By WorkSide = By.id("workSide");
    private final By WorkEmail = By.id("workEmail");
    public void setStartService (){
        driver.findElement(StartService).click();

    }
    public void setNameInEnglish (String name) {
        driver.findElement(NameInEnglish).sendKeys(name);
    }
    public void setNameInArabic (String name) {
        driver.findElement(NameInArabic).sendKeys(name);
    }

    public void ClickResidencePlace () {
        driver.findElement(ResidencePlace).click();
    }
    public void setChooseResidence(int choose) {
        final By ChooseResidence = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[1]/div/div/div[2]/div/div["+choose+"]");
        driver.findElement(ChooseResidence).click();
    }
    public void ClickResidenceCity() {
        driver.findElement(ResidenceCity).click();
    }
    public void setResidenceCity(int choose) throws InterruptedException {
        Thread.sleep(2000);
        final By chooseResidenceCity = By.id("choices--localResidenceCity-item-choice-"+choose);
        driver.findElement(chooseResidenceCity).click();
    }

    public void setIdentityType(int choose, int nationality) throws InterruptedException {
        final By IdentityType = By.xpath("html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[4]/div[2]/div[1]/div/div["+choose+"]/label/input");
        driver.findElement(IdentityType).click();
        Thread.sleep(2000);
        if ( choose == 2) {
            setNationality(nationality);
        }
    }
    public void setNationality(int choose) {
        driver.findElement(Nationality).click();
        ChooseNationality(choose);
    }
    public void ChooseNationality(int choose) {
        final By setNationality = By.id("choices--nationality-item-choice-"+choose);
        driver.findElement(setNationality).click();
    }
    public void setGender(int choose) {
        final By gender = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[1]/div[1]/div/div/div["+choose+"]/label/input");
        driver.findElement(gender).click();
    }
    public void setWorkSide(String work) {
        driver.findElement(WorkSide).sendKeys(work);
    }
    public void setWorkEmail(String workEmail) {
        driver.findElement(WorkEmail).sendKeys(workEmail);
    }
}
