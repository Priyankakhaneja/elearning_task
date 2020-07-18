package elearning_stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import wrapper.wrapper_excel;

import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;

	public class stepdefinitions {
		static WebDriver driver;
		@Given("^launch application with url \"([^\"]*)\"$")
		public void launch_application_with_url(String url) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PriyankaKhaneja\\Desktop\\selenium new\\chromedriver_win32 (2)\\chromedriver.exe" );
			driver= new ChromeDriver();
			driver.get(url);
		    
		}

		@Then("^i enter username \"([^\"]*)\" and passowrd \"([^\"]*)\"$")
		public void i_enter_username_and_passowrd(String username, String password) throws Throwable {
		   driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(username);
		   driver.findElement(By.name("password")).sendKeys(password);
		   driver.findElement(By.name("submitAuth")).click();
		}
		@Given("^i click on administration tab and course category$")
		public void i_click_on_administration_tab_and_course_category() throws Throwable {
		  driver.findElement(By.xpath("//a[@title=\"Administration\"]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Courses categories')]")).click();
		  
		}

		@Then("^i create a new category for course with category code \"([^\"]*)\" and category name \"([^\"]*)\"$")
		public void i_create_a_new_category_for_course_with_category_code_and_category_name(String code, String name) throws Throwable {
		    driver.findElement(By.xpath("//img[@title='Add category']")).click();
		    driver.findElement(By.id("course_category_code")).sendKeys(code);
		    driver.findElement(By.id("course_category_name")).sendKeys(name);
		    driver.findElement(By.xpath("//div[@class='radio']//input[@value='TRUE']")).click();
		    driver.findElement(By.id("course_category_submit")).click();
		    Thread.sleep(3000);
		     		    
		}

@Given("^i click on admin tab and create a course link$")
public void i_click_on_admin_tab_and_create_a_course_link() throws Throwable {
	driver.findElement(By.xpath("//a[@title=\"Administration\"]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create a course')]")).click();
	
}

@Given("^i add title \"([^\"]*)\" and code \"([^\"]*)\"$")
public void i_add_title_and_code(String title, String code) throws Throwable {
	driver.findElement(By.id("update_course_title")).sendKeys(title);
	driver.findElement(By.xpath("//input[@name='visual_code']")).sendKeys(code);
	
}

@Then("^i add teacher \"([^\"]*)\" category \"([^\"]*)\" and language \"([^\"]*)\"$")
public void i_add_teacher_category_and_language(String teach,String category, String Lang) throws Throwable {
Select lan = new Select(driver.findElement(By.name("course_language")));
lan.selectByValue(Lang);
Select cat= new Select (driver.findElement(By.name("category_code")));
cat.selectByValue(category);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='select2-selection__clear']")).click();
	WebElement teacherlist = driver.findElement(By.xpath("//input[@type='search']"));
	teacherlist.click();
	teacherlist.sendKeys(teach);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"select2-course_teachers-results\"]/li[7]")).click();
	driver.findElement(By.xpath("//button[contains(text(),' Create a course')]")).click();
	Thread.sleep(5000);
	String result =driver.findElement(By.cssSelector(".alert.alert-success")).getText();
	System.out.println(result);
	driver.quit();
	
}

}
