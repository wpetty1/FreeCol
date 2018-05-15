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
 * The class <code>NationSummaryTest</code> contains tests for the class <code>{@link NationSummary}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:53 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class NationSummaryTest {
	/**
	 * Run the NationSummary(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_1()
		throws Exception {
		Element element = new IIOMetadataNode();

		NationSummary result = new NationSummary(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setGold(1);
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_5()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setGold(1);
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_6()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setGold(1);
		player.setTax(1);
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		requester.setGold(1);
		requester.setTax(1);
		requester.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_7()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setGold(1);
		player.setTax(1);
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		requester.setGold(1);
		requester.setTax(1);
		requester.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_8()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setGold(1);
		player.setTax(1);
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testNationSummary_9()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setGold(1);
		player.setTax(1);
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Player requester = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getFoundingFathers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetFoundingFathers_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getFoundingFathers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the int getGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetGold_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getGold();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMilitaryStrength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetMilitaryStrength_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getMilitaryStrength();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNavalStrength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetNavalStrength_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getNavalStrength();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfSettlements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetNumberOfSettlements_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getNumberOfSettlements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetNumberOfUnits_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getNumberOfUnits();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the int getSoL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetSoL_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getSoL();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the Stance getStance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetStance_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		Stance result = fixture.getStance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the int getTax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetTax_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		int result = fixture.getTax();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = NationSummary.getXMLElementTagName();

		// add additional test code here
		assertEquals("nationSummary", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_11()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_12()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_13()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_14()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_15()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	@Test
	public void testWriteAttributes_16()
		throws Exception {
		NationSummary fixture = new NationSummary(new IIOMetadataNode());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.NationSummary.<init>(NationSummary.java:103)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:53 PM
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
	 * @generatedBy CodePro at 5/14/18 3:53 PM
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
	 * @generatedBy CodePro at 5/14/18 3:53 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NationSummaryTest.class);
	}
}