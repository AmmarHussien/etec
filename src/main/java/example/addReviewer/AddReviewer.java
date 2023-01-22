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
    private final By nationalIdNumberIqamaNumber = By.id("nationalIdNumberIqamaNumber");
    private final By age = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[2]/div[1]/div[2]/div/input[2]");
    private final By mainEmail = By.id("mainEmail");
    private final By secondEmail = By.id("secondEmail");
    private final By contactNumber = By.id("contactnumber");
    private final By academicLevel = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[5]/div/div[1]/div[1]/div[1]/div/div[1]");
    private final By currentJob = By.id("currentJob");
    private final By qualityExperience = By.id("qualityExperience");
    private final By trainingCertificate = By.id("trainingCertificate");
    private final By publicSpecialty = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[5]/div/div[2]/div[1]/div[1]/div/div[1]");
    private final By subSpecialty = By.id("subSpecialty");
    private final By languages = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[5]/div/div[2]/div[1]/div[2]/div/div[1]");
    private final By delicateSpecialization = By.id("delicateSpecialization");
    private final By website = By.id("website");
    private final By uploadFile = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[5]/div/div[2]/div[2]/div[3]/div/input");
    private final By cvSummary = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[6]/div/div[5]/div/div[3]/div[1]/div/div[2]/div[1]");
    private final By nextButton_1 = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/ul/li[2]/button");
    private final By bankName =By.id("bankName");
    private final By bankAddress = By.id("bankAddress");
    private final By beneficiaryName = By.id("beneficiaryName");
    private final By beneficiaryAddress = By.id("beneficiaryAddress");
    private final By accountNumber = By.id("accountNumber");
    private final By accountCurrency = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/div[2]/div[3]/div/div[1]");
    private final By nextButton_2 = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/ul/li[3]/button");
    private final By nextButton_3 = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/ul/li[3]/button");
    private final By nextButton_4 = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/ul/li[3]/button");
    private final By checkBox = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/label/input");
    private final By submitTask = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/ul/li[3]/button");
    private final By addOtb = By.id("verificationNumberSentEmail");
    private final By sendTask = By.xpath("/html/body/div[8]/div[2]/div/mat-dialog-container/extra-form-dialog/div/formio/div/div/div/div[2]/div[2]/div[4]/div[1]/div[1]/button");
    private final By addVisit = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/div[1]/div[2]/div/button");
    private final By visitType = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/ul/li/div[1]/div/div[1]/div[1]/div[1]/div/div[1]");
    private final By programName = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/ul/li/div[1]/div/div[1]/div[1]/div[2]/div/div[1]");
    private final By institutionName = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/ul/li/div[1]/div/div[1]/div[2]/div[1]/div/div[1]");
    private final By visitRole = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/ul/li/div[1]/div/div[1]/div[1]/div[3]/div/div[1]");
    private final By visitDate = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/ul/li/div[1]/div/div[1]/div[2]/div[2]/div/input[2]");
    private final By saveVisit = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div/ul/li/div[1]/div/div[2]/i[1]");
    private final By visitEvaluation = By.id("visitEvaluation");
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
    public void setNationalIdNumberIqamaNumber (String number) {
        driver.findElement(nationalIdNumberIqamaNumber).sendKeys(number);
    }
    public void setWorkSide(String work) {
        driver.findElement(WorkSide).sendKeys(work);
    }
    public void setWorkEmail(String workEmail) {
        driver.findElement(WorkEmail).sendKeys(workEmail);
    }
    public void setAge(String ages) {
        driver.findElement(age).sendKeys(ages);
    }
    public void setMainEmail (String email) {
        driver.findElement(mainEmail).sendKeys(email);
    }
    public void setSecondEmail (String email) {
        driver.findElement(secondEmail).sendKeys(email);
    }
    public void setContactNumber (String number) {
        driver.findElement(contactNumber).sendKeys(number);
    }
    public void setAcademicLevel (int choose) {
        driver.findElement(academicLevel).click();
        final By scienceGradeItem = By.id("choices--scienceGrade-item-choice-"+choose);
        driver.findElement(scienceGradeItem).click();
    }
    public void setCurrentJob (String job) {
        driver.findElement(currentJob).sendKeys(job);
    }
    public void setQualityExperience (String experience) {
        driver.findElement(qualityExperience).sendKeys(experience);
    }
    public void setTrainingCertificate (String certificate) {
        driver.findElement(trainingCertificate).sendKeys(certificate);
    }
    public void setPublicSpecialty (int specialty) {
        driver.findElement(publicSpecialty).click();
        final By publicSpecialtyItem = By.id("choices--publicSpecialty-item-choice-"+specialty);
        driver.findElement(publicSpecialtyItem).click();
    }
    public void setSubSpecialty (String specialty) {
        driver.findElement(subSpecialty).sendKeys(specialty);
    }

    public void setLanguages (int language) {
        driver.findElement(languages).click();
        final By item = By.id("choices--languages-item-choice-"+ language);
        driver.findElement(item).click();
    }
    public void setDelicateSpecialization (String specialization) {
        driver.findElement(delicateSpecialization).sendKeys(specialization);
    }
    public void setWebsite (String websites) {
        driver.findElement(website).sendKeys(websites);
    }
    /**
     //     * Provides path of file to the form then clicks upload button
     //     * @param absolutePathOfFile The complete path of the file to upload
     //     */
    public void uploadFile (String absolutePathOfFile){
        driver.findElement(uploadFile).sendKeys(absolutePathOfFile);
    }
    public void setCvSummary (String cv) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(cvSummary).sendKeys(cv);
    }
    public void clickNextOne(){
        driver.findElement(nextButton_1).click();
    }
    public void setBankName( String name ) {
        driver.findElement(bankName).sendKeys(name);
    }
    public void setBankAddress (String address) {
        driver.findElement(bankAddress).sendKeys(address);
    }
    public void setBeneficiaryName (String name) {
        driver.findElement(beneficiaryName).sendKeys(name);
    }
    public void setBeneficiaryAddress (String address) {
        driver.findElement(beneficiaryAddress).sendKeys(address);
    }
    public void setAccountNumber (String accountNum) {
        driver.findElement(accountNumber).sendKeys(accountNum);
    }
    public void setAccountCurrency (int currency) {
        driver.findElement(accountCurrency).click();
        final By accountCurrencyItem = By.id("choices--accountCurrency-item-choice-"+currency);
        driver.findElement(accountCurrencyItem).click();
    }
    public void clickNextTwo(){
        driver.findElement(nextButton_2).click();
    }
    public void clickNextThree(){
        driver.findElement(nextButton_3).click();
    }
    public void AddVisitButton() {
        driver.findElement(addVisit).click();
    }
    public void setVisitType (int choose) {
        driver.findElement(visitType).click();
        final By visitTypeItem = By.id("choices--visitType-item-choice-" + choose);
        driver.findElement(visitTypeItem).click();
    }

    public void setInstitutionName (int choose){
        driver.findElement(institutionName).click();
        final By institutionNameItem = By.id("choices--institutionName-item-choice-" + choose);
        driver.findElement(institutionNameItem).click();
    }
    public void setProgramName (int choose) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(programName).click();
        final By programNameItem = By.id("choices--programName-item-choice-"+choose);
        driver.findElement(programNameItem).click();
    }
    public void setVisitRole (int choose){
        driver.findElement(visitRole).click();
        final By visitRoleItem = By.id("choices--visitRole-item-choice-"+choose);
        driver.findElement(visitRoleItem).click();
    }
    public void setVisitDate (String date){
        driver.findElement(visitDate).sendKeys(date);
    }
    public void setVisitEvaluation (String evaluation) {
        driver.findElement(visitEvaluation).sendKeys(evaluation);
    }
    public void setSaveVisit () {
        driver.findElement(saveVisit).click();
    }
    public void clickNextFour(){
        driver.findElement(nextButton_4).click();
    }
    public void clickCheckBox(){
        driver.findElement(checkBox).click();
    }
    public void setSubmitTask(){
        driver.findElement(submitTask).click();
    }
    public void setAddOtb(String otb) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addOtb).sendKeys(otb);
    }
    public void setSendTask(){
        driver.findElement(sendTask).click();
    }


}
