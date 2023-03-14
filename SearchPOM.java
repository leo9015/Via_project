package projectVia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class SearchPOM {
  
    WebDriver driver;
	
	static By oneway = By.xpath("/html/body/div[4]/div[3]/div/form/div[3]/div/div[1]/label");
	static By source = By.xpath("//*[@id=\"source\"]");
	static By dest = By.xpath("//*[@id=\"destination\"]");
	static By sourcedrop = By.xpath("//*[@id=\"ui-id-1\"]");  //*[@id="ui-id-127"]
	static By destdrop = By.xpath("//*[@id=\"ui-id-2\"]");
	static By fromdate = By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[2]/div[6]/div[7]");  //30 July
	static By todate = By.xpath("//*[@id=\"return-cal\"]/div[4]/div[2]/div[2]/div[3]"); //2 August
	static By returncalendar= By.xpath("//*[@id=\"round-trip-panel\"]/div[5]");
	static By adult_incr = By.xpath("/html/body/div[4]/div[3]/div/form/div[4]/div[4]/div[1]/div/div[3]");
	static By child_incr = By.xpath("/html/body/div[4]/div[3]/div/form/div[4]/div[4]/div[2]/div/div[3]");
	static By infant_incr = By.xpath("/html/body/div[4]/div[3]/div/form/div[4]/div[4]/div[3]/div/div[3]");
	static By search_btn= By.xpath("//*[@id=\"search-flight-btn\"]");
	static By book_btn = By.xpath("//*[@id=\"searchResultContainer\"]/div[7]/div/div[5]/div[1]/div[3]/div[2]/button"); //2nd button always
	static By month_year= By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[1]/span[2]");
	static By calendar_next = By.xpath("//*[@id=\"depart-cal\"]/div[4]/div[1]/span[3]");
	
	static By flight_title= By.xpath("//*[@id=\"adult1Title\"]");
	static By flight_fn= By.xpath("//*[@id=\"adult1FirstName\"]");
	static By flight_ln= By.xpath("//*[@id=\"adult1Surname\"]");
	static By flight_mob= By.xpath("//*[@id=\"contactMobile\"]");
	static By flight_email= By.xpath("//*[@id=\"contactEmail\"]");
	
	static By child_collapse= By.xpath("//*[@id=\"child1\"]/p/span[3]");
	static By child_title= By.xpath("//*[@id=\"child1Title\"]");
	static By child_fn= By.xpath("//*[@id=\"child1FirstName\"]");
	static By child_ln= By.xpath("//*[@id=\"child1Surname\"]");
	static By child_bday= By.xpath("//*[@id=\"child1DOBday\"]");
	static By child_bmonth= By.xpath("//*[@id=\"child1DOBmonth\"]");
	static By child_byear= By.xpath("//*[@id=\"child1DOByear\"]");
	
	static By infant_collapse= By.xpath("//*[@id=\"infant1\"]/p/span[3]"); 
	static By infant_title= By.xpath("//*[@id=\"infant1Title\"]");
	static By infant_fn= By.xpath("//*[@id=\"infant1FirstName\"]");
	static By infant_ln= By.xpath("//*[@id=\"infant1Surname\"]");
	static By infant_bday= By.xpath("//*[@id=\"infant1DOBday\"]");
	static By infant_bmonth= By.xpath("//*[@id=\"infant1DOBmonth\"]");
	static By infant_byear= By.xpath("//*[@id=\"infant1DOByear\"]");
	
	static By proceedtoBook_btn= By.xpath("//*[@id=\"makePayCTA\"]");
	
	static By refund_rb= By.xpath("//*[@id=\"refundProtectDiv\"]/div[3]/div/div[1]/div/div[1]/div/label");
	
	static By makepayment_btn= By.xpath("//*[@id=\"confirmProceedPayBtn\"]/span[2]");
	
	static By credcard_no = By.xpath("//*[@id=\"ccNum-allcardsuihandler\"]");
	static By credcard_name = By.xpath("//*[@id=\"ccName-allcardsuihandler\"]");
	static By credcard_mm = By.xpath("//*[@id=\"ccMon-allcardsuihandler\"]");
	static By credcard_yyyy = By.xpath("//*[@id=\"ccYr-allcardsuihandler\"]");
	static By credcard_cvv = By.xpath("//*[@id=\"ccCvv-allcardsuihandler\"]");
	
	static By netbank_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[2]/div[1]");
	static By netbank_selectdrop= By.xpath("//*[@id=\"pp-netbankinguihandler\"]/div/div[4]/label/select");
	
	
	static By wallet_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[3]/div[1]");
	static By walletbank_selectdrop= By.xpath("//*[@id=\"pp-walletuihandler\"]/div/div[6]/label/select");
	
	static By debt_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[4]/div[1]");
	static By debtcard_no = By.xpath("//*[@id=\"ccNum-allcardsuihandler\"]");
	static By debtcard_name = By.xpath("//*[@id=\"ccName-allcardsuihandler\"]");
	static By debtcard_mm = By.xpath("//*[@id=\"ccMon-allcardsuihandler\"]");
	static By debtcard_yyyy = By.xpath("//*[@id=\"ccYr-allcardsuihandler\"]");
	static By debtcard_cvv = By.xpath("//*[@id=\"ccCvv-allcardsuihandler\"]");
	
	
	static By emi_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[5]/div[1]");
	static By emibank_selectdrop= By.xpath("//*[@id=\"emiBankBlk\"]/div[3]/label/select");
	
	static By instacred_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[6]/div[1]");
	static By instacred_mob= By.xpath("//*[@id=\"mobileNo\"]");
	
	static By itzcash_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[7]/div[1]");
	
	static By upi_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[8]/div[1]");
	static By gpay_selectRB = By.xpath("//*[@id=\"upiBlk\"]/div[2]/div[1]/label[1]");
	static By upi_id= By.xpath("//*[@id=\"vPayPrefix\"]");
	static By gpay_bank = By.xpath("//*[@id=\"gPayBank\"]");
	
	
	//Seat Selecting
	static By select_seat= By.xpath("//*[@id=\"editDet\"]/div[2]/div[1]/div/div/div[2]/div/div/div/button");
	static By adult1_seat= By.xpath("//*[@id=\"seatMap-BOM_HYD_G8_509_06082022\"]/div[2]/div/div[29]/div[5]");
	static By child1_seat= By.xpath("//*[@id=\"seatMap-BOM_HYD_G8_509_06082022\"]/div[2]/div/div[29]/div[6]");
	static By proceed_withseatbtn= By.xpath("//*[@id=\"seatMap-BOM_HYD_G8_509_06082022\"]/div[3]/div[4]/button");
	
	//*[@id="searchResultContainer"]/div[7]/div/div[5]/div[1]/div[3]/div[2]/button
	
	//*[@id="depart-cal"]/div[3]/div[2]/div[6]/div[6]
	//*[@id="depart-cal"]/div[4]/div[2]/div[6]/div[1]
	
	//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]
	
	public SearchPOM(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOneway() {
		driver.findElement(oneway).click();
	}
	
	public void clickSource(String loc) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(source).sendKeys(loc);
		Thread.sleep(2000);
		driver.findElement(sourcedrop).click();
    	//Select selectYear = new Select(driver.findElement(sourcedrop));
    	//selectYear.selectByValue(loc);
    	Thread.sleep(2000);
	}
	
	public void clickDest(String loc) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(dest).sendKeys(loc);
		Thread.sleep(2000);
		driver.findElement(destdrop).click();
		Thread.sleep(2000);
	}
	
	public void selectDeptDate(String dob) throws InterruptedException
	{
		Thread.sleep(2000);
		
		String[] arrofdate = dob.split("/");
		while(!driver.findElement(month_year).getText().contains(arrofdate[1]))
		{
			driver.findElement(calendar_next).click();
		}
		
		/*
		Thread.sleep(3000);
		List<WebElement> allDates= driver.findElements(By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[2]")); //*[@id="depart-cal"]/div[3]/div[2]
		Thread.sleep(3000);
		int count = allDates.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(1000);
				String text= allDates.get(i).getText();
				if(text.equalsIgnoreCase(arrofdate[0]))
				{
					System.out.println(text);
					Thread.sleep(2000);
					allDates.get(i).click();
				}
		}
		*/
		driver.findElement(By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[2]/div[2]/div[7]")).click();  //manual date
	}
	public void selectReturnDate(String dob) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(returncalendar).click();
		Thread.sleep(2000);
		driver.findElement(todate).click();
		Thread.sleep(2000);
	}
	
	public void countofPassengers(String adult, String child, String infant) throws InterruptedException
	{
		int i_adult=Integer.parseInt(adult); 
		int i_child=Integer.parseInt(child);
		int i_infant=Integer.parseInt(infant);
		
		int i;
		for(i=1;i<i_adult;i++)
		{
			driver.findElement(adult_incr).click();
			Thread.sleep(1000);
		}
		for(i=1;i<=i_child;i++)
		{
			driver.findElement(child_incr).click();
			Thread.sleep(1000);
		}
		for(i=1;i<=i_infant;i++)
		{
			driver.findElement(infant_incr).click();
			Thread.sleep(1000);
		}
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(search_btn).click();
		Thread.sleep(3000);
	}
	
	public void clickBook() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(book_btn).click();
		Thread.sleep(2000);
	}
	
	public void passengerDetails(String parent_title,String parent_fn,String parent_ln, String elder_title,
			String elder_fn, String elder_ln, String elder_dob, String younger_title, String younger_fn, String younger_ln, String younger_dob
			,String parent_mob, String parent_email) throws InterruptedException 
	{
		Thread.sleep(2000);
		//adult
    	Select fl_title = new Select(driver.findElement(flight_title));
    	fl_title.selectByVisibleText(parent_title);
    	
    	driver.findElement(flight_fn).sendKeys(parent_fn);
    	driver.findElement(flight_ln).sendKeys(parent_ln);
    	
    	Thread.sleep(2000);
    	//child
    	driver.findElement(child_collapse).click();
    	
    	Select ch_title = new Select(driver.findElement(child_title));
    	ch_title.selectByVisibleText(elder_title);
    	
    	driver.findElement(child_fn).sendKeys(elder_fn);
    	driver.findElement(child_ln).sendKeys(elder_ln);
    	String[] arrofelder = elder_dob.split("/");
    	
    	Select ch_bday = new Select(driver.findElement(child_bday));
    	ch_bday.selectByVisibleText(arrofelder[0]);
    	
    	Select ch_bmonth = new Select(driver.findElement(child_bmonth));
    	ch_bmonth.selectByVisibleText(arrofelder[1]);
    	
    	Select ch_byear = new Select(driver.findElement(child_byear));
    	ch_byear.selectByVisibleText(arrofelder[2]);
    	
    	Thread.sleep(2000);
    	//infant
    	driver.findElement(infant_collapse).click();
    	
    	Select in_title = new Select(driver.findElement(infant_title));
    	in_title.selectByVisibleText(younger_title);
    	
    	driver.findElement(infant_fn).sendKeys(younger_fn);
    	driver.findElement(infant_ln).sendKeys(younger_ln);
    	String[] arrofyounger = younger_dob.split("/");
    	
    	Select in_bday = new Select(driver.findElement(infant_bday));
    	in_bday.selectByVisibleText(arrofyounger[0]);
    	
    	Select in_bmonth = new Select(driver.findElement(infant_bmonth));
    	in_bmonth.selectByVisibleText(arrofyounger[1]);
    	
    	Select in_byear = new Select(driver.findElement(infant_byear));
    	in_byear.selectByVisibleText(arrofyounger[2]);
    	Thread.sleep(2000);
    	
    	//Select Seat Optional
		/*
		 * driver.findElement(select_seat).click(); Thread.sleep(7000);
		 * driver.findElement(adult1_seat).click();
		 * driver.findElement(child1_seat).click();
		 * driver.findElement(proceed_withseatbtn).click(); Thread.sleep(2000);
		 */
    	
    	//adult_continue
    	driver.findElement(flight_mob).sendKeys(parent_mob);
    	driver.findElement(flight_email).sendKeys(parent_email);
    	Thread.sleep(2000);
    	
    	//click proceed to book
    	driver.findElement(proceedtoBook_btn).click();
    	Thread.sleep(3000);
	}
	
	public void reviewItinerary() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(refund_rb).click();
		Thread.sleep(2000);
		driver.findElement(makepayment_btn).click();
		Thread.sleep(4000);
	}
	
	public void paymentDetails(String CreditCardNumber, String CreditCardName, String CreditCardMM, String CreditCardYYYY, String CreditCardCVV,
			String Bank, String Mobile, String UPIId, String UPIBank, String WalletBank, String EMIBank) throws InterruptedException
	{
		
		driver.findElement(credcard_no).sendKeys(CreditCardNumber);
		driver.findElement(credcard_name).sendKeys(CreditCardName);
		driver.findElement(credcard_mm).sendKeys(CreditCardMM);
		driver.findElement(credcard_yyyy).sendKeys(CreditCardYYYY);
		driver.findElement(credcard_cvv).sendKeys(CreditCardCVV);
		
		driver.findElement(netbank_collapse).click();
		Select nb_bank = new Select(driver.findElement(netbank_selectdrop));
    	nb_bank.selectByVisibleText(Bank);
    	
    	driver.findElement(wallet_collapse).click();
		Select wallet_bank = new Select(driver.findElement(walletbank_selectdrop));
    	wallet_bank.selectByVisibleText(WalletBank);
    	
    	driver.findElement(debt_collapse).click();
    	driver.findElement(debtcard_no).sendKeys(CreditCardNumber);
		driver.findElement(debtcard_name).sendKeys(CreditCardName);
		driver.findElement(debtcard_mm).sendKeys(CreditCardMM);
		driver.findElement(debtcard_yyyy).sendKeys(CreditCardYYYY);
		driver.findElement(debtcard_cvv).sendKeys(CreditCardCVV);
		
		driver.findElement(emi_collapse).click();
		Select emi_bank = new Select(driver.findElement(emibank_selectdrop));
    	emi_bank.selectByVisibleText(EMIBank);
    	
    	driver.findElement(instacred_collapse).click();
    	driver.findElement(instacred_mob).sendKeys(Mobile);
    	
    	driver.findElement(itzcash_collapse).click();
    	
    	driver.findElement(upi_collapse).click();
    	driver.findElement(gpay_selectRB).click();
    	driver.findElement(upi_id).sendKeys(UPIId);
    	Select upi_bank = new Select(driver.findElement(gpay_bank));
    	upi_bank.selectByVisibleText(UPIBank);
    	
    	Thread.sleep(2000);
    	
	}
	

}
