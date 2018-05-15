package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>PlayerExploredTileTest</code> contains tests for the class <code>{@link PlayerExploredTile}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:16 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class PlayerExploredTileTest {
	/**
	 * Run the PlayerExploredTile(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testPlayerExploredTile_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		PlayerExploredTile result = new PlayerExploredTile(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerExploredTile(Game,Player,Tile) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testPlayerExploredTile_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		PlayerExploredTile result = new PlayerExploredTile(game, player, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_2()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_3()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_4()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_5()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_6()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_7()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_8()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_9()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fixCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testFixCache_10()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.fixCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = PlayerExploredTile.getXMLElementTagName();

		// add additional test code here
		assertEquals("playerExploredTile", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_8()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testReadChildren_9()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_11()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_12()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_13()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_14()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_15()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteAttributes_16()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_13()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_14()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	@Test
	public void testWriteChildren_15()
		throws Exception {
		PlayerExploredTile fixture = new PlayerExploredTile(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
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
	 * @generatedBy CodePro at 5/14/18 4:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PlayerExploredTileTest.class);
	}
}