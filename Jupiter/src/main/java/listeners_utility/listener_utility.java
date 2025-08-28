package listeners_utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseClass_Utility.baseclass;
import java_Utility.java;

public class listener_utility implements ITestListener, ISuiteListener {
	
	java ran = new java();
	ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/report"+ran.randomNum()+".html");
	ExtentReports reports = new ExtentReports();
	ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		
		spark.config().setDocumentTitle("Jupiter");
		spark.config().setReportName("Jupiter Report");
		spark.config().setTheme(Theme.STANDARD);
		
		reports.attachReporter(spark);
		reports.setSystemInfo("browser", "chrome");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		reports.flush();
		System.out.println("Suite ends");
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String TestName = result.getMethod().getMethodName();
		TakesScreenshot tks = (TakesScreenshot) baseclass.sdriver;
		String src = tks.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(src, TestName);
		
	}	

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	

}
