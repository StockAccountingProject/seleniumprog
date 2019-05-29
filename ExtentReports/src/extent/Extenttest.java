package extent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extenttest
{
	public static void main(String[] args)
	{
		ExtentHtmlReporter path=new ExtentHtmlReporter("E:/Report.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(path);
		ExtentTest logger=report.createTest("Verify Titles");
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    logger.log(Status.INFO, "Browser started");
	    driver.get("http://google.com");
	    logger.log(Status.INFO, "Application is Running");
	    String title=driver.getTitle();
	    if (title.equalsIgnoreCase("google"))
	    {
	    	logger.log(Status.PASS, "Title Matched");
	    	 	
		}else
		{
			logger.log(Status.FAIL, "Title Mismatched");
		}
	    
		report.flush();
				
	}
	
	
}
