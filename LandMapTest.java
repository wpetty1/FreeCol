package net.sf.freecol.common.model;

import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.option.OptionGroup;

/**
 * The class <code>LandMapTest</code> contains tests for the class <code>{@link LandMap}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:43 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LandMapTest {
	/**
	 * Run the LandMap(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		game.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));

		LandMap result = new LandMap(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LandMap(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		game.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));

		LandMap result = new LandMap(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LandMap(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		game.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));

		LandMap result = new LandMap(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LandMap(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_4()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		game.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));

		LandMap result = new LandMap(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LandMap(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_5()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		game.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));

		LandMap result = new LandMap(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LandMap(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_6()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		game.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));

		LandMap result = new LandMap(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LandMap(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_7()
		throws Exception {
		int width = 1;
		int height = 1;

		LandMap result = new LandMap(width, height);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getWidth());
		assertEquals(1, result.getHeight());
	}

	/**
	 * Run the LandMap(OptionGroup,Random) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testLandMap_8()
		throws Exception {
		OptionGroup mgo = new OptionGroup("");
		Random random = new Random();

		LandMap result = new LandMap(mgo, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.getInteger(OptionGroup.java:336)
		//       at net.sf.freecol.common.model.LandMap.<init>(LandMap.java:107)
		assertNotNull(result);
	}

	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);

		int result = fixture.getHeight();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testGetWidth_1()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);

		int result = fixture.getWidth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isLand(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsLand_1()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isLand(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLand(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsLand_2()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isLand(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLand(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsLand_3()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isLand(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = -1;
		int y = 1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsValid_4()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = -1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	@Test
	public void testIsValid_5()
		throws Exception {
		LandMap fixture = new LandMap(1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:43 PM
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
	 * @generatedBy CodePro at 5/14/18 3:43 PM
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
	 * @generatedBy CodePro at 5/14/18 3:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LandMapTest.class);
	}
}