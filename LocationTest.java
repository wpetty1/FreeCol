package net.sf.freecol.common.model;

import java.util.Iterator;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>LocationTest</code> contains tests for the class <code>{@link Location}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:45 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LocationTest {
	/**
	 * Run the int getRank(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetRank_1()
		throws Exception {
		Location loc = new HighSeas(new Game(new IIOMetadataNode(), ""));

		int result = Location.getRank(loc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRank(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetRank_2()
		throws Exception {
		Location loc = null;

		int result = Location.getRank(loc);

		// add additional test code here
		assertEquals(-3, result);
	}

	/**
	 * Run the Location upLoc(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testUpLoc_1()
		throws Exception {
		Location loc = new HighSeas(new Game(new IIOMetadataNode(), ""));

		Location result = Location.upLoc(loc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location upLoc(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testUpLoc_2()
		throws Exception {
		Location loc = null;

		Location result = Location.upLoc(loc);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LocationTest.class);
	}
}