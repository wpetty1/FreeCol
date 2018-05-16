package net.sf.freecol.common.io;

import java.io.BufferedInputStream;
import java.io.File;
import net.sf.freecol.common.resources.ResourceMapping;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColDataFileTest</code> contains tests for the class <code>{@link FreeColDataFile}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:41 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColDataFileTest {
	/**
	 * Run the FreeColDataFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColDataFile_1()
		throws Exception {
		File file = new File("");

		FreeColDataFile result = new FreeColDataFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColDataFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColDataFile_2()
		throws Exception {
		File file = new File("");

		FreeColDataFile result = new FreeColDataFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColDataFile(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFreeColDataFile_3()
		throws Exception {
		File file = new File("");

		FreeColDataFile result = new FreeColDataFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getFileNames(String,String,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetFileNames_1()
		throws Exception {
		String prefix = "";
		String suffix = "";
		Locale locale = Locale.getDefault();

		List<String> result = FreeColDataFile.getFileNames(prefix, suffix, locale);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("_en"));
		assertTrue(result.contains("_en_US"));
	}

	/**
	 * Run the List<String> getFileNames(String,String,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetFileNames_2()
		throws Exception {
		String prefix = "";
		String suffix = "";
		Locale locale = Locale.getDefault();

		List<String> result = FreeColDataFile.getFileNames(prefix, suffix, locale);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("_en"));
		assertTrue(result.contains("_en_US"));
	}

	/**
	 * Run the BufferedInputStream getInputStream(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetInputStream_1()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String filename = "";

		BufferedInputStream result = fixture.getInputStream(filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BufferedInputStream getInputStream(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetInputStream_2()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String filename = "";

		BufferedInputStream result = fixture.getInputStream(filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BufferedInputStream getInputStream(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetInputStream_3()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String filename = "";

		BufferedInputStream result = fixture.getInputStream(filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BufferedInputStream getInputStream(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetInputStream_4()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String filename = "";

		BufferedInputStream result = fixture.getInputStream(filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getResourceFileNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetResourceFileNames_1()
		throws Exception {

		List<String> result = FreeColDataFile.getResourceFileNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
		assertTrue(result.contains("resources.properties"));
		assertTrue(result.contains("resources_en.properties"));
		assertTrue(result.contains("resources_en_US.properties"));
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetResourceMapping_1()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetResourceMapping_2()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetResourceMapping_3()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetResourceMapping_4()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the ResourceMapping getResourceMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetResourceMapping_5()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));

		ResourceMapping result = fixture.getResourceMapping();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the URI getURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetURI_1()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String name = "urn:";

		URI result = fixture.getURI(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the URI getURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetURI_2()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String name = "urn:";

		URI result = fixture.getURI(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the URI getURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetURI_3()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String name = "";

		URI result = fixture.getURI(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the URI getURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetURI_4()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String name = "";

		URI result = fixture.getURI(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the URI getURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetURI_5()
		throws Exception {
		FreeColDataFile fixture = new FreeColDataFile(new File(""));
		String name = "";

		URI result = fixture.getURI(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the FileFilter makeFileFilter(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testMakeFileFilter_1()
		throws Exception {
		String requiredFile = "";

		FileFilter result = FreeColDataFile.makeFileFilter(requiredFile);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
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
	 * @generatedBy CodePro at 5/14/18 4:41 PM
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
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColDataFileTest.class);
	}
}