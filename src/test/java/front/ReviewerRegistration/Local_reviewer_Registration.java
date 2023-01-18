package front.ReviewerRegistration;

import base.MainSetup;
import example.addReviewer.AddReviewer;
import example.homePageFront;
import org.testng.annotations.Test;

public class Local_reviewer_Registration extends MainSetup {
    @Test
    public  void testSuccessfulLogin() throws InterruptedException {
        AddReviewer addReviewer = homePageFront.ChooseAddReviewerTask();
        addReviewer.setStartService();
        addReviewer.setNameInEnglish("Ammar");
        addReviewer.setNameInArabic("عمار");
        addReviewer.ClickResidencePlace();
        addReviewer.setChooseResidence(1);
        addReviewer.ClickResidenceCity();
        addReviewer.setResidenceCity(1); // from 1 to 43
        addReviewer.setIdentityType(2, 1);
        // 1 for National Number ,   2 for IqamaNumber if choose iqama must select nationality from 1 to 100
        addReviewer.setGender(1); // 1 for man , 2 for woman because man always number 1 🤣
        addReviewer.setWorkSide("WorkSide");
        addReviewer.setWorkEmail("helo@hello.com");

    }

}

