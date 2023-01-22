package front.ReviewerRegistration;

import base.MainSetup;
import example.addReviewer.AddReviewer;
import org.testng.annotations.Test;

public class Local_reviewer_Registration extends MainSetup {
    @Test
    public  void testSuccessfulLogin() throws InterruptedException {
        AddReviewer addReviewer = homePageFront.ChooseAddReviewerTask();
        addReviewer.setStartService();
        addReviewer.setNameInEnglish("Ammar"); //english String only
        addReviewer.setNameInArabic("عمار"); // arabic String only
        addReviewer.ClickResidencePlace();
        addReviewer.setChooseResidence(1);
        addReviewer.ClickResidenceCity();
        addReviewer.setResidenceCity(1); // from 1 to 43
        addReviewer.setIdentityType(2, 1);
        //choose 1 for National Number ,   2 for IqamaNumber if choose iqama must select nationality from 1 to 100
        addReviewer.setNationalIdNumberIqamaNumber("2134123456"); // start with 2 for iqama , 1 for national number
        addReviewer.setGender(1); // 1 for man , 2 for woman because man always number 1 🤣
        addReviewer.setWorkSide("WorkSide"); // arabic or english string
        addReviewer.setWorkEmail("helo@hello.com"); // email format
        addReviewer.setAge("20000202");// yyyy-MM-dd
        addReviewer.setMainEmail("helo@hello.com"); // email format
        addReviewer.setSecondEmail("helo@hello.com"); // email format
        addReviewer.setContactNumber("500000005"); // 9 number
        addReviewer.setAcademicLevel(1); // 1 for first level , 2 for second level
        addReviewer.setCurrentJob("Current job"); // arabic or english string
        addReviewer.setQualityExperience("test");// arabic or english string
        addReviewer.setTrainingCertificate("test");// arabic or english string
        addReviewer.setPublicSpecialty(1); // from 1 to 20
        addReviewer.setSubSpecialty("test");// arabic or english string
        addReviewer.setLanguages(1);
        // 1 for arabic , 2 for english  to choose arabic and english  addReviewer.setLanguages(1); +  addReviewer.setLanguages(2);
        addReviewer.setDelicateSpecialization("test");// arabic or english string
        addReviewer.setWebsite("www.text.com");// arabic or english string
        addReviewer.uploadFile("/Users/ammarhussien/Downloads/ETEC.pdf");
        addReviewer.setCvSummary("Hello World");// arabic or english string
        addReviewer.clickNextOne();
        addReviewer.setBankName("ts");
        addReviewer.setBankAddress("test");
        addReviewer.setBeneficiaryName("test");
        addReviewer.setBeneficiaryAddress("tesst");
        addReviewer.setAccountNumber("4386834768734");
        addReviewer.setAccountCurrency(2);// 1 for USD , 2 for SAR , 3 for EUR
        addReviewer.clickNextTwo();
        addReviewer.clickNextThree();
        addReviewer.AddVisitButton();
        addReviewer.setVisitType(1); // 1 for programmatic , 2 for institution
        addReviewer.setInstitutionName(1);
        addReviewer.setProgramName(1);
        addReviewer.setVisitDate("20200202");// if choose programmatic only
        addReviewer.setVisitRole(2); // 1 for team leader , 2 for reviewer, 3 for observed
        addReviewer.setVisitEvaluation("test");
        addReviewer.setSaveVisit();
        addReviewer.clickNextFour();
        addReviewer.clickCheckBox();
        addReviewer.setSubmitTask();
        addReviewer.setAddOtb("123456");
        //addReviewer.setSendTask();


    }

}

