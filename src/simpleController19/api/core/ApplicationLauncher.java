package simpleController19.api.core;

import java.awt.Color;


public interface ApplicationLauncher {
	
	 /* ****************************** SPLASH SCREEN MESSAGE KEYS ************************************ */	
		public static final String SPLASH_KEY_MESSAGE_OPENING = "splash.opening";
		public static final String SPLASH_KEY_MESSAGE_PREPAREUI = "splash.prepareui";
		public static final String SPLASH_KEY_MESSAGE_PREPARE = "splash.prepare";
		public static final String SPLASH_KEY_MESSAGE_STARTING = "splash.starting";
	 /* ********************************* OBJECT VALUES KEYS ***************************************** */	
		public static final String SPLASH_KEY_VALUE_TEXT_COLOR = "splash.text.color";
		public static final String SPLASH_KEY_VALUE_TEXT_SIZE ="splash.font.size";
		public static final String SPLASH_KEY_VALUE_PROGRESS_COLOR ="splash.progress.color";
		public static final String SPLASH_KEY_VALUE_DEFAULT_PROGRESS_COLOR ="splash.progress.color.default";
		public static final String SPLASH_KEY_VALUE_DEFAULT_TEXT_SIZE ="splash.font.size.default";
		public static final String SPLASH_KEY_VALUE_DEFAULT_TEXT_COLOR = "splash.text.color.default";
	 /* *********************************** DEFAULT VALUES ******************************************* */
		public static final Color SPLASH_VALUE_DEFAULT_TEXT_COLOR = Color.DARK_GRAY;
		public static final Float SPLASH_VALUE_DEFAULT_TEXT_SIZE = 11f;
		public static final Color SPLASH_VALUE_DEFAULT_PROGRESS_COLOR = Color.BLUE;
	/* ************************************** OTHER KEYS ********************************************* */	
		public static final String VIEWA_FILE_NAME = "viewa.properties";
		public static final String APPLICATION_BUNDLE_NAME = "Application";
		public static final String APPLICATION_VERSION = "application.version";
		public static final String APPLICATION_NAME = "application.name";	
		public static final String APPLICATION_LOCALE = "application.locale";
		public static final String APPLICATION_SPLASH = "application.splash";
		public static final String LOCALE_SEPARATOR = "_";	
		
		/**
		 * @param clazz
		 */
		public Application execute(Class<? extends Application> clazz) throws Exception;

	}
