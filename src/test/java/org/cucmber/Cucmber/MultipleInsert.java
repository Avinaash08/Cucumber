package org.cucmber.Cucmber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultipleInsert {
	WebDriver driver;
	@Given("Launh the url")
	public void launh_the_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\Avinaash\\Cucmber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("launch the add traiff")
	public void launch_the_add_traiff() {
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")).click();
	}

	@When("Fill the field {string},{string},{string},{string},{string},{string}and{string}")
	public void fill_the_field_and(String mon, String flm, String fim, String fsp, String lpm, String ipm, String spc) {
	    driver.findElement(By.id("rental1")).sendKeys(mon);
	    driver.findElement(By.name("local_minutes")).sendKeys(flm);
	    driver.findElement(By.id("inter_minutes")).sendKeys(fim);
	    driver.findElement(By.name("sms_pack")).sendKeys(fsp);
	    driver.findElement(By.name("minutes_charges")).sendKeys(lpm);
	    driver.findElement(By.name("inter_charges")).sendKeys(ipm);
	    driver.findElement(By.name("sms_charges")).sendKeys(spc);
	}

	@When("submit the form")
	public void submit_the_form() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input")).click();
	}

	@Then("verify with assert {string}")
	public void verify_with_assert(String string) {
		Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.xpath("//h2[@style='text-align: center;font-weight: 700;font-size:28px;']")).getText());

	}

}
