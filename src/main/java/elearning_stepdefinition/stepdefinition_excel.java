package elearning_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wrapper.wrapper_excel;

public class stepdefinition_excel {
	static WebDriver driver;
	@Given("^launch application with url$")
	public void launch_application_with_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PriyankaKhaneja\\Desktop\\selenium new\\chromedriver_win32 (2)\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get(wrapper_excel.getdata(1, 0));
	}

	@Then("^i enter username and passowrd$")
	public void i_enter_username_and_passowrd() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(wrapper_excel.getdata(1, 1));
		   driver.findElement(By.name("password")).sendKeys(wrapper_excel.getdata(1, 2));
		   driver.findElement(By.name("submitAuth")).click();
	   
	}
	@Then("^i create a new category for course$")
	public void i_create_a_new_category_for_course() throws Throwable {
		 driver.findElement(By.xpath("//a[@title=\"Administration\"]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Courses categories')]")).click();
		 driver.findElement(By.xpath("//img[@title='Add category']")).click();
		 driver.findElement(By.id("course_category_code")).sendKeys(wrapper_excel.getdata(1, 3));
		 driver.findElement(By.id("course_category_name")).sendKeys(wrapper_excel.getdata(1, 4));
		 driver.findElement(By.xpath("//div[@class='radio']//input[@value='TRUE']")).click();
		 driver.findElement(By.id("course_category_submit")).click();
		 Thread.sleep(3000);
	 
	}

	@When("^i create a course$")
	public void i_create_a_course() throws Throwable {
		driver.findElement(By.xpath("//a[@title=\"Administration\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create a course')]")).click();
		driver.findElement(By.id("update_course_title")).sendKeys(wrapper_excel.getdata(1, 5));
		driver.findElement(By.xpath("//input[@name='visual_code']")).sendKeys(wrapper_excel.getdata(1, 6));
		Select lan = new Select(driver.findElement(By.name("course_language")));
		lan.selectByValue(wrapper_excel.getdata(1, 9));
		Select cat= new Select (driver.findElement(By.name("category_code")));
		cat.selectByValue(wrapper_excel.getdata(1, 8));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[@class='select2-selection__clear']")).click();
			WebElement teacherlist = driver.findElement(By.xpath("//input[@type='search']"));
			teacherlist.click();
			teacherlist.sendKeys(wrapper_excel.getdata(1, 7));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"select2-course_teachers-results\"]/li[7]")).click();
			driver.findElement(By.xpath("//button[contains(text(),' Create a course')]")).click();
			
	}

	@Then("^i verify course is added$")
	public void i_verify_course_is_added() throws Throwable {
		Thread.sleep(3000);
		String result =driver.findElement(By.cssSelector(".alert.alert-success")).getText();
		System.out.println(result);
		driver.quit();
	}

}
