package net.sf.freecol.common.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TileImprovementStyleTest</code> contains tests for the class <code>{@link TileImprovementStyle}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:29 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileImprovementStyleTest {
	/**
	 * Run the String decodeOldStyle(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testDecodeOldStyle_1()
		throws Exception {
		String input = "";
		int pad = 0;

		String result = TileImprovementStyle.decodeOldStyle(input, pad);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String decodeOldStyle(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testDecodeOldStyle_2()
		throws Exception {
		String input = "";
		int pad = 1;

		String result = TileImprovementStyle.decodeOldStyle(input, pad);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String decodeOldStyle(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testDecodeOldStyle_3()
		throws Exception {
		String input = "0";
		int pad = 1;

		String result = TileImprovementStyle.decodeOldStyle(input, pad);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String decodeOldStyle(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testDecodeOldStyle_4()
		throws Exception {
		String input = "0";
		int pad = 1;

		String result = TileImprovementStyle.decodeOldStyle(input, pad);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String decodeOldStyle(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testDecodeOldStyle_5()
		throws Exception {
		String input = "0";
		int pad = 1;

		String result = TileImprovementStyle.decodeOldStyle(input, pad);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementStyle getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {
		String key = null;

		TileImprovementStyle result = TileImprovementStyle.getInstance(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementStyle getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {
		String key = "";

		TileImprovementStyle result = TileImprovementStyle.getInstance(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementStyle getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetInstance_3()
		throws Exception {
		String key = "0";

		TileImprovementStyle result = TileImprovementStyle.getInstance(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementStyle getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetInstance_4()
		throws Exception {
		String key = "";

		TileImprovementStyle result = TileImprovementStyle.getInstance(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementStyle getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetInstance_5()
		throws Exception {
		String key = "";

		TileImprovementStyle result = TileImprovementStyle.getInstance(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementStyle getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetInstance_6()
		throws Exception {
		String key = "";

		TileImprovementStyle result = TileImprovementStyle.getInstance(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getMask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMask_1()
		throws Exception {
		TileImprovementStyle fixture = TileImprovementStyle.getInstance("0");

		String result = fixture.getMask();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:556)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the String getString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		TileImprovementStyle fixture = TileImprovementStyle.getInstance("0");

		String result = fixture.getString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:556)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
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
	public void testToString_1()
		throws Exception {
		TileImprovementStyle fixture = TileImprovementStyle.getInstance("0");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:556)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(TileImprovementStyleTest.class);
	}
}