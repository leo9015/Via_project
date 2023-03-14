package projectVia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base {
	 static  WebDriver driver;
	 static String browser, URL, dp;
	 static LogInRegPOM bp;
	 static SearchPOM sp;
	 static HotelPOM gp;
	 
	 static String titleValue,name,pan,cTitleValue,cname,service,serviceReason,mobile,mail,p,q,c,d;
	 
	 @BeforeSuite 
		public static void setUp() throws Exception {
			
			
				InputStream file= new FileInputStream("src//test//resources//config.properties");
				Properties prop= new Properties();
				prop.load(file);
				browser=prop.getProperty("browser");
				URL=prop.getProperty("url");
				dp= prop.getProperty("driverpath");
				
				switch(browser.toLowerCase()) {
				case "edge":
					System.setProperty("webdriver.edge.driver", dp);
					driver = new EdgeDriver();
					break;
				case "chrome":
					System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
					driver = new ChromeDriver();
				}
				
				driver.manage().window().maximize();
				driver.get(URL);
				bp= new LogInRegPOM(driver);
				sp= new SearchPOM(driver);
				gp= new HotelPOM(driver);
			
		}
	 
	 public void captureScreen() throws IOException {
    	 
			
    	 File scrshttemp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 		String ts =  new SimpleDateFormat("ddMMyyy_HHmmss").format(Calendar.getInstance().getTime());
 		File scrsht = new File("screenshots\\"+ ts + ".png");
 		FileUtils.copyFile(scrshttemp,scrsht);
 	}
	 public void webWait(WebDriver driver ,int n, WebElement elmt)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(n));
			wait.until(ExpectedConditions.elementToBeClickable(elmt));	
		}
		public void wait(WebDriver driver,int n)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(n)); 
		}
	 public static ExtentReports extentreporter;
	 public static ExtentSparkReporter sparkreporter;
	 public static ExtentTest extentlogger;
	 
	 @BeforeTest
	 public static void Extentsetup() {
		 String ts= new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
		 extentreporter = new ExtentReports();
		 sparkreporter = new ExtentSparkReporter(new File(System.getProperty("user.dir")  +"\\Extent Reports\\"+ ts +".html"));
		 extentreporter.attachReporter(sparkreporter);
	 }
	 @BeforeTest
	 public static void readData() throws IOException
	  {
		  InputStream data = new FileInputStream("src\\test\\resources\\testdata.xlsx");
		  Workbook wb= new XSSFWorkbook(data);
	 
		Sheet st = wb.getSheet("Sheet1");
		XSSFCell cell = (XSSFCell) st.getRow(1).getCell(1);
		cell.setCellType(CellType.STRING);
		titleValue = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(1).getCell(2);
		cell.setCellType(CellType.STRING);
		name = cell.getStringCellValue();
		String[] b = name.split(" ");
		p=b[0];
		q=b[1];

		cell = (XSSFCell) st.getRow(1).getCell(3);
		cell.setCellType(CellType.STRING);
		pan = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(1).getCell(6);
		cell.setCellType(CellType.STRING);
		service = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(1).getCell(7);
		cell.setCellType(CellType.STRING);
		serviceReason = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(1).getCell(4);
		cell.setCellType(CellType.STRING);
		mobile = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(1).getCell(5);
		cell.setCellType(CellType.STRING);
		mail = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(2).getCell(1);
		cell.setCellType(CellType.STRING);
		cTitleValue = cell.getStringCellValue();

		cell = (XSSFCell) st.getRow(2).getCell(2);
		cell.setCellType(CellType.STRING);
		cname = cell.getStringCellValue();
		String[] a = cname.split(" ");
		d=a[0];
		c=a[1];
	}

	 @AfterTest
	 public void ExtentReportTeardown() {
		 extentreporter.flush();
	 }
	 
	     @AfterSuite ////changed to suite from class becasue using testng.xml file
		public static void tearDown() throws Exception {
			//driver.close();
			//driver.quit();
		}
  
}
