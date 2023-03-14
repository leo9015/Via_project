package projectVia;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class HotelPOM extends Base {

	static WebDriver driver;
	

	static By monthbox2 = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(4) div.vc-month-box-head > span.vc-month-box-head-cell:nth-child(2)");
	static By monthbox = By.cssSelector("div.vc-month-box-head > span:nth-child(2)");
	static By datebox1 = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(3) div.vc-month-box > div.vc-row:nth-child(2)");
	static By datebox2 = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(3) div.vc-month-box > div.vc-row:nth-child(3)");
	static By datebox3 = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(3) div.vc-month-box > div.vc-row:nth-child(4)");
	static By datebox4 = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(3) div.vc-month-box > div.vc-row:nth-child(5)");
	static By datebox5 = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(3) div.vc-month-box > div.vc-row:nth-child(6)");
	static By checkOut = By.id("checkOut");
	static By button = By.cssSelector("div.via-calender > div:nth-child(4) > div:nth-child(1) > span:nth-child(3)");

	static By HotelsClick = By.id("Hotels");
	static By Images = By.linkText("Images");

	static By DestinationText = By.id("destination");

	static By checkIn = By.id("checkIn");

	static By incAdults = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.counter-element.adult.js-count.via-processed:nth-child(2) div:nth-child(2) > div.plus");
	static By textAdults = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.counter-element.adult.js-count.via-processed:nth-child(2) div:nth-child(2) > div.count");
	static By decAdults = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.counter-element.adult.js-count.via-processed:nth-child(2) div:nth-child(2) > div.minus");

	static By close = By.id("vc-close");
	static By checkInRightArrow = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(5) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.element:nth-child(2) div.via-calender:nth-child(3) div.vc-month-box-container:nth-child(4) div.vc-month-box-head > span.vc-month-box-head-cell.vc-month-controls.icon-Rightarrowthin.vc-month-control-active.js-next-month:nth-child(3)");
	WebElement listBox;
	Action action;

	static By AddRoomsAndGuests = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div:nth-child(1) div.element-room:nth-child(4) div.hotelRoomDropDown.js-room:nth-child(2) > span.drop-icon");
	static By AddAdults = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.counter-element.adult.js-count.via-processed:nth-child(2) div:nth-child(2) > div.plus");
	static By adultcountText = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.counter-element.adult.js-count.via-processed:nth-child(2) div:nth-child(2) > div.count");
	static By AddChildrens = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.counter-element.child.js-count.via-processed:nth-child(3) div:nth-child(2) > div.plus");
	static By childage = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div.roomConfig:nth-child(5) div.roomConfigBody div.roomDiv div.childAgeSelectContainer:nth-child(4) div.childAge label.customSBox > select:nth-child(1)");
	static By ClickDone = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div:nth-child(1) div.roomConfig:nth-child(5) div.roomConfigFooter > div.done");

	static By Nationality = By.id("nationalityCountry");
	static By Residence = By.id("residenceCountry");
	static By SearchHotel = By.cssSelector(
			"div.searchbox.recentSearch.searchBoxHome:nth-child(4) div.container div.content form.hotelSearchForm div.panel.u_floatL:nth-child(3) div:nth-child(1) div:nth-child(10) > div.search-hotel.u_vertAlignMiddle.u_floatR:nth-child(3)");

	static By HotelType = By.cssSelector(
			"div.filterHotel.isFixed:nth-child(10) div.container div.hotelType.allFilter p:nth-child(2) > span.drop-icon");
	static By DeselectAllHotel = By.cssSelector(
			"div.filterHotel.isFixed:nth-child(10) div.container div.hotelType.allFilter div.hotelTypeFilter.allFilterList:nth-child(4) div.cBox:nth-child(1) > div.customCBox");
	static By SelectBusinessHotel = By.cssSelector(
			"div.filterHotel.isFixed:nth-child(10) div.container div.hotelType.allFilter div.hotelTypeFilter.allFilterList:nth-child(4) div.cBox:nth-child(2) div.customCBox > label:nth-child(2)");
	static By Ratings = By.cssSelector(
			"div.filterHotel.isFixed:nth-child(10) div.container div.stars.allFilter p:nth-child(2) > span.drop-icon");
	static By DeselectAll = By.cssSelector(
			"div.filterHotel.isFixed:nth-child(10) div.container div.stars.allFilter div.starFilter.allFilterList:nth-child(4) div.cBox:nth-child(1) div.customCBox > label:nth-child(2)");
	static By Select4Star = By.cssSelector(
			"div.filterHotel.isFixed:nth-child(10) div.container div.stars.allFilter div.starFilter.allFilterList:nth-child(4) div.cBox:nth-child(2) div.customCBox > label:nth-child(2)");
	static By ClearFilter = By.className("clearFilter");
	static By SelectRooms = By.cssSelector(
			"div.mainBody:nth-child(11) div.hotelResContainer div.resultSet div.result:nth-child(1) div.priceDiv div.bookSec > div.selectBtn.js-viewRoom.via-processed");
	static By BookRoom = By.cssSelector(
			"div.mainBody:nth-child(11) div.hotelResContainer div.resultSet div.result:nth-child(1) div.rooms div.eachRoom:nth-child(1) div.eachRoomDetails div.bookDiv > div.bookBtn.js-bookRoom.via-processed");
	By pricingDetailCollapse= By.cssSelector("div.switchBtn.js-snapshot-switch.expandSwitch");
	By pricingDetailRetract=  By.cssSelector("div.switchBtn.js-snapshot-switch.retractSwitch");
	
	 By titleName  = By.name("Room0AdultTitle0");
	 By fName = By.name("Room0AdultFirstName0");
	 By lName = By.name("Room0AdultLastName0");
	 By panNumber = By.name("panNumber");
	By childTitleName  = By.name("Room0ChildTitle0");
	By childfName = By.name("Room0ChildFirstName0");
	By childlName = By.name("Room0ChildLastName0");
	By specialService = By.id("selectSSR");
	By other=By.name("OTHERS");
	 By mobileNumber =By.name("contactPhone");
	 By email = By.name("contactEmail");
	By hotdealstext = By.cssSelector("div.fltSegment");
	By hotDeals = By.cssSelector("div.customRBtn");
	By validate = By.id("voucherValidate");
	By termscheckbox =By.id("read_terms_label");
	By proceedBooking = By.id("makePayCTA"); 
	By makePayment = By.id("confirmProceedPayBtn");

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
	
	static By upi_collapse = By.xpath("//*[@id=\"stp2Cont\"]/div[1]/div/div[8]/div[1]");
	static By gpay_selectRB = By.xpath("//*[@id=\"upiBlk\"]/div[2]/div[1]/label[1]");
	static By upi_id= By.xpath("//*[@id=\"vPayPrefix\"]");
	static By gpay_bank = By.xpath("//*[@id=\"gPayBank\"]");
	

	static By date1 = By.id("checkIn");
	static String dateVal = "11/04/2022";
	By datebox = By.cssSelector("div.vc-row > div.vc-cell");
	static String data = "";
	static String[] a = { "" };
	static String[] c = { "" };

	static String b = "";
	static String d = "";

	double adultCount;
	double childCount;
	String child1Count;
	String child2Count;
	String child3Count;

	static String checkInDate;
	static String checkOutDate;
	static String nation;
	static String country;

	Workbook wb;
	Sheet sh;

	public void readExcelData() throws IOException, InterruptedException {
		InputStream file = new FileInputStream("src\\test\\resources\\testdata.xlsx");
		wb = new XSSFWorkbook(file);
		sh = wb.getSheet("Hotel_Record");

		XSSFCell incell = (XSSFCell) sh.getRow(1).getCell(0);
		incell.setCellType(CellType.STRING);
		data = incell.getStringCellValue();

		XSSFCell checkInCell = (XSSFCell) sh.getRow(1).getCell(1);
		checkInCell.setCellType(CellType.STRING);
		checkInDate = checkInCell.getStringCellValue();

		XSSFCell checkOutCell = (XSSFCell) sh.getRow(1).getCell(2);
		checkOutCell.setCellType(CellType.STRING);
		checkOutDate = checkOutCell.getStringCellValue();

		XSSFCell adult = (XSSFCell) sh.getRow(1).getCell(3);
		adult.setCellType(CellType.NUMERIC);
		adultCount = adult.getNumericCellValue();

		XSSFCell child = (XSSFCell) sh.getRow(1).getCell(4);
		child.setCellType(CellType.NUMERIC);
		childCount = child.getNumericCellValue();

		XSSFCell child1 = (XSSFCell) sh.getRow(1).getCell(5);
		child1.setCellType(CellType.STRING);
		child1Count = child1.getStringCellValue();

		XSSFCell child2 = (XSSFCell) sh.getRow(1).getCell(6);
		child2.setCellType(CellType.STRING);
		child2Count = child2.getStringCellValue();

		XSSFCell child3 = (XSSFCell) sh.getRow(1).getCell(7);
		child3.setCellType(CellType.STRING);
		child3Count = child3.getStringCellValue();

		XSSFCell nationText = (XSSFCell) sh.getRow(1).getCell(8);
		nationText.setCellType(CellType.STRING);
		nation = nationText.getStringCellValue();

		XSSFCell Resi = (XSSFCell) sh.getRow(1).getCell(9);
		Resi.setCellType(CellType.STRING);
		country = Resi.getStringCellValue();

		wb.close();

	}

	public HotelPOM(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnHotels() throws InterruptedException {
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(HotelsClick).click();
		Thread.sleep(5000);
	}

	public void destinationText() throws InterruptedException, IOException {
		WebElement listBox = driver.findElement(DestinationText);
		Thread.sleep(5000);

		listBox.sendKeys(data);
		Thread.sleep(5000);
		listBox.sendKeys(Keys.DOWN);
		listBox.sendKeys(Keys.ENTER);
	}

	public void checkInField() throws InterruptedException, IOException {

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) (driver);
		 * 
		 * js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",
		 * driver.findElement(date1)); Thread.sleep(5000);
		 */

		driver.findElement(checkIn).click();
		
		a = checkInDate.split("-");
		String b = a[0].replace("'", "");
		System.out.println(a);
		while (true) {
			WebElement checkIN = driver.findElement(monthbox);
			System.out.println(checkIN.getText());
			//Thread.sleep(5000);
			if (checkIN.getText().equals(a[1])) {
				ArrayList<WebElement> checkInDay = (ArrayList<WebElement>) driver.findElements(datebox);
				for (WebElement j : checkInDay) {
					if (j.getText().equals(b)) {
						j.click();
						break;
					}
				}
				break;
			} else {
				Actions ac = new Actions(driver);
				Thread.sleep(5000);
				WebElement elem = driver.findElement(button);
				ac.moveToElement(elem).click().build().perform();
			}
		}
		Thread.sleep(5000);

	}

	public void selectCheckOutDate() throws InterruptedException {
		driver.findElement(checkOut).click();
		c = checkOutDate.split("-");
		String d = c[0].replace("'", "");

		
				ArrayList<WebElement> checkOutDay = (ArrayList<WebElement>) driver.findElements(datebox);
				for (WebElement j : checkOutDay) {
					if (j.getText().equals(d)) {
						j.click();
						//Thread.sleep(5000);

						break;
					}

				
			} 
Thread.sleep(5000);
	}

	public void Rooms() throws IOException, InterruptedException {
		driver.findElement(AddRoomsAndGuests).click();
		Thread.sleep(2000);

		System.out.println(Integer.parseInt(driver.findElement(adultcountText).getText()));
		while (Integer.parseInt(driver.findElement(adultcountText).getText()) > 1) {
			driver.findElement(decAdults).click();
		}

		Thread.sleep(500);
		for (int i = 1; i < adultCount; i++) {
			driver.findElement(AddAdults).click();
		}

		Thread.sleep(500);
		for (int j = 0; j < childCount; j++) {
			driver.findElement(AddChildrens).click();
		}
		Thread.sleep(2500);
		if(childCount==1)
		{
			WebElement num1 = driver.findElement(childage);
			Select agenum1 = new Select(num1);
			agenum1.selectByVisibleText(child1Count);
		}
		
		if(childCount==2)
		{
			WebElement num1 = driver.findElement(childage);
			Select agenum1 = new Select(num1);
			agenum1.selectByVisibleText(child1Count);
				
			WebElement num2 = driver.findElement(childage);
			Select agenum2 = new Select(num2);
			agenum2.selectByVisibleText(child2Count);
		}
		
		if(childCount==3)
		{
			WebElement num1 = driver.findElement(childage);
			Select agenum1 = new Select(num1);
			agenum1.selectByVisibleText(child1Count);
				
			WebElement num2 = driver.findElement(childage);
			Select agenum2 = new Select(num2);
			agenum2.selectByVisibleText(child2Count);
			
			WebElement num3 = driver.findElement(childage);
			Select agenum3= new Select(num3);
			agenum3.selectByVisibleText(child3Count);
		}
		Thread.sleep(2500);
		driver.findElement(ClickDone).click();

	}

	public void selectNation() {
		WebElement Nation = driver.findElement(Nationality);
		Select oSelect = new Select(Nation);
		oSelect.selectByVisibleText(nation);
	}

	public void selectResidence() {
		WebElement Resi = driver.findElement(Residence);
		Select oSelect = new Select(Resi);
		oSelect.selectByVisibleText(country);
	}

	public void Search() {
		driver.findElement(SearchHotel).click();
	}

	public void HotelType() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(HotelType).click();
		Thread.sleep(5000);

		driver.findElement(DeselectAllHotel).click();
		Thread.sleep(5000);

		driver.findElement(SelectBusinessHotel).click();
		Thread.sleep(5000);

	}

	public void Ratings() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);

		driver.findElement(Ratings).click();
		Thread.sleep(5000);

		driver.findElement(DeselectAll).click();
		Thread.sleep(5000);

		driver.findElement(Select4Star).click();
		Thread.sleep(5000);

	}

	public void ClearFilter() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(ClearFilter).click();
		Thread.sleep(5000);

	}

	public void SelectRoom() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(SelectRooms).click();
		Thread.sleep(5000);

	}

	public void BookRoom() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(BookRoom).click();
		Thread.sleep(5000);
	}
	public void priceDetails()
	{
		//wait(driver,10);
		webWait(driver, 50,driver.findElement(pricingDetailCollapse));
		Actions ac= new Actions(driver);
		WebElement detailcollapse= driver.findElement(pricingDetailCollapse);
		ac.moveToElement(detailcollapse).click().build().perform();
		WebElement detailretract= driver.findElement(pricingDetailRetract);
		ac.moveToElement(detailretract).click().build().perform();
	}

	public void panNumber(String pan)
	{
		driver.findElement(panNumber).sendKeys(pan);
	}
	public void childFirstName(String aa)
	{
		driver.findElement(childfName).sendKeys(a);
	}
	public void childLastName(String ba)
	{
		driver.findElement(childlName).sendKeys(b);
	}
	public void childTitle(String cOptionValue)
	{	
		wait(driver,10);
		Select ctitle = new Select(driver.findElement(childTitleName));	//child details will be asked when you book hotel in other country
		ctitle.selectByVisibleText(cOptionValue);
	}
	public void adultTitle(String titleValue)
	{	//System.out.println(titleValue);
		webWait(driver,20,driver.findElement(titleName));
		Select title = new Select(driver.findElement(titleName));
		title.selectByVisibleText(titleValue);
	}
	public void adultLastNameTextBox(String ca)
	{	//System.out.println(c);
		driver.findElement(lName).sendKeys(ca);
	}
	public void adultFirstNameTextBox(String da)
	{
		driver.findElement(fName).sendKeys(da);
	}
	public void serviceTextBox(String service)
	{
		Select ssr = new Select(driver.findElement(specialService));
		ssr.selectByVisibleText(service);
	}
	public void otherTextBox(String serviceReason)
	{
		webWait(driver, 10,driver.findElement(other));					 
		driver.findElement(other).sendKeys(serviceReason);
	}
	public void mobileTextBox(String mobile)
	{
		driver.findElement(mobileNumber).sendKeys(mobile);
	}
	public void mailTextBox(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void applyDiscount()
	{
		ArrayList<WebElement> deals =  (ArrayList<WebElement>) driver.findElements(hotDeals);
		Actions ac= new Actions(driver);
		WebElement a = deals.get(0);
		ac.moveToElement(a).click().build().perform();
	}
	
	public void clickValidateButton()
	{
		driver.findElement(validate).click();
	}
	
	public void clickTermsCheckbox()
	{
		driver.findElement(termscheckbox).click();
	}
	
	public void clickProceedBooking()
	{
		driver.findElement(proceedBooking).click();
	}

	public void clickOnPaymentButton() 
	{
		webWait(driver, 20,driver.findElement(makePayment));
		driver.findElement(makePayment).click();		
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
		
    	driver.findElement(upi_collapse).click();
    	driver.findElement(gpay_selectRB).click();
    	driver.findElement(upi_id).sendKeys(UPIId);
    	Select upi_bank = new Select(driver.findElement(gpay_bank));
    	upi_bank.selectByVisibleText(UPIBank);
    	
    	Thread.sleep(2000);
    	
	}
	


}
