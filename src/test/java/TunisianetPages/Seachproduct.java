package TunisianetPages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class Seachproduct {
@FindBy(xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]")
WebElement searItem;
@FindBy(xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/div[2]/button")
WebElement submit;



public Seachproduct (WebDriver driver) {
	PageFactory.initElements(Config.driver,this);
}
public void searItem (String searchproduct) {
	try {
	searItem.sendKeys(searchproduct+Keys.ENTER);
	WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains(searchproduct.toLowerCase()));
} catch (Exception e) {
	// TODO: handle exception
}
}
public void search() throws InterruptedException {
Thread.sleep(4000);
	submit.click();
}
}