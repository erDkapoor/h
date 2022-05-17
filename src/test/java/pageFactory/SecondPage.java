package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	WebDriver driver;

	public SecondPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//table//tr[@class='heading3']")

	WebElement homePageUserName;

	public String getHomePageDashboardUserName() {

		return homePageUserName.getText();

	}
}
