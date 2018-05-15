package net.sf.freecol.common.util;

import java.awt.FontMetrics;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StringUtilsTest</code> contains tests for the class <code>{@link StringUtils}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:41 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class StringUtilsTest {
	/**
	 * Run the String chop(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testChop_1()
		throws Exception {
		String str = "";
		int maxLength = 1;

		String result = StringUtils.chop(str, maxLength);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String chop(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testChop_2()
		throws Exception {
		String str = "";
		int maxLength = 1;

		String result = StringUtils.chop(str, maxLength);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getBreakingPoint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetBreakingPoint_1()
		throws Exception {
		String string = "";

		int result = StringUtils.getBreakingPoint(string);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getBreakingPoint(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetBreakingPoint_2()
		throws Exception {
		String string = "aaa";
		String delim = "aaa";

		int result = StringUtils.getBreakingPoint(string, delim);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBreakingPoint(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetBreakingPoint_3()
		throws Exception {
		String string = "aaa";
		String delim = "aaa";

		int result = StringUtils.getBreakingPoint(string, delim);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBreakingPoint(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetBreakingPoint_4()
		throws Exception {
		String string = "aaa";
		String delim = "aaa";

		int result = StringUtils.getBreakingPoint(string, delim);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBreakingPoint(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetBreakingPoint_5()
		throws Exception {
		String string = "";
		String delim = "";

		int result = StringUtils.getBreakingPoint(string, delim);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the String getEnumKey(Enum<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetEnumKey_1()
		throws Exception {
		Enum<Enum> value = null;

		String result = StringUtils.getEnumKey(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.StringUtils.getEnumKey(StringUtils.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the String getEnumKey(Enum<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetEnumKey_2()
		throws Exception {
		Enum<Enum> value = null;

		String result = StringUtils.getEnumKey(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.StringUtils.getEnumKey(StringUtils.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the String getEnumKey(Enum<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetEnumKey_3()
		throws Exception {
		Enum<Enum> value = null;

		String result = StringUtils.getEnumKey(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.StringUtils.getEnumKey(StringUtils.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the String getEnumKey(Enum<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testGetEnumKey_4()
		throws Exception {
		Enum<Enum> value = null;

		String result = StringUtils.getEnumKey(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.StringUtils.getEnumKey(StringUtils.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the String join(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testJoin_1()
		throws Exception {
		String delimiter = "";
		List<String> strings = new ArrayList<String>();

		String result = StringUtils.join(delimiter, strings);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String join(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testJoin_2()
		throws Exception {
		String delimiter = "";

		String result = StringUtils.join(delimiter);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String join(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testJoin_3()
		throws Exception {
		String delimiter = "";

		String result = StringUtils.join(delimiter);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String join(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testJoin_4()
		throws Exception {
		String delimiter = "";
		String string1 = "";
		String string2 = "";

		String result = StringUtils.join(delimiter, string1, string2);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String join(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testJoin_5()
		throws Exception {
		String delimiter = "";
		String string1 = "";

		String result = StringUtils.join(delimiter, string1);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String lastPart(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLastPart_1()
		throws Exception {
		String s = null;
		String delim = "";

		String result = StringUtils.lastPart(s, delim);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String lastPart(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testLastPart_2()
		throws Exception {
		String s = "";
		String delim = "";

		String result = StringUtils.lastPart(s, delim);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<String> splitText(String,String,FontMetrics,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testSplitText_1()
		throws Exception {
		String text = "";
		String delim = "";
		FontMetrics fontMetrics = null;
		int width = 1;

		List<String> result = StringUtils.splitText(text, delim, fontMetrics, width);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> splitText(String,String,FontMetrics,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testSplitText_2()
		throws Exception {
		String text = "";
		String delim = "";
		FontMetrics fontMetrics = null;
		int width = 1;

		List<String> result = StringUtils.splitText(text, delim, fontMetrics, width);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> splitText(String,String,FontMetrics,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testSplitText_3()
		throws Exception {
		String text = "aaaa";
		String delim = "aaaa";
		FontMetrics fontMetrics = null;
		int width = 1;

		List<String> result = StringUtils.splitText(text, delim, fontMetrics, width);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> splitText(String,String,FontMetrics,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testSplitText_4()
		throws Exception {
		String text = "";
		String delim = "";
		FontMetrics fontMetrics = null;
		int width = 1;

		List<String> result = StringUtils.splitText(text, delim, fontMetrics, width);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(StringUtilsTest.class);
	}
}