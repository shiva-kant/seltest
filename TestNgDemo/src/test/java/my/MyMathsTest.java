package my;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyMathsTest {
	WebDriver driver;

	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivchou\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
driver.get("C:\\Users\\shivchou\\Desktop\\hello.html");
	}

	@AfterClass
	public void destroy() {

		driver = null;
		// System.out.println("AFTER");
	}

	@Test
	public void testOne() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"xyz\"]"));
		String str = element.getText();
		assertEquals("ALPHA", str);
	}
}
