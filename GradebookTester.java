import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
	GradeBook gradeBook1, gradeBook2;
	
	@Before
	public void setUp() throws Exception {
		gradeBook1 = new GradeBook(3);
		gradeBook1.addScore(64);
		gradeBook1.addScore(75);
		gradeBook1.addScore(23);
		
		gradeBook2 = new GradeBook(3);	
		gradeBook2.addScore(0);
		gradeBook2.addScore(23);
		gradeBook2.addScore(53);		
	}

	@After
	public void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testSum() {
		assertTrue(162.0 == gradeBook1.sum());
		assertTrue(76.0 == gradeBook2.sum());
	}

	@Test
	public void testMinimum() {
		assertTrue(23.0 == gradeBook1.minimum());
		assertTrue(0.0 == gradeBook2.minimum());
	}

	@Test
	public void testFinalScore() {
		assertTrue(139.0 == gradeBook1.finalScore());
		assertTrue(76.0 == gradeBook2.finalScore());	
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(3, gradeBook1.getScoreSize());
		assertEquals(3, gradeBook2.getScoreSize());
	}

	@Test
	public void testToString() {
		assertTrue("64.0 75.0 23.0".equals(gradeBook1.toString()));
		assertTrue("0.0 23.0 53.0".equals(gradeBook2.toString()));
	}
}