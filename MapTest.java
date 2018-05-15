package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.pathfinding.GoalDecider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.sf.freecol.common.util.LogBuilder;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.pathfinding.CostDecider;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>MapTest</code> contains tests for the class <code>{@link Map}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:48 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class MapTest {
	/**
	 * Run the Map(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testMap_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		Map result = new Map(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testMap_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Map result = new Map(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testMap_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Map result = new Map(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map(Game,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testMap_4()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		int width = 1;
		int height = 1;

		Map result = new Map(game, width, height);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testAdd_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void addRegion(Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testAddRegion_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.addRegion(region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean canAdd(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testCanAdd_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.canAdd(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAdd(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testCanAdd_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.canAdd(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testContains_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = null;
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = null;
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.movesLeft = 1;
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		carrier.setType(new UnitType("", new Specification()));
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = null;
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		carrier.setType(new UnitType("", new Specification()));
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.movesLeft = 1;
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode findPath(Unit,Location,Location,Unit,CostDecider,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFindPath_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location end = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		CostDecider costDecider = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.findPath(unit, start, end, carrier, costDecider, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixupRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFixupRegions_14()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.fixupRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_1()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_2()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_3()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_4()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_5()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_6()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_7()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_8()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean[][] floodFill(boolean[][],int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testFloodFill_9()
		throws Exception {
		boolean[][] boolmap = new boolean[][] {};
		int x = 1;
		int y = 1;
		int limit = 1;

		boolean[][] result = Map.floodFill(boolmap, x, y, limit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_14()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = -1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_15()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = -1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void forSubMap(int,int,int,int,Consumer<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testForSubMap_16()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;
		java.util.function.Consumer<Tile> consumer = null;

		fixture.forSubMap(x, y, w, h, consumer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the Tile getAdjacentTile(Tile,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetAdjacentTile_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		Direction direction = Direction.E;

		Tile result = fixture.getAdjacentTile(tile, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getAdjacentTile(int,int,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetAdjacentTile_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		Direction direction = Direction.E;

		Tile result = fixture.getAdjacentTile(x, y, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterable<Tile> getAllTiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetAllTiles_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Iterable<Tile> result = fixture.getAllTiles();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getBestEntryTile(Unit,Tile,Unit,CostDecider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetBestEntryTile_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		CostDecider costDecider = null;

		Tile result = fixture.getBestEntryTile(unit, tile, carrier, costDecider);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getBestEntryTile(Unit,Tile,Unit,CostDecider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetBestEntryTile_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		CostDecider costDecider = null;

		Tile result = fixture.getBestEntryTile(unit, tile, carrier, costDecider);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<Tile> getCircleIterator(Tile,boolean,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetCircleIterator_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile center = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean isFilled = true;
		int radius = 1;

		Iterator<Tile> result = fixture.getCircleIterator(center, isFilled, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterable<Tile> getCircleTiles(Tile,boolean,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetCircleTiles_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile center = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean isFilled = true;
		int radius = 1;

		Iterable<Tile> result = fixture.getCircleTiles(center, isFilled, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getClosestTile(Tile,Collection<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetClosestTile_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Collection<Tile> tiles = new ArrayList<Tile>();

		Tile result = fixture.getClosestTile(tile, tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getClosestTile(Tile,Collection<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetClosestTile_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Collection<Tile> tiles = new ArrayList<Tile>();

		Tile result = fixture.getClosestTile(tile, tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getClosestTile(Tile,Collection<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetClosestTile_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Collection<Tile> tiles = new ArrayList<Tile>();

		Tile result = fixture.getClosestTile(tile, tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Colony getColony() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetColony_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Colony result = fixture.getColony();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getDirection(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetDirection_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile t1 = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile t2 = new Tile(new Game(new IIOMetadataNode(), ""), "");

		Direction result = fixture.getDirection(t1, t2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getDirection(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetDirection_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile t1 = null;
		Tile t2 = new Tile(new Game(new IIOMetadataNode(), ""), "");

		Direction result = fixture.getDirection(t1, t2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getDirection(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetDirection_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile t1 = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile t2 = null;

		Direction result = fixture.getDirection(t1, t2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getDistance(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetDistance_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile t1 = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		Tile t2 = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);

		int result = fixture.getDistance(t1, t2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the java.util.Map<String, Region> getFixedRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetFixedRegions_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		java.util.Map<String, Region> result = fixture.getFixedRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<String, Region> getFixedRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetFixedRegions_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		java.util.Map<String, Region> result = fixture.getFixedRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<String, Region> getFixedRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetFixedRegions_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		java.util.Map<String, Region> result = fixture.getFixedRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsContainer getGoodsContainer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetGoodsContainer_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		GoodsContainer result = fixture.getGoodsContainer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getHeight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the IndianSettlement getIndianSettlement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetIndianSettlement_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		IndianSettlement result = fixture.getIndianSettlement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getLandWithinDistance(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLandWithinDistance_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int distance = 1;

		Tile result = fixture.getLandWithinDistance(x, y, distance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getLandWithinDistance(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLandWithinDistance_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int distance = 1;

		Tile result = fixture.getLandWithinDistance(x, y, distance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getLandWithinDistance(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLandWithinDistance_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;
		int distance = 1;

		Tile result = fixture.getLandWithinDistance(x, y, distance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getLatitude(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLatitude_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int row = 1;

		int result = fixture.getLatitude(row);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the float getLatitudePerRow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLatitudePerRow_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		float result = fixture.getLatitudePerRow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the Map.Layer getLayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLayer_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Map.Layer result = fixture.getLayer();

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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLocationLabel_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		StringTemplate result = fixture.getLocationLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLocationLabelFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetLocationLabelFor_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setNewLandName((String) null);

		StringTemplate result = fixture.getLocationLabelFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getMaximumLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetMaximumLatitude_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getMaximumLatitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMinimumLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetMinimumLatitude_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getMinimumLatitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Tile getRandomLandTile(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRandomLandTile_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Random random = new Random();

		Tile result = fixture.getRandomLandTile(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getRandomLandTile(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRandomLandTile_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Random random = new Random();

		Tile result = fixture.getRandomLandTile(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getRandomLandTile(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRandomLandTile_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Random random = new Random();

		Tile result = fixture.getRandomLandTile(random);

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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRank_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getRank();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Region getRegionByKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRegionByKey_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		String key = "";

		Region result = fixture.getRegionByKey(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region getRegionByKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRegionByKey_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		String key = null;

		Region result = fixture.getRegionByKey(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region getRegionByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRegionByName_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		String name = "";

		Region result = fixture.getRegionByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Region getRegionByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRegionByName_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		String name = null;

		Region result = fixture.getRegionByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Region> getRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRegions_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Collection<Region> result = fixture.getRegions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getRoughDirection(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRoughDirection_1()
		throws Exception {
		Tile src = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		Tile dst = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);

		Direction result = Map.getRoughDirection(src, dst);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getRoughDirection(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRoughDirection_2()
		throws Exception {
		Tile src = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		Tile dst = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);

		Direction result = Map.getRoughDirection(src, dst);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getRoughDirection(Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRoughDirection_3()
		throws Exception {
		Tile src = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		Tile dst = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);

		Direction result = Map.getRoughDirection(src, dst);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getRow(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetRow_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int latitude = 1;

		int result = fixture.getRow(latitude);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getSearchTrace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetSearchTrace_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.getSearchTrace();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getSearchTrace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetSearchTrace_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.getSearchTrace();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Settlement getSettlement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetSettlement_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Settlement result = fixture.getSettlement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(Position) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetTile_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Map.Position p = new Map.Position(1, 1);

		Tile result = fixture.getTile(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetTile_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetTile_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getUnitCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetUnitCount_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getUnitCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Iterator<Unit> getUnitIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetUnitIterator_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Iterator<Unit> result = fixture.getUnitIterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Unit> getUnitList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetUnitList_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		List<Unit> result = fixture.getUnitList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<Tile> getWholeMapIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetWholeMapIterator_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Iterator<Tile> result = fixture.getWholeMapIterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetWidth_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getWidth();

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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Map.getXMLElementTagName();

		// add additional test code here
		assertEquals("map", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPolar(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsPolar_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);

		boolean result = fixture.isPolar(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPolar(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsPolar_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 3);

		boolean result = fixture.isPolar(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPolar(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsPolar_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 3);

		boolean result = fixture.isPolar(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_1()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_2()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_3()
		throws Exception {
		Location l1 = null;
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_4()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = null;

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_5()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_6()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameContiguity(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameContiguity_7()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameContiguity(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameLocation(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameLocation_1()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameLocation(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameLocation(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameLocation_2()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameLocation(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameLocation(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameLocation_3()
		throws Exception {
		Location l1 = null;
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameLocation(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameLocation(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameLocation_4()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = null;

		boolean result = Map.isSameLocation(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameLocation(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameLocation_5()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameLocation(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSameLocation(Location,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsSameLocation_6()
		throws Exception {
		Location l1 = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location l2 = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = Map.isSameLocation(l1, l2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Position) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Map.Position position = new Map.Position(1, 1);

		boolean result = fixture.isValid(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Position) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Map.Position position = new Map.Position(1, 1);

		boolean result = fixture.isValid(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int x = 1;
		int y = 1;

		boolean result = fixture.isValid(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_5()
		throws Exception {
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;

		boolean result = Map.isValid(x, y, width, height);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_6()
		throws Exception {
		int x = -1;
		int y = 1;
		int width = 1;
		int height = 1;

		boolean result = Map.isValid(x, y, width, height);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_7()
		throws Exception {
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;

		boolean result = Map.isValid(x, y, width, height);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_8()
		throws Exception {
		int x = 1;
		int y = -1;
		int width = 1;
		int height = 1;

		boolean result = Map.isValid(x, y, width, height);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testIsValid_9()
		throws Exception {
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;

		boolean result = Map.isValid(x, y, width, height);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_14()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_15()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testReadChildren_16()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_14()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_15()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetContiguity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetContiguity_16()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetContiguity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_14()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_15()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetHighSeasCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetHighSeasCount_16()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetHighSeasCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_8()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_9()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_10()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_11()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_12()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_13()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_14()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_15()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void resetLayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testResetLayers_16()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		fixture.resetLayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the PathNode search(Unit,Location,GoalDecider,CostDecider,int,Unit,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearch_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoalDecider goalDecider = null;
		CostDecider costDecider = null;
		int maxTurns = 1;
		Unit carrier = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.search(unit, start, goalDecider, costDecider, maxTurns, carrier, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode search(Unit,Location,GoalDecider,CostDecider,int,Unit,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearch_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoalDecider goalDecider = null;
		CostDecider costDecider = null;
		int maxTurns = 1;
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		carrier.setType(new UnitType("", new Specification()));
		carrier.setEntryLocation(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.search(unit, start, goalDecider, costDecider, maxTurns, carrier, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode search(Unit,Location,GoalDecider,CostDecider,int,Unit,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearch_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoalDecider goalDecider = null;
		CostDecider costDecider = null;
		int maxTurns = 1;
		Unit carrier = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		carrier.setType(new UnitType("", new Specification()));
		carrier.setEntryLocation(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.search(unit, start, goalDecider, costDecider, maxTurns, carrier, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode search(Unit,Location,GoalDecider,CostDecider,int,Unit,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearch_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location start = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoalDecider goalDecider = null;
		CostDecider costDecider = null;
		int maxTurns = 1;
		Unit carrier = null;
		LogBuilder lb = new LogBuilder(1);

		PathNode result = fixture.search(unit, start, goalDecider, costDecider, maxTurns, carrier, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = null;
		GoalDecider goalDecider = null;
		int radius = 1;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoalDecider goalDecider = null;
		int radius = 1;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoalDecider goalDecider = null;
		int radius = 0;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoalDecider goalDecider = null;
		int radius = 1;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoalDecider goalDecider = null;
		int radius = 1;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoalDecider goalDecider = null;
		int radius = 1;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile searchCircle(Tile,GoalDecider,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSearchCircle_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile start = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoalDecider goalDecider = null;
		int radius = 1;

		Tile result = fixture.searchCircle(start, goalDecider, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void setLayer(Layer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSetLayer_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Map.Layer newLayer = Map.Layer.ALL;

		fixture.setLayer(newLayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMaximumLatitude(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSetMaximumLatitude_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int newMaximumLatitude = 1;

		fixture.setMaximumLatitude(newMaximumLatitude);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMinimumLatitude(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSetMinimumLatitude_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		int newMinimumLatitude = 1;

		fixture.setMinimumLatitude(newMinimumLatitude);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean setSearchTrace(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSetSearchTrace_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		boolean trace = true;

		boolean result = fixture.setSearchTrace(trace);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean setSearchTrace(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSetSearchTrace_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(false);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		boolean trace = true;

		boolean result = fixture.setSearchTrace(trace);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void setTile(Tile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testSetTile_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int x = 1;
		int y = 1;

		fixture.setTile(tile, x, y);

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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testToShortString_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		String result = fixture.toShortString();

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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testUp_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));

		Location result = fixture.up();

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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		Map fixture = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		fixture.setMaximumLatitude(1);
		fixture.setMinimumLatitude(1);
		fixture.setSearchTrace(true);
		fixture.setLayer(Map.Layer.ALL);
		fixture.addRegion(new Region(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
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
	 * @generatedBy CodePro at 5/14/18 3:48 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MapTest.class);
	}
}