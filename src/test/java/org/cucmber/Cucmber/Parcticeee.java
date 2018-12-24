package org.cucmber.Cucmber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Parcticeee {
	WebDriver driver;

	@Given("Launch guru")
	public void launch_guru() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\Avinaash\\Cucmber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("Launch add")
	public void launch_add() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("Fill the add {string},{string},{string},{string},{string}and{string}")
	public void fill_the_add_and(String b, String f, String l, String e, String add, String pho) {
		driver.findElement(By.xpath("//label[@for='" + b + "']")).click();
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys(f);
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.xpath("//*[@id=\"message\"]")).getText());
		driver.findElement(By.id("lname")).sendKeys(l);
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.xpath("//*[@id=\"message50\"]")).getText());
		driver.findElement(By.id("email")).sendKeys(e);
		Assert.assertEquals("Email-ID is not valid", driver.findElement(By.xpath("//*[@id=\"message9\"]")).getText());
		driver.findElement(By.xpath("(//*[@id=\"message\"])[2]")).sendKeys(add);
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.xpath("//*[@id=\"message3\"]")).getText());
		driver.findElement(By.id("telephoneno")).sendKeys(pho);
		Assert.assertEquals("Characters are not allowed", driver.findElement(By.xpath("//*[@id=\"message7\"]")).getText());

	}

	@When("submit the application")
	public void submit_the_application() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();
	}

	@Then("verfiy the assert message {string}")
	public void verfiy_the_assert_message(String string) {
		Assert.assertEquals("Please Note Down Your CustomerID",
				driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[2]/td/b")).getText());
	}

}
