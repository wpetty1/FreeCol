package net.sf.freecol.common.option;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import java.util.Iterator;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OptionGroupTest</code> contains tests for the class <code>{@link OptionGroup}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:46 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class OptionGroupTest {
	/**
	 * Run the OptionGroup(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testOptionGroup_1()
		throws Exception {
		String id = "";

		OptionGroup result = new OptionGroup(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ < >]", result.toString());
		assertEquals(".name", result.getName());
		assertEquals(true, result.isEditable());
		assertEquals("optionGroup", result.getXMLTagName());
		assertEquals(".shortDescription", result.getShortDescription());
		assertEquals(true, result.isNullValueOK());
		assertEquals(false, result.hasOptionGroup());
		assertEquals("", result.getGroup());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<optionGroup id=\"\" editable=\"true\"></optionGroup>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the OptionGroup(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testOptionGroup_2()
		throws Exception {
		Specification specification = new Specification();

		OptionGroup result = new OptionGroup(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null < >]", result.toString());
		assertEquals("null.name", result.getName());
		assertEquals(true, result.isEditable());
		assertEquals("optionGroup", result.getXMLTagName());
		assertEquals("null.shortDescription", result.getShortDescription());
		assertEquals(true, result.isNullValueOK());
		assertEquals(false, result.hasOptionGroup());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<optionGroup editable=\"true\"></optionGroup>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the OptionGroup(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testOptionGroup_3()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		OptionGroup result = new OptionGroup(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ < >]", result.toString());
		assertEquals(".name", result.getName());
		assertEquals(true, result.isEditable());
		assertEquals("optionGroup", result.getXMLTagName());
		assertEquals(".shortDescription", result.getShortDescription());
		assertEquals(true, result.isNullValueOK());
		assertEquals(false, result.hasOptionGroup());
		assertEquals("", result.getGroup());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<optionGroup id=\"\" editable=\"true\"></optionGroup>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the OptionGroup(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testOptionGroup_4()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		OptionGroup result = new OptionGroup(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.option.OptionGroup.<init>(OptionGroup.java:98)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testOptionGroup_5()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		OptionGroup result = new OptionGroup(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.option.OptionGroup.<init>(OptionGroup.java:98)
		assertNotNull(result);
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_4()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_5()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(false);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_6()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(false);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_7()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(false);
		fixture.isDefined = true;
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_8()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(false);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_9()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		fixture.add(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.add(OptionGroup.java:177)
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_10()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		fixture.add(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.add(OptionGroup.java:177)
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_11()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		Option option = new AbstractUnitOption(new Specification());

		fixture.add(option);

		// add additional test code here
	}

	/**
	 * Run the void add(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAdd_12()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		fixture.add(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.add(OptionGroup.java:177)
	}

	/**
	 * Run the OptionGroup clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ < [null null] >]", result.toString());
		assertEquals(".name", result.getName());
		assertEquals(true, result.isEditable());
		assertEquals("optionGroup", result.getXMLTagName());
		assertEquals(".shortDescription", result.getShortDescription());
		assertEquals(true, result.isNullValueOK());
		assertEquals(false, result.hasOptionGroup());
		assertEquals("", result.getGroup());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the boolean getBoolean(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetBoolean_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		boolean result = fixture.getBoolean(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.getBoolean(OptionGroup.java:374)
		assertTrue(result);
	}

	/**
	 * Run the int getInteger(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetInteger_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		int result = fixture.getInteger(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.getInteger(OptionGroup.java:336)
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		String result = fixture.getName();

		// add additional test code here
		assertEquals(".name", result);
	}

	/**
	 * Run the Option getOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetOption_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		Option result = fixture.getOption(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup getOptionGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetOptionGroup_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		OptionGroup result = fixture.getOptionGroup(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.getOptionGroup(OptionGroup.java:317)
		assertNotNull(result);
	}

	/**
	 * Run the List<Option> getOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetOptions_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		List<Option> result = fixture.getOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the String getShortDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetShortDescription_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		String result = fixture.getShortDescription();

		// add additional test code here
		assertEquals(".shortDescription", result);
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		String result = fixture.getString(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.getString(OptionGroup.java:412)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		String result = fixture.getText(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.getText(OptionGroup.java:450)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ < [null null] >]", result.toString());
		assertEquals(".name", result.getName());
		assertEquals(true, result.isEditable());
		assertEquals("optionGroup", result.getXMLTagName());
		assertEquals(".shortDescription", result.getShortDescription());
		assertEquals(true, result.isNullValueOK());
		assertEquals(false, result.hasOptionGroup());
		assertEquals("", result.getGroup());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = OptionGroup.getXMLElementTagName();

		// add additional test code here
		assertEquals("optionGroup", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("optionGroup", result);
	}

	/**
	 * Run the boolean hasOptionGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testHasOptionGroup_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		boolean result = fixture.hasOptionGroup();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOptionGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testHasOptionGroup_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		boolean result = fixture.hasOptionGroup();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEditable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testIsEditable_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		boolean result = fixture.isEditable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEditable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testIsEditable_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(false);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		boolean result = fixture.isEditable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNullValueOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testIsNullValueOK_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Iterator<Option> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		Iterator<Option> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		boolean result = fixture.merge(option);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(false);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		boolean result = fixture.merge(option);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_3()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new OptionGroup("");

		boolean result = fixture.merge(option);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_4()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.merge(OptionGroup.java:237)
		assertTrue(result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_5()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.merge(OptionGroup.java:237)
		assertTrue(result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_6()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.merge(OptionGroup.java:237)
		assertTrue(result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_7()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.merge(OptionGroup.java:237)
		assertTrue(result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_8()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.merge(OptionGroup.java:237)
		assertTrue(result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_9()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.merge(OptionGroup.java:237)
		assertTrue(result);
	}

	/**
	 * Run the boolean merge(Option) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testMerge_10()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		Option option = new AbstractUnitOption(new Specification());

		boolean result = fixture.merge(option);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.option.AbstractOption.readAttributes(AbstractOption.java:190)
		//       at net.sf.freecol.common.option.OptionGroup.readAttributes(OptionGroup.java:568)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.option.AbstractOption.readAttributes(AbstractOption.java:190)
		//       at net.sf.freecol.common.option.OptionGroup.readAttributes(OptionGroup.java:568)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.option.OptionGroup.readChild(OptionGroup.java:589)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.option.OptionGroup.readChild(OptionGroup.java:589)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.option.OptionGroup.readChild(OptionGroup.java:589)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.option.OptionGroup.readChild(OptionGroup.java:589)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.option.OptionGroup.readChild(OptionGroup.java:589)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.OptionGroup.readChildren(OptionGroup.java:581)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.OptionGroup.readChildren(OptionGroup.java:581)
	}

	/**
	 * Run the Option remove(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		Option result = fixture.remove(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Option remove(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";

		Option result = fixture.remove(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testRemoveAll_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;

		fixture.removeAll();

		// add additional test code here
	}

	/**
	 * Run the void setBoolean(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetBoolean_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";
		boolean value = true;

		fixture.setBoolean(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.setBoolean(OptionGroup.java:393)
	}

	/**
	 * Run the void setEditable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetEditable_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		boolean editable = true;

		fixture.setEditable(editable);

		// add additional test code here
	}

	/**
	 * Run the void setInteger(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetInteger_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";
		int value = 1;

		fixture.setInteger(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.setInteger(OptionGroup.java:355)
	}

	/**
	 * Run the void setString(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetString_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";
		String value = "";

		fixture.setString(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.setString(OptionGroup.java:431)
	}

	/**
	 * Run the void setText(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetText_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String id = "";
		String value = "";

		fixture.setText(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.OptionGroup.setText(OptionGroup.java:469)
	}

	/**
	 * Run the void setValue(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		OptionGroup value = new OptionGroup("");

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		OptionGroup value = new OptionGroup("");

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		OptionGroup value = new OptionGroup("");

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		OptionGroup value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ < [null null] >]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ < [null null] >]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.AbstractUnitOption.writeChildren(AbstractUnitOption.java:217)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1151)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1127)
		//       at net.sf.freecol.common.option.OptionGroup.writeChildren(OptionGroup.java:560)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.AbstractUnitOption.writeChildren(AbstractUnitOption.java:217)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1151)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1127)
		//       at net.sf.freecol.common.option.OptionGroup.writeChildren(OptionGroup.java:560)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.AbstractUnitOption.writeChildren(AbstractUnitOption.java:217)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1151)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1127)
		//       at net.sf.freecol.common.option.OptionGroup.writeChildren(OptionGroup.java:560)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		OptionGroup fixture = new OptionGroup("");
		fixture.setEditable(true);
		fixture.isDefined = true;
		fixture.add(new AbstractUnitOption(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.AbstractUnitOption.writeChildren(AbstractUnitOption.java:217)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1151)
		//       at net.sf.freecol.common.model.FreeColObject.toXML(FreeColObject.java:1127)
		//       at net.sf.freecol.common.option.OptionGroup.writeChildren(OptionGroup.java:560)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
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
	 * @generatedBy CodePro at 5/14/18 4:46 PM
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
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OptionGroupTest.class);
	}
}