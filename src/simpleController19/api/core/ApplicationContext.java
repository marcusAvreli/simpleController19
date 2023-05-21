package simpleController19.api.core;

/**
 * This interface represents an Application scope. Inside this scope you can store,
 * retrieve, and remove attributes by their names.
 * 
 * @author Mario Garcia
 *
 */
public interface ApplicationContext {

	/**
	 * This methods stores an object by its name
	 * 
	 * @param name The name of the object
	 * @param value The object itself
	 */
	public void setAttribute(String name,Object value);
	/**
	 * This method removes an object by its name. It's equals to call setAttribute("name",null).
	 * 
	 * @param name The name of the object
	 */
	public void removeAttribute(String name);
	/**
	 * This method retrieves an object from ApplicationContext by its name. It returns null if
	 * the method can't be found.
	 * 
	 * @param name The name of the object
	 * @return The retrieved object
	 */
	public Object getAttribute(String name);
	
}