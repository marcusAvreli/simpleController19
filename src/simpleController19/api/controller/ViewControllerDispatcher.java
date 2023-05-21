package simpleController19.api.controller;

import java.util.EventListener;
import java.util.EventObject;
import java.util.List;
import java.util.Map;

import simpleController19.api.view.ViewContainer;

/**
 * 
 * This is the interface responsible for matching all the declared listeners
 * to the components that are going to use them. This implementation is going to collect
 * all the listeners and inject them in the components of a given view depending
 * on the name of the view and the component.<br/><br/>
 * 
 * Probably the implementation will be moved from the application context to
 * the view context in order to make the framework more modular.
 * 
 * @author Mario Garcia
 * @since 1.0
 * 
 */

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/controller/ViewControllerDispatcher.java#L24
public interface ViewControllerDispatcher
{
	
	/**
	 * @param pathExpression
	 * @param controller
	 */
	public void addController(String pathExpression,ViewController<? extends EventListener,? extends EventObject> controller);	
	
	/**
	 * This method holds a map with the controllers sorted by viewId
	 * 
	 * @return The map sorted by view id
	 */
	public Map<String,ViewController<? extends EventListener,? extends EventObject>> getControllers(); 	
	
	/**
	 * This method loops all the components inserted in the controllers general list and
	 * only takes those from the view given as parameter.
	 * 
	 * @param view The view whose listeners we want to collect
	 * @return The listeners that belongs to the view
	 */
	public Map<String,List<ViewController<? extends EventListener,? extends EventObject>>> getViewControllers(ViewContainer view);
	
	
	/**
	 * @param pathExpression
	 */
	public void removeController(String pathExpression);

	/**
	 * This method receives all the listeners of the application sorted
	 * by view id.
	 * 
	 * @param controllers
	 */
	public void setControllers(Map<String,ViewController<? extends EventListener,? extends EventObject>> controllers);
	
}