package inputtext;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import mavenproject1.mavenproject1.InputtextBase;
import pages.Inputtextpom;

	public class InputText extends InputtextBase {
  @Test
  public void init ()throws Exception{
	  
	  Inputtextpom inputpage =  PageFactory.initElements(driver, Inputtextpom.class);
	  inputpage.clickEdit();
	  Thread.sleep(1000);
	  inputpage.firstName("Neela Naren");
	  inputpage.appendText(" person");
	  inputpage.insideText();
	  inputpage.enableText();
	  inputpage.readonlyText();
	  driver.navigate().back();
	  inputpage.clickButton();
	  inputpage.gotoHome();
	  inputpage.findLocation();
	  inputpage.buttonColor();
	  inputpage.buttonSize();
	  inputpage.buttonDisable();
	  
	  
  
  
	}
  }
  

