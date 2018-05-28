package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbHomePage {
	private WebDriver driver;
	
	public ImdbHomePage(WebDriver driver2) {
		this.driver = driver2;
	}
		//Elements
		WebElement searchTxt; //name='q'
		WebElement searchBtn; //id='navbar-submit-button'
			
		//Methods
		public boolean at() {
			return false;
		}
		public void searchMovie(String movieName) {
			
		}

}
