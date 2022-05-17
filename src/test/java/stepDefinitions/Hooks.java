package stepDefinitions;

import base.Base;
import io.cucumber.java.After;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageFactory.HomePage;

import java.io.File;
import java.io.IOException;

public class Hooks {
	public HomePage homePage;
	public WebDriver driver;
	public Base base;

	public Hooks(Base base) {
		this.base = base;

	}

	@Before
	public void setUp() {
		base.WebDriverManager();
		this.driver = base.getDriver();
		driver.get("https://www.google.co.in/");

	}

	@After
	public void tearDown() {

		base.WebDriverQuit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver =base.getDriver();
		if(scenario.isFailed())
		{
			//screenshot
			File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");

		}

	}

}
