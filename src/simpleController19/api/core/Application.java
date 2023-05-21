package simpleController19.api.core;

import simpleController19.api.controller.ViewControllerDispatcherAware;
import simpleController19.api.view.ViewContainerFrame;
import simpleController19.api.view.ViewManager;
import simpleController19.api.view.ViewManagerException;
import simpleController19.core.view.DefaultViewContainerFrame;

/**
 * This is the entry point of any application. From Application object
 * views are loaded and unloaded through its ViewManager.<br/><br/>
 * It is also responsible for connecting views to its controllers 
 * through its ControllerDispatcher.<br/><br/>
 * 
 * Before the first view is shown some background work is done. The
 * application lifecycle starts at <br/><br/>
 * <code>execute(Application)</code><br/><br/>
 * This method launches the the viewManager in the EventDispatcherThread while
 * it creates a new Thread for the main application code.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/core/Application.java
public interface Application extends ViewControllerDispatcherAware,ApplicationContextAware {

/**
 * 
 */
public void close();

/**
 * The name of the application is not very important, but its used
 * as default title name if the application is frame based.
 * 
 * @return the name of the application
 */
public abstract String getName();

/**
 * This method returns the current locale
 * 
 * @return java.util.Locale
 */
//public Locale getLocale();


/**
 * Returns whether the application is visible or not
 * 
 * @return
 */
public boolean isVisible();


/**
 * Establish the root view of the application
 * 
 * @param rootView
 * @since 1.0.4
 */
public abstract void setRootView(ViewContainerFrame rootView);
public void prepare() ;
public void prepareUI() ;
public void initUI();

/**
 * This method sets the visibility of the root view
 * 
 * @param visible
 * @since 1.0.4
 */
public void setVisible(boolean visible);

/**
 * Sets the ViewManager
 * 
 * @param manager. If a ViewManager has been already set then an
 * exception should be thrown.
 * @see {@link ViewManager}
 */
public void setViewManager(ViewManager manager) throws ViewManagerException;

/**
 * Returns the object responsible for arranging and ordering the views. 
 * 
 * @return The view manager.
 * @see {@link ViewManager}
 */
public ViewManager getViewManager();
}