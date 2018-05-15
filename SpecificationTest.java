package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.option.StringOption;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.option.AbstractOption;
import net.sf.freecol.common.option.AbstractUnitOption;
import net.sf.freecol.common.option.BooleanOption;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.option.Option;
import java.util.ArrayList;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.option.RangeOption;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.option.IntegerOption;
import org.junit.*;
import net.sf.freecol.common.io.FreeColModFile;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.option.OptionGroup;

/**
 * The class <code>SpecificationTest</code> contains tests for the class <code>{@link Specification}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:25 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class SpecificationTest {
	/**
	 * Run the Specification() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSpecification_1()
		throws Exception {

		Specification result = new Specification();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getDifficultyOptionGroup());
		assertEquals(null, result.getDefaultNationType());
		assertEquals(null, result.getFastestLandUnitType());
		assertEquals(null, result.getFastestNavalUnitType());
		assertEquals(null, result.getMissionaryRole());
		assertEquals(null, result.getDifficultyLevel());
		assertEquals(null, result.getScoutRole());
		assertEquals(null, result.getPioneerRole());
	}

	/**
	 * Run the Specification() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSpecification_2()
		throws Exception {

		Specification result = new Specification();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getDifficultyOptionGroup());
		assertEquals(null, result.getDefaultNationType());
		assertEquals(null, result.getFastestLandUnitType());
		assertEquals(null, result.getFastestNavalUnitType());
		assertEquals(null, result.getMissionaryRole());
		assertEquals(null, result.getDifficultyLevel());
		assertEquals(null, result.getScoutRole());
		assertEquals(null, result.getPioneerRole());
	}

	/**
	 * Run the Specification(InputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSpecification_3()
		throws Exception {
		InputStream in = new ByteArrayInputStream("".getBytes());

		Specification result = new Specification(in);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Load specification stream error
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:371)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:353)
		assertNotNull(result);
	}

	/**
	 * Run the Specification(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSpecification_4()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Specification result = new Specification(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Error parsing specification
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:340)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:324)
		assertNotNull(result);
	}

	/**
	 * Run the void addAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		fixture.addAbility(id);

		// add additional test code here
	}

	/**
	 * Run the void addAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddAbility_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		fixture.addAbility(id);

		// add additional test code here
	}

	/**
	 * Run the void addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddAbility_3()
		throws Exception {
		Specification fixture = new Specification();
		Ability ability = new Ability("");

		fixture.addAbility(ability);

		// add additional test code here
	}

	/**
	 * Run the void addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddModifier_1()
		throws Exception {
		Specification fixture = new Specification();
		Modifier modifier = new Modifier(new Specification());

		fixture.addModifier(modifier);

		// add additional test code here
	}

	/**
	 * Run the void addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddModifier_2()
		throws Exception {
		Specification fixture = new Specification();
		Modifier modifier = new Modifier(new Specification());

		fixture.addModifier(modifier);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddOptionGroup_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = true;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddOptionGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = true;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddOptionGroup_3()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = false;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddOptionGroup_4()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = true;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void applyDifficultyLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testApplyDifficultyLevel_1()
		throws Exception {
		Specification fixture = new Specification();
		String difficulty = "";

		fixture.applyDifficultyLevel(difficulty);

		// add additional test code here
	}

	/**
	 * Run the void applyDifficultyLevel(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testApplyDifficultyLevel_2()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup level = null;

		fixture.applyDifficultyLevel(level);

		// add additional test code here
	}

	/**
	 * Run the void applyDifficultyLevel(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testApplyDifficultyLevel_3()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup level = new OptionGroup("");

		fixture.applyDifficultyLevel(level);

		// add additional test code here
	}

	/**
	 * Run the void clearEuropeanNationalAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testClearEuropeanNationalAdvantages_1()
		throws Exception {
		Specification fixture = new Specification();

		fixture.clearEuropeanNationalAdvantages();

		// add additional test code here
	}

	/**
	 * Run the void clearEuropeanNationalAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testClearEuropeanNationalAdvantages_2()
		throws Exception {
		Specification fixture = new Specification();

		fixture.clearEuropeanNationalAdvantages();

		// add additional test code here
	}

	/**
	 * Run the void disableEditing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testDisableEditing_1()
		throws Exception {
		Specification fixture = new Specification();

		fixture.disableEditing();

		// add additional test code here
	}

	/**
	 * Run the void disableEditing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testDisableEditing_2()
		throws Exception {
		Specification fixture = new Specification();

		fixture.disableEditing();

		// add additional test code here
	}

	/**
	 * Run the void disableEditing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testDisableEditing_3()
		throws Exception {
		Specification fixture = new Specification();

		fixture.disableEditing();

		// add additional test code here
	}

	/**
	 * Run the FreeColGameObjectType findType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testFindType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		FreeColGameObjectType result = fixture.findType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType findType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testFindType_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		FreeColGameObjectType result = fixture.findType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType findType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testFindType_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = null;

		FreeColGameObjectType result = fixture.findType(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean fixGameOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testFixGameOptions_1()
		throws Exception {
		Specification fixture = new Specification();

		boolean result = fixture.fixGameOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		assertTrue(result);
	}

	/**
	 * Run the boolean fixGameOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testFixGameOptions_2()
		throws Exception {
		Specification fixture = new Specification();

		boolean result = fixture.fixGameOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		assertTrue(result);
	}

	/**
	 * Run the boolean fixMapGeneratorOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testFixMapGeneratorOptions_1()
		throws Exception {
		Specification fixture = new Specification();

		boolean result = fixture.fixMapGeneratorOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: mapGeneratorOptions.terrainGenerator
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkIntegerOption(Specification.java:2707)
		//       at net.sf.freecol.common.model.Specification.fixMapGeneratorOptions(Specification.java:2673)
		assertTrue(result);
	}

	/**
	 * Run the boolean fixMapGeneratorOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testFixMapGeneratorOptions_2()
		throws Exception {
		Specification fixture = new Specification();

		boolean result = fixture.fixMapGeneratorOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: mapGeneratorOptions.terrainGenerator
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkIntegerOption(Specification.java:2707)
		//       at net.sf.freecol.common.model.Specification.fixMapGeneratorOptions(Specification.java:2673)
		assertTrue(result);
	}

	/**
	 * Run the void generateDynamicOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGenerateDynamicOptions_1()
		throws Exception {
		Specification fixture = new Specification();

		fixture.generateDynamicOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		//       at net.sf.freecol.common.model.Specification.generateDynamicOptions(Specification.java:770)
	}

	/**
	 * Run the void generateDynamicOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGenerateDynamicOptions_2()
		throws Exception {
		Specification fixture = new Specification();

		fixture.generateDynamicOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		//       at net.sf.freecol.common.model.Specification.generateDynamicOptions(Specification.java:770)
	}

	/**
	 * Run the void generateDynamicOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGenerateDynamicOptions_3()
		throws Exception {
		Specification fixture = new Specification();

		fixture.generateDynamicOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		//       at net.sf.freecol.common.model.Specification.generateDynamicOptions(Specification.java:770)
	}

	/**
	 * Run the void generateDynamicOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGenerateDynamicOptions_4()
		throws Exception {
		Specification fixture = new Specification();

		fixture.generateDynamicOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		//       at net.sf.freecol.common.model.Specification.generateDynamicOptions(Specification.java:770)
	}

	/**
	 * Run the void generateDynamicOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGenerateDynamicOptions_5()
		throws Exception {
		Specification fixture = new Specification();

		fixture.generateDynamicOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		//       at net.sf.freecol.common.model.Specification.generateDynamicOptions(Specification.java:770)
	}

	/**
	 * Run the void generateDynamicOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGenerateDynamicOptions_6()
		throws Exception {
		Specification fixture = new Specification();

		fixture.generateDynamicOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		//       at net.sf.freecol.common.model.Specification.generateDynamicOptions(Specification.java:770)
	}

	/**
	 * Run the List<Ability> getAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetAbilities_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		List<Ability> result = fixture.getAbilities(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetAge_1()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetAge_2()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetAge_3()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetAge_4()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the boolean getBoolean(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetBoolean_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		boolean result = fixture.getBoolean(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getBooleanOption(Specification.java:1070)
		//       at net.sf.freecol.common.model.Specification.getBoolean(Specification.java:1095)
		assertTrue(result);
	}

	/**
	 * Run the BooleanOption getBooleanOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetBooleanOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		BooleanOption result = fixture.getBooleanOption(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getBooleanOption(Specification.java:1070)
		assertNotNull(result);
	}

	/**
	 * Run the BooleanOption getBooleanOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetBooleanOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		BooleanOption result = fixture.getBooleanOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<UnitType> getBuildableUnitTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetBuildableUnitTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getBuildableUnitTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the BuildingType getBuildingType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetBuildingType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		BuildingType result = fixture.getBuildingType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(800, result.getPriority());
		assertEquals(1, result.getLevel());
		assertEquals(null, result.getProducedGoodsType());
		assertEquals("building-type", result.getXMLTagName());
		assertEquals(true, result.isAutomaticBuild());
		assertEquals(null, result.getUpgradesFrom());
		assertEquals(3, result.getWorkPlaces());
		assertEquals(null, result.getUpgradesTo());
		assertEquals(false, result.isDefenceType());
		assertEquals(0, result.getUpkeep());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<building-type id=\"\" workplaces=\"3\"></building-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<BuildingType> getBuildingTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetBuildingTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<BuildingType> result = fixture.getBuildingTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the NationType getDefaultNationType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultNationType_1()
		throws Exception {
		Specification fixture = new Specification();

		NationType result = fixture.getDefaultNationType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Role getDefaultRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getDefaultRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.isOffensive());
		assertEquals("role", result.getXMLTagName());
		assertEquals("default", result.getRoleSuffix());
		assertEquals("[Role default]", result.toFullString());
		assertEquals(null, result.getDowngrade());
		assertEquals(null, result.getExpertUnit());
		assertEquals(false, result.isDefensive());
		assertEquals(true, result.isDefaultRole());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.role.default", result.toString());
		assertEquals("model.role.default.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.role.default.name", result.getNameKey());
		assertEquals("model.role.default", result.getId());
		assertEquals("default", result.getSuffix());
		assertEquals("<role id=\"model.role.default\"></role>", result.serialize());
		assertEquals("model.role.default", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getDefaultUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_1()
		throws Exception {
		Specification fixture = new Specification();

		UnitType result = fixture.getDefaultUnitType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("model.unit.freeColonist", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_2()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = new EuropeanNationType("", new Specification());

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("model.unit.freeColonist", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_3()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = new EuropeanNationType("", new Specification());

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("model.unit.freeColonist", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_4()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = new EuropeanNationType("", new Specification());

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("model.unit.freeColonist", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_5()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = null;

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("model.unit.freeColonist", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getDefaultUnitType(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_6()
		throws Exception {
		Specification fixture = new Specification();
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setNationType(new EuropeanNationType("", new Specification()));

		UnitType result = fixture.getDefaultUnitType(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitType getDefaultUnitType(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultUnitType_7()
		throws Exception {
		Specification fixture = new Specification();
		Player player = null;

		UnitType result = fixture.getDefaultUnitType(player);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("model.unit.freeColonist", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the String getDifficultyLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyLevel_1()
		throws Exception {
		Specification fixture = new Specification();

		String result = fixture.getDifficultyLevel();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyLevels_1()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyLevels_2()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyLevels_3()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyLevels_4()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the OptionGroup getDifficultyOptionGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyOptionGroup_1()
		throws Exception {
		Specification fixture = new Specification();

		OptionGroup result = fixture.getDifficultyOptionGroup();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup getDifficultyOptionGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDifficultyOptionGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		OptionGroup result = fixture.getDifficultyOptionGroup(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Disaster getDisaster(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDisaster_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Disaster result = fixture.getDisaster(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[]", result.toString());
		assertEquals("disaster", result.getXMLTagName());
		assertEquals(false, result.isNatural());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<disaster id=\"\" natural=\"false\" effects=\"one\"></disaster>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<Disaster> getDisasters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDisasters_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Disaster> result = fixture.getDisasters();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EquipmentType getEquipmentType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetEquipmentType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		EquipmentType result = fixture.getEquipmentType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRole());
		assertEquals(1, result.getMaximumCount());
		assertEquals(-1, result.getCombatLossPriority());
		assertEquals(false, result.isMilitaryEquipment());
		assertEquals("equipment-type", result.getXMLTagName());
		assertEquals(false, result.canBeCaptured());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<equipment-type id=\"\" maximum-count=\"1\" combat-loss-priority=\"-1\"></equipment-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<EuropeanNationType> getEuropeanNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetEuropeanNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<EuropeanNationType> result = fixture.getEuropeanNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getEuropeanNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetEuropeanNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getEuropeanNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Event getEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetEvent_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Event result = fixture.getEvent(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals("event", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<event id=\"\"></event>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<Event> getEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetEvents_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Event> result = fixture.getEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitType getExpertForProducing(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetExpertForProducing_1()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		UnitType result = fixture.getExpertForProducing(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getFarmedGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetFarmedGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getFarmedGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitType getFastestLandUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetFastestLandUnitType_1()
		throws Exception {
		Specification fixture = new Specification();

		UnitType result = fixture.getFastestLandUnitType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the UnitType getFastestNavalUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetFastestNavalUnitType_1()
		throws Exception {
		Specification fixture = new Specification();

		UnitType result = fixture.getFastestNavalUnitType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getFoodGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetFoodGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getFoodGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FoundingFather getFoundingFather(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetFoundingFather_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		FoundingFather result = fixture.getFoundingFather(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals("founding-father", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<FoundingFather> getFoundingFathers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetFoundingFathers_1()
		throws Exception {
		Specification fixture = new Specification();

		List<FoundingFather> result = fixture.getFoundingFathers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the OptionGroup getGameOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetGameOptions_1()
		throws Exception {
		Specification fixture = new Specification();

		OptionGroup result = fixture.getGameOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1698)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getGameOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetGameOptions_2()
		throws Exception {
		Specification fixture = new Specification();

		OptionGroup result = fixture.getGameOptions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GoodsType getGoodsType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetGoodsType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		GoodsType result = fixture.getGoodsType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isFarmed());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isStorable());
		assertEquals(Integer.MAX_VALUE, result.getPrice());
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRawMaterial());
		assertEquals(null, result.getInputType());
		assertEquals(false, result.isBreedable());
		assertEquals(false, result.limitIgnored());
		assertEquals(false, result.isStoredAs());
		assertEquals(false, result.isTradeGoods());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isRefined());
		assertEquals(0, result.getInitialAmount());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods-type id=\"\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<GoodsType> getGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Specification fixture = new Specification();

		String result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getImmigrationGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetImmigrationGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getImmigrationGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<IndianNationType> getIndianNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetIndianNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<IndianNationType> result = fixture.getIndianNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getIndianNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetIndianNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getIndianNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getInitialPrice(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetInitialPrice_1()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getInitialPrice(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialPrice(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetInitialPrice_2()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getInitialPrice(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialPrice(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetInitialPrice_3()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getInitialPrice(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInteger(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetInteger_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		int result = fixture.getInteger(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getIntegerOption(Specification.java:1050)
		//       at net.sf.freecol.common.model.Specification.getInteger(Specification.java:1113)
		assertEquals(0, result);
	}

	/**
	 * Run the IntegerOption getIntegerOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetIntegerOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		IntegerOption result = fixture.getIntegerOption(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getIntegerOption(Specification.java:1050)
		assertNotNull(result);
	}

	/**
	 * Run the IntegerOption getIntegerOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetIntegerOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		IntegerOption result = fixture.getIntegerOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<GoodsType> getLibertyGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetLibertyGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getLibertyGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the OptionGroup getMapGeneratorOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetMapGeneratorOptions_1()
		throws Exception {
		Specification fixture = new Specification();

		OptionGroup result = fixture.getMapGeneratorOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: mapGeneratorOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.getMapGeneratorOptions(Specification.java:1707)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getMapGeneratorOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetMapGeneratorOptions_2()
		throws Exception {
		Specification fixture = new Specification();

		OptionGroup result = fixture.getMapGeneratorOptions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Role> getMilitaryRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetMilitaryRoles_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Role> result = fixture.getMilitaryRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getMilitaryRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetMilitaryRoles_2()
		throws Exception {
		Specification fixture = new Specification();

		List<Role> result = fixture.getMilitaryRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getMissionaryRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetMissionaryRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getMissionaryRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetModifiers_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		List<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetModifiers_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		List<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Nation getNation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetNation_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Nation result = fixture.getNation(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getColor());
		assertEquals(0, result.getPreferredLatitude());
		assertEquals(null, result.forceDefaultColor());
		assertEquals(true, result.startsOnEastCoast());
		assertEquals(false, result.isSelectable());
		assertEquals(false, result.isUnknownEnemy());
		assertEquals("nation", result.getXMLTagName());
		assertEquals(null, result.getREFNation());
		assertEquals(".ruler", result.getRulerNameKey());
		assertEquals(".ruler", result.getRulerName());
		assertEquals(null, result.getRebelNation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<nation id=\"\" selectable=\"false\" preferred-latitude=\"0\" starts-on-east-coast=\"true\"></nation>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationType getNationType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetNationType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		NationType result = fixture.getNationType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<NationType> getNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<NationType> result = fixture.getNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GoodsType> getNewWorldGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetNewWorldGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getNewWorldGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GoodsType> getNewWorldLuxuryGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetNewWorldLuxuryGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getNewWorldLuxuryGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the AbstractOption getOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = null;

		AbstractOption result = fixture.getOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption getOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		AbstractOption result = fixture.getOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption getOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetOption_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		AbstractOption result = fixture.getOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getOptionGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetOptionGroup_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = null;

		OptionGroup result = fixture.getOptionGroup(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getOptionGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetOptionGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		OptionGroup result = fixture.getOptionGroup(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getOptionGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetOptionGroup_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		OptionGroup result = fixture.getOptionGroup(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Role getPioneerRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetPioneerRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getPioneerRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getPrimaryFoodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetPrimaryFoodType_1()
		throws Exception {
		Specification fixture = new Specification();

		GoodsType result = fixture.getPrimaryFoodType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isFarmed());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isStorable());
		assertEquals(Integer.MAX_VALUE, result.getPrice());
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRawMaterial());
		assertEquals(null, result.getInputType());
		assertEquals(false, result.isBreedable());
		assertEquals(false, result.limitIgnored());
		assertEquals(false, result.isStoredAs());
		assertEquals(false, result.isTradeGoods());
		assertEquals("model.goods.food.workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isRefined());
		assertEquals(0, result.getInitialAmount());
		assertEquals("model.goods.food", result.toString());
		assertEquals("model.goods.food.description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.goods.food.name", result.getNameKey());
		assertEquals("model.goods.food", result.getId());
		assertEquals("food", result.getSuffix());
		assertEquals("<goods-type id=\"model.goods.food\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals("model.goods.food", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<EuropeanNationType> getREFNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetREFNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<EuropeanNationType> result = fixture.getREFNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getREFNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetREFNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getREFNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getREFRoles(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetREFRoles_1()
		throws Exception {
		Specification fixture = new Specification();
		boolean naval = false;

		List<Role> result = fixture.getREFRoles(naval);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getREFRoles(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetREFRoles_2()
		throws Exception {
		Specification fixture = new Specification();
		boolean naval = true;

		List<Role> result = fixture.getREFRoles(naval);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<UnitType> getREFUnitTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetREFUnitTypes_1()
		throws Exception {
		Specification fixture = new Specification();
		boolean naval = true;

		List<UnitType> result = fixture.getREFUnitTypes(naval);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the RangeOption getRangeOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetRangeOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		RangeOption result = fixture.getRangeOption(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getRangeOption(Specification.java:1060)
		assertNotNull(result);
	}

	/**
	 * Run the RangeOption getRangeOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetRangeOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		RangeOption result = fixture.getRangeOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<GoodsType> getRawBuildingGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetRawBuildingGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getRawBuildingGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ResourceType getResourceType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetResourceType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		ResourceType result = fixture.getResourceType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getMaxValue());
		assertEquals(0, result.getMinValue());
		assertEquals("resource-type", result.getXMLTagName());
		assertEquals(null, result.getBestGoodsType());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<resource-type id=\"\" maximum-value=\"0\" minimum-value=\"0\"></resource-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<ResourceType> getResourceTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetResourceTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<ResourceType> result = fixture.getResourceTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Role result = fixture.getRole(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.isOffensive());
		assertEquals("role", result.getXMLTagName());
		assertEquals("", result.getRoleSuffix());
		assertEquals("[Role ]", result.toFullString());
		assertEquals(null, result.getDowngrade());
		assertEquals(null, result.getExpertUnit());
		assertEquals(false, result.isDefensive());
		assertEquals(false, result.isDefaultRole());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<role id=\"\"></role>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the Role getRoleWithAbility(String,List<Role>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetRoleWithAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		List<Role> roles = new ArrayList<Role>();

		Role result = fixture.getRoleWithAbility(id, roles);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Role> getRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetRoles_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Role> result = fixture.getRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getScoutRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetScoutRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getScoutRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getStorableGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetStorableGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getStorableGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		String result = fixture.getString(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		assertNotNull(result);
	}

	/**
	 * Run the StringOption getStringOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetStringOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		StringOption result = fixture.getStringOption(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: 
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		assertNotNull(result);
	}

	/**
	 * Run the StringOption getStringOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetStringOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		StringOption result = fixture.getStringOption(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovementType getTileImprovementType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTileImprovementType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		TileImprovementType result = fixture.getTileImprovementType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getExposeResourcePercent());
		assertEquals(0, result.getExpendedAmount());
		assertEquals(null, result.getRequiredImprovementType());
		assertEquals(0, result.getZIndex());
		assertEquals("tile-improvement-type", result.getXMLTagName());
		assertEquals(false, result.isNatural());
		assertEquals(false, result.isChangeType());
		assertEquals(0, result.getMagnitude());
		assertEquals(0, result.getAddWorkTurns());
		assertEquals(null, result.getRequiredRole());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<tile-improvement-type id=\"\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<TileImprovementType> getTileImprovementTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTileImprovementTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<TileImprovementType> result = fixture.getTileImprovementTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the TileType getTileType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTileType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		TileType result = fixture.getTileType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getIndex());
		assertEquals(false, result.isDirectlyHighSeasConnected());
		assertEquals(0, result.getBasicWorkTurns());
		assertEquals(false, result.isHighSeasConnected());
		assertEquals(false, result.isElevation());
		assertEquals(false, result.isForested());
		assertEquals("tile-type", result.getXMLTagName());
		assertEquals(false, result.canSettle());
		assertEquals(false, result.isWater());
		assertEquals(0, result.getBasicMoveCost());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<tile-type id=\"\" basic-move-cost=\"0\" basic-work-turns=\"0\" is-forest=\"false\" is-water=\"false\" is-elevation=\"false\" is-connected=\"false\" can-settle=\"false\"><gen humidity-minimum=\"0\" humidity-maximum=\"0\" temperature-minimum=\"0\" temperature-maximum=\"0\" altitude-minimum=\"0\" altitude-maximum=\"0\"></gen></tile-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<TileType> getTileTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTileTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<TileType> result = fixture.getTileTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_4()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_5()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_6()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_7()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_8()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_9()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetType_10()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesProviding(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTypesProviding_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		boolean value = true;

		List<FreeColGameObjectType> result = fixture.getTypesProviding(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Specification.getTypesProviding(Specification.java:1825)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesProviding(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTypesProviding_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		boolean value = true;

		List<FreeColGameObjectType> result = fixture.getTypesProviding(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Specification.getTypesProviding(Specification.java:1825)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesProviding(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTypesProviding_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		boolean value = true;

		List<FreeColGameObjectType> result = fixture.getTypesProviding(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Specification.getTypesProviding(Specification.java:1825)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesProviding(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTypesProviding_4()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		boolean value = true;

		List<FreeColGameObjectType> result = fixture.getTypesProviding(id, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Specification.getTypesProviding(Specification.java:1825)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesWithAbility(Class<T>,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTypesWithAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		Class<FreeColGameObjectType> resultType = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.getTypesWithAbility(resultType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesWithoutAbility(Class<T>,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTypesWithoutAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		Class<FreeColGameObjectType> resultType = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.getTypesWithoutAbility(resultType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(13, result.size());
	}

	/**
	 * Run the UnitType getUnitType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetUnitType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		UnitType result = fixture.getUnitType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isPerson());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isRecruitable());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<unit-type id=\"\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<UnitType> getUnitTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetUnitTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesPurchasedInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetUnitTypesPurchasedInEurope_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesPurchasedInEurope();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesTrainedInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetUnitTypesTrainedInEurope_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesTrainedInEurope();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesWithAbility(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetUnitTypesWithAbility_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesWithAbility();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesWithoutAbility(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetUnitTypesWithoutAbility_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesWithoutAbility();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		Specification fixture = new Specification();

		String result = fixture.getVersion();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Specification.getXMLElementTagName();

		// add additional test code here
		assertEquals("freecol-specification", result);
	}

	/**
	 * Run the boolean hasOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHasOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		boolean result = fixture.hasOption(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHasOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = null;

		boolean result = fixture.hasOption(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHasOption_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		boolean result = fixture.hasOption(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadMods_1()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadMods_2()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadMods_3()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadMods_4()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadOptionsFile_1()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadOptionsFile_2()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadOptionsFile_3()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadOptionsFile_4()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLoadOptionsFile_5()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testMergeGroup_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testMergeGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testMergeGroup_3()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");
		group.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testMergeGroup_4()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");
		group.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testMergeGroup_5()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");
		group.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void prepare(Advantages,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testPrepare_1()
		throws Exception {
		Specification fixture = new Specification();
		NationOptions.Advantages advantages = NationOptions.Advantages.FIXED;
		String difficulty = "";

		fixture.prepare(advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		//       at net.sf.freecol.common.model.Specification.applyFixes(Specification.java:1878)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:393)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:382)
	}

	/**
	 * Run the void prepare(Advantages,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testPrepare_2()
		throws Exception {
		Specification fixture = new Specification();
		NationOptions.Advantages advantages = NationOptions.Advantages.FIXED;
		String difficulty = null;

		fixture.prepare(advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		//       at net.sf.freecol.common.model.Specification.applyFixes(Specification.java:1878)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:393)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:382)
	}

	/**
	 * Run the void prepare(Advantages,OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testPrepare_3()
		throws Exception {
		Specification fixture = new Specification();
		NationOptions.Advantages advantages = NationOptions.Advantages.FIXED;
		OptionGroup difficulty = new OptionGroup("");

		fixture.prepare(advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		//       at net.sf.freecol.common.model.Specification.applyFixes(Specification.java:1878)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:393)
	}

	/**
	 * Run the void prepare(Advantages,OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testPrepare_4()
		throws Exception {
		Specification fixture = new Specification();
		NationOptions.Advantages advantages = NationOptions.Advantages.FIXED;
		OptionGroup difficulty = new OptionGroup("");

		fixture.prepare(advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		//       at net.sf.freecol.common.model.Specification.applyFixes(Specification.java:1878)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:393)
	}

	/**
	 * Run the void prepare(Advantages,OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testPrepare_5()
		throws Exception {
		Specification fixture = new Specification();
		NationOptions.Advantages advantages = NationOptions.Advantages.FIXED;
		OptionGroup difficulty = null;

		fixture.prepare(advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		//       at net.sf.freecol.common.model.Specification.applyFixes(Specification.java:1878)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:393)
	}

	/**
	 * Run the void prepare(Advantages,OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testPrepare_6()
		throws Exception {
		Specification fixture = new Specification();
		NationOptions.Advantages advantages = NationOptions.Advantages.FIXED;
		OptionGroup difficulty = null;

		fixture.prepare(advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions.map
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:1004)
		//       at net.sf.freecol.common.model.Specification.checkOption(Specification.java:2727)
		//       at net.sf.freecol.common.model.Specification.checkBooleanOption(Specification.java:2699)
		//       at net.sf.freecol.common.model.Specification.fixGameOptions(Specification.java:2582)
		//       at net.sf.freecol.common.model.Specification.applyFixes(Specification.java:1878)
		//       at net.sf.freecol.common.model.Specification.prepare(Specification.java:393)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_1()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_2()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_3()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_4()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_5()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_6()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_7()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_8()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_9()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_10()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_11()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_12()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_13()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_14()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_15()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadFromXML_16()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.Specification.readFromXML(Specification.java:2827)
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSaveOptionsFile_1()
		throws Exception {
		OptionGroup group = new OptionGroup("");
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSaveOptionsFile_2()
		throws Exception {
		OptionGroup group = new OptionGroup("");
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSaveOptionsFile_3()
		throws Exception {
		OptionGroup group = new OptionGroup("");
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSaveOptionsFile_4()
		throws Exception {
		OptionGroup group = null;
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setGameOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSetGameOptions_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup go = new OptionGroup("");

		fixture.setGameOptions(go);

		// add additional test code here
	}

	/**
	 * Run the void setMapGeneratorOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSetMapGeneratorOptions_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup mgo = new OptionGroup("");

		fixture.setMapGeneratorOptions(mgo);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_1()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_2()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_3()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_4()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_5()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_6()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_7()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_8()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_9()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_10()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_11()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_12()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_13()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_14()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_15()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToXML_16()
		throws Exception {
		Specification fixture = new Specification();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:430)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2773)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
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
	 * @generatedBy CodePro at 5/14/18 4:25 PM
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
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SpecificationTest.class);
	}
}