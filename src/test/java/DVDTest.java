import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDTest {

	@Test
	public void testDVDisaDVD() {
		DVD d = new DVD("name");
		String output = d.info();
		assertEquals("name", output);
	} 
}