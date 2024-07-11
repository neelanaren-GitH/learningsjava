import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGsample {
  @Test
  public void getURL() {
	  
	  WebDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelavathy.n\\selenium - workspace\\chromedriver\\chromedriver.exe");
	  driver.get("https://letcode.in/test");
	  driver.findElement(By.className("card-footer-item"));
	  
	  
  }
}
