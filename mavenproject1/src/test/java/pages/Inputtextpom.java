package pages;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Inputtextpom {

 WebDriver driver;
	public  Inputtextpom(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(how = How.ID,using ="fullName")
	WebElement fullName;
	
	@FindBy(how = How.ID,using ="join")
	WebElement joinText;
	
	@FindBy(how = How.ID,using ="clearMe")
	WebElement clearText;
	
	@FindBy(how = How.ID,using ="noEdit")
	WebElement textEnabled;
	
	@FindBy(how = How.ID,using ="dontwrite")
	WebElement readOnly;
	
	@FindBy(how = How.XPATH,using = "//a[text()='Click']")
	WebElement Clickbutton;
	
	@FindBy (how = How.ID,using ="home")
	WebElement GoToHome;
	
	@FindBy (how = How.ID,using = "position")
	WebElement Findlocation;
	
	@FindBy (how = How.ID,using = "color")
	WebElement ColorButton;
	
	@FindBy (how = How.ID,using = "property")
	WebElement ButtonSize;
	
	@FindBy (how = How.ID,using = "isDisabled")
	WebElement DisabledButton;
	
	
   public void clickEdit() {
		
		editButton.click();
	}
	
   public void firstName(String text) {
		
		fullName.sendKeys(text);
	}
   
   public void appendText(String paste) {
		
		joinText.sendKeys( paste, Keys.TAB);
	}
   
   public void insideText() {
		
		clearText.clear();
	}
   
   public void enableText() {
		
		boolean txt = textEnabled.isEnabled();
		System.out.println(txt);
	}
   
   public void readonlyText() {
		
		String read = readOnly.getAttribute("readonly");
		System.out.println(read);
	}
   
   public void clickButton() {
	   Clickbutton.click();
   }
   
   public void gotoHome() {
		
		GoToHome.click();
		driver.navigate().back();
	}
   
   
   public void findLocation() {
	   
	  Point point = Findlocation.getLocation();
	  int x=  point.getX();
	  int y = point.getY();
	  System.out.println("The values of" + x + "the values of y" + y);
	   
   }
   
   public void buttonColor() {
	   
	  String color = ColorButton.getCssValue("background-color");
	   System.out.println("background color is" + color);
	   
   }
   
   public void buttonSize() {
	   
	  Dimension size = ButtonSize.getSize();
	   System.out.println("Button Size" + size);
   }
   
public void buttonDisable() {
	   
	   boolean button = DisabledButton.isEnabled();
	   System.out.println("Button" +button);
   }

}
