package net.sf.freecol.common.util;

import java.io.File;
import java.io.Writer;
import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UtilsTest</code> contains tests for the class <code>{@link Utils}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:41 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class UtilsTest {
	/**
	 * Run the Utils() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testUtils_1()
		throws Exception {
		Utils result = new Utils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean equals(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {

		boolean result = Utils.equals(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {

		boolean result = Utils.equals(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {

		boolean result = Utils.equals(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(T,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {

		boolean result = Utils.equals(null, null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Writer getFileUTF8Writer(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetFileUTF8Writer_1()
		throws Exception {
		File file = new File("");

		Writer result = Utils.getFileUTF8Writer(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.util.Utils.getFileUTF8Writer(Utils.java:131)
		assertNotNull(result);
	}

	/**
	 * Run the Writer getFileUTF8Writer(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetFileUTF8Writer_2()
		throws Exception {
		File file = new File("");

		Writer result = Utils.getFileUTF8Writer(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.util.Utils.getFileUTF8Writer(Utils.java:131)
		assertNotNull(result);
	}

	/**
	 * Run the Writer getFileUTF8Writer(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetFileUTF8Writer_3()
		throws Exception {
		File file = new File("");

		Writer result = Utils.getFileUTF8Writer(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.util.Utils.getFileUTF8Writer(Utils.java:131)
		assertNotNull(result);
	}

	/**
	 * Run the String getRandomState(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetRandomState_1()
		throws Exception {
		Random random = new Random();

		String result = Utils.getRandomState(random);

		// add additional test code here
		assertEquals("ACED0005737200106A6176612E7574696C2E52616E646F6D363296344BF00A530300035A0014686176654E6578744E657874476175737369616E4400106E6578744E657874476175737369616E4A000473656564787000000000000000000000006FDFBCFD21EB78", result);
	}

	/**
	 * Run the String getRandomState(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetRandomState_2()
		throws Exception {
		Random random = new Random();

		String result = Utils.getRandomState(random);

		// add additional test code here
		assertEquals("ACED0005737200106A6176612E7574696C2E52616E646F6D363296344BF00A530300035A0014686176654E6578744E657874476175737369616E4400106E6578744E657874476175737369616E4A00047365656478700000000000000000000000F2F224DDB27478", result);
	}

	/**
	 * Run the String getRandomState(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetRandomState_3()
		throws Exception {
		Random random = new Random();

		String result = Utils.getRandomState(random);

		// add additional test code here
		assertEquals("ACED0005737200106A6176612E7574696C2E52616E646F6D363296344BF00A530300035A0014686176654E6578744E657874476175737369616E4400106E6578744E657874476175737369616E4A00047365656478700000000000000000000000AA729AD938AC78", result);
	}

	/**
	 * Run the String getRandomState(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetRandomState_4()
		throws Exception {
		Random random = new Random();

		String result = Utils.getRandomState(random);

		// add additional test code here
		assertEquals("ACED0005737200106A6176612E7574696C2E52616E646F6D363296344BF00A530300035A0014686176654E6578744E657874476175737369616E4400106E6578744E657874476175737369616E4A000473656564787000000000000000000000007BE606FD53C178", result);
	}

	/**
	 * Run the String getRandomState(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetRandomState_5()
		throws Exception {
		Random random = new Random();

		String result = Utils.getRandomState(random);

		// add additional test code here
		assertEquals("ACED0005737200106A6176612E7574696C2E52616E646F6D363296344BF00A530300035A0014686176654E6578744E657874476175737369616E4400106E6578744E657874476175737369616E4A000473656564787000000000000000000000006014F4C4BB9678", result);
	}

	/**
	 * Run the int hashCode(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Object object = new Object();

		int result = Utils.hashCode(object);

		// add additional test code here
		assertEquals(816754027, result);
	}

	/**
	 * Run the int hashCode(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Object object = null;

		int result = Utils.hashCode(object);

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the Random restoreRandomState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testRestoreRandomState_1()
		throws Exception {
		String state = null;

		Random result = Utils.restoreRandomState(state);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Random restoreRandomState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testRestoreRandomState_2()
		throws Exception {
		String state = "";

		Random result = Utils.restoreRandomState(state);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Random restoreRandomState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testRestoreRandomState_3()
		throws Exception {
		String state = "";

		Random result = Utils.restoreRandomState(state);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Random restoreRandomState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testRestoreRandomState_4()
		throws Exception {
		String state = "aa";

		Random result = Utils.restoreRandomState(state);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Random restoreRandomState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testRestoreRandomState_5()
		throws Exception {
		String state = "";

		Random result = Utils.restoreRandomState(state);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Random restoreRandomState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testRestoreRandomState_6()
		throws Exception {
		String state = "";

		Random result = Utils.restoreRandomState(state);

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(UtilsTest.class);
	}
}