//public static void main(String[] args) {
//		ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/selenium.html");
//		reporter.config().setDocumentTitle("sample report");
//		reporter.config().setTheme(Theme.STANDARD);
//		ExtentReports report=new ExtentReports();
//		report.attachReporter(reporter);
//		report.setSystemInfo("platform", "windows");
//		report.setSystemInfo("author", "mamatha");
//		ExtentTest logger = report.createTest("sample test");
//		logger.log(Status.FAIL, "this is failed");
//		logger.log(Status.INFO, "this is information");
//		logger.log(Status.PASS, "this is passed");
//		logger.addScreenCaptureFromPath("file:///C:/Section-II/suresh1/reports/selenium.html");
//		ExtentTest logger1 = report.createTest("demo test");
//		logger1.log(Status.FAIL, "this is failed");
//		logger1.log(Status.INFO, "this is information");
//		logger1.log(Status.PASS, "this is passed");
//		re