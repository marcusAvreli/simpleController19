package simpleController19.api.core;


//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/core/ApplicationContextAware.java#L17
public interface ApplicationContextAware {

	/**
	 * This method returns the current available ApplicationContext
	 * 
	 * @return
	 */
	public ApplicationContext getApplicationContext();
	/**
	 * This method sets up the ApplicationContext. If there's already an available 
	 * applicationContext it will throw an ApplicationContextException.
	 * 
	 * @param applicationContext The ApplicationContext
	 * @throws ApplicationContextException If there's a previous ApplicationContext
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws ApplicationContextException;
}