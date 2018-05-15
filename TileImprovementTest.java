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
 * The class <code>TileImprovementTest</code> contains tests for the class <code>{@link TileImprovement}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:29 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileImprovementTest {
	/**
	 * Run the TileImprovement(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testTileImprovement_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		TileImprovement result = new TileImprovement(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement(Game,Tile,TileImprovement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testTileImprovement_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileImprovement template = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		template.setTurnsToComplete(1);
		template.setMagnitude(1);
		template.setVirtual(true);

		TileImprovement result = new TileImprovement(game, tile, template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement(Game,Tile,TileImprovementType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testTileImprovement_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileImprovementType type = null;

		TileImprovement result = new TileImprovement(game, tile, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement(Game,Tile,TileImprovementType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testTileImprovement_4()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		TileImprovementType type = new TileImprovementType("", new Specification());

		TileImprovement result = new TileImprovement(game, tile, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement(Game,Tile,TileImprovementType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testTileImprovement_5()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileImprovementType type = new TileImprovementType("", new Specification());

		TileImprovement result = new TileImprovement(game, tile, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int applyBonus(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testApplyBonus_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;

		int result = fixture.applyBonus(goodsType, unitType, potential);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int applyBonus(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testApplyBonus_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 0;

		int result = fixture.applyBonus(goodsType, unitType, potential);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int applyBonus(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testApplyBonus_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;

		int result = fixture.applyBonus(goodsType, unitType, potential);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canProduce(goodsType, unitType);

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean fix = false;

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCheckIntegrity_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCheckIntegrity_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCheckIntegrity_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testCheckIntegrity_6()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the TileType getChange(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetChange_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileType tileType = new TileType("", new Specification());

		TileType result = fixture.getChange(tileType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileType getChange(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetChange_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileType tileType = new TileType("", new Specification());

		TileType result = fixture.getChange(tileType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Direction> getConnectionDirections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionDirections_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		List<Direction> result = fixture.getConnectionDirections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Direction> getConnectionDirections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionDirections_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		List<Direction> result = fixture.getConnectionDirections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Direction> getConnectionDirections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionDirections_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		List<Direction> result = fixture.getConnectionDirections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Direction, Integer> getConnections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnections_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		java.util.Map<Direction, Integer> result = fixture.getConnections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Direction, Integer> getConnections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnections_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		java.util.Map<Direction, Integer> result = fixture.getConnections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Direction, Integer> getConnections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnections_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		java.util.Map<Direction, Integer> result = fixture.getConnections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Direction, Integer> getConnections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnections_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		java.util.Map<Direction, Integer> result = fixture.getConnections();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the long getConnectionsFromStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionsFromStyle_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		long result = fixture.getConnectionsFromStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getConnectionsFromStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionsFromStyle_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		long result = fixture.getConnectionsFromStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getConnectionsFromStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionsFromStyle_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		long result = fixture.getConnectionsFromStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getConnectionsFromStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionsFromStyle_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		long result = fixture.getConnectionsFromStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getConnectionsFromStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetConnectionsFromStyle_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		long result = fixture.getConnectionsFromStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0L, result);
	}

	/**
	 * Run the int getMagnitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMagnitude_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		int result = fixture.getMagnitude();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMoveCost_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;
		int moveCost = 1;

		int result = fixture.getMoveCost(direction, moveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMoveCost_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;
		int moveCost = 1;

		int result = fixture.getMoveCost(direction, moveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMoveCost_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;
		int moveCost = 1;

		int result = fixture.getMoveCost(direction, moveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.getNameKey();

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetNameKey_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.getNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Modifier getProductionModifier(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifier_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());

		Modifier result = fixture.getProductionModifier(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Modifier getProductionModifier(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifier_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());

		Modifier result = fixture.getProductionModifier(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifiers_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifiers_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifiers_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = null;

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifiers_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = null;

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifiers_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = null;
		UnitType unitType = new UnitType("", new Specification());

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovementStyle getStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetStyle_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TileImprovementStyle result = fixture.getStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getTurnsToComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetTurnsToComplete_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		int result = fixture.getTurnsToComplete();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the TileImprovementType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TileImprovementType result = fixture.getType();

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = TileImprovement.getXMLElementTagName();

		// add additional test code here
		assertEquals("tileImprovement", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getZIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetZIndex_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		int result = fixture.getZIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsComplete_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isComplete();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsComplete_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isComplete();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConnectedTo(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsConnectedTo_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;

		boolean result = fixture.isConnectedTo(direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConnectedTo(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsConnectedTo_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;

		boolean result = fixture.isConnectedTo(direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsNatural_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isNatural();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsNatural_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isNatural();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRiver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsRiver_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isRiver();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRiver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsRiver_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isRiver();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoad() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsRoad_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isRoad();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoad() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsRoad_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isRoad();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileTypeAllowed(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsTileTypeAllowed_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.isTileTypeAllowed(tileType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileTypeAllowed(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsTileTypeAllowed_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.isTileTypeAllowed(tileType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isVirtual() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsVirtual_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isVirtual();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isVirtual() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsVirtual_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(false);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isVirtual();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = null;

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isWorkerAllowed(unit);

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_12()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_13()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_14()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_15()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_16()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setConnected(Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetConnected_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;
		boolean value = false;

		fixture.setConnected(direction, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setConnected(Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetConnected_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;
		boolean value = true;

		fixture.setConnected(direction, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setConnected(Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetConnected_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Direction direction = Direction.E;
		boolean value = true;

		fixture.setConnected(direction, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMagnitude(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetMagnitude_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int magnitude = 1;

		fixture.setMagnitude(magnitude);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setTurnsToComplete(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetTurnsToComplete_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int turns = 1;

		fixture.setTurnsToComplete(turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setVirtual(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetVirtual_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean virtual = true;

		fixture.setVirtual(virtual);

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRiverConnections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRiverConnections_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		String conns = "";

		String result = fixture.updateRiverConnections(conns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRiverConnections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRiverConnections_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		String conns = "";

		String result = fixture.updateRiverConnections(conns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRiverConnections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRiverConnections_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		String conns = null;

		String result = fixture.updateRiverConnections(conns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRiverConnections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRiverConnections_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		String conns = null;

		String result = fixture.updateRiverConnections(conns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRiverConnections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRiverConnections_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		String conns = null;

		String result = fixture.updateRiverConnections(conns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRiverConnections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRiverConnections_6()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		String conns = null;

		String result = fixture.updateRiverConnections(conns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRoadConnections(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRoadConnections_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean connect = true;

		String result = fixture.updateRoadConnections(connect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRoadConnections(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRoadConnections_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean connect = true;

		String result = fixture.updateRoadConnections(connect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRoadConnections(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRoadConnections_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean connect = true;

		String result = fixture.updateRoadConnections(connect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRoadConnections(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRoadConnections_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean connect = true;

		String result = fixture.updateRoadConnections(connect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String updateRoadConnections(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testUpdateRoadConnections_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(0);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		boolean connect = true;

		String result = fixture.updateRoadConnections(connect);

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(true);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(false);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteAttributes_11()
		throws Exception {
		TileImprovement fixture = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		fixture.setTurnsToComplete(1);
		fixture.setMagnitude(1);
		fixture.setVirtual(false);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileImprovementTest.class);
	}
}