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

public class List {
	WebDriver driver;
	@Given("Need to launch the telecom browser")
	public void need_to_launch_the_telecom_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\Avinaash\\Cucmber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("Need to enter the add customer")
	public void need_to_enter_the_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("Fill the customer deatils")
	public void fill_the_customer_deatils(DataTable dataTable) {
		//List
		/*java.util.List<String> cus = dataTable.asList();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys(cus.get(1));
		driver.findElement(By.id("lname")).sendKeys(cus.get(2));
		driver.findElement(By.id("email")).sendKeys(cus.get(3));
		driver.findElement(By.xpath("(//*[@id=\"message\"])[2]")).sendKeys(cus.get(4));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get(5));
		
		//List of List
		java.util.List<java.util.List<String>> cus = dataTable.asLists();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys(cus.get(0).get(1));
		driver.findElement(By.id("lname")).sendKeys(cus.get(1).get(2));
		driver.findElement(By.id("email")).sendKeys(cus.get(2).get(3));
		driver.findElement(By.xpath("(//*[@id=\"message\"])[2]")).sendKeys(cus.get(3).get(4));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get(3).get(5)); */
		
		//List of Map
		java.util.List<Map<String, String>> cus = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys(cus.get(0).get("Firtname"));
		driver.findElement(By.id("lname")).sendKeys(cus.get(1).get("Lastname"));
		driver.findElement(By.id("email")).sendKeys(cus.get(2).get("Email"));
		driver.findElement(By.xpath("(//*[@id=\"message\"])[2]")).sendKeys(cus.get(3).get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cus.get(3).get("Phone"));
		
	}

	@When("enter the submit")
	public void enter_the_submit() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();
	}

	@Then("validate the page")
	public void validate_the_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("access"));
	}

}
