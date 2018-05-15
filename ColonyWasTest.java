package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ColonyWasTest</code> contains tests for the class <code>{@link ColonyWas}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:12 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ColonyWasTest {
	/**
	 * Run the ColonyWas(Colony) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testColonyWas_1()
		throws Exception {
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");
		colony.productionBonus = 1;

		ColonyWas result = new ColonyWas(colony);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testFireChanges_1()
		throws Exception {
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");
		colony.productionBonus = 1;
		ColonyWas fixture = new ColonyWas(colony);

		boolean result = fixture.fireChanges();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testFireChanges_2()
		throws Exception {
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");
		colony.productionBonus = 1;
		ColonyWas fixture = new ColonyWas(colony);

		boolean result = fixture.fireChanges();

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
	 * @generatedBy CodePro at 5/14/18 3:12 PM
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
	 * @generatedBy CodePro at 5/14/18 3:12 PM
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
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ColonyWasTest.class);
	}
}