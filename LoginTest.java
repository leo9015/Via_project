package projectVia;


import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTest extends Base{
	
	public void switchWindows(String givenTitle) throws Exception {
		String title = givenTitle;
		String mainwindow = driver.getWindowHandle();
	      Set<String> s1 = driver.getWindowHandles();
	      Iterator<String> i1 = s1.iterator();
	      
	      while (i1.hasNext()) {
	          String ChildWindow = i1.next();
	              if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
	              driver.switchTo().window(ChildWindow);
	            
	      			String dtitle= driver.getTitle();
	      			Assert.assertEquals(dtitle,title, title + " - Page Not Found");
	      			System.out.println(title); 	
	               driver.close();
	              System.out.println("Child window closed");
	          }
	      }    
	      driver.switchTo().window(mainwindow);
	}
	
	 @Test(priority= 1)
	 public void SigninTest() {
//		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		  wait.until(ExpectedConditions.elementToBeClickable(By.id("wzrk-cancel")));
//	  	  driver.findElement(By.id("wzrk-cancel")).click();
	  	 // Thread.sleep(3000);
	  	  extentlogger = extentreporter.createTest("SignIn Test");
		extentlogger.log(Status.INFO, "Sign In Test");
		 bp.clickonSignin();
		 extentlogger.log(Status.INFO, "Sign In Test clicked");
		 extentlogger.log(Status.PASS, "Sign In Test executed successfully");
	  	  }
	 
	 @Test(priority= 2)
	 public void ForgotTest() {
	  	 // Thread.sleep(3000);
	  	  extentlogger = extentreporter.createTest("Forgot Test");
		extentlogger.log(Status.INFO, "Forgot Test");
		bp.clickonForgot();
		 extentlogger.log(Status.INFO, "Forgot Test clicked");
		 extentlogger.log(Status.PASS, "Forgot Test executed successfully");
		 extentlogger.log(Status.INFO, "Login Here Test");
			bp.clickonLoginHere();
			 extentlogger.log(Status.INFO, "Login Here Test clicked");
			 extentlogger.log(Status.PASS, "Login Here Test executed successfully");

	  	  }
	 
	 
	 @Test(priority= 3)
	 public void FacebookTest() throws Exception {
	  	 // Thread.sleep(3000);
	  	  extentlogger = extentreporter.createTest("Facebook Test");
		extentlogger.log(Status.INFO, "Facebook Test");
		bp.clickonFacebook();
		 extentlogger.log(Status.INFO, "Facebook Test clicked");
		 extentlogger.log(Status.PASS, "Facebook Test executed successfully");
		 switchWindows("Facebook");
	  	  }
	 
	 @Test(priority= 4)
	 public void GoogleTest() throws Exception {
	  	 // Thread.sleep(3000);
	  	 extentlogger = extentreporter.createTest("Google Test");
		 extentlogger.log(Status.INFO, "Google Test");
		 bp.clickonGoogle();
		 extentlogger.log(Status.INFO, "Google Test clicked");
		 extentlogger.log(Status.PASS, "Google Test executed successfully");
		 switchWindows("Sign in – Google accounts");
	  	  }
	 
	 @Test(priority= 5)
	 public void Login() {
	  	 // Thread.sleep(3000);
	  	extentlogger = extentreporter.createTest("Login Test");
		extentlogger.log(Status.INFO, "Login Test");
		bp.clickOnSimail();
		 extentlogger.log(Status.INFO, "Email entered");
		 bp.clickOnSipass();
		 extentlogger.log(Status.INFO, "Password entered");
		 bp.clickonSIbutton();
		 extentlogger.log(Status.INFO, "Signin Button clicked");
		 extentlogger.log(Status.PASS, "Login Test executed successfully");
		 
	  	  }
	 @Test(enabled = false )
	 public void LogoutTest() {
		 extentlogger = extentreporter.createTest("Logout Test");
		extentlogger.log(Status.INFO, "Logout Test"); 
		bp.Logout();
		extentlogger.log(Status.INFO, "Logged In and Logged Out");
		extentlogger.log(Status.PASS, "Logout Test executed successfully");
		driver.navigate().to("https://in.via.com");
	 }
  
}
