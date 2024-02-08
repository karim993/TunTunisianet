package TunisianetPages;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class tunisianetPages {
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> productnames;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement ajouteraupanier;
	@FindBy(xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement contenentpanier;
@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[3]/div/a")	
WebElement commander;

	
	public tunisianetPages(WebDriver driver) {
		PageFactory.initElements(Config.driver,this);
	}
	public void clickonproduct (String productByName)  {
		try {
		for(WebElement productname : productnames) {
			Thread.sleep(4000);
			if(productname.getText().contains(productByName)) {
				Config.actions = new Actions(Config.driver);
			Config.actions.moveToElement(productname).perform();
			productname.click();
			
			}
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
			
}

public void addartical()  {
	try {
	ajouteraupanier.click();
	contenentpanier.click();
	commander.click();
	
	
}	catch (Exception e) {
	// TODO: handle exception
}
}
}