package net.sf.freecol.common.io;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColDirectoriesTest</code> contains tests for the class <code>{@link FreeColDirectories}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:42 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColDirectoriesTest {
	/**
	 * Run the FreeColDirectories() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColDirectories_1()
		throws Exception {
		FreeColDirectories result = new FreeColDirectories();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String checkDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCheckDir_1()
		throws Exception {
		File dir = new File("");

		String result = FreeColDirectories.checkDir(dir);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String checkDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCheckDir_2()
		throws Exception {
		File dir = new File("");

		String result = FreeColDirectories.checkDir(dir);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String checkDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCheckDir_3()
		throws Exception {
		File dir = new File("");

		String result = FreeColDirectories.checkDir(dir);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String checkDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCheckDir_4()
		throws Exception {
		File dir = new File("");

		String result = FreeColDirectories.checkDir(dir);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String checkDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCheckDir_5()
		throws Exception {
		File dir = null;

		String result = FreeColDirectories.checkDir(dir);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String checkDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCheckDir_6()
		throws Exception {
		File dir = new File("");

		String result = FreeColDirectories.checkDir(dir);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the File getAutosaveDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAutosaveDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getAutosaveDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getBaseClientOptionsFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetBaseClientOptionsFile_1()
		throws Exception {

		File result = FreeColDirectories.getBaseClientOptionsFile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\base\\client-options.xml", result.toString());
		assertEquals("client-options.xml", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\base\\client-options.xml", result.getCanonicalPath());
		assertEquals("data\\base", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\base\\client-options.xml", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\base\\client-options.xml", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getBaseDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetBaseDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getBaseDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\base", result.toString());
		assertEquals("base", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\base", result.getCanonicalPath());
		assertEquals("data", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\base", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\base", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getClientOptionsFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetClientOptionsFile_1()
		throws Exception {

		File result = FreeColDirectories.getClientOptionsFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getClientOptionsFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetClientOptionsFile_2()
		throws Exception {

		File result = FreeColDirectories.getClientOptionsFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getDataDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetDataDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getDataDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data", result.toString());
		assertEquals("data", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data", result.getCanonicalPath());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(null, result.getParentFile());
		assertEquals("data", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getHighScoreFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetHighScoreFile_1()
		throws Exception {

		File result = FreeColDirectories.getHighScoreFile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("HighScores.xml", result.toString());
		assertEquals("HighScores.xml", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\HighScores.xml", result.getCanonicalPath());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\HighScores.xml", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(null, result.getParentFile());
		assertEquals("HighScores.xml", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getI18nDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetI18nDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getI18nDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\strings", result.toString());
		assertEquals("strings", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\strings", result.getCanonicalPath());
		assertEquals("data", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\strings", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\strings", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getLastSaveGameFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLastSaveGameFile_1()
		throws Exception {

		File result = FreeColDirectories.getLastSaveGameFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColDirectories.getLastSaveGameFile(FreeColDirectories.java:816)
		assertNotNull(result);
	}

	/**
	 * Run the File getLastSaveGameFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLastSaveGameFile_2()
		throws Exception {

		File result = FreeColDirectories.getLastSaveGameFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColDirectories.getLastSaveGameFile(FreeColDirectories.java:816)
		assertNotNull(result);
	}

	/**
	 * Run the File getLastSaveGameFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLastSaveGameFile_3()
		throws Exception {

		File result = FreeColDirectories.getLastSaveGameFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColDirectories.getLastSaveGameFile(FreeColDirectories.java:816)
		assertNotNull(result);
	}

	/**
	 * Run the File getLastSaveGameFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLastSaveGameFile_4()
		throws Exception {

		File result = FreeColDirectories.getLastSaveGameFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColDirectories.getLastSaveGameFile(FreeColDirectories.java:816)
		assertNotNull(result);
	}

	/**
	 * Run the File getLastSaveGameFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLastSaveGameFile_5()
		throws Exception {

		File result = FreeColDirectories.getLastSaveGameFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColDirectories.getLastSaveGameFile(FreeColDirectories.java:816)
		assertNotNull(result);
	}

	/**
	 * Run the String getLogFilePath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLogFilePath_1()
		throws Exception {

		String result = FreeColDirectories.getLogFilePath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getMapsDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetMapsDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getMapsDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\maps", result.toString());
		assertEquals("maps", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\maps", result.getCanonicalPath());
		assertEquals("data", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\maps", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\maps", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getOptionsDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetOptionsDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getOptionsDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getOptionsDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetOptionsDirectory_2()
		throws Exception {

		File result = FreeColDirectories.getOptionsDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getOptionsFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetOptionsFile_1()
		throws Exception {
		String name = "";

		File result = FreeColDirectories.getOptionsFile(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getOptionsFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetOptionsFile_2()
		throws Exception {
		String name = "";

		File result = FreeColDirectories.getOptionsFile(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getRulesClassicDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetRulesClassicDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getRulesClassicDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\rules\\classic", result.toString());
		assertEquals("classic", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\rules\\classic", result.getCanonicalPath());
		assertEquals("data\\rules", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\rules\\classic", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\rules\\classic", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getRulesDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetRulesDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getRulesDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\rules", result.toString());
		assertEquals("rules", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\rules", result.getCanonicalPath());
		assertEquals("data", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\rules", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\rules", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getSaveDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetSaveDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getSaveDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getSavegameFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetSavegameFile_1()
		throws Exception {

		File result = FreeColDirectories.getSavegameFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getStandardModsDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetStandardModsDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getStandardModsDirectory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("data\\mods", result.toString());
		assertEquals("mods", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\mods", result.getCanonicalPath());
		assertEquals("data", result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\data\\mods", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals("data\\mods", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getStartMapFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetStartMapFile_1()
		throws Exception {

		File result = FreeColDirectories.getStartMapFile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("startMap.fsg", result.toString());
		assertEquals("startMap.fsg", result.getName());
		assertEquals(0L, result.length());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\startMap.fsg", result.getCanonicalPath());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canExecute());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals("C:\\Users\\Collin\\Desktop\\IDES\\eclipse\\startMap.fsg", result.getAbsolutePath());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(null, result.getParentFile());
		assertEquals("startMap.fsg", result.getPath());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getUsableSpace());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
	}

	/**
	 * Run the File getUserCacheDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetUserCacheDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getUserCacheDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getUserConfigDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetUserConfigDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getUserConfigDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getUserDataDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetUserDataDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getUserDataDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getUserModsDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetUserModsDirectory_1()
		throws Exception {

		File result = FreeColDirectories.getUserModsDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean onMacOSX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testOnMacOSX_1()
		throws Exception {

		boolean result = FreeColDirectories.onMacOSX();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean onMacOSX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testOnMacOSX_2()
		throws Exception {

		boolean result = FreeColDirectories.onMacOSX();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean onUnix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testOnUnix_1()
		throws Exception {

		boolean result = FreeColDirectories.onUnix();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean onUnix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testOnUnix_2()
		throws Exception {

		boolean result = FreeColDirectories.onUnix();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean onWindows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testOnWindows_1()
		throws Exception {

		boolean result = FreeColDirectories.onWindows();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean onWindows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testOnWindows_2()
		throws Exception {

		boolean result = FreeColDirectories.onWindows();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean setClientOptionsFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetClientOptionsFile_1()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setClientOptionsFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setClientOptionsFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetClientOptionsFile_2()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setClientOptionsFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setClientOptionsFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetClientOptionsFile_3()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setClientOptionsFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setClientOptionsFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetClientOptionsFile_4()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setClientOptionsFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String setDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetDataDirectory_1()
		throws Exception {
		String path = null;

		String result = FreeColDirectories.setDataDirectory(path);

		// add additional test code here
		assertEquals("Not a directory: data", result);
	}

	/**
	 * Run the String setDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetDataDirectory_2()
		throws Exception {
		String path = null;

		String result = FreeColDirectories.setDataDirectory(path);

		// add additional test code here
		assertEquals("Not a directory: data", result);
	}

	/**
	 * Run the String setDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetDataDirectory_3()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setDataDirectory(path);

		// add additional test code here
		assertEquals("Not a directory: ", result);
	}

	/**
	 * Run the String setDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetDataDirectory_4()
		throws Exception {
		String path = null;

		String result = FreeColDirectories.setDataDirectory(path);

		// add additional test code here
		assertEquals("Not a directory: data", result);
	}

	/**
	 * Run the String setDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetDataDirectory_5()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setDataDirectory(path);

		// add additional test code here
		assertEquals("Not a directory: ", result);
	}

	/**
	 * Run the void setLogFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetLogFilePath_1()
		throws Exception {
		String path = "";

		FreeColDirectories.setLogFilePath(path);

		// add additional test code here
	}

	/**
	 * Run the boolean setSavegameFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetSavegameFile_1()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setSavegameFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setSavegameFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetSavegameFile_2()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setSavegameFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setSavegameFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetSavegameFile_3()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setSavegameFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setSavegameFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetSavegameFile_4()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setSavegameFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setSavegameFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetSavegameFile_5()
		throws Exception {
		String path = "";

		boolean result = FreeColDirectories.setSavegameFile(path);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String setUserCacheDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetUserCacheDirectory_1()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setUserCacheDirectory(path);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String setUserCacheDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetUserCacheDirectory_2()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setUserCacheDirectory(path);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String setUserConfigDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetUserConfigDirectory_1()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setUserConfigDirectory(path);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String setUserConfigDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetUserConfigDirectory_2()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setUserConfigDirectory(path);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String setUserDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetUserDataDirectory_1()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setUserDataDirectory(path);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Run the String setUserDataDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetUserDataDirectory_2()
		throws Exception {
		String path = "";

		String result = FreeColDirectories.setUserDataDirectory(path);

		// add additional test code here
		assertEquals("cli.error.home.notExists", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
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
	 * @generatedBy CodePro at 5/14/18 4:42 PM
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
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColDirectoriesTest.class);
	}
}