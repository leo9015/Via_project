package projectVia;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInRegPOM {
	
	WebDriver driver;
	public LogInRegPOM(WebDriver driver) {
		this.driver = driver;
	}
	By email= By.id("emailIdSignUp");
	By password= By.id("passwordSignUp");
	By name= By.id("nameSignUp");
	By mobno = By.id("mobileNoSignUp");
	By createAcc = By.id("signUpValidate");
	By signin = By.id("SignIn");
	By mobileISD = By.id("mobileIsdSignUp");
	By signup = By.className("signUpBtn");
	public void clickonSignUP() {
		driver.findElement(signup).click();		
	}
	public void typeeMail(String mail) throws InterruptedException {
		WebElement ep= driver.findElement(email);	
		ep.click();
		ep.sendKeys(mail);
}
	public void typeName(String nm) throws InterruptedException {
		WebElement ep=driver.findElement(name);
		ep.click();
		ep.sendKeys(nm);
}
	public void typePass(String pp) throws InterruptedException {
		WebElement ep=driver.findElement(password);
		ep.click();
		ep.sendKeys(pp);
}
	public void typeMob(String mb) throws InterruptedException {
		WebElement ep=driver.findElement(mobno);
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		ep.sendKeys(mb);
}
	
	public void clickonCreate() {
		driver.findElement(createAcc).click();	
	}
	public void clickonSignin() {
		driver.findElement(signin).click();	
	}
	
	By sImail= By.id("loginIdText");
	By sIpass= By.id("passwordText");
	By forgotPass = By.cssSelector("#SignInContent > div:nth-child(2) > div.panelRow.u_padT0 > div:nth-child(1) > div > div.u_padT12 > label");
	By sIbutton= By.id("loginValidate");
	By loginHere = By.cssSelector("#SignInContent > div:nth-child(6) > div.panelRow.coloredRow.u_clear > label > span"); 
	By facebook = By.id("loginFacebook");
	By google = By.id("loginGoogle");
	public void clickOnSimail() {
		WebElement ep=driver.findElement(sImail);		
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ep.sendKeys("smitkadam1815@gmail.com");
}
	public void clickOnSipass() {
		WebElement ep=driver.findElement(sIpass);		
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ep.sendKeys("Dummy@27");
}
	public void clickonSIbutton() {
			WebElement ep=driver.findElement(sIbutton);		
			ep.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void clickonForgot() {
		WebElement ep=driver.findElement(forgotPass);		
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void clickonLoginHere() {
		WebElement ep=driver.findElement(loginHere);		
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void clickonFacebook() {
		WebElement ep=driver.findElement(facebook);		
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
}
	
	public void clickonGoogle() {
		WebElement ep=driver.findElement(google);		
		ep.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
}
	By done= By.id("userNameSecondaryNav");
	By logout = By.cssSelector("#userNameSecondaryNavContent > div > div.logedinRow.coloredRow > p > a");
	
	public void Logout() {
		driver.findElement(done).click();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(logout).click();		
	}
	
	By siginBack = By.xpath("//*[@id=\"SignInContent\"]/div[2]/div[3]/div[1]/label/span");
	public void siginBack() {
		driver.findElement(siginBack).click();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
}
