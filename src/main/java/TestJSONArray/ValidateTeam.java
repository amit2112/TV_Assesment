package TestJSONArray;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import Utilities.JSonReader;

public class ValidateTeam {
	int noOfForeignPlayer=0; 
	int noOfWicketKeeper=0;
	
	@Test
	public void checkForeignPlayer() {
		noOfForeignPlayer = JSonReader.getForeignPlayer();
		assertEquals(noOfForeignPlayer, 4);
	}
	
	@Test
	public void checkNoOfWicketKeeper() {
		noOfWicketKeeper = JSonReader.getWicketKeeperCount();
		assertTrue(noOfWicketKeeper >= 1);
	}

}