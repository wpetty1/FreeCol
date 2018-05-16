package net.sf.freecol.common.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColSavegameFileTest</code> contains tests for the class <code>{@link FreeColSavegameFile}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:42 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColSavegameFileTest {
	/**
	 * Run the FreeColSavegameFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColSavegameFile_1()
		throws Exception {
		File file = new File("");

		FreeColSavegameFile result = new FreeColSavegameFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileFilter getFileFilter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetFileFilter_1()
		throws Exception {

		FileFilter result = FreeColSavegameFile.getFileFilter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColXMLReader getFreeColXMLReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetFreeColXMLReader_1()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		FreeColXMLReader result = fixture.getFreeColXMLReader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColXMLReader getFreeColXMLReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetFreeColXMLReader_2()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		FreeColXMLReader result = fixture.getFreeColXMLReader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColXMLReader getFreeColXMLReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetFreeColXMLReader_3()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		FreeColXMLReader result = fixture.getFreeColXMLReader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BufferedInputStream getSavegameInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetSavegameInputStream_1()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		BufferedInputStream result = fixture.getSavegameInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BufferedInputStream getSavegameInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetSavegameInputStream_2()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		BufferedInputStream result = fixture.getSavegameInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getSavegameVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetSavegameVersion_1()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		int result = fixture.getSavegameVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColSavegameFile.<init>(FreeColSavegameFile.java:76)
		assertEquals(0, result);
	}

	/**
	 * Run the int getSavegameVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetSavegameVersion_2()
		throws Exception {
		FreeColSavegameFile fixture = new FreeColSavegameFile(new File(""));

		int result = fixture.getSavegameVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColSavegameFile.<init>(FreeColSavegameFile.java:76)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColSavegameFileTest.class);
	}
}