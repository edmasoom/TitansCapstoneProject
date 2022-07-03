package step.definition;


//its important to import core.Base not other imports
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{
	
	// before and after hooks, if you want o run a block of code before scenior you 
	// put the before and after hooks. 
	//Every scenario we run, the below both methods will run automatically 
	
	@Before
	public void beforeHooks(Scenario scenario) {
	logger.info("Scenario" + scenario.getName()+ "started");
	selectBrowser();
	openBrowser();
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		driver.quit();
		logger.info("Scenario" + scenario.getName()+ scenario.getStatus());
		
	}

}