package com.imdb.tests;

import org.junit.Test;

public class ImdbTestPOM extends ImdbTestBasePOM {
	
	@Test
	public void searchMovieTest() throws Exception {
		home.searchMovie("It");		
		
		//Assert.assertTrue(results.at());
		
		results.clickMovieByYear("It", "2017");
	}
}
