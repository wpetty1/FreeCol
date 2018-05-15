package net.sf.freecol.common.io;

import java.util.Collection;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ModsTest</code> contains tests for the class <code>{@link Mods}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:43 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ModsTest {
	/**
	 * Run the Mods() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testMods_1()
		throws Exception {
		Mods result = new Mods();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Collection<FreeColModFile> getAllMods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetAllMods_1()
		throws Exception {

		Collection<FreeColModFile> result = Mods.getAllMods();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FreeColModFile getFreeColModFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetFreeColModFile_1()
		throws Exception {
		String id = "";

		FreeColModFile result = Mods.getFreeColModFile(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColModFile getModFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetModFile_1()
		throws Exception {
		String id = "";

		FreeColModFile result = Mods.getModFile(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<FreeColTcFile> getRuleSets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetRuleSets_1()
		throws Exception {

		List<FreeColTcFile> result = Mods.getRuleSets();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColTcFile> getRuleSets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetRuleSets_2()
		throws Exception {

		List<FreeColTcFile> result = Mods.getRuleSets();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the void loadMods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testLoadMods_1()
		throws Exception {

		Mods.loadMods();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
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
	 * @generatedBy CodePro at 5/14/18 4:43 PM
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
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModsTest.class);
	}
}