package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FeatureContainerTest</code> contains tests for the class <code>{@link FeatureContainer}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:18 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FeatureContainerTest {
	/**
	 * Run the FeatureContainer() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testFeatureContainer_1()
		throws Exception {
		FeatureContainer result = new FeatureContainer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddAbility_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = null;

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddAbility_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddAbility_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_6()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_7()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_8()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_9()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_10()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_11()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_12()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_13()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_14()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_15()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddFeatures_16()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddModifier_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = null;

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddModifier_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testAddModifier_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testApplyModifiers_1()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = null;

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testApplyModifiers_2()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testApplyModifiers_3()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testApplyModifiers_4()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testApplyModifiers_5()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testApplyModifiers_6()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		float number = 1.0f;
		Turn turn = new Turn(1);
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		float result = fixture.applyModifiers(number, turn, id, fcgot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testClear_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testClear_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testClear_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the boolean containsAbilityKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testContainsAbilityKey_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String key = "";

		boolean result = fixture.containsAbilityKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsAbilityKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testContainsAbilityKey_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String key = "";

		boolean result = fixture.containsAbilityKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetAbilities_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = null;
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetAbilities_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = null;
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetAbilities_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetAbilities_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetAbilities_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getModifiers(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetModifiers_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = null;
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Modifier> result = fixture.getModifiers(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getModifiers(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetModifiers_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = null;
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Modifier> result = fixture.getModifiers(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getModifiers(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetModifiers_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Modifier> result = fixture.getModifiers(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getModifiers(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetModifiers_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Modifier> result = fixture.getModifiers(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getModifiers(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetModifiers_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Modifier> result = fixture.getModifiers(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testHasAbility_1()
		throws Exception {
		Set<Ability> abilitySet = new HashSet<Ability>();

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testHasAbility_2()
		throws Exception {
		Set<Ability> abilitySet = null;

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testHasAbility_3()
		throws Exception {
		Set<Ability> abilitySet = new HashSet<Ability>();

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testHasAbility_4()
		throws Exception {
		Set<Ability> abilitySet = new HashSet<Ability>();

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testHasAbility_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		boolean result = fixture.hasAbility(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAbility(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testHasAbility_6()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		boolean result = fixture.hasAbility(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the void removeAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbilities_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";

		fixture.removeAbilities(id);

		// add additional test code here
	}

	/**
	 * Run the void removeAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbilities_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";

		fixture.removeAbilities(id);

		// add additional test code here
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbility_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = null;

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbility_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbility_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbility_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveAbility_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_6()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_7()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveFeatures_8()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifier_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = null;

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifier_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifier_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifier_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifier_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void removeModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifiers_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void removeModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testRemoveModifiers_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_6()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_7()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_8()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_9()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_10()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_11()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_12()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_13()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_14()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_15()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void replaceSource(FreeColGameObjectType,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReplaceSource_16()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColGameObjectType oldSource = null;
		FreeColGameObjectType newSource = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		fixture.replaceSource(oldSource, newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[FeatureContainer]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[FeatureContainer]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[FeatureContainer]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
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
	 * @generatedBy CodePro at 5/14/18 3:18 PM
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
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FeatureContainerTest.class);
	}
}