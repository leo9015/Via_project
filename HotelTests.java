package projectVia;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HotelTests extends Base {
	static String[] payment;
  
	@Test(priority = 1)
  public void clickOnHotelsTest() throws InterruptedException, IOException {
	  Thread.sleep(3000);
	 gp.clickOnHotels(); 
	 gp.readExcelData();
  }
 
  @Test(priority = 2)
  public void destinationTextTest() throws InterruptedException, IOException {
		 Thread.sleep(3000);

		gp.destinationText();
		 Thread.sleep(3000);

}
  @Test(priority = 3)
  public void checkInTest() throws InterruptedException, IOException  {

	 gp.checkInField();
	 Thread.sleep(3000);
  }
  @Test(priority = 4)
  public void checkOutTest() throws InterruptedException, IOException  {

	 gp.selectCheckOutDate();
	 Thread.sleep(3000);
  }  
  
  @Test(priority = 5)
  public void RoomsTest() throws InterruptedException, IOException  {
	 gp.Rooms();
	 Thread.sleep(3000);

  }
  
  @Test(priority = 6)
  public void selectNation() throws InterruptedException, IOException  {
	 gp.selectNation();
	 Thread.sleep(3000);

  }
  
  @Test(priority = 7)
  public void selectResidence() throws InterruptedException, IOException  {
	 gp.selectResidence();
	 Thread.sleep(3000);

	 
  } 
  
  @Test(priority = 8)
  public void Search() throws InterruptedException, IOException  {
	 gp.Search();
	 Thread.sleep(3000);

  }
  @Test(priority = 9)
  public void HotelTypeTest() throws InterruptedException, IOException  {
	 gp.HotelType();
	 Thread.sleep(3000);

  }
  @Test(priority = 10)
  public void RatingsTest() throws InterruptedException, IOException  {
	 gp.Ratings();
	 Thread.sleep(3000);

  }
  @Test(priority =11)
  public void ClearFilterTest() throws InterruptedException, IOException  {
	 gp.ClearFilter();
	 Thread.sleep(3000);

  }
  @Test(priority = 12)
  public void SelectRoomTest() throws InterruptedException, IOException  {
	 gp.SelectRoom();
	 Thread.sleep(3000);

  }
  @Test(priority = 13)
  public void BookRoomTest() throws InterruptedException, IOException  {
	 gp.BookRoom();
	 Thread.sleep(3000);

  }
  @Test(priority = 14)
	public void checkTitle() 
	{		
		extentlogger = extentreporter.createTest("Title Test");
		extentlogger.log(Status.INFO, "Title Value check");
		String text = driver.getTitle();
		assertEquals(text, "Confirm Your Hotel Booking -Via.com");
		//Reporter.log("Executing....");
	}
	@Test(priority = 15)
		public void priceDetailCollapseButton() 
		{	
		extentlogger = extentreporter.createTest("PriceDetailCollapseButton");
   	extentlogger.log(Status.INFO, "Price Details Collapse Button Test");
		gp.priceDetails();
		extentlogger.log(Status.PASS, "Collapse Button Test executed successfully");
		}
	
	@Test(priority = 16)
	public void EnterGuestDetails()
	{	extentlogger = extentreporter.createTest("Enter Guest Details");
	
		extentlogger.log(Status.INFO, "Adult title DropDown Test");
		gp.adultTitle(titleValue);
		extentlogger.log(Status.PASS, "Adult Title Dropdown Test selected");
		
		extentlogger.log(Status.INFO, "FirstName Textbox test");
		gp.adultFirstNameTextBox(p);
		Assert.assertNotNull(driver.findElement(gp.fName).getAttribute("value"));
		extentlogger.log(Status.PASS, "Adult FirstName TextBox entered");
		
		extentlogger.log(Status.INFO, "LastName Textbox test");
		gp.adultLastNameTextBox(q);
		Assert.assertNotNull(driver.findElement(gp.lName).getAttribute("value"));
		extentlogger.log(Status.PASS, "Adult LastName TextBox entered");
		
		extentlogger.log(Status.INFO, "Pan Textbox test");
		gp.panNumber(pan);
		Assert.assertNotNull(driver.findElement(gp.panNumber).getAttribute("value"));
		extentlogger.log(Status.PASS, "panNumber TextBox entered");
		
		extentlogger.log(Status.INFO, "Service dropdown test");
		gp.serviceTextBox(service);
		extentlogger.log(Status.PASS, "Service Dropdown selected");
		
		extentlogger.log(Status.INFO, "Other Textbox test");
		gp.otherTextBox(serviceReason);
		extentlogger.log(Status.PASS, "Service Reason entered");
		
		extentlogger.log(Status.INFO, "Mobile number Textbox test");
		gp.mobileTextBox(mobile);
		Assert.assertNotNull(driver.findElement(gp.mobileNumber).getAttribute("value"));
		extentlogger.log(Status.PASS, "Mobile Number entered");
		
		extentlogger.log(Status.INFO, "Mail id Textbox test");
		gp.mailTextBox(mail);
		Assert.assertNotNull(driver.findElement(gp.email).getAttribute("value"));
		extentlogger.log(Status.PASS, "Mail id TextBox entered");
	}
	@Test(priority = 17,enabled = false)
	public void chileTitle()
	{
		gp.childTitle(cTitleValue);
		
	}
	
	@Test(priority = 18,enabled = false)
	public void childFirstName()
	{
		gp.childFirstName(d);
	}
	
	@Test(priority = 19,enabled = false)
	public void childLastName()
	{
		gp.childLastName(c);
	}

	@Test(priority = 20)
	public void validateButton()
	{	extentlogger = extentreporter.createTest("Validate Button");
		extentlogger.log(Status.INFO, "Validate Button Test");
		gp.clickValidateButton();
		extentlogger.log(Status.PASS, "Validate Button Test executed successfully");
	}
	
	
	@Test(priority = 21)
	public void applyDiscount()
	{extentlogger = extentreporter.createTest("Apply Discount Button");
	extentlogger.log(Status.INFO, "Apply Discount radio button Test");
		gp.applyDiscount();
		extentlogger.log(Status.PASS, "Apply Discount radio button Test executed successfully");
	}
	
	@Test(priority = 22)
	public void termsCheckBox()
	{extentlogger = extentreporter.createTest("Terms and Condition CheckBox");
	extentlogger.log(Status.INFO, "Terms and condition checkbox Test");
		gp.clickTermsCheckbox();
		extentlogger.log(Status.PASS, "Terms and conditions CheckBox checked");
	}
	
	@Test(priority = 23)
	public void proceedBookingButton()
	{extentlogger = extentreporter.createTest("Proceed Booking Button");
	extentlogger.log(Status.INFO, "Proceed Booking Button Test");
		gp.clickProceedBooking();
		extentlogger.log(Status.PASS, "Proceed Booking Button Test executed successfully");
	}		
	
	@Test(priority = 24)
	public void makePayment()
	{extentlogger = extentreporter.createTest("Make Payment Button");
	extentlogger.log(Status.INFO, "Make Payment Button Test");
	gp.clickOnPaymentButton();
		extentlogger.log(Status.PASS, "Payment Button Test executed successfully");
	}
	@Test(priority = 25)
	public void paymentDetails() throws InterruptedException, IOException
	{
		InputStream data = new FileInputStream("src/test/resources/testdata.xlsx");
		Workbook wb = new XSSFWorkbook(data);
		Sheet sh =  wb.getSheet("payment");
		extentlogger = extentreporter.createTest("Payment Details Entry Test");
		payment = new String[11];
		
		for(int i=0;i<11;i++)
		{
			XSSFCell cell = (XSSFCell) sh.getRow(1).getCell(i);
			cell.setCellType(CellType.STRING);
			payment[i]=cell.getStringCellValue();
		}
		
		//Enter Payment Details
		gp.paymentDetails(payment[0], payment[1],payment[2],payment[3],payment[4],payment[5],payment[6],payment[7],payment[8],payment[9],payment[10]);
		Thread.sleep(2000);
		extentlogger.log(Status.PASS, "Payment details entered sucessfully");
		wb.close();
	}
}
