package example;

import example.addReviewer.AddReviewer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePageFront {
    WebDriver driver;
    public homePageFront(WebDriver driver){
        this.driver = driver;
    }
    public AddReviewer ChooseAddReviewerTask() {
        clickXpath("/html/body/app-root/div/div/div[2]/app-service-catalog/div/app-page/div/div/div/div/div/mat-drawer-container/mat-drawer-content/div[2]/div/div[1]/app-service-card[8]/div/mat-card/div[2]/div/h5");
        return new AddReviewer(driver);
    }

//    public createTask1 CreateEventButton(){
//        clickXpath("/html/body/app-root/div/div/div[2]/app-service-catalog/div/app-page/div/div/div/div/div/mat-drawer-container/mat-drawer-content/div[2]/div/div[1]/app-service-card[8]");
//        clickXpath("/html/body/app-root/div/div/div[2]/app-service-details/div/app-page/div/div/div/div/div[1]/div[2]/button");
//        return new createTask1(driver);
//    }




    public  void clickXpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).click();
    }
}
