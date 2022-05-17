package stepDefinitions;

import base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;

public class newFeature {

	public Base base;
	public HomePage homePage;

	public newFeature(Base base) {
		this.base = base;
		this.homePage = base.getHomePage();

	}

	@Given("Precondition is given")
	public void precondition_is_given() {
		System.out.println("Hi");

		homePage.secondPage.getHomePageDashboardUserName();

	}

	@When("Something is done")
	public void something_is_done() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Something is expected")
	public void something_is_expected() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("Another precondition is given")
	public void another_precondition_is_given() {
		System.out.println("bye");
		// Assert.assertEquals(1,2);
		// Write code here that turns the phrase above into concrete actions

	}

	@When("Something is done again")
	public void something_is_done_again() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Something is expected again")
	public void something_is_expected_again() {
		// Write code here that turns the phrase above into concrete actions

	}

}
