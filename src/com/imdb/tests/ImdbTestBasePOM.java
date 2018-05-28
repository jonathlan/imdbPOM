package com.imdb.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.imdb.pages.ImdbHomePage;
import com.imdb.pages.ImdbResultsPage;

//import paginas.AddFriend;
//import paginas.LoginPage;
//import paginas.SearchPage;

public class ImdbTestBasePOM {
	private final String CHROME_DRIVER_NAME = "webdriver.chrome.driver";
	private final String GENERIC_DRIVER_LOCATION = "C:\\testautomation\\libs\\drivers\\";
	private final String CHROME_DRIVER_LOCATION = GENERIC_DRIVER_LOCATION + "chromedriver.exe";
	private final String FIREFOX_DRIVER_NAME = "webdriver.gecko.driver";
	private final String FIREFOX_DRIVER_LOCATION = GENERIC_DRIVER_LOCATION + "geckodriver.exe";
	public WebDriver driver = null;
	ImdbHomePage home;
	ImdbResultsPage results;
	
	@Before
	public void setUp() {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty(CHROME_DRIVER_NAME, CHROME_DRIVER_LOCATION);
	    driver = new ChromeDriver(ops);			
	    driver.get("http://imdb.com");
	    home = new ImdbHomePage(driver);
	    results = new ImdbResultsPage(driver);
	}
	
	@After
	public void baBye() {		
		driver.quit();
	}
}
