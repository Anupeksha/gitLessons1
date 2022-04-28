package com.Zoho.reports;

import java.io.File;
import java.util.Date;

import com.Zoho.base.Pages.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportManager {
	static ExtentReports reports;

	public static ExtentReports getExtentReport(String repotsPath) {
		if (reports == null) {
			
			Date d = new Date();
			String reportsFolderName = d.toString().replaceAll(":", "-");
			String reportsFolderPath = Constants.REPORTS_PATH+reportsFolderName;
			String screenshotsFolderPath = reportsFolderPath+"\\screenshot";
			File f = new File(screenshotsFolderPath);
			f.mkdirs();
			
			reports = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(reportsFolderPath);
			spark.config().setReportName("Automation Reports");
			spark.config().setDocumentTitle("Module1");
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("UTF-8");

			reports.attachReporter(spark);
		}

		return reports;
	}

}
