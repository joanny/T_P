package fr.iut;

import org.junit.Assert;
import org.junit.Test;

public class ListFileHandlerTest {
	@Test
	public void test1() {

		// prepare
		ListFileHandler l = new ListFileHandler();

		FileScanner f = new MockFileScanner();

		// Perform
		f.handleRecursively(null, l);

		// post- check
		Assert.assertEquals(4, l.getResultList().size());
	}
}
