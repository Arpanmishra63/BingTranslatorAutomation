package webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Translation {

	
	WebDriver driver;
	By sourceLanguage = (By.id("t_sl"));
	By targetLanguage = (By.id("t_tl"));
	By input = (By.id("t_sv"));
	By output = (By.id("t_tv"));
	By swap= By.id("t_revIcon");
	
	public Translation(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
public void selectLanguage(String inputText, String outputText) {
		driver.findElement(sourceLanguage).sendKeys(inputText);
		driver.findElement(targetLanguage).sendKeys(outputText);
		
	}

	public String translate(String inputTextValue) {
		driver.findElement(input).sendKeys(inputTextValue);
		
		return driver.findElement(output).getText();
	}
	
	public boolean swap() {
		String sourceBeforeClick = driver.findElement(input).getText();
		System.out.println(sourceBeforeClick + "zbwdciue");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(swap).click();
		
		
		String targetAfterClick = driver.findElement(output).getText();
		

		System.out.println(targetAfterClick);
		
		if(sourceBeforeClick.equals(targetAfterClick)) {
			return true;
		}
		else
			return false;
		
	}
	
}
