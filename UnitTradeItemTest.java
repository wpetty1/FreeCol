package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>UnitTradeItemTest</code> contains tests for the class <code>{@link UnitTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:36 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class UnitTradeItemTest {
	/**
	 * Run the UnitTradeItem(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testUnitTradeItem_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		UnitTradeItem result = new UnitTradeItem(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitTradeItem(Game,Player,Player,Unit) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testUnitTradeItem_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Player source = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Player destination = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitTradeItem result = new UnitTradeItem(game, source, destination, unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Object other = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Object other = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Object other = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEvaluateFor_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEvaluateFor_2()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testEvaluateFor_3()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		Unit result = fixture.getUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = UnitTradeItem.getXMLElementTagName();

		// add additional test code here
		assertEquals("unitTradeItem", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testIsUnique_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.isUnique();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setUnit(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testSetUnit_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setUnit(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		UnitTradeItem fixture = new UnitTradeItem(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:36 PM
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
	 * @generatedBy CodePro at 5/14/18 4:36 PM
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
	 * @generatedBy CodePro at 5/14/18 4:36 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UnitTradeItemTest.class);
	}
}