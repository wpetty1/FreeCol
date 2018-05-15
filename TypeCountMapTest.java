package net.sf.freecol.common.model;

import java.util.Collection;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TypeCountMapTest</code> contains tests for the class <code>{@link TypeCountMap}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:33 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TypeCountMapTest {
	/**
	 * Run the TypeCountMap() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testTypeCountMap_1()
		throws Exception {
		TypeCountMap result = new TypeCountMap();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void add(TypeCountMap<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();
		TypeCountMap<FreeColGameObjectType> other = new TypeCountMap();

		fixture.add(other);

		// add additional test code here
	}

	/**
	 * Run the void add(TypeCountMap<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();
		TypeCountMap<FreeColGameObjectType> other = new TypeCountMap();

		fixture.add(other);

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the boolean containsKey(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testContainsKey_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		boolean result = fixture.containsKey(TileType.WATER);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsKey(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		boolean result = fixture.containsKey(TileType.WATER);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getCount(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testGetCount_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		int result = fixture.getCount(TileType.WATER);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getCount(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testGetCount_2()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		int result = fixture.getCount(TileType.WATER);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the java.util.Map<FreeColGameObjectType, Integer> getValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testGetValues_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		java.util.Map<FreeColGameObjectType, Integer> result = fixture.getValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Integer incrementCount(T,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testIncrementCount_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();
		int newCount = 1;

		Integer result = fixture.incrementCount(TileType.WATER, newCount);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer incrementCount(T,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testIncrementCount_2()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();
		int newCount = 1;

		Integer result = fixture.incrementCount(TileType.WATER, newCount);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer incrementCount(T,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testIncrementCount_3()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();
		int newCount = 1;

		Integer result = fixture.incrementCount(TileType.WATER, newCount);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Set<FreeColGameObjectType> keySet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testKeySet_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		Set<FreeColGameObjectType> result = fixture.keySet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void putAll(TypeCountMap<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testPutAll_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();
		TypeCountMap<FreeColGameObjectType> other = new TypeCountMap();

		fixture.putAll(other);

		// add additional test code here
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[net.sf.freecol.common.model.TypeCountMap]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[net.sf.freecol.common.model.TypeCountMap]", result);
	}

	/**
	 * Run the Collection<Integer> values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	@Test
	public void testValues_1()
		throws Exception {
		TypeCountMap fixture = new TypeCountMap();

		Collection<Integer> result = fixture.values();

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
	 * @generatedBy CodePro at 5/14/18 4:33 PM
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
	 * @generatedBy CodePro at 5/14/18 4:33 PM
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
	 * @generatedBy CodePro at 5/14/18 4:33 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TypeCountMapTest.class);
	}
}