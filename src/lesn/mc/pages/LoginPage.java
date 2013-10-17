package lesn.mc.pages;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import lesn.mc.pageelement.LoginPageElement;
import lesn.mc.pagebase.PageBase;

import java.io.*;

public class LoginPage extends PageBase {
    
    private WebDriver driver ;
    private PageBase pageBase=new PageBase();
    private String nousermessage;
      
    public LoginPage() {
    	super();
    }
    public LoginPage(WebDriver driver,String pageTitle){
         
        super(driver, pageTitle);        
   }
  
  
    public void typeUserName(WebDriver driver,String ID,String value){
    	pageBase.setId(driver, ID, value);
    }
    
    public  void typePassword(WebDriver driver,String ID,String value){
    	pageBase.setId(driver, ID, value);
    }


    public void LoginButton(WebDriver driver,String xpath){
    	pageBase.clickForXpath(driver, LoginPageElement.submit );
         
   }
  
    public String LoginErrMessageForNoUsername(){
           return driver.findElement(By.xpath(LoginPageElement.Message)).getText();
         
   }
      
    public String LoginErrMessageForNoUsernameAndPassword(){
           return driver.findElement(By.xpath (LoginPageElement.Message )).getText()+
                         driver.findElement(By. xpath(LoginPageElement.Message1)).getText();
   }
  
    public String LoginErrMessageForNoPassword(){
           return driver.findElement(By.xpath ( LoginPageElement.Message1 )).getText();
   }
   
}