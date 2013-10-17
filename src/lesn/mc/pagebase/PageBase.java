package lesn.mc.pagebase;


import java.util.List;



import org.apache.commons.logging.Log;
import org.openqa.jetty.log.LogFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import lesn.mc.pageelement.LoginPageElement;
import lesn.mc.pageelement.LoginPageTestData;




public class PageBase extends PageBaseAbstract{

	private WebDriver driver;
	private Log logger =  LogFactory.getLog(this.getClass());
		
	 public void open(){
		  driver.get(LoginPageElement.URL); 
	  }
	 public String getURL() {
			return LoginPageElement.URL;
		  }
	 
	  public boolean isPageLoad(){
		  return (driver.getTitle().contains(LoginPageTestData.pageTitle)); 
	  } 
	  public PageBase(){
		  
	  }
	  public PageBase(WebDriver driver, String pageTitle) {
	  this.driver = driver; 
	  LoginPageTestData.pageTitle = pageTitle; 
  }

	public WebElement findId(WebDriver driver, String id) {
		return driver.findElement(By.id(id));
		
	}
	
	
	public WebElement findName(WebDriver driver, String name){
		return driver.findElement(By.name(name));
		
	}

	public WebElement findXpath(WebDriver driver,String xpath){
		return driver.findElement(By.xpath(xpath));
	}

	public void findClassName(WebDriver driver, String className){
		driver.findElement(By.className(className));
	}

	public void findCssSelector(WebDriver driver, String cssselector){
		driver.findElement(By.cssSelector(cssselector));
	}

	public void findLinkText(WebDriver driver, String linkText){
		driver.findElement(By.linkText(linkText)).click();
	}

	public void findPartialLinkText(WebDriver driver, String partialLinkText){
		driver.findElement(By.partialLinkText(partialLinkText)).click();
	}

	public void findTagName(WebDriver driver, String tagName){
		driver.findElement(By.tagName(tagName));
	}
	

	public void setId(WebDriver driver,String id,String value)  {
		driver.findElement(By.id(id)).sendKeys(value);	
		
	}
	
	public void setValueForElment(WebDriver driver,WebElement we,String value)  {
		we.sendKeys(value);	
		
	}

	public void setName(WebDriver driver, String name,String value) {
		driver.findElement(By.name(name)).sendKeys(value);
		
	}
	

	public void clickForId(WebDriver driver,String id) {
	    driver.findElement(By.id(id)).click();
		
	}
	

	public void clickForName(WebDriver driver, String name) {
		
		driver.findElement(By.name(name)).click();
	}

	public void clickForXpath(WebDriver driver, String xpath) {
			
		driver.findElement(By.xpath(xpath)).click();
		}

	public void clearForId(WebDriver driver, String id) {
		driver.findElement(By.id(id)).clear();
		
	}

	public void clearForName(WebDriver driver, String name) {
		driver.findElement(By.name(name)).clear();
		
	}

	@Override
	public String byXpathGetText(WebDriver driver,String xpath) {
	    return driver.findElement(By.xpath(xpath)).getText();
		
	}

	public  void byXpathEnter(WebDriver driver,String xpath){
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}

	public void byXpathDown(WebDriver driver,String xpath){
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.DOWN);
	}

	@Override
	public void swithFrame(WebDriver driver,String name) {
		driver.switchTo().frame(name);
		
	}

	@Override
	public void jumpFrame(WebDriver driver) {
	    driver.switchTo().defaultContent();
		
	};

	public void executeScript(WebDriver driver,String str){
		 ((JavascriptExecutor) driver).executeScript(str); 
	}

	public void  setXpath(WebDriver driver, String xpath,String value){
		driver.findElement(By.xpath(xpath)).sendKeys(value);	
	};
	

	public  void  switchForNoidnameInframe(WebDriver driver){
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	};
	

	public void  closeDialogbox(WebDriver driver) throws InterruptedException{

		Alert confirm = driver.switchTo().alert(); 
		 confirm.accept();
				  
	};
	

	public void clickForClass(WebDriver driver,String classname){
		driver.findElement(By.className(classname)).click();
	};
	
	public void clearForXpath(WebDriver driver,String xpath){
		driver.findElement(By.xpath(xpath)).clear();
	}
	@Override
	public void moveElement(WebDriver driver,WebElement ement) {
		Actions action = new Actions(driver) ;   
		action.moveToElement(ement).click().perform();	

		
		
	}
	@Override
	public void selectDropdown(WebDriver driver, String id,String values) {
		
		WebElement select = driver.findElement(By.id(id));
 
        List<WebElement> options = ((WebElement) select).findElements(By.tagName("option"));
        
        for(WebElement option : options){
        	
            if(option.getText().equals(values)) {
            	
                option.click();
                
                break;
            }
        }
		
	}
	
	@Override
	public void selectNoIDDropdown(WebDriver driver,String xpath,String values) {
		
		WebElement select = driver.findElement(By.xpath(xpath));
		
		 List<WebElement> options = ((WebElement) select).findElements(By.tagName("option"));
		 
		 for(WebElement option : options){
	        	
	            if(option.getText().equals(values)) {
	            	
	                option.click();
	                
	                break;
	            }
	        }
	}
	
	@Override
	
	public  String byIDGetText(WebDriver driver, String id) {

		return driver.findElement(By.id(id)).getText();
	}
	
	
	@Override
	public void JudgeDialogbox(WebDriver driver,String values) {
		
		Alert confirm = driver.switchTo().alert(); 
		
		if(confirm.getText().equals(values)){
			
			 confirm.accept();
		}
       
		
	}
	@Override
	public void byXpathSelected(WebDriver driver, String xpath) {
		
		boolean is = driver.findElement(By.xpath(xpath)).isSelected();
		 
		 while(is==false){
			 
			 driver.findElement(By.xpath(xpath)).click();
			 
			 boolean it = driver.findElement(By.xpath(xpath)).isSelected();
			 
			 if(it==true){
				 
				 break;
				 
			 }
		 }
		 
		   
	}
	@Override
	public String byXpathInputGetText(WebDriver driver, String xpath) {
		
		return driver.findElement(By.xpath(xpath)).getAttribute("value");
	}
	@Override
	public String byIDInputGetText(WebDriver driver, String id) {
		
		return driver.findElement(By.id(id)).getAttribute("value");
	}

	

}
