package net.sf.freecol.common.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColModFileTest</code> contains tests for the class <code>{@link FreeColModFile}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:42 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColModFileTest {
	/**
	 * Run the FreeColModFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColModFile_1()
		throws Exception {
		File file = new File("");

		FreeColModFile result = new FreeColModFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColModFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColModFile_2()
		throws Exception {
		File file = new File("");

		FreeColModFile result = new FreeColModFile(file);

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

		FileFilter result = FreeColModFile.getFileFilter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		String result = fixture.getId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the String getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		String result = fixture.getParent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the Specification getSpecification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetSpecification_1()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		Specification result = fixture.getSpecification();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Specification getSpecification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetSpecification_2()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		Specification result = fixture.getSpecification();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getSpecificationInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetSpecificationInputStream_1()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		InputStream result = fixture.getSpecificationInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getSpecificationInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetSpecificationInputStream_2()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		InputStream result = fixture.getSpecificationInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void readModDescriptor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadModDescriptor_1()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		fixture.readModDescriptor();

		// add additional test code here
	}

	/**
	 * Run the void readModDescriptor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadModDescriptor_2()
		throws Exception {
		FreeColModFile fixture = new FreeColModFile(new File(""));

		fixture.readModDescriptor();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(FreeColModFileTest.class);
	}
}