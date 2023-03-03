package StepDefinitionsFile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class DataTableWithoutHeader
{
	public WebDriver driver;

@Given("^I open my chrome browser$")
public void i_open_my_chrome_browser() throws Throwable 
{
  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver/chromedriver.exe");
  driver=new ChromeDriver();  
}

@When("^I enter URL of website\"([^\"]*)\"$")
public void i_enter_URL_of_website(String arg1) throws Throwable 
{
	 driver.get("https://www.nykaa.com/");  
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("	(//button[@shape='default'])[2]")).click();
	 Thread.sleep(2000); 
}

@When("^I enter my valid username and password$")
public void i_enter_my_valid_username_and_password(DataTable header) throws Throwable
{
   List<List<String>> data= header.raw();
   driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys(data.get(0).get(0));
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[text()='proceed']")).click();  //click on  proceed button
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
   Thread.sleep(2000);
	 
   driver.findElement(By.xpath("//button[text()='login']")).click();  //click on  login button
   Thread.sleep(2000);
}

@Then("^User should be on homepage$")
public void user_should_be_on_homepage() throws Throwable
{
    
}


}
