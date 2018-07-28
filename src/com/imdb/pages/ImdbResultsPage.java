package com.imdb.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbResultsPage {
	private WebDriver driver;
	
	public ImdbResultsPage(WebDriver driver2) {
		this.driver = driver2;
	}
	//Elements
//		WebElement resultsLbl; // //h1[@class='findHeader']
//		WebElement titlesLbl; // //h3[@class='findSectionHeader' and text() = 'Titles']
		
		//Methods
		public boolean at() {
			return false;
		}
		
		public void clickMovieByYear(String movieName, String movieYear) throws Exception {
			WebElement correctElement = getMovieByYear(movieName, movieYear);
			if (correctElement != null){				
				correctElement.findElement(By.linkText(movieName)).click();
				System.out.println(movieName + " from " + movieYear + " found");
			} else {				
				throw new Exception("Test FAILED - " + movieName + " from " + movieYear + " NOT found");				
			}
		}
		
		public WebElement getMovieByYear (String movieName, String movieYear) {
			By by = By.className("result_text");
			List<WebElement> elements = driver.findElements(by);
			for (WebElement element : elements) {
				if (element.getText().contains(movieName) && element.getText().contains(movieYear))
					return element;
			}
			return null;		
		}
}
