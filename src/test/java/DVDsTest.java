import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDsTest {

	@Test
	public void testDVDsisArray() {
		dvdbox = new DVDs();
		assertEquals(100, dvdbox.size());
		
	}

}