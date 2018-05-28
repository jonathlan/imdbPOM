package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbResultsPage {
	private WebDriver driver;
	
	public ImdbResultsPage(WebDriver driver2) {
		this.driver = driver2;
	}
	//Elements
		WebElement resultsLbl; // //h1[@class='findHeader']
		WebElement titlesLbl; // //h3[@class='findSectionHeader' and text() = 'Titles']
		
		//Methods
		public boolean at() {
			return false;
		}
		
		public void getMovieByYear(String movieName, String movieYear) {
			
		}
		
		public void clickMovieByYear(String movieName, String movieYear) {
			
		}
}
