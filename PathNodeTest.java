package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>PathNodeTest</code> contains tests for the class <code>{@link PathNode}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:55 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class PathNodeTest {
	/**
	 * Run the PathNode(Location,int,int,boolean,PathNode,PathNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testPathNode_1()
		throws Exception {
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeft = 1;
		int turns = 1;
		boolean onCarrier = true;
		PathNode previous = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null));
		PathNode next = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null));

		PathNode result = new PathNode(location, movesLeft, turns, onCarrier, previous, next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void addTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testAddTurns_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));
		int turns = 1;

		fixture.addTurns(turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void convertToGoodsDeliveryPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testConvertToGoodsDeliveryPath_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), (PathNode) null);

		fixture.convertToGoodsDeliveryPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean embarkedThisTurn(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testEmbarkedThisTurn_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));
		int turns = 1;

		boolean result = fixture.embarkedThisTurn(turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean embarkedThisTurn(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testEmbarkedThisTurn_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, false, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));
		int turns = 1;

		boolean result = fixture.embarkedThisTurn(turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void ensureDisembark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testEnsureDisembark_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		fixture.ensureDisembark();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void ensureDisembark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testEnsureDisembark_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, false, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		fixture.ensureDisembark();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String fullPathToString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testFullPathToString_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		String result = fixture.fullPathToString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getCarrierMove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetCarrierMove_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		PathNode result = fixture.getCarrierMove();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getCost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetCost_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getCost();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetCost_2()
		throws Exception {
		int turns = 1;
		int movesLeft = 1;

		int result = PathNode.getCost(turns, movesLeft);

		// add additional test code here
		assertEquals(199, result);
	}

	/**
	 * Run the int getCost(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetCost_3()
		throws Exception {
		int turns = 21262214;
		int movesLeft = 1;

		int result = PathNode.getCost(turns, movesLeft);

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the Direction getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetDirection_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, (PathNode) null, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		Direction result = fixture.getDirection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetDirection_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		Direction result = fixture.getDirection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetDirection_3()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		Direction result = fixture.getDirection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Direction getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetDirection_4()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		Direction result = fixture.getDirection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getFirstNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetFirstNode_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		PathNode result = fixture.getFirstNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getFirstNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetFirstNode_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, (PathNode) null, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		PathNode result = fixture.getFirstNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getLastNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetLastNode_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), (PathNode) null);

		PathNode result = fixture.getLastNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetLength_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getLength();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		Location result = fixture.getLocation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getMovesLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetMovesLeft_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getMovesLeft();

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
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		PathNode fixture = new PathNode((Location) null, 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getTotalTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTotalTurns_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 0, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getTotalTurns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTotalTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTotalTurns_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getTotalTurns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the PathNode getTransportDropNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTransportDropNode_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		PathNode result = fixture.getTransportDropNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getTransportDropNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTransportDropNode_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		PathNode result = fixture.getTransportDropNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getTransportDropNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTransportDropNode_3()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), (PathNode) null);

		PathNode result = fixture.getTransportDropNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PathNode getTransportDropNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTransportDropNode_4()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, false, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		PathNode result = fixture.getTransportDropNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getTransportDropTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTransportDropTurns_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getTransportDropTurns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testGetTurns_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		int result = fixture.getTurns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isOnCarrier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testIsOnCarrier_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		boolean result = fixture.isOnCarrier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOnCarrier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testIsOnCarrier_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, false, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		boolean result = fixture.isOnCarrier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void setMovesLeft(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testSetMovesLeft_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));
		int movesLeft = 1;

		fixture.setMovesLeft(movesLeft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setOnCarrier(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testSetOnCarrier_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));
		boolean onCarrier = true;

		fixture.setOnCarrier(onCarrier);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testSetTurns_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));
		int turns = 1;

		fixture.setTurns(turns);

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
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean usesCarrier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testUsesCarrier_1()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		boolean result = fixture.usesCarrier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean usesCarrier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	@Test
	public void testUsesCarrier_2()
		throws Exception {
		PathNode fixture = new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)), new PathNode(new HighSeas(new Game(new IIOMetadataNode(), "")), 1, 1, true, new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null), new PathNode(new Building(new Game(new IIOMetadataNode(""), ""), ""), 0, 0, false, (PathNode) null, (PathNode) null)));

		boolean result = fixture.usesCarrier();

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
	 * @generatedBy CodePro at 5/14/18 3:55 PM
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
	 * @generatedBy CodePro at 5/14/18 3:55 PM
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
	 * @generatedBy CodePro at 5/14/18 3:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PathNodeTest.class);
	}
}