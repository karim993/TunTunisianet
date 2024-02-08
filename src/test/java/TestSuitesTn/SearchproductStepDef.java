package TestSuitesTn;

import Helper.Config;
import TunisianetPages.Seachproduct;
import io.cucumber.java.en.*;


public class SearchproductStepDef {

	
	@Given("Admin clic on search {string}")
	public void admin_clic_on_search(String searchproduct) {
	    Seachproduct page = new Seachproduct(Config.driver);
	    page.searItem(searchproduct);
	}
	@Then("Admin clic {string}")
	public void admin_clic(String submit) throws InterruptedException {
		Seachproduct page = new Seachproduct(Config.driver);
		page.search();
		Config.quitbrowser();
	   
	}


	
	
}
