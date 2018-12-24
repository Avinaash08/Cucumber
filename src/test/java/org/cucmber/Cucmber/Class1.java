package org.cucmber.Cucmber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Class1 {
	WebDriver driver;

	@Given("launch the google page")
	public void launch_the_google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\Avinaash\\Cucmber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	}

	@Given("click the gamil and get into sign")
	public void click_the_gamil_and_get_into_sign() {
		driver.navigate().to(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en&flowName=GlifWebSignIn&flowEntry=SignUp");
	}

	@When("Fill all the filled")
	public void fill_all_the_filled(DataTable dataTable) {
		List<String> sign = dataTable.asList();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(sign.get(0));

	}

	@When("click submit button")
	public void click_submit_button() {

	}

	@Then("verify the given value")
	public void verify_the_given_value() {

	}

}
