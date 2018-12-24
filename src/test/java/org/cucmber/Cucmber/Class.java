package org.cucmber.Cucmber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Class {
	WebDriver driver;
	@Given("Launch the google page")
	public void launch_the_google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\Avinaash\\Cucmber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("pass the value by using sendkeys")
	public void pass_the_value_by_using_sendkeys() {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("selenium",Keys.ENTER);
		
	}

	@Then("verify the value")
	public void verify_the_value() {
		Assert.assertTrue(driver.getCurrentUrl().contains("search"));
	}

}
