package net.sf.freecol.common.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import net.sf.freecol.common.resources.ResourceMapping;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColTcFileTest</code> contains tests for the class <code>{@link FreeColTcFile}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:42 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColTcFileTest {
	/**
	 * Run the FreeColTcFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColTcFile_1()
		throws Exception {
		File file = new File("");

		FreeColTcFile result = new FreeColTcFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColTcFile(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColTcFile_2()
		throws Exception {
		String id = "";

		FreeColTcFile result = new FreeColTcFile(id);

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

		FileFilter result = FreeColTcFile.getFileFilter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetResourceMapping_1()
		throws Exception {
		FreeColTcFile fixture = new FreeColTcFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at net.sf.freecol.common.io.FreeColTcFile.<init>(FreeColTcFile.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetResourceMapping_2()
		throws Exception {
		FreeColTcFile fixture = new FreeColTcFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at net.sf.freecol.common.io.FreeColTcFile.<init>(FreeColTcFile.java:46)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(FreeColTcFileTest.class);
	}
}