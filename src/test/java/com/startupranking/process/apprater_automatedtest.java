package com.startupranking.process;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class apprater_automatedtest {
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(); driver.get("https://apprater.net/add/");
	}
	@Test
	public void completeData() throws InterruptedException{	
		if (driver.findElement(By.name("user-submitted-name")).isDisplayed()) {
			driver.findElement(By.name("user-submitted-name")).sendKeys("Axel Yataco");
			driver.findElement(By.name("user-submitted-email")).sendKeys("jhonatan_axel@outlook.com");
			driver.findElement(By.cssSelector("input[name = 'user-submitted-title']")).sendKeys("Personal Project");
			driver.findElement(By.xpath("//input[@name='user-submitted-url[]']")).sendKeys("https://bienesraicesb.netlify.app");
			driver.findElement(By.cssSelector("textarea[name='user-submitted-content']")).sendKeys("Project developed with the technologies: HTML,SASS,JS");	
		} else
			System.out.println("Page not found");
	}
}
