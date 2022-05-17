package pageFactory;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
	public WebDriver driver;

	public SecondPage secondPage;

	public HomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(this.driver, this);
		secondPage = new SecondPage(driver);

	}

	// secondPage=new SecondPage(this.driver);

	@FindBy(xpath = "//table//tr[@class='heading3']")

	WebElement homePageUserName;

	public String getHomePageDashboardUserName() {

		return homePageUserName.getText();

	}

}
