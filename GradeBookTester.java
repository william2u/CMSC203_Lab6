package lab6;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	GradeBook GradeBook_1;
	GradeBook GradeBook_2;
	GradeBook GradeBook_3;
	
	/**
    Generate a random score
    @return a score between 0 and 100 with two decimals
	*/
	public double newScore()
	{
		Random singleScore = new Random();
		double randomScore = 0 + (100 - 0) * singleScore.nextDouble();
		double roundedScore = Math.round(randomScore * 100.0) / 100.0;
		
		return roundedScore;
	}
	
	@BeforeEach
	void setUp() throws Exception {
		GradeBook_1 = new GradeBook(5);
		GradeBook_2 = new GradeBook(5);
		GradeBook_3 = new GradeBook(5);
		
		/* tring to automaticaly generate scores for the arrays
		String GradeBook_1_list ="";
		for (int i = 0; i < 5; i++)
	    {
			double buffer1 = newScore();
			GradeBook_1.addScore( buffer1 );
			GradeBook_1_list += buffer1 + " ";
	    }
		
		String GradeBook_2_list ="";
		for (int i = 0; i < 5; i++)
	    {
			double buffer2 = newScore();
			GradeBook_2.addScore( buffer2 );
			GradeBook_2_list += buffer2 + " ";
	    }
		
		String GradeBook_3_list ="";
		for (int i = 0; i < 5; i++)
	    {
			//GradeBook_3.addScore( newScore() );
			double buffer3 = newScore();
			GradeBook_3.addScore( buffer3 );
			GradeBook_3_list += buffer3 + " ";
	    }
		*/
		
		GradeBook_1 = new GradeBook(5);
		GradeBook_1.addScore(66.0);
		
		GradeBook_2 = new GradeBook(5);
		GradeBook_2.addScore(77.0);
		GradeBook_2.addScore(88.0);
		
		GradeBook_3 = new GradeBook(5);
		GradeBook_3.addScore(99.0);
		GradeBook_3.addScore(59.2);
		GradeBook_3.addScore(72.3);
	}

	@AfterEach
	void tearDown() throws Exception {
		GradeBook_1 = null;
		GradeBook_2 = null;
		GradeBook_3 = null;
	}

	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		assertTrue(GradeBook_1.toString().equals( "66.0 " ));
        assertEquals(1, GradeBook_1.getScoreSize(), 0.01);
        
        assertTrue(GradeBook_2.toString().equals( "77.0 88.0 " ));
        assertEquals(2, GradeBook_2.getScoreSize(), 0.01);
        
        assertTrue(GradeBook_3.toString().equals( "99.0 59.2 72.3 " ));
        assertEquals(3, GradeBook_3.getScoreSize(), 0.01);
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		assertEquals( 66.0, GradeBook_1.sum(), .0001);
		assertEquals(165.0, GradeBook_2.sum(), .0001);
		assertEquals(230.5, GradeBook_3.sum(), .0001);
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		assertEquals( 66.0, GradeBook_1.minimum(), 0.001);
		assertEquals( 77.0, GradeBook_2.minimum(), 0.001);
		assertEquals( 59.2, GradeBook_3.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		assertEquals( 66.0, GradeBook_1.finalScore(), 0.001);
		assertEquals( 88.0, GradeBook_2.finalScore(), 0.001);
		assertEquals(171.3, GradeBook_3.finalScore(), 0.001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
