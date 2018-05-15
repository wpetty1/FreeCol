package net.sf.freecol.common.model;

import java.util.Random;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DirectionTest</code> contains tests for the class <code>{@link Direction}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:13 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class DirectionTest {
	/**
	 * Run the Direction(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testDirection_1()
		throws Exception {
		int oddDX = 1;
		int oddDY = 1;
		int evenDX = 1;
		int evenDY = 1;

		Direction result = new Direction(oddDX, oddDY, evenDX, evenDY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: net.sf.freecol.common.model.Direction.<init>(int, int, int, int)
		//       at java.lang.Class.getConstructor0(Unknown Source)
		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Direction angleToDirection(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testAngleToDirection_1()
		throws Exception {
		double angle = 1.0;

		Direction result = Direction.angleToDirection(angle);

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.NE", result.getKey());
		assertEquals("model.direction.NE.name", result.getNameKey());
		assertEquals("NE", result.name());
		assertEquals("NE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Direction[] getClosestDirections(String,Logger,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetClosestDirections_1()
		throws Exception {
		Direction fixture = Direction.E;
		String logMe = "";
		Logger logger = Logger.getAnonymousLogger();
		Random random = new Random();

		Direction[] result = fixture.getClosestDirections(logMe, logger, random);

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.length);
		assertNotNull(result[0]);
		assertEquals("direction.E", result[0].getKey());
		assertEquals("model.direction.E.name", result[0].getNameKey());
		assertEquals("E", result[0].name());
		assertEquals("E", result[0].toString());
		assertEquals(2, result[0].ordinal());
		assertNotNull(result[1]);
		assertEquals("direction.NE", result[1].getKey());
		assertEquals("model.direction.NE.name", result[1].getNameKey());
		assertEquals("NE", result[1].name());
		assertEquals("NE", result[1].toString());
		assertEquals(1, result[1].ordinal());
		assertNotNull(result[2]);
		assertEquals("direction.SE", result[2].getKey());
		assertEquals("model.direction.SE.name", result[2].getNameKey());
		assertEquals("SE", result[2].name());
		assertEquals("SE", result[2].toString());
		assertEquals(3, result[2].ordinal());
		assertNotNull(result[3]);
		assertEquals("direction.N", result[3].getKey());
		assertEquals("model.direction.N.name", result[3].getNameKey());
		assertEquals("N", result[3].name());
		assertEquals("N", result[3].toString());
		assertEquals(0, result[3].ordinal());
		assertNotNull(result[4]);
		assertEquals("direction.S", result[4].getKey());
		assertEquals("model.direction.S.name", result[4].getNameKey());
		assertEquals("S", result[4].name());
		assertEquals("S", result[4].toString());
		assertEquals(4, result[4].ordinal());
		assertNotNull(result[5]);
		assertEquals("direction.SW", result[5].getKey());
		assertEquals("model.direction.SW.name", result[5].getNameKey());
		assertEquals("SW", result[5].name());
		assertEquals("SW", result[5].toString());
		assertEquals(5, result[5].ordinal());
		assertNotNull(result[6]);
		assertEquals("direction.NW", result[6].getKey());
		assertEquals("model.direction.NW.name", result[6].getNameKey());
		assertEquals("NW", result[6].name());
		assertEquals("NW", result[6].toString());
		assertEquals(7, result[6].ordinal());
		assertNotNull(result[7]);
		assertEquals("direction.W", result[7].getKey());
		assertEquals("model.direction.W.name", result[7].getNameKey());
		assertEquals("W", result[7].name());
		assertEquals("W", result[7].toString());
		assertEquals(6, result[7].ordinal());
	}

	/**
	 * Run the Direction[] getClosestDirections(String,Logger,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetClosestDirections_2()
		throws Exception {
		Direction fixture = Direction.E;
		String logMe = "";
		Logger logger = Logger.getAnonymousLogger();
		Random random = new Random();

		Direction[] result = fixture.getClosestDirections(logMe, logger, random);

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.length);
		assertNotNull(result[0]);
		assertEquals("direction.E", result[0].getKey());
		assertEquals("model.direction.E.name", result[0].getNameKey());
		assertEquals("E", result[0].name());
		assertEquals("E", result[0].toString());
		assertEquals(2, result[0].ordinal());
		assertNotNull(result[1]);
		assertEquals("direction.SE", result[1].getKey());
		assertEquals("model.direction.SE.name", result[1].getNameKey());
		assertEquals("SE", result[1].name());
		assertEquals("SE", result[1].toString());
		assertEquals(3, result[1].ordinal());
		assertNotNull(result[2]);
		assertEquals("direction.NE", result[2].getKey());
		assertEquals("model.direction.NE.name", result[2].getNameKey());
		assertEquals("NE", result[2].name());
		assertEquals("NE", result[2].toString());
		assertEquals(1, result[2].ordinal());
		assertNotNull(result[3]);
		assertEquals("direction.S", result[3].getKey());
		assertEquals("model.direction.S.name", result[3].getNameKey());
		assertEquals("S", result[3].name());
		assertEquals("S", result[3].toString());
		assertEquals(4, result[3].ordinal());
		assertNotNull(result[4]);
		assertEquals("direction.N", result[4].getKey());
		assertEquals("model.direction.N.name", result[4].getNameKey());
		assertEquals("N", result[4].name());
		assertEquals("N", result[4].toString());
		assertEquals(0, result[4].ordinal());
		assertNotNull(result[5]);
		assertEquals("direction.SW", result[5].getKey());
		assertEquals("model.direction.SW.name", result[5].getNameKey());
		assertEquals("SW", result[5].name());
		assertEquals("SW", result[5].toString());
		assertEquals(5, result[5].ordinal());
		assertNotNull(result[6]);
		assertEquals("direction.NW", result[6].getKey());
		assertEquals("model.direction.NW.name", result[6].getNameKey());
		assertEquals("NW", result[6].name());
		assertEquals("NW", result[6].toString());
		assertEquals(7, result[6].ordinal());
		assertNotNull(result[7]);
		assertEquals("direction.W", result[7].getKey());
		assertEquals("model.direction.W.name", result[7].getNameKey());
		assertEquals("W", result[7].name());
		assertEquals("W", result[7].toString());
		assertEquals(6, result[7].ordinal());
	}

	/**
	 * Run the Direction[] getClosestDirections(String,Logger,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetClosestDirections_3()
		throws Exception {
		Direction fixture = Direction.E;
		String logMe = "";
		Logger logger = Logger.getAnonymousLogger();
		Random random = new Random();

		Direction[] result = fixture.getClosestDirections(logMe, logger, random);

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.length);
		assertNotNull(result[0]);
		assertEquals("direction.E", result[0].getKey());
		assertEquals("model.direction.E.name", result[0].getNameKey());
		assertEquals("E", result[0].name());
		assertEquals("E", result[0].toString());
		assertEquals(2, result[0].ordinal());
		assertNotNull(result[1]);
		assertEquals("direction.SE", result[1].getKey());
		assertEquals("model.direction.SE.name", result[1].getNameKey());
		assertEquals("SE", result[1].name());
		assertEquals("SE", result[1].toString());
		assertEquals(3, result[1].ordinal());
		assertNotNull(result[2]);
		assertEquals("direction.NE", result[2].getKey());
		assertEquals("model.direction.NE.name", result[2].getNameKey());
		assertEquals("NE", result[2].name());
		assertEquals("NE", result[2].toString());
		assertEquals(1, result[2].ordinal());
		assertNotNull(result[3]);
		assertEquals("direction.N", result[3].getKey());
		assertEquals("model.direction.N.name", result[3].getNameKey());
		assertEquals("N", result[3].name());
		assertEquals("N", result[3].toString());
		assertEquals(0, result[3].ordinal());
		assertNotNull(result[4]);
		assertEquals("direction.S", result[4].getKey());
		assertEquals("model.direction.S.name", result[4].getNameKey());
		assertEquals("S", result[4].name());
		assertEquals("S", result[4].toString());
		assertEquals(4, result[4].ordinal());
		assertNotNull(result[5]);
		assertEquals("direction.NW", result[5].getKey());
		assertEquals("model.direction.NW.name", result[5].getNameKey());
		assertEquals("NW", result[5].name());
		assertEquals("NW", result[5].toString());
		assertEquals(7, result[5].ordinal());
		assertNotNull(result[6]);
		assertEquals("direction.SW", result[6].getKey());
		assertEquals("model.direction.SW.name", result[6].getNameKey());
		assertEquals("SW", result[6].name());
		assertEquals("SW", result[6].toString());
		assertEquals(5, result[6].ordinal());
		assertNotNull(result[7]);
		assertEquals("direction.W", result[7].getKey());
		assertEquals("model.direction.W.name", result[7].getNameKey());
		assertEquals("W", result[7].name());
		assertEquals("W", result[7].toString());
		assertEquals(6, result[7].ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_2()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_3()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_4()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_5()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_6()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetEWMirroredDirection_7()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Direction fixture = Direction.E;

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("direction.E", result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Direction fixture = Direction.E;

		String result = fixture.getNameKey();

		// add additional test code here
		assertEquals("model.direction.E.name", result);
	}

	/**
	 * Run the Direction getNextDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetNextDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getNextDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.SE", result.getKey());
		assertEquals("model.direction.SE.name", result.getNameKey());
		assertEquals("SE", result.name());
		assertEquals("SE", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the Direction getPreviousDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetPreviousDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getPreviousDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.NE", result.getKey());
		assertEquals("model.direction.NE.name", result.getNameKey());
		assertEquals("NE", result.name());
		assertEquals("NE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Direction getRandomDirection(String,Logger,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetRandomDirection_1()
		throws Exception {
		String logMe = "";
		Logger logger = Logger.getAnonymousLogger();
		Random random = new Random();

		Direction result = Direction.getRandomDirection(logMe, logger, random);

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.E", result.getKey());
		assertEquals("model.direction.E.name", result.getNameKey());
		assertEquals("E", result.name());
		assertEquals("E", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Direction[] getRandomDirections(String,Logger,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetRandomDirections_1()
		throws Exception {
		String logMe = "";
		Logger logger = Logger.getAnonymousLogger();
		Random random = new Random();

		Direction[] result = Direction.getRandomDirections(logMe, logger, random);

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.length);
		assertNotNull(result[0]);
		assertEquals("direction.E", result[0].getKey());
		assertEquals("model.direction.E.name", result[0].getNameKey());
		assertEquals("E", result[0].name());
		assertEquals("E", result[0].toString());
		assertEquals(2, result[0].ordinal());
		assertNotNull(result[1]);
		assertEquals("direction.S", result[1].getKey());
		assertEquals("model.direction.S.name", result[1].getNameKey());
		assertEquals("S", result[1].name());
		assertEquals("S", result[1].toString());
		assertEquals(4, result[1].ordinal());
		assertNotNull(result[2]);
		assertEquals("direction.SE", result[2].getKey());
		assertEquals("model.direction.SE.name", result[2].getNameKey());
		assertEquals("SE", result[2].name());
		assertEquals("SE", result[2].toString());
		assertEquals(3, result[2].ordinal());
		assertNotNull(result[3]);
		assertEquals("direction.W", result[3].getKey());
		assertEquals("model.direction.W.name", result[3].getNameKey());
		assertEquals("W", result[3].name());
		assertEquals("W", result[3].toString());
		assertEquals(6, result[3].ordinal());
		assertNotNull(result[4]);
		assertEquals("direction.SW", result[4].getKey());
		assertEquals("model.direction.SW.name", result[4].getNameKey());
		assertEquals("SW", result[4].name());
		assertEquals("SW", result[4].toString());
		assertEquals(5, result[4].ordinal());
		assertNotNull(result[5]);
		assertEquals("direction.N", result[5].getKey());
		assertEquals("model.direction.N.name", result[5].getNameKey());
		assertEquals("N", result[5].name());
		assertEquals("N", result[5].toString());
		assertEquals(0, result[5].ordinal());
		assertNotNull(result[6]);
		assertEquals("direction.NW", result[6].getKey());
		assertEquals("model.direction.NW.name", result[6].getNameKey());
		assertEquals("NW", result[6].name());
		assertEquals("NW", result[6].toString());
		assertEquals(7, result[6].ordinal());
		assertNotNull(result[7]);
		assertEquals("direction.NE", result[7].getKey());
		assertEquals("model.direction.NE.name", result[7].getNameKey());
		assertEquals("NE", result[7].name());
		assertEquals("NE", result[7].toString());
		assertEquals(1, result[7].ordinal());
	}

	/**
	 * Run the Direction getReverseDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testGetReverseDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getReverseDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Map.Position step(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testStep_1()
		throws Exception {
		Direction fixture = Direction.E;
		int x = 1;
		int y = 1;

		Map.Position result = fixture.step(x, y);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(2, 1)", result.toString());
		assertEquals(1, result.getY());
		assertEquals(2, result.getX());
	}

	/**
	 * Run the Map.Position step(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	@Test
	public void testStep_2()
		throws Exception {
		Direction fixture = Direction.E;
		int x = 1;
		int y = 1;

		Map.Position result = fixture.step(x, y);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(2, 1)", result.toString());
		assertEquals(1, result.getY());
		assertEquals(2, result.getX());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:13 PM
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
	 * @generatedBy CodePro at 5/14/18 3:13 PM
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
	 * @generatedBy CodePro at 5/14/18 3:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DirectionTest.class);
	}
}