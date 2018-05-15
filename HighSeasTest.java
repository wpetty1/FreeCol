package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>HighSeasTest</code> contains tests for the class <code>{@link HighSeas}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:30 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class HighSeasTest {
	/**
	 * Run the HighSeas(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHighSeas_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");

		HighSeas result = new HighSeas(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HighSeas(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHighSeas_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		HighSeas result = new HighSeas(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void addDestination(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddDestination_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location destination = null;

		fixture.addDestination(destination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void addDestination(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddDestination_2()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location destination = new HighSeas(new Game(new IIOMetadataNode(), ""));

		fixture.addDestination(destination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void addDestination(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddDestination_3()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location destination = new HighSeas(new Game(new IIOMetadataNode(), ""));

		fixture.addDestination(destination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<Location> getDestinations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetDestinations_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Location> result = fixture.getDestinations();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getLinkTarget(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetLinkTarget_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setEurope(new Europe(new Game(new IIOMetadataNode(), ""), ""));

		FreeColGameObject result = fixture.getLinkTarget(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLocationLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetLocationLabel_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		StringTemplate result = fixture.getLocationLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetNoAddReason_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetNoAddReason_2()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetNoAddReason_3()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getRank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetRank_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getRank();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = HighSeas.getXMLElementTagName();

		// add additional test code here
		assertEquals("highSeas", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeDestination(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testRemoveDestination_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location destination = new HighSeas(new Game(new IIOMetadataNode(), ""));

		fixture.removeDestination(destination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toShortString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testToShortString_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		String result = fixture.toShortString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location up() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testUp_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));

		Location result = fixture.up();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		HighSeas fixture = new HighSeas(new Game(new IIOMetadataNode(), ""));
		fixture.addDestination(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

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
	 * @generatedBy CodePro at 5/14/18 3:30 PM
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
	 * @generatedBy CodePro at 5/14/18 3:30 PM
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
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HighSeasTest.class);
	}
}