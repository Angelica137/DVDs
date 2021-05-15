import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDTest {

	@Test
	public void testDVDisaDVD() {
		DVD d = new DVD("name");
		String output = d.info();
		assertEquals("name", output);
	}

	@Test
	public void testDVDLibraryFor100DVDs() {
		DVD[] d = new DVD[100];
		assertEquals(100, d.length);
	}

	public void testDVDLibraryFor10DVDs() {
		DVD[] d = new DVD[10];
		assertEquals(10, d.length);
	}
}