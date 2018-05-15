package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Date;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>HighScoreTest</code> contains tests for the class <code>{@link HighScore}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:29 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class HighScoreTest {
	/**
	 * Run the HighScore(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_1()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		HighScore result = new HighScore(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.HighScore.<init>(HighScore.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		HighScore result = new HighScore(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.HighScore.<init>(HighScore.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_3()
		throws Exception {
		Element element = new IIOMetadataNode();

		HighScore result = new HighScore(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.HighScore.<init>(HighScore.java:187)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_5()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_6()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_7()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setIndependentNationName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_8()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setIndependentNationName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testHighScore_9()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setIndependentNationName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testCheckHighScore_1()
		throws Exception {
		int score = 1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testCheckHighScore_2()
		throws Exception {
		int score = 1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testCheckHighScore_3()
		throws Exception {
		int score = -1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testCheckHighScore_4()
		throws Exception {
		int score = 1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		FreeColObject other = new HighScore(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		int result = fixture.compareTo(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getColonies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetColonies_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getColonies();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Date getDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		Date result = fixture.getDate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getDifficulty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetDifficulty_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getDifficulty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getIndependenceTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetIndependenceTurn_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getIndependenceTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the HighScore.ScoreLevel getLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetLevel_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		HighScore.ScoreLevel result = fixture.getLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNationId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetNationId_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNationId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNationLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetNationLabel_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNationLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNationTypeId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetNationTypeId_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNationTypeId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNewLandName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetNewLandName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNewLandName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getOldNationNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetOldNationNameKey_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getOldNationNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getPlayerName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetPlayerName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getPlayerName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getRetirementTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetRetirementTurn_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getRetirementTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetScore_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetUnits_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getUnits();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = HighScore.getXMLElementTagName();

		// add additional test code here
		assertEquals("highScore", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_1()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_2()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_3()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_4()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_5()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_6()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testLoadHighScores_7()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:376)
		assertNotNull(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testNewHighScore_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setScore(1);

		boolean result = HighScore.newHighScore(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testNewHighScore_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setScore(1);

		boolean result = HighScore.newHighScore(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testNewHighScore_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setScore(1);

		boolean result = HighScore.newHighScore(player);

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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_12()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_13()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_14()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_15()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testReadAttributes_16()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_1()
		throws Exception {
		List<HighScore> scores = null;

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_2()
		throws Exception {
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:419)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_3()
		throws Exception {
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:419)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_4()
		throws Exception {
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:419)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_5()
		throws Exception {
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:419)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_6()
		throws Exception {
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:419)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testSaveHighScores_7()
		throws Exception {
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:419)
		assertTrue(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_11()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_12()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_13()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_14()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_15()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	@Test
	public void testWriteAttributes_16()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setName("");
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("");
		player.setScore(1);
		player.nationId = "";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
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
	 * @generatedBy CodePro at 5/14/18 3:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HighScoreTest.class);
	}
}