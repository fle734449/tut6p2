package tut6p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.jupiter.api.Test;

public class MinWebTest {
	@Test public void t0() {
		// execute the test <x = 0, y = 0, z = 0, submitButton = click> and check the output message is correct
		System.setProperty("webdriver.gecko.driver","TODO: /path/to/geckodriver");
		WebDriver wd = new FirefoxDriver(); // launch the browser
		// edit the next line to enter the location of "min.html" on your file system
		wd.get("file:///C:/Users/.../min.html");
		WebElement we = wd.findElement(By.id(???));
		we.sendKeys(???); // enter a representative for x
		we = wd.findElement(By.id(???));
		we.sendKeys(???); // enter a representative for y
		we = wd.findElement(By.id(???));
		we.sendKeys(???); // enter a representative for z
		we = wd.findElement(By.id(???));
		we.???(); //click the button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, 0, 0) = 0", output);
		wd.quit(); // close the browser window
	}
}
