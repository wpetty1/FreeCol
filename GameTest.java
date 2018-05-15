package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.sf.freecol.server.ai.AIMain;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.server.FreeColServer;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.option.OptionGroup;

/**
 * The class <code>GameTest</code> contains tests for the class <code>{@link Game}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:25 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GameTest {
	/**
	 * Run the Game(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGame_1()
		throws Exception {
		Specification specification = new Specification();

		Game result = new Game(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getMap());
		assertEquals(null, result.getDifficultyOptionGroup());
		assertEquals(2, result.getAge());
		assertEquals(null, result.getUnknownEnemy());
		assertEquals(null, result.getClientPlayer());
		assertEquals(null, result.getNextPlayer());
		assertEquals(null, result.getFirstPlayer());
		assertEquals(false, result.isInRevengeMode());
		assertEquals(null, result.getCurrentPlayer());
		assertEquals(null, result.getNationOptions());
		assertEquals(true, result.isInServer());
		assertEquals(null, result.getCombatModel());
		assertEquals(false, result.isInClient());
		assertEquals("game", result.getXMLTagName());
		assertEquals(true, result.allPlayersReadyToLaunch());
		assertEquals(false, result.getSpanishSuccession());
		assertEquals(false, result.isDisposed());
		assertEquals(false, result.isUninitialized());
		assertEquals("net.sf.freecol.common.model.Game:0", result.toString());
		assertEquals("0", result.getId());
		assertEquals("0", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("0", result.getIdType());
	}

	/**
	 * Run the Game(Element,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGame_2()
		throws Exception {
		Element element = new IIOMetadataNode();
		String clientUserName = "";

		Game result = new Game(element, clientUserName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean addPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testAddPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer((Player) null);
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setAI(false);
		player.nationId = "";

		boolean result = fixture.addPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testAddPlayer_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setAI(true);
		player.nationId = "";

		boolean result = fixture.addPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testAddPlayer_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setAI(false);

		boolean result = fixture.addPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean allPlayersReadyToLaunch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testAllPlayersReadyToLaunch_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.allPlayersReadyToLaunch();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean allPlayersReadyToLaunch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testAllPlayersReadyToLaunch_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.allPlayersReadyToLaunch();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAddNewPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCanAddNewPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.canAddNewPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAddNewPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCanAddNewPlayer_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.canAddNewPlayer();

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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap((Map) null);
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = null;

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = null;

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_7()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_8()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_9()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = null;

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testCheckOwners_10()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Ownable o = new Europe(new Game(new IIOMetadataNode(), ""), "");
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Game o = new Game(new Specification());
		o.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		o.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.setSpanishSuccession(true);
		o.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.setCombatModel(new SimpleCombatModel());
		o.setNationOptions(new NationOptions(new Specification()));
		o.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		o.setTurn(new Turn(1));
		o.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.nextId = 1;

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Location findFreeColLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testFindFreeColLocation_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		Location result = fixture.findFreeColLocation(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location findFreeColLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testFindFreeColLocation_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		Location result = fixture.findFreeColLocation(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getAge() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetAge_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		int result = fixture.getAge();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Player getClientPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetClientPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Player result = fixture.getClientPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the CombatModel getCombatModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetCombatModel_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		CombatModel result = fixture.getCombatModel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getCurrentPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetCurrentPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Player result = fixture.getCurrentPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getDifficultyOptionGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetDifficultyOptionGroup_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		OptionGroup result = fixture.getDifficultyOptionGroup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getFirstPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFirstPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Player result = fixture.getFirstPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getFirstPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFirstPlayer_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;

		Player result = fixture.getFirstPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObject_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = null;

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObject_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObject_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObject_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObject_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObject_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;

		FreeColGameObject result = fixture.getFreeColGameObject(id, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<FreeColGameObject> getFreeColGameObjectIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObjectIterator_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Iterator<FreeColGameObject> result = fixture.getFreeColGameObjectIterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterable<FreeColGameObject> getFreeColGameObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetFreeColGameObjects_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Iterable<FreeColGameObject> result = fixture.getFreeColGameObjects();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getGameOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetGameOptions_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		OptionGroup result = fixture.getGameOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getLiveEuropeanPlayers(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetLiveEuropeanPlayers_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player other = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Player> result = fixture.getLiveEuropeanPlayers(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getLiveNativePlayers(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetLiveNativePlayers_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player other = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Player> result = fixture.getLiveNativePlayers(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getLivePlayers(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetLivePlayers_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player other = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Player> result = fixture.getLivePlayers(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Class<? extends FreeColGameObject> getLocationClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetLocationClass_1()
		throws Exception {
		String id = "";

		Class<? extends FreeColGameObject> result = Game.getLocationClass(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at net.sf.freecol.common.model.Game.getLocationClass(Game.java:1058)
		assertNotNull(result);
	}

	/**
	 * Run the Map getMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetMap_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Map result = fixture.getMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the OptionGroup getMapGeneratorOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetMapGeneratorOptions_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		OptionGroup result = fixture.getMapGeneratorOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject getMessageDisplay(ModelMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetMessageDisplay_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		ModelMessage message = new ModelMessage(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		message.setDisplayId((String) null);
		message.setSourceId("");

		FreeColObject result = fixture.getMessageDisplay(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ModelMessage.<init>(ModelMessage.java:193)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getMessageSource(ModelMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetMessageSource_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		ModelMessage message = new ModelMessage(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		message.setSourceId("");

		FreeColGameObject result = fixture.getMessageSource(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ModelMessage.<init>(ModelMessage.java:193)
		assertNotNull(result);
	}

	/**
	 * Run the NationOptions getNationOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetNationOptions_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		NationOptions result = fixture.getNationOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNextId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetNextId_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		String result = fixture.getNextId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getNextPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetNextPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Player result = fixture.getNextPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getOtherLivePlayers(Player[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetOtherLivePlayers_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		List<Player> result = fixture.getOtherLivePlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getOtherLivePlayers(Player[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetOtherLivePlayers_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		List<Player> result = fixture.getOtherLivePlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerAfter_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
		Player beforePlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerAfter_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player beforePlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerAfter_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player beforePlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerAfter_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player beforePlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerAfter_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player beforePlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerAfter_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player beforePlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerByName_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		Player result = fixture.getPlayerByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerByNation(Nation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerByNation_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Nation nation = new Nation("", new Specification());

		Player result = fixture.getPlayerByNation(nation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerByNationId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayerByNationId_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String nationId = "";

		Player result = fixture.getPlayerByNationId(nationId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetPlayers_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		List<Player> result = fixture.getPlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSettlementByName_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSettlementByName_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSettlementByName_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSettlementByName_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getSpanishSuccession() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSpanishSuccession_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.getSpanishSuccession();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getSpanishSuccession() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSpanishSuccession_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(false);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.getSpanishSuccession();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Specification getSpecification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetSpecification_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Specification result = fixture.getSpecification();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<String, String> getStatistics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetStatistics_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		java.util.Map<String, String> result = fixture.getStatistics();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<String, String> getStatistics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetStatistics_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		java.util.Map<String, String> result = fixture.getStatistics();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<String, String> getStatistics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetStatistics_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		java.util.Map<String, String> result = fixture.getStatistics();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Turn getTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetTurn_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Turn result = fixture.getTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UUID getUUID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetUUID_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		UUID result = fixture.getUUID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getUnknownEnemy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetUnknownEnemy_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Player result = fixture.getUnknownEnemy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Nation getVacantNation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetVacantNation_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Nation result = fixture.getVacantNation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Nation getVacantNation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetVacantNation_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		Nation result = fixture.getVacantNation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Nation> getVacantNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetVacantNations_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		List<Nation> result = fixture.getVacantNations();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Nation> getVacantNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetVacantNations_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		List<Nation> result = fixture.getVacantNations();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Nation> getVacantNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetVacantNations_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		List<Nation> result = fixture.getVacantNations();

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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Game.getXMLElementTagName();

		// add additional test code here
		assertEquals("game", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isInClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testIsInClient_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.isInClient();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInRevengeMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testIsInRevengeMode_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.isInRevengeMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInRevengeMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testIsInRevengeMode_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.isInRevengeMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testIsInServer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;

		boolean result = fixture.isInServer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the FreeColObject newInstance(Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNewInstance_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Class<FreeColObject> returnClass = FreeColObject.class;
		boolean server = false;

		FreeColObject result = fixture.newInstance(returnClass, server);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject newInstance(Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNewInstance_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Class<FreeColObject> returnClass = FreeColObject.class;
		boolean server = true;

		FreeColObject result = fixture.newInstance(returnClass, server);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void notifyOwnerChanged(FreeColGameObject,Player,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNotifyOwnerChanged_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Player newOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.notifyOwnerChanged(source, oldOwner, newOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void notifyOwnerChanged(FreeColGameObject,Player,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNotifyOwnerChanged_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener((FreeColGameObjectListener) null);
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));
		Player oldOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Player newOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.notifyOwnerChanged(source, oldOwner, newOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void notifyRemoveFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNotifyRemoveFreeColGameObject_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		fixture.notifyRemoveFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void notifyRemoveFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNotifyRemoveFreeColGameObject_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener((FreeColGameObjectListener) null);
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";

		fixture.notifyRemoveFreeColGameObject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void notifySetFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNotifySetFreeColGameObject_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		FreeColGameObject fcgo = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.notifySetFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void notifySetFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testNotifySetFreeColGameObject_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener((FreeColGameObjectListener) null);
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		FreeColGameObject fcgo = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.notifySetFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean playerNameInUse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testPlayerNameInUse_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		boolean result = fixture.playerNameInUse(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean playerNameInUse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testPlayerNameInUse_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String name = "";

		boolean result = fixture.playerNameInUse(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Game fixture = new Game((Specification) null);
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_8()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testReadChildren_9()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.nextId = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = null;
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean removePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemovePlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.removePlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean removePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemovePlayer_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.nationId = "";

		boolean result = fixture.removePlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean removePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testRemovePlayer_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.nationId = "";

		boolean result = fixture.removePlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void setCombatModel(CombatModel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetCombatModel_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		CombatModel newCombatModel = new SimpleCombatModel();

		fixture.setCombatModel(newCombatModel);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCurrentPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetCurrentPlayer_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player newCurrentPlayer = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setCurrentPlayer(newCurrentPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetFreeColGameObject_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = null;
		FreeColGameObject fcgo = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetFreeColGameObject_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		FreeColGameObject fcgo = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetFreeColGameObject_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		FreeColGameObject fcgo = null;

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetFreeColGameObject_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		FreeColGameObject fcgo = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetFreeColGameObject_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String id = "";
		FreeColGameObject fcgo = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setFreeColGameObjectListener(FreeColGameObjectListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetFreeColGameObjectListener_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		FreeColGameObjectListener fcgol = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));

		fixture.setFreeColGameObjectListener(fcgol);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setGameOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetGameOptions_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		OptionGroup go = new OptionGroup("");

		fixture.setGameOptions(go);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetMap_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Map newMap = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetMap_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Map newMap = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetMap_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Map newMap = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetMap_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Map newMap = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMapGeneratorOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetMapGeneratorOptions_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		OptionGroup mgo = new OptionGroup("");

		fixture.setMapGeneratorOptions(mgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setNationOptions(NationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetNationOptions_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		NationOptions newNationOptions = new NationOptions(new Specification());

		fixture.setNationOptions(newNationOptions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSpanishSuccession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetSpanishSuccession_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		boolean spanishSuccession = true;

		fixture.setSpanishSuccession(spanishSuccession);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setTurn(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetTurn_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Turn newTurn = new Turn(1);

		fixture.setTurn(newTurn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setUnknownEnemy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testSetUnknownEnemy_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setUnknownEnemy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the FreeColObject unserialize(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testUnserialize_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String xml = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.unserialize(xml, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject unserialize(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testUnserialize_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String xml = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.unserialize(xml, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject unserialize(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testUnserialize_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String xml = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.unserialize(xml, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject unserialize(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testUnserialize_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String xml = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.unserialize(xml, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject unserialize(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testUnserialize_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
		String xml = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.unserialize(xml, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer((Player) null);
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer((Player) null);
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy((Player) null);
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap(new Map(new Game(new IIOMetadataNode(), ""), 1, 1));
		fixture.setUnknownEnemy((Player) null);
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap((Map) null);
		fixture.setUnknownEnemy(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		Game fixture = new Game(new Specification());
		fixture.setMap((Map) null);
		fixture.setUnknownEnemy((Player) null);
		fixture.setSpanishSuccession(true);
		fixture.setCurrentPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setCombatModel(new SimpleCombatModel());
		fixture.setNationOptions(new NationOptions(new Specification()));
		fixture.setFreeColGameObjectListener(new AIMain(new FreeColServer(true, true, new Specification(), 1, "")));
		fixture.setTurn(new Turn(1));
		fixture.addPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.nextId = 1;
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
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
	 * @generatedBy CodePro at 5/14/18 3:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GameTest.class);
	}
}