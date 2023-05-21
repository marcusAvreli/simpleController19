package simpleController19.api.view;

import java.awt.Image;
import java.util.List;

import javax.swing.JToolBar;
import javax.swing.RootPaneContainer;

import simpleController19.api.controller.ViewControllerAware;
import simpleController19.api.core.ApplicationAware;
import simpleController19.api.view.event.ViewContainerEventControllerAware;



//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/ViewContainer.java
public interface ViewContainer  extends  RootPaneContainer,ApplicationAware,ViewControllerAware,ComponentsAware,ViewContainerEventControllerAware
{
	public static final String CONTENTPANE 	= "contentPane";
	public static final String FRAME		= "frame";
	public static final String MENUBAR		= "menuBar";
	public static final String ROOTPANE 	= "rootPane";
	public static final String TOOLBAR 		= "toolBar";
	
	
	
	//public Image getIconImage();
	
	/**
	 * Returns the id of the view
	 * 
	 * @return the name
	 */
	public abstract String getId();
	
	/**
	 * @return
	 */
	public JToolBar getJToolBar();
	
	/**
	 * Returns the title of the view
	 * 
	 * @return
	 */
	public abstract String getTitle();
	

	
	/**
	 * Sets a representative image for this view
	 * 
	 * @param image
	 */
	//public void setIconImage(Image image);
	
	/**
	 * Sets the name view.
	 * 
	 * @param name the id to set
	 */
	public abstract void setId(String name);		
	
	/**
	 * @param toolBar
	 */
	public void setJToolbar(JToolBar toolBar);

	/**
	 * Sets the title of the view
	 * 
	 * @param title
	 */
	public abstract void setTitle(String title);

	public abstract void viewInit() throws ViewException;

}