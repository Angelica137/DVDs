import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDsTest {

	@Test
	public void testDVDisaDVD() {
		d = new DVDs();
		assertEquals("name", d.name());
		
	}

}