package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>BuildQueueTest</code> contains tests for the class <code>{@link BuildQueue}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:08 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class BuildQueueTest {
	/**
	 * Run the BuildQueue(Colony,CompletionAction,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testBuildQueue_1()
		throws Exception {
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");
		BuildQueue.CompletionAction action = BuildQueue.CompletionAction.ADD_RANDOM;
		int priority = 1;

		BuildQueue result = new BuildQueue(colony, action, priority);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void add(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		fixture.add(new BuildingType("", new Specification()));

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the BuildQueue.CompletionAction getCompletionAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetCompletionAction_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		BuildQueue.CompletionAction result = fixture.getCompletionAction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getConsumedGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetConsumedGoods_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		List<AbstractGoods> result = fixture.getConsumedGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getConsumedGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetConsumedGoods_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		List<AbstractGoods> result = fixture.getConsumedGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the BuildableType getCurrentlyBuilding() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetCurrentlyBuilding_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		BuildableType result = fixture.getCurrentlyBuilding();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the BuildableType getCurrentlyBuilding() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetCurrentlyBuilding_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		BuildableType result = fixture.getCurrentlyBuilding();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetModifiers_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		String id = "";

		Set<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetPriority_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		int result = fixture.getPriority();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_3()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_4()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_5()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_6()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProductionInfo_7()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<AbstractGoods> input = new ArrayList<AbstractGoods>();

		ProductionInfo result = fixture.getProductionInfo(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<BuildableType> getValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetValues_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		List<BuildableType> result = fixture.getValues();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testHasAbility_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		String id = "model.ability.consumeAllOrNothing";

		boolean result = fixture.hasAbility(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testHasAbility_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		String id = "";

		boolean result = fixture.hasAbility(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		boolean result = fixture.isEmpty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		boolean result = fixture.isEmpty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void remove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		int index = 1;

		fixture.remove(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCompletionAction(CompletionAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testSetCompletionAction_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		BuildQueue.CompletionAction newCompletionAction = BuildQueue.CompletionAction.ADD_RANDOM;

		fixture.setCompletionAction(newCompletionAction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCurrentlyBuilding(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testSetCurrentlyBuilding_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		fixture.setCurrentlyBuilding(new BuildingType("", new Specification()));

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCurrentlyBuilding(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testSetCurrentlyBuilding_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		fixture.setCurrentlyBuilding(new BuildingType("", new Specification()));

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCurrentlyBuilding(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testSetCurrentlyBuilding_3()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		fixture.setCurrentlyBuilding(new BuildingType("", new Specification()));

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setValues(List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testSetValues_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());
		List<BuildableType> values = new ArrayList<BuildableType>();

		fixture.setValues(values);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		int result = fixture.size();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		BuildQueue fixture = new BuildQueue(new Colony(new Game(new IIOMetadataNode(), ""), ""), BuildQueue.CompletionAction.ADD_RANDOM, 1);
		fixture.setValues(new ArrayList<BuildableType>());

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BuildQueueTest.class);
	}
}