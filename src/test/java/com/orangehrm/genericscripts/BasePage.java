package com.orangehrm.genericscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orangehrm.pageobjects.DashboardPageObjects;

import com.orangehrm.pageobjects.LoginPageObjects;
import com.orangehrm.pageobjects.PIMPageObejcts;
import com.orangehrm.utilities.ReadPropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage implements I_ApplicationConstants  //pascal case
{
	//String browserName="chrome";
	public static WebDriver driver;
	public LoginPageObjects lp;
	public DashboardPageObjects db;
	public PIMPageObejcts pim;
	
	@BeforeClass
	@Parameters("browserName")
	
	public void initBrowser(String browserName) //camelcase
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		switch(browserName.trim().toLowerCase())
		{
		case "chrome": driver= new ChromeDriver();
		     break;
		case "fire": driver = new FirefoxDriver();
		     break;
		case "edge":driver = new EdgeDriver();
		     break;
		}
	}
	@BeforeMethod
	public void launchApplication() throws IOException
	{
		String url=ReadPropertyFile.readData("testUrl");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(waitTimeDuration,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lp = new LoginPageObjects(driver);
		db = new DashboardPageObjects(driver);
		pim = new PIMPageObejcts(driver);
		login();
	}
	public void login() throws IOException
	{
		String usn=ReadPropertyFile.readData("testUsn");
		String psw=ReadPropertyFile.readData("testPsw");
		lp.enterUsn(usn);
		lp.enterPsw(psw);
	    lp.clickLoginbtn();
	}
	
	@AfterMethod
	public void logout()
	{
	db.profileMenu();
	db.logoutoption();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	}
