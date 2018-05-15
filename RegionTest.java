package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>RegionTest</code> contains tests for the class <code>{@link Region}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:18 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class RegionTest {
	/**
	 * Run the Region(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testRegion_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");

		Region result = new Region(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testRegion_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		Region result = new Region(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void addChild(Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testAddChild_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(null);
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Region child = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.addChild(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void addChild(Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testAddChild_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Region child = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.addChild(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<Region> discover(Player,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testDiscover_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Turn turn = new Turn(1);

		List<Region> result = fixture.discover(player, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Region> discover(Player,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testDiscover_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Turn turn = new Turn(1);

		List<Region> result = fixture.discover(player, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Region> discover(Player,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testDiscover_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Turn turn = new Turn(1);

		List<Region> result = fixture.discover(player, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Region> getChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetChildren_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		List<Region> result = fixture.getChildren();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Region> getChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetChildren_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(null);
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		List<Region> result = fixture.getChildren();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getClaimable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetClaimable_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.getClaimable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getClaimable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetClaimable_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(false);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.getClaimable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getDiscoverable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoverable_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.getDiscoverable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getDiscoverable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoverable_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(false);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.getDiscoverable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Region getDiscoverableRegion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoverableRegion_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(false);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Region result = fixture.getDiscoverableRegion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region getDiscoverableRegion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoverableRegion_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(false);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Region result = fixture.getDiscoverableRegion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region getDiscoverableRegion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoverableRegion_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Region result = fixture.getDiscoverableRegion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getDiscoveredBy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoveredBy_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Player result = fixture.getDiscoveredBy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Turn getDiscoveredIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoveredIn_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Turn result = fixture.getDiscoveredIn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getDiscoverer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetDiscoverer_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		String result = fixture.getDiscoverer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		String result = fixture.getKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetLabel_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetLabel_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		String result = fixture.getNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Region result = fixture.getParent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getScoreValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetScoreValue_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		int result = fixture.getScoreValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Region.RegionType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		Region.RegionType result = fixture.getType();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Region.getXMLElementTagName();

		// add additional test code here
		assertEquals("region", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testHasName_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.hasName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testHasName_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.hasName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testHasName_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.hasName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsLeaf_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(null);
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isLeaf();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsLeaf_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isLeaf();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsLeaf_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isLeaf();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPacific() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsPacific_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "model.region.pacific";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isPacific();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPacific() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsPacific_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isPacific();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPacific() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsPacific_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isPacific();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPacific() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsPacific_4()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

		boolean result = fixture.isPacific();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setChildren(List<Region>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetChildren_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		List<Region> newChildren = new ArrayList<Region>();

		fixture.setChildren(newChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setClaimable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetClaimable_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		boolean newClaimable = true;

		fixture.setClaimable(newClaimable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDiscoverable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetDiscoverable_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		boolean newDiscoverable = true;

		fixture.setDiscoverable(newDiscoverable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDiscoveredBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetDiscoveredBy_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Player newDiscoveredBy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setDiscoveredBy(newDiscoveredBy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDiscoveredIn(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetDiscoveredIn_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Turn newDiscoveredIn = new Turn(1);

		fixture.setDiscoveredIn(newDiscoveredIn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDiscoverer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetDiscoverer_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		String discoverer = "";

		fixture.setDiscoverer(discoverer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		String newName = "";

		fixture.setName(newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setParent(Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetParent_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		Region newParent = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.setParent(newParent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setScoreValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetScoreValue_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
		int newScoreValue = 1;

		fixture.setScoreValue(newScoreValue);

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;

		String result = fixture.toString();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;

		String result = fixture.toString();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(false);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_11()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_12()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_13()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_14()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_15()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_16()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent((Region) null);
		fixture.setDiscoverer("");
		fixture.setName((String) null);
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn((Turn) null);
		fixture.setScoreValue(0);
		fixture.setDiscoveredBy((Player) null);
		fixture.key = null;
		fixture.type = Region.RegionType.COAST;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		Region fixture = new Region(new Game(new IIOMetadataNode(), ""));
		fixture.setParent(new Region(new Game(new IIOMetadataNode(), "")));
		fixture.setDiscoverer("");
		fixture.setName("");
		fixture.setChildren(new ArrayList<Region>());
		fixture.setDiscoverable(true);
		fixture.setClaimable(true);
		fixture.setDiscoveredIn(new Turn(1));
		fixture.setScoreValue(1);
		fixture.setDiscoveredBy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.key = "";
		fixture.type = Region.RegionType.COAST;
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RegionTest.class);
	}
}