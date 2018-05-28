package com.imdb.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class ImdbTestPOM extends ImdbTestBasePOM {
	
	@Test
	public void searchMovieTest() {
		home.searchMovie("It");		
		
		Assert.assertTrue(results.at());
		
		results.getMovieByYear("It", "2017");
		results.clickMovieByYear("It", "2017");
	}
}
