package simpleController19.api.core;

/**
 * This type of exception will be thrown when someone tries to set an ApplicationContext
 * when a previous one has been already set up.
 * 
 * @author Mario Garcia
 *
 */
public class ApplicationContextException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. It initializes the exception message "Application context has already been set up"
	 */
	public ApplicationContextException(){
		super("Application context has already been set up");
	}
}