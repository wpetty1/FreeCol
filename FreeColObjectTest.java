package net.sf.freecol.common.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.util.LogBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.client.gui.plaf.FreeColLabelUI;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * The class <code>FreeColObjectTest</code> contains tests for the class <code>{@link FreeColObject}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:21 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColObjectTest {
	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddAbility_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddAbility_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddAbility_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddFeatures_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddFeatures_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddModifier_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddModifier_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddModifier_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void addPropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddPropertyChangeListener_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void addPropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddPropertyChangeListener_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void addPropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddPropertyChangeListener_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the void addPropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testAddPropertyChangeListener_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the float applyModifiers(float,Turn,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testApplyModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		float number = 1.0f;
		Turn turn = new Turn(1);
		String id = "";

		float result = fixture.applyModifiers(number, turn, id);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testApplyModifiers_2()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FreeColObject.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testApplyModifiers_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareIds_1()
		throws Exception {
		FreeColObject fco1 = null;
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareIds_2()
		throws Exception {
		FreeColObject fco1 = null;
		FreeColObject fco2 = null;

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareIds_3()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = null;

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareIds_4()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareIds_5()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareIds_6()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean containsAbilityKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testContainsAbilityKey_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testContainsAbilityKey_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsAbilityKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsModifierKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testContainsModifierKey_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsModifierKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsModifierKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testContainsModifierKey_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsModifierKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsModifierKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testContainsModifierKey_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsModifierKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the FreeColObject copy(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.copy(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void dumpCollection(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testDumpCollection_1()
		throws Exception {
		Collection<FreeColObject> items = new ArrayList<FreeColObject>();

		FreeColObject.dumpCollection(items);

		// add additional test code here
	}

	/**
	 * Run the void dumpCollection(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testDumpCollection_2()
		throws Exception {
		Collection<FreeColObject> items = new ArrayList<FreeColObject>();

		FreeColObject.dumpCollection(items);

		// add additional test code here
	}

	/**
	 * Run the void dumpObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testDumpObject_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		fixture.dumpObject();

		// add additional test code here
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new AbstractGoods();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new AbstractGoods();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new AbstractGoods();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		int oldValue = 1;
		int newValue = 1;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		int oldValue = 1;
		int newValue = 1;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		boolean oldValue = true;
		boolean newValue = true;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		boolean oldValue = true;
		boolean newValue = true;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(PropertyChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "", new Object(), new Object());

		fixture.firePropertyChange(event);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(PropertyChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "", new Object(), new Object());

		fixture.firePropertyChange(event);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int oldValue = 1;
		int newValue = 1;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int oldValue = 1;
		int newValue = 1;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		boolean oldValue = true;
		boolean newValue = true;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testFirePropertyChange_8()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		boolean oldValue = true;
		boolean newValue = true;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the Set<Ability> getAbilities() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetAbilities_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Set<Ability> result = fixture.getAbilities();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Ability> getAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetAbilities_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		Set<Ability> result = fixture.getAbilities(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetAbilities_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		Set<Ability> result = fixture.getAbilities(id, fcgot);

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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetAbilities_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetAbilities_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * Run the Set<Modifier> getDefenceModifiers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetDefenceModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Set<Modifier> result = fixture.getDefenceModifiers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FeatureContainer getFeatureContainer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetFeatureContainer_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		FeatureContainer result = fixture.getFeatureContainer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdNumber_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdNumber_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdNumber_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdNumber_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the String getIdType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdType_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getIdType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getIdType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdType_2()
		throws Exception {
		String id = "";

		String result = FreeColObject.getIdType(id);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIdType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdType_3()
		throws Exception {
		String id = "";

		String result = FreeColObject.getIdType(id);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIdType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetIdType_4()
		throws Exception {
		String id = null;

		String result = FreeColObject.getIdType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Set<Modifier> getModifiers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Set<Modifier> result = fixture.getModifiers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetModifiers_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		Set<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Modifier> getModifiers(String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetModifiers_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		Set<Modifier> result = fixture.getModifiers(id, fcgot);

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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetModifiers_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetModifiers_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * Run the PropertyChangeListener[] getPropertyChangeListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners(propertyName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners(propertyName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the List<Ability> getSortedAbilities() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSortedAbilities_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		List<Ability> result = fixture.getSortedAbilities();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<FreeColObject> getSortedCopy(Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSortedCopy_1()
		throws Exception {
		Collection<FreeColObject> c = new ArrayList<FreeColObject>();

		List<FreeColObject> result = FreeColObject.getSortedCopy(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Modifier> getSortedModifiers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSortedModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		List<Modifier> result = fixture.getSortedModifiers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Specification getSpecification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSpecification_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Specification result = fixture.getSpecification();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSuffix_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getSuffix();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSuffix_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getSuffix();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSuffix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSuffix_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String prefix = "";

		String result = fixture.getSuffix(prefix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.FreeColObject.getSuffix(FreeColObject.java:130)
		assertNotNull(result);
	}

	/**
	 * Run the String getSuffix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetSuffix_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String prefix = "";

		String result = fixture.getSuffix(prefix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.FreeColObject.getSuffix(FreeColObject.java:130)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = FreeColObject.getXMLElementTagName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean hasAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasAbility_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasAbility(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasAbility_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasAbility(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasAbility_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		boolean result = fixture.hasAbility(id, fcgot);

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
	 * Run the boolean hasAbility(String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasAbility_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		boolean result = fixture.hasAbility(id, fcgot);

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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasAbility_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasAbility_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * Run the boolean hasListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasListeners_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		boolean result = fixture.hasListeners(propertyName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasListeners_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		boolean result = fixture.hasListeners(propertyName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasListeners_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		boolean result = fixture.hasListeners(propertyName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasModifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasModifier_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasModifier(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasModifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasModifier_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasModifier(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasModifier(String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasModifier_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		boolean result = fixture.hasModifier(id, fcgot);

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
	 * Run the boolean hasModifier(String,FreeColGameObjectType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasModifier_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());

		boolean result = fixture.hasModifier(id, fcgot);

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
	 * Run the boolean hasModifier(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasModifier_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		boolean result = fixture.hasModifier(id, fcgot, turn);

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
	 * Run the boolean hasModifier(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHasModifier_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		boolean result = fixture.hasModifier(id, fcgot, turn);

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
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(30752, result);
	}

	/**
	 * Run the void internId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInternId_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String newId = "";

		fixture.internId(newId);

		// add additional test code here
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_8()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = null;
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invokeMethod(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testInvokeMethod_9()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String methodName = "";
		Class<Object> returnClass = Object.class;

		Object result = fixture.invokeMethod(methodName, returnClass, Europe.ABILITY_DRESS_MISSIONARY);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void logFreeColObjects(Collection<T>,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testLogFreeColObjects_1()
		throws Exception {
		Collection<FreeColObject> c = new ArrayList<FreeColObject>();
		LogBuilder lb = new LogBuilder(1);

		FreeColObject.logFreeColObjects(c, lb);

		// add additional test code here
	}

	/**
	 * Run the void logFreeColObjects(Collection<T>,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testLogFreeColObjects_2()
		throws Exception {
		Collection<FreeColObject> c = new ArrayList<FreeColObject>();
		LogBuilder lb = new LogBuilder(1);

		FreeColObject.logFreeColObjects(c, lb);

		// add additional test code here
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractGoods.readAttributes(AbstractGoods.java:293)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractGoods.readAttributes(AbstractGoods.java:293)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractGoods.readAttributes(AbstractGoods.java:293)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChild(FreeColObject.java:1305)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXML_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXML_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXML_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXML_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXML_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXML_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
	}

	/**
	 * Run the void readFromXMLElement(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLElement_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Element element = new IIOMetadataNode();

		fixture.readFromXMLElement(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
	}

	/**
	 * Run the void readFromXMLElement(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLElement_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Element element = new IIOMetadataNode();

		fixture.readFromXMLElement(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
	}

	/**
	 * Run the void readFromXMLPartial(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLPartial_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXMLPartial(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLPartial(FreeColObject.java:1323)
	}

	/**
	 * Run the void readFromXMLPartial(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLPartial_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXMLPartial(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLPartial(FreeColObject.java:1323)
	}

	/**
	 * Run the void readFromXMLPartial(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLPartial_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXMLPartial(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLPartial(FreeColObject.java:1323)
	}

	/**
	 * Run the void readFromXMLPartial(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLPartial_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXMLPartial(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLPartial(FreeColObject.java:1323)
	}

	/**
	 * Run the void readFromXMLPartial(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLPartial_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXMLPartial(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLPartial(FreeColObject.java:1323)
	}

	/**
	 * Run the void readFromXMLPartial(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadFromXMLPartial_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXMLPartial(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLPartial(FreeColObject.java:1323)
	}

	/**
	 * Run the String readId(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadId_1()
		throws Exception {
		Element element = new IIOMetadataNode();

		String result = FreeColObject.readId(element);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String readId(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testReadId_2()
		throws Exception {
		Element element = new IIOMetadataNode();

		String result = FreeColObject.readId(element);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void removeAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveAbilities_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeAbilities(id);

		// add additional test code here
	}

	/**
	 * Run the void removeAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveAbilities_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeAbilities(id);

		// add additional test code here
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveAbility_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveAbility_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveFeatures_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveFeatures_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveModifier_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveModifier_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void removeModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemoveModifiers_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the boolean save(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");

		boolean result = fixture.save(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1000)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:988)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");

		boolean result = fixture.save(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1000)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:988)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");

		boolean result = fixture.save(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1000)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:988)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File,WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		boolean result = fixture.save(file, scope);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1000)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File,WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		boolean result = fixture.save(file, scope);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1000)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File,WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		boolean result = fixture.save(file, scope);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1000)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(file, scope, pretty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_8()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(file, scope, pretty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(File,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_9()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		File file = new File("");
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(file, scope, pretty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.save(FreeColObject.java:1014)
		assertTrue(result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_10()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_11()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_12()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_13()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSave_14()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String serialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSerialize_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.serialize();

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the String serialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSerialize_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.serialize();

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the String serialize(WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSerialize_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		String result = fixture.serialize(scope);

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the String serialize(WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSerialize_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		String result = fixture.serialize(scope);

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String newId = "";

		fixture.setId(newId);

		// add additional test code here
	}

	/**
	 * Run the void setSpecification(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testSetSpecification_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Specification specification = new Specification();

		fixture.setSpecification(specification);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0 (null)", result);
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXML_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLElement_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.FreeColObject.toXMLElement(FreeColObject.java:863)
		//       at net.sf.freecol.common.model.FreeColObject.toXMLElement(FreeColObject.java:809)
		//       at net.sf.freecol.common.model.FreeColObject.toXMLElement(FreeColObject.java:770)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document,WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLElement_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope writeScope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		Element result = fixture.toXMLElement(document, writeScope);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Invalid write scope: CLIENT
		//       at net.sf.freecol.common.model.FreeColObject.toXMLElement(FreeColObject.java:806)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document,WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testToXMLElement_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope writeScope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		Element result = fixture.toXMLElement(document, writeScope);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLElement_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Element result = fixture.toXMLElement(document, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testToXMLElement_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;
		Player player = null;

		Element result = fixture.toXMLElement(document, player);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElementPartial(Document,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLElementPartial_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;

		Element result = fixture.toXMLElementPartial(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Parse fail
		//       at net.sf.freecol.common.model.FreeColObject.toXMLElement(FreeColObject.java:865)
		//       at net.sf.freecol.common.model.FreeColObject.toXMLElementPartial(FreeColObject.java:821)
		assertNotNull(result);
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testToXMLPartial_8()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:21 PM
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
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
	 * @generatedBy CodePro at 5/14/18 3:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColObjectTest.class);
	}
}