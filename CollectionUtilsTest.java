package net.sf.freecol.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import net.sf.freecol.server.ai.CacheEntryComparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CollectionUtilsTest</code> contains tests for the class <code>{@link CollectionUtils}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:40 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class CollectionUtilsTest {
	/**
	 * Run the CollectionUtils() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testCollectionUtils_1()
		throws Exception {
		CollectionUtils result = new CollectionUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void accumulateMap(Map<K,V>,Map<K,V>,BinaryOperator<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAccumulateMap_1()
		throws Exception {
		Map<Object, Object> map1 = new HashMap<Object, Object>();
		Map<Object, Object> map2 = new HashMap<Object, Object>();
		BinaryOperator<Object> accumulator = null;

		CollectionUtils.accumulateMap(map1, map2, accumulator);

		// add additional test code here
	}

	/**
	 * Run the void accumulateMap(Map<K,V>,Map<K,V>,BinaryOperator<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAccumulateMap_2()
		throws Exception {
		Map<Object, Object> map1 = new HashMap<Object, Object>();
		Map<Object, Object> map2 = new HashMap<Object, Object>();
		BinaryOperator<Object> accumulator = null;

		CollectionUtils.accumulateMap(map1, map2, accumulator);

		// add additional test code here
	}

	/**
	 * Run the void accumulateToMap(Map<K,V>,K,V,BinaryOperator<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAccumulateToMap_1()
		throws Exception {
		Map<Object, Object> map = new HashMap<Object, Object>();
		BinaryOperator<Object> accumulator = null;

		CollectionUtils.accumulateToMap(map, null, null, accumulator);

		// add additional test code here
	}

	/**
	 * Run the void accumulateToMap(Map<K,V>,K,V,BinaryOperator<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAccumulateToMap_2()
		throws Exception {
		Map<Object, Object> map = new HashMap<Object, Object>();
		BinaryOperator<Object> accumulator = null;

		CollectionUtils.accumulateToMap(map, null, null, accumulator);

		// add additional test code here
	}

	/**
	 * Run the boolean all(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAll_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.all(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.allMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:363)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:348)
		assertTrue(result);
	}

	/**
	 * Run the boolean all(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAll_2()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.all(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.allMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:363)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:348)
		assertTrue(result);
	}

	/**
	 * Run the boolean all(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAll_3()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.all(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:363)
		assertTrue(result);
	}

	/**
	 * Run the boolean all(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAll_4()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.all(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:363)
		assertTrue(result);
	}

	/**
	 * Run the boolean all(T[],Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAll_5()
		throws Exception {
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.all(new Object[] {}, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.allMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:363)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:335)
		assertTrue(result);
	}

	/**
	 * Run the boolean all(T[],Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAll_6()
		throws Exception {
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.all(new Object[] {}, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.allMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:363)
		//       at net.sf.freecol.common.util.CollectionUtils.all(CollectionUtils.java:335)
		assertTrue(result);
	}

	/**
	 * Run the boolean allSame(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAllSame_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();

		boolean result = CollectionUtils.allSame(collection);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allSame(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAllSame_2()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();

		boolean result = CollectionUtils.allSame(collection);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allSame(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAllSame_3()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();

		boolean result = CollectionUtils.allSame(collection);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allSame(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAllSame_4()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();

		boolean result = CollectionUtils.allSame(collection);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean any(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAny_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.any(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.anyMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:368)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:353)
		assertTrue(result);
	}

	/**
	 * Run the boolean any(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAny_2()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.any(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.anyMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:368)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:353)
		assertTrue(result);
	}

	/**
	 * Run the boolean any(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAny_3()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.any(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean any(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAny_4()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.any(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean any(T[],Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAny_5()
		throws Exception {
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.any(new Object[] {}, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.anyMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:368)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:339)
		assertTrue(result);
	}

	/**
	 * Run the boolean any(T[],Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAny_6()
		throws Exception {
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.any(new Object[] {}, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.anyMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:368)
		//       at net.sf.freecol.common.util.CollectionUtils.any(CollectionUtils.java:339)
		assertTrue(result);
	}

	/**
	 * Run the void appendToMapList(Map<K,List<T>>,K,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAppendToMapList_1()
		throws Exception {
		Map<Object, List<Object>> map = new HashMap<Object, List<Object>>();

		CollectionUtils.appendToMapList(map, null, null);

		// add additional test code here
	}

	/**
	 * Run the void appendToMapList(Map<K,List<T>>,K,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAppendToMapList_2()
		throws Exception {
		Map<Object, List<Object>> map = new HashMap<Object, List<Object>>();

		CollectionUtils.appendToMapList(map, null, null);

		// add additional test code here
	}

	/**
	 * Run the void appendToMapList(Map<K,List<T>>,K,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testAppendToMapList_3()
		throws Exception {
		Map<Object, List<Object>> map = new HashMap<Object, List<Object>>();

		CollectionUtils.appendToMapList(map, null, null);

		// add additional test code here
	}

	/**
	 * Run the boolean contains(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.contains(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.filter(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.contains(CollectionUtils.java:385)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.contains(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.filter(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.contains(CollectionUtils.java:385)
		assertTrue(result);
	}

	/**
	 * Run the Object find(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testFind_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		Object result = CollectionUtils.find(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.filter(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:444)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:420)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:407)
		assertNotNull(result);
	}

	/**
	 * Run the Object find(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testFind_2()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		Object result = CollectionUtils.find(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:444)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:431)
		assertNotNull(result);
	}

	/**
	 * Run the Object find(Collection<T>,Predicate<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testFind_3()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		Object result = CollectionUtils.find(collection, predicate, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.filter(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:444)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:420)
		assertNotNull(result);
	}

	/**
	 * Run the Object find(Stream<T>,Predicate<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testFind_4()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		Object result = CollectionUtils.find(stream, predicate, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:444)
		assertNotNull(result);
	}

	/**
	 * Run the Object find(T[],Predicate<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testFind_5()
		throws Exception {
		Predicate<Object> predicate = null;

		Object result = CollectionUtils.find(new Object[] {}, predicate, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.filter(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:444)
		//       at net.sf.freecol.common.util.CollectionUtils.find(CollectionUtils.java:396)
		assertNotNull(result);
	}

	/**
	 * Run the Iterable<List<Object>> getPermutations(List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testGetPermutations_1()
		throws Exception {
		List<Object> l = null;

		Iterable<List<Object>> result = CollectionUtils.getPermutations(l);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Iterable<List<Object>> getPermutations(List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testGetPermutations_2()
		throws Exception {
		List<Object> l = new ArrayList<Object>();

		Iterable<List<Object>> result = CollectionUtils.getPermutations(l);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int incrementMapCount(Map<K,Integer>,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testIncrementMapCount_1()
		throws Exception {
		Map<Object, Integer> map = new HashMap<Object, Integer>();

		int result = CollectionUtils.incrementMapCount(map, null);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int incrementMapCount(Map<K,Integer>,K) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testIncrementMapCount_2()
		throws Exception {
		Map<Object, Integer> map = new HashMap<Object, Integer>();

		int result = CollectionUtils.incrementMapCount(map, null);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_1()
		throws Exception {
		List<Object> one = null;
		List<Object> two = null;

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_2()
		throws Exception {
		List<Object> one = null;
		List<Object> two = new ArrayList<Object>();

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_3()
		throws Exception {
		List<Object> one = new ArrayList<Object>();
		List<Object> two = null;

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_4()
		throws Exception {
		List<Object> one = new ArrayList<Object>();
		List<Object> two = new ArrayList<Object>();

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_5()
		throws Exception {
		List<Object> one = new ArrayList<Object>();
		List<Object> two = new ArrayList<Object>();

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_6()
		throws Exception {
		List<Object> one = new ArrayList<Object>();
		List<Object> two = new ArrayList<Object>();

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_7()
		throws Exception {
		List<Object> one = new ArrayList<Object>();
		List<Object> two = new ArrayList<Object>();

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean listEquals(List<T>,List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testListEquals_8()
		throws Exception {
		List<Object> one = new ArrayList<Object>();
		List<Object> two = new ArrayList<Object>();

		boolean result = CollectionUtils.listEquals(one, two);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<Object> makeUnmodifiableList(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMakeUnmodifiableList_1()
		throws Exception {

		List<Object> result = CollectionUtils.makeUnmodifiableList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> makeUnmodifiableList(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMakeUnmodifiableList_2()
		throws Exception {

		List<Object> result = CollectionUtils.makeUnmodifiableList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Object> makeUnmodifiableSet(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMakeUnmodifiableSet_1()
		throws Exception {

		Set<Object> result = CollectionUtils.makeUnmodifiableSet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Object> makeUnmodifiableSet(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMakeUnmodifiableSet_2()
		throws Exception {

		Set<Object> result = CollectionUtils.makeUnmodifiableSet();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Stream<Object> map(Collection<T>,Function<? super T,? extends R>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMap_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Function<? extends Object, ? extends Object> mapper = null;

		Stream<Object> result = CollectionUtils.map(collection, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.map(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.map(CollectionUtils.java:468)
		assertNotNull(result);
	}

	/**
	 * Run the Stream<Object> map(T[],Function<? super T,? extends R>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMap_2()
		throws Exception {
		Function<? extends Object, ? extends Object> mapper = null;

		Stream<Object> result = CollectionUtils.map(new Object[] {}, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.ReferencePipeline.map(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.map(CollectionUtils.java:456)
		assertNotNull(result);
	}

	/**
	 * Run the List<java.util.Map.Entry<Comparable, Object>> mapEntriesByKey(Map<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMapEntriesByKey_1()
		throws Exception {
		Map<Comparable, Object> map = new HashMap<Object, Object>();

		List<java.util.Map.Entry<Comparable, Object>> result = CollectionUtils.mapEntriesByKey(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<java.util.Map.Entry<Object, Object>> mapEntriesByKey(Map<K,V>,Comparator<K>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMapEntriesByKey_2()
		throws Exception {
		Map<Object, Object> map = new HashMap<Object, Object>();
		Comparator<Object> comparator = new CacheEntryComparator();

		List<java.util.Map.Entry<Object, Object>> result = CollectionUtils.mapEntriesByKey(map, comparator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<java.util.Map.Entry<Object, Comparable>> mapEntriesByValue(Map<K,V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMapEntriesByValue_1()
		throws Exception {
		Map<Object, Comparable> map = new HashMap<Object, Object>();

		List<java.util.Map.Entry<Object, Comparable>> result = CollectionUtils.mapEntriesByValue(map);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<java.util.Map.Entry<Object, Object>> mapEntriesByValue(Map<K,V>,Comparator<V>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testMapEntriesByValue_2()
		throws Exception {
		Map<Object, Object> map = new HashMap<Object, Object>();
		Comparator<Object> comparator = new CacheEntryComparator();

		List<java.util.Map.Entry<Object, Object>> result = CollectionUtils.mapEntriesByValue(map, comparator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean none(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testNone_1()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.none(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.noneMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:373)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:358)
		assertTrue(result);
	}

	/**
	 * Run the boolean none(Collection<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testNone_2()
		throws Exception {
		Collection<Object> collection = new ArrayList<Object>();
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.none(collection, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.noneMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:373)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:358)
		assertTrue(result);
	}

	/**
	 * Run the boolean none(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testNone_3()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.none(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:373)
		assertTrue(result);
	}

	/**
	 * Run the boolean none(Stream<T>,Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testNone_4()
		throws Exception {
		Stream<Object> stream = null;
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.none(stream, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:373)
		assertTrue(result);
	}

	/**
	 * Run the boolean none(T[],Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testNone_5()
		throws Exception {
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.none(new Object[] {}, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.noneMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:373)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:343)
		assertTrue(result);
	}

	/**
	 * Run the boolean none(T[],Predicate<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testNone_6()
		throws Exception {
		Predicate<Object> predicate = null;

		boolean result = CollectionUtils.none(new Object[] {}, predicate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Objects.requireNonNull(Unknown Source)
		//       at java.util.stream.MatchOps.makeRef(Unknown Source)
		//       at java.util.stream.ReferencePipeline.noneMatch(Unknown Source)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:373)
		//       at net.sf.freecol.common.util.CollectionUtils.none(CollectionUtils.java:343)
		assertTrue(result);
	}

	/**
	 * Run the void reverse(List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testReverse_1()
		throws Exception {
		List<Object> list = new ArrayList<Object>();

		CollectionUtils.reverse(list);

		// add additional test code here
	}

	/**
	 * Run the void reverse(List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testReverse_2()
		throws Exception {
		List<Object> list = new ArrayList<Object>();

		CollectionUtils.reverse(list);

		// add additional test code here
	}

	/**
	 * Run the void reverse(List<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testReverse_3()
		throws Exception {
		List<Object> list = new ArrayList<Object>();

		CollectionUtils.reverse(list);

		// add additional test code here
	}

	/**
	 * Run the void rotate(List<T>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testRotate_1()
		throws Exception {
		List<Object> list = new ArrayList<Object>();
		int n = 1;

		CollectionUtils.rotate(list, n);

		// add additional test code here
	}

	/**
	 * Run the void rotate(List<T>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testRotate_2()
		throws Exception {
		List<Object> list = new ArrayList<Object>();
		int n = 0;

		CollectionUtils.rotate(list, n);

		// add additional test code here
	}

	/**
	 * Run the void rotate(List<T>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testRotate_3()
		throws Exception {
		List<Object> list = new ArrayList<Object>();
		int n = 1;

		CollectionUtils.rotate(list, n);

		// add additional test code here
	}

	/**
	 * Run the void rotate(List<T>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testRotate_4()
		throws Exception {
		List<Object> list = new ArrayList<Object>();
		int n = 1;

		CollectionUtils.rotate(list, n);

		// add additional test code here
	}

	/**
	 * Run the void rotate(List<T>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testRotate_5()
		throws Exception {
		List<Object> list = new ArrayList<Object>();
		int n = 1;

		CollectionUtils.rotate(list, n);

		// add additional test code here
	}

	/**
	 * Run the void rotate(List<T>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	@Test
	public void testRotate_6()
		throws Exception {
		List<Object> list = new ArrayList<Object>();
		int n = 1;

		CollectionUtils.rotate(list, n);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:40 PM
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
	 * @generatedBy CodePro at 5/14/18 4:40 PM
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
	 * @generatedBy CodePro at 5/14/18 4:40 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CollectionUtilsTest.class);
	}
}