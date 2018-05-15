package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>TileItemTest</code> contains tests for the class <code>{@link TileItem}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:30 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileItemTest {
	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		Location result = fixture.getLocation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getSpaceTaken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetSpaceTaken_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		int result = fixture.getSpaceTaken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsInEurope_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isInEurope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Location newLocation = null;

		boolean result = fixture.setLocation(newLocation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testSetLocation_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Location newLocation = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.setLocation(newLocation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testSetLocation_3()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.setLocation(newLocation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileItemTest.class);
	}
}