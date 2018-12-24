package org.cucmber.Cucmber;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Class2 {
	WebDriver driver;
	@Given("First enter into telecom site")
	public void first_enter_into_telecom_site() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\Avinaash\\Cucmber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("Click the add customer link")
	public void click_the_add_customer_link() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("Fill the details")
	public void fill_the_details(DataTable dataTable) {
		Map<String, String> cus = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys(cus.get("Firstname"));
		driver.findElement(By.id("lname")).sendKeys(cus.get("Lastname"));
		driver.findElement(By.id("email")).sendKeys(cus.get("Email"));
		driver.findElement(By.xpath("(//*[@id=\"message\"])[2]")).sendKeys(cus.get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get("Phoneno"));
	}

	@When("click submit")
	public void click_submit() {
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();
	}

	@Then("validate the out put result.")
	public void validate_the_out_put_result() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("access"));
	}
}
