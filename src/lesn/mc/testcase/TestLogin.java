package lesn.mc.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




import lesn.mc.pageelement.LoginPageElement;
import lesn.mc.pageelement.LoginPageTestData;


import lesn.mc.pages.LoginPage;

public class TestLogin {

        private static WebDriver driver;
        private static LoginPage page; 
      
        @BeforeClass
        public static void initializeClass(){
               driver = new FirefoxDriver();
               page=new LoginPage(driver,LoginPageTestData.URL);
                
        }
       

       @Test
        public void testLoginSuccess() throws InterruptedException{
    	   
           page.open();
           page.typeUserName(driver, LoginPageElement.usernameByID,LoginPageTestData.username);    
           page.typePassword(driver, LoginPageElement.passwordByID,LoginPageTestData.password);
           page.LoginButton(driver,  LoginPageElement.submit);
           Assert.assertEquals(driver.getTitle(), LoginPageTestData.loginTitle );
       }

      @Test
        public void testLoginNoPassword() throws InterruptedException{
    	  
    	  page.open();
          page.typeUserName(driver, LoginPageElement.usernameByID,LoginPageTestData.username);    
          page.LoginButton(driver,  LoginPageElement.submit);
          Assert. assertEquals(page.LoginErrMessageForNoPassword(), LoginPageTestData.ErrMessageForNoPassword );
       }
      
        @Test
        public void testLoginNoUsername() throws InterruptedException{
        	page.open();
        	page.typePassword(driver, LoginPageElement.passwordByID,LoginPageTestData.password);    
            page.LoginButton(driver,  LoginPageElement.submit);
            System.out.println(page.LoginErrMessageForNoUsername());
            Assert. assertEquals(page.LoginErrMessageForNoUsername(), "必须录入用户名" );
       }
      
        @Test
        public void testLoginNoUsernameAndPassword() throws InterruptedException{
        	page.open();
            page.LoginButton(driver,  LoginPageElement.submit);
            Assert. assertEquals(page.LoginErrMessageForNoUsernameAndPassword(), "必须录入用户名。" +"\n" +"必须录入密码。" );

       }

      
    @AfterClass
        public static void Quit(){
               driver.quit(); 
       }

}
