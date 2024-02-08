package TestSuitesTn;

import Helper.Config;
import Helper.Utils;
import io.cucumber.java.en.*;

public class CummonStepDef {
	@Given("Admin is on HomePage")
	public void admin_is_on_home_page() throws Exception {
		 Config.ConfigChrome();
		   Config.maximazewindow();
	Config.navigate(Utils.getproprety("Web_Portal_Link"));
	}
	}

