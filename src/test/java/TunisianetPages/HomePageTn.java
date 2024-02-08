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

public class HomePageTn {


	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
	List<WebElement> submenus;
	
	
	public HomePageTn (WebDriver driver) {
		PageFactory.initElements(Config.driver,this);
		
	}
	public void mousehoveronmenus (String menutitle,String submenutitle) throws Exception {
		try {
		for(WebElement menu : menus) {
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if (menu.getText().contains(menutitle)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
				
				for(WebElement submenu : submenus) {
					Thread.sleep(3000);
					if(submenu.getText().contains(submenutitle)) {
					Config.actions.moveToElement(submenu).perform();
						submenu.click();
					}		
				}
				}
			}
			
	
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
}

