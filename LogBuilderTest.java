package net.sf.freecol.common.util;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LogBuilderTest</code> contains tests for the class <code>{@link LogBuilder}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:41 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LogBuilderTest {
	/**
	 * Run the LogBuilder(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLogBuilder_1()
		throws Exception {
		int size = 1;

		LogBuilder result = new LogBuilder(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(0, result.size());
	}

	/**
	 * Run the LogBuilder(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLogBuilder_2()
		throws Exception {
		int size = 0;

		LogBuilder result = new LogBuilder(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(0, result.size());
	}

	/**
	 * Run the void add(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);

		fixture.add();

		// add additional test code here
	}

	/**
	 * Run the void addStackTrace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testAddStackTrace_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);

		fixture.addStackTrace();

		// add additional test code here
	}

	/**
	 * Run the boolean grew(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGrew_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);

		boolean result = fixture.grew();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.remove(Unknown Source)
		//       at net.sf.freecol.common.util.LogBuilder.grew(LogBuilder.java:142)
		assertTrue(result);
	}

	/**
	 * Run the void log(Logger,Level) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLog_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		Logger logger = Logger.getAnonymousLogger();
		Level level = Level.parse("");

		fixture.log(logger, level);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Bad level ""
		//       at java.util.logging.Level.parse(Unknown Source)
	}

	/**
	 * Run the void log(Logger,Level) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLog_2()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		Logger logger = null;
		Level level = Level.parse("");

		fixture.log(logger, level);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Bad level ""
		//       at java.util.logging.Level.parse(Unknown Source)
	}

	/**
	 * Run the void log(Logger,Level) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLog_3()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		Logger logger = Logger.getAnonymousLogger();
		Level level = null;

		fixture.log(logger, level);

		// add additional test code here
	}

	/**
	 * Run the void log(Logger,Level) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLog_4()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		Logger logger = Logger.getAnonymousLogger();
		Level level = Level.parse("");

		fixture.log(logger, level);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Bad level ""
		//       at java.util.logging.Level.parse(Unknown Source)
	}

	/**
	 * Run the void mark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testMark_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);

		fixture.mark();

		// add additional test code here
	}

	/**
	 * Run the void shrink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testShrink_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		String delim = "";

		fixture.shrink(delim);

		// add additional test code here
	}

	/**
	 * Run the void shrink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testShrink_2()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		String delim = null;

		fixture.shrink(delim);

		// add additional test code here
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void truncate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testTruncate_1()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		int size = 1;

		fixture.truncate(size);

		// add additional test code here
	}

	/**
	 * Run the void truncate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testTruncate_2()
		throws Exception {
		LogBuilder fixture = new LogBuilder(1);
		int size = 1;

		fixture.truncate(size);

		// add additional test code here
	}

	/**
	 * Run the String wide(int,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testWide_1()
		throws Exception {
		int size = 0;

		String result = LogBuilder.wide(size);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String wide(int,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testWide_2()
		throws Exception {
		int size = 1;

		String result = LogBuilder.wide(size);

		// add additional test code here
		assertEquals(" ", result);
	}

	/**
	 * Run the String wide(int,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testWide_3()
		throws Exception {
		int size = 1;

		String result = LogBuilder.wide(size);

		// add additional test code here
		assertEquals(" ", result);
	}

	/**
	 * Run the String wide(int,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testWide_4()
		throws Exception {
		int size = 1;

		String result = LogBuilder.wide(size);

		// add additional test code here
		assertEquals(" ", result);
	}

	/**
	 * Run the String wide(int,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testWide_5()
		throws Exception {
		int size = 1;

		String result = LogBuilder.wide(size);

		// add additional test code here
		assertEquals(" ", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
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
	 * @generatedBy CodePro at 5/14/18 4:41 PM
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
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LogBuilderTest.class);
	}
}