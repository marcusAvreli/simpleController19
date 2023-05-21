package simpleController19.api.view.perspective;

import java.awt.Container;

import simpleController19.api.view.ViewAware;


/**
 * It's responsible for the visual arrangement of the views at a given
 * time. Views are added from the application ViewManager to 
 * the perspective.
 * 
 * @author Mario Garcia
 * @since 1.0
 */

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/perspective/Perspective.java
public interface Perspective extends ViewAware
{
	/**
	 * Arranges the views contained in the manager. It would be
	 * called by the application before the views can be viewed.
	 * 
	 * @return
	 */
	public Container arrange() ;
	
	/**
	 *  Unloads all views from this perspective
	 */
	public void clear();
	
	/**
	 * @return
	 */
	public String getId();
		
	/**
	 * @param id
	 */
	public void setId(String id);
	
}