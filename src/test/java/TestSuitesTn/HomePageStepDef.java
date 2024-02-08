package TestSuitesTn;



import Helper.Config;
import TunisianetPages.HomePageTn;
import TunisianetPages.tunisianetPages;
import io.cucumber.java.en.*;

public class HomePageStepDef {
	
	@Given("Admin clic on menu {string} and clic on submenu {string}")
	public void admin_clic_on_menu_and_clic_on_submenu(String menus, String submenus) throws Exception {
	   HomePageTn home = new HomePageTn(Config.driver);
	   home.mousehoveronmenus(menus, submenus);
	}

	@Then("Admin clic on product {string}")
	public void admin_clic_on_product(String productnames) {
		tunisianetPages page = new tunisianetPages(Config.driver);
		page.clickonproduct(productnames);
	}

	@Then("Admin is directed to another page and clic on {string}") 
	public void admin_is_directed_to_another_page_and_clic_on(String ajouteraupanier)  throws  Exception{
		tunisianetPages page = new tunisianetPages(Config.driver);
		page.clickonproduct(ajouteraupanier);
	   
	}
	@Then("Admin clic on {string}")
	public void admin_clic_on(String contenentpanier) {
		tunisianetPages page = new tunisianetPages(Config.driver);
		page.addartical();
		Config.quitbrowser();
	}



	

	}
	
