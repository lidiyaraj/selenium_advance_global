package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport {
	public static void main(String[] args) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/Adv");
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setTheme(Theme.STANDARD);
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform","windows");
		report.setSystemInfo("author", "aarun");
		ExtentTest logger = report.createTest("sample test");
		
//		public static void logfail(String fail)
//		{
//
//			logger.log(Status.FAIL, "this is failed");
//		}
//		logger.log(Status.INFO, "this is information");
//		logger.log(Status.PASS, "this is passed");
//	    //logger.addScreenCaptureFromPath("");
//		String screenshotPath = "file:///D:/arun/Eclipse_workspace/AdvanceProject/errorShot/null%202023-08-10T13-33-13.555900600.png";
//        logger.addScreenCaptureFromPath(screenshotPath);
//
		ExtentTest logger1 = report.createTest("z test");
		logger1.log(Status.FAIL, "this is failed");
		logger1.log(Status.INFO, "this is information");
		logger1.log(Status.PASS, "this is passed");
		
		ExtentTest logger2 = report.createTest("demo test 2");
		logger2.log(Status.FAIL, "this is failed");
		logger2.log(Status.INFO, "this is information");
		logger2.log(Status.PASS, "this is passed");
		
		report.flush();
	}

}
