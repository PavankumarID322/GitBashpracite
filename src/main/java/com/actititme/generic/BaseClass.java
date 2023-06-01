package com.actititme.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) throws Exception {
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		Reporter.log("Opening Browser",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closing Browser",true);
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws Exception {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url=f.getPropertyData("url");
		String un1=f.getPropertyData("username");
		String pw1=f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un1,pw1);
	
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		HomePage h=new HomePage(driver);
		h.setLogout();
	}

	
	
	
}
