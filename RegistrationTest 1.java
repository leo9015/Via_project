package projectVia;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class RegistrationTest extends Base{
	
      @Test(priority=1)
	  public void Registration() throws Exception {
    	  WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			  wait.until(ExpectedConditions.elementToBeClickable(By.id("wzrk-cancel")));
		  	  driver.findElement(By.id("wzrk-cancel")).click();

			
			bp.clickonSignin();
			wait.until(ExpectedConditions.elementToBeClickable(bp.signup));
    	  extentlogger = extentreporter.createTest("SignUp Test");
  		extentlogger.log(Status.INFO, "Sign Up Test");
  		bp.clickonSignUP();
  		 extentlogger.log(Status.INFO, "Sign Up Test clicked");
  		 extentlogger.log(Status.PASS, "Sign Up Test executed successfully"); }
  		
  		 @Test(priority=2)
  	  public void enterDetails() throws Exception	{
  			
  			 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(bp.email));
			String em,nm,pass,mb;
			 
	    	extentlogger = extentreporter.createTest("Enter Details Test");
	  		extentlogger.log(Status.INFO, "Enter Details Test");

			InputStream file = new FileInputStream("src//test//resources//testdata.xlsx");
			Workbook wb = new XSSFWorkbook(file);
			  Sheet sh = wb.getSheet("SignUp");
			  XSSFCell ecell = (XSSFCell) sh.getRow(1).getCell(0);
				ecell.setCellType(CellType.STRING);
				em = ecell.getStringCellValue();
				bp.typeeMail(em);
				 extentlogger.log(Status.PASS, "Entered email successfully");
				
				XSSFCell ncell = (XSSFCell) sh.getRow(1).getCell(1);
				ncell.setCellType(CellType.STRING);
				nm = ncell.getStringCellValue();
				bp.typeName(nm);
				 extentlogger.log(Status.PASS, "Entered name successfully");
				 
				XSSFCell pcell = (XSSFCell) sh.getRow(1).getCell(2);
				pcell.setCellType(CellType.STRING);
				pass = pcell.getStringCellValue();
				bp.typePass(pass);
				 extentlogger.log(Status.PASS, "Entered password successfully");
				 
				XSSFCell mcell = (XSSFCell) sh.getRow(1).getCell(3);
				mcell.setCellType(CellType.STRING);
				mb = mcell.getStringCellValue();;
				bp.typeMob(mb);
				
				 extentlogger.log(Status.PASS, "Entered Mobile Number successfully");
			    bp.siginBack();
				//bp.clickonCreate();
			
			wb.close();
		  	
	  }
  }
