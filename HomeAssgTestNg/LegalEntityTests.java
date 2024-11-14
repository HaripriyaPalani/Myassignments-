package HomeAssgTestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LegalEntityTests extends ProjectSpecificMethod {

   @Test
    public void createAndVerifyLegalEntity() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='App Launcher']"))).click();
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='View All Applications']"))).click();
          WebElement  Legal=	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='slds-truncate' and text()='Legal Entities']")));
    	 Actions action =new Actions(driver);
    	 action.moveToElement(Legal).click().perform();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='New']"))).click();
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']"))).sendKeys("Salesforce Automation by Haripriya");
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save']"))).click();

       
   }
    

 @Test
    public void createLegalEntityWithoutNameAndVerifyAlert() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	

	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='App Launcher']"))).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='View All Applications']"))).click();
	 Actions action =new Actions(driver);
        WebElement  Legal=	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='slds-truncate' and text()='Legal Entities']")));
         action.moveToElement(Legal).click().perform();  
	     WebElement dropdown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//one-app-nav-bar-item-root[@data-id='0QkJ4000000sbf9KAA']//lightning-icon[@icon-name='utility:chevrondown']")));
	     action.moveToElement(dropdown).click().perform();
	     WebElement newEntity=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Legal Entity']")));
	     action.moveToElement(newEntity).click().perform();
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']"))).sendKeys("Salesforce Automation by Haripriya");
         WebElement companyField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='CompanyName']")));
         companyField.sendKeys("TestLeaf");
         WebElement descriptionField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//textarea[@class='slds-textarea'])[2]")));
         descriptionField.sendKeys("Salesforces");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='actionBody']"))).sendKeys(Keys.PAGE_DOWN);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-value='--None--']"))).click();
        WebElement active = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Active']")));
        action.moveToElement(active).click().perform();
         driver.findElement(By.xpath("//button[text()='Save']")).click();
  }
}
