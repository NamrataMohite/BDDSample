package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class ModuleTwoStepDef {
	
	@Before (order=1,value="@RegressionTest")                                          //Hooks:@Before and @After are hooks they will run when we want to run them before a scenario or step even if scenario pass or fail after hook will be executed
	public void initChrome() {
		System.out.println("Init Chrome");
	}
	
	@Before(order=2,value="@RegressionTest")
	public void readFromFile() {
		System.out.println("Read from Property file");
	}
	
	@Before(order=2,value="@SmokeTest")
	public void setUpDB() {
		System.out.println("Congiure DB");
	}
	

	@Before (order=1,value="@SmokeTest")                                            //Tagged Hooks
	public void initEdge() {
		System.out.println("Init Edge");
	}
	
	@Before
	public void setUpDBTwo() {
		System.out.println("Congiure DB Two");
	}
		@When("USer create a new Tasks")
		public void u_ser_create_a_new_tasks() {
		   System.out.println("USer create a new Tasks");
		}
		
		

			@When("User view Tasks details")
			public void user_view_tasks_details() {
			   System.out.println("User view Tasks details");
			}
			
			
				@When("User update a Tasks details")
				public void user_update_a_tasks_details() {
					System.out.println("User update a Tasks details");
				    
				}
				
//				@After
//				public void closeDB() {
//					System.out.println("Close DB");
//				}










}
