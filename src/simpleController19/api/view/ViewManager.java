package simpleController19.api.view;

import java.awt.Container;
import java.util.Map;

import simpleController19.api.core.ApplicationAware;
import simpleController19.api.view.perspective.Perspective;
import simpleController19.api.view.perspective.PerspectiveConstraint;


//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/ViewManager.java
/**
 * This interface should be implemented by classes used for managing
 * several views.<br/><br/>
 * Views can be added to the manager and then re-arranged before it can
 * be shown.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */
public interface ViewManager extends ApplicationAware
{
	public static final String ROOT_VIEW_ID = "rootViewId";

	/**
	 * Adds a view to the manager
	 * 
	 * @param view
	 * @throws
	 */
	public void addView(ViewContainer view) throws ViewException;
	public void addView(ViewContainer view,PerspectiveConstraint constraint) throws ViewException;
	public void setPerspective(Perspective perspective);
	public Perspective getPerspective();
	public Container arrangeViews();
	
	//[ID:2895658]: getRootView() from ViewManager not to throw and Exception
	/**
	 * @return
	 */
	public ViewContainerFrame getRootView();
	
	/**
	 * @return
	 */
	public Map<Object,ViewContainer> getViews();
	
	
	/**
	 * Sets the main view
	 * 
	 * @param view
	 * @throws ViewException
	 */
	public void setRootView(ViewContainerFrame view);
	
	
}