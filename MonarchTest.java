package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import net.sf.freecol.common.util.RandomChoice;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>MonarchTest</code> contains tests for the class <code>{@link Monarch}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:52 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class MonarchTest {
	/**
	 * Run the Monarch(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testMonarch_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		Monarch result = new Monarch(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch(Game,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testMonarch_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Player player = null;

		Monarch result = new Monarch(game, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch(Game,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testMonarch_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Monarch result = new Monarch(game, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_7()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_8()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_9()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_10()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_11()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(false);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_12()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(false);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_13()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_14()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_15()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean actionIsValid(MonarchAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testActionIsValid_16()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Monarch.MonarchAction action = Monarch.MonarchAction.ADD_TO_REF;

		boolean result = fixture.actionIsValid(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean fix = false;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean fix = false;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCheckIntegrity_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCheckIntegrity_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCheckIntegrity_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the AbstractUnit chooseForREF(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testChooseForREF_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		AbstractUnit result = fixture.chooseForREF(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractUnit chooseForREF(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testChooseForREF_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		AbstractUnit result = fixture.chooseForREF(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractUnit chooseForREF(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testChooseForREF_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		AbstractUnit result = fixture.chooseForREF(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractUnit chooseForREF(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testChooseForREF_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		AbstractUnit result = fixture.chooseForREF(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractUnit chooseForREF(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testChooseForREF_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		AbstractUnit result = fixture.chooseForREF(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> collectPotentialEnemies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCollectPotentialEnemies_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<Player> result = fixture.collectPotentialEnemies();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> collectPotentialEnemies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCollectPotentialEnemies_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<Player> result = fixture.collectPotentialEnemies();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> collectPotentialFriends() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCollectPotentialFriends_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<Player> result = fixture.collectPotentialFriends();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<Monarch.MonarchAction>> getActionChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetActionChoices_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<RandomChoice<Monarch.MonarchAction>> result = fixture.getActionChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<Monarch.MonarchAction>> getActionChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetActionChoices_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<RandomChoice<Monarch.MonarchAction>> result = fixture.getActionChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<Monarch.MonarchAction>> getActionChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetActionChoices_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<RandomChoice<Monarch.MonarchAction>> result = fixture.getActionChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<Monarch.MonarchAction>> getActionChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetActionChoices_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<RandomChoice<Monarch.MonarchAction>> result = fixture.getActionChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<Monarch.MonarchAction>> getActionChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetActionChoices_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<RandomChoice<Monarch.MonarchAction>> result = fixture.getActionChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<Monarch.MonarchAction>> getActionChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetActionChoices_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		List<RandomChoice<Monarch.MonarchAction>> result = fixture.getActionChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getDispleasure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetDispleasure_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		boolean result = fixture.getDispleasure();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getDispleasure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetDispleasure_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(false);

		boolean result = fixture.getDispleasure();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Monarch.Force getExpeditionaryForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetExpeditionaryForce_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getExpeditionaryForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getExpeditionaryForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetExpeditionaryForce_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getExpeditionaryForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetInterventionForce_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetInterventionForce_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getMercenaries(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaries_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		List<AbstractUnit> result = fixture.getMercenaries(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getMercenaries(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaries_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		List<AbstractUnit> result = fixture.getMercenaries(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getMercenaries(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaries_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		List<AbstractUnit> result = fixture.getMercenaries(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getMercenaries(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaries_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		List<AbstractUnit> result = fixture.getMercenaries(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getMercenaries(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaries_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		List<AbstractUnit> result = fixture.getMercenaries(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getMercenaryForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaryForce_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getMercenaryForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getMercenaryForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetMercenaryForce_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getMercenaryForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		String result = fixture.getNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitType getNavalREFUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetNavalREFUnitType_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		UnitType result = fixture.getNavalREFUnitType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = true;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = false;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = false;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = false;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = false;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = false;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getSupport(Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupport_7()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();
		boolean naval = false;

		List<AbstractUnit> result = fixture.getSupport(random, naval);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getSupportSea() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupportSea_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		boolean result = fixture.getSupportSea();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getSupportSea() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetSupportSea_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(false);
		fixture.setDispleasure(true);

		boolean result = fixture.getSupportSea();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_7()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_8()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_9()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getWarSupport(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupport_10()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		List<AbstractUnit> result = fixture.getWarSupport(enemy, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getWarSupportForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupportForce_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getWarSupportForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Monarch.Force getWarSupportForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetWarSupportForce_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		Monarch.Force result = fixture.getWarSupportForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Monarch.getXMLElementTagName();

		// add additional test code here
		assertEquals("monarch", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int lowerTax(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testLowerTax_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		int result = fixture.lowerTax(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int raiseTax(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testRaiseTax_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		Random random = new Random();

		int result = fixture.raiseTax(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_15()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChild_16()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDispleasure(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetDispleasure_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean displeasure = true;

		fixture.setDispleasure(displeasure);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSupportSea(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetSupportSea_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		boolean supportSea = true;

		fixture.setSupportSea(supportSea);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_7()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_8()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_9()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_10()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_11()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_12()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_13()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_14()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_15()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateInterventionForce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testUpdateInterventionForce_16()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);

		fixture.updateInterventionForce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Monarch fixture = new Monarch(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSupportSea(true);
		fixture.setDispleasure(true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
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
	 * @generatedBy CodePro at 5/14/18 3:52 PM
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
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MonarchTest.class);
	}
}