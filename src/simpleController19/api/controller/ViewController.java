package simpleController19.api.controller;

import java.util.EventListener;
import java.util.EventObject;

import simpleController19.api.view.ViewContainer;
import simpleController19.api.view.ViewException;
import simpleController19.api.view.ViewManager;

public interface ViewController<EL extends EventListener,EO extends EventObject> extends ListenerProxy<EL,EO> {

	/**
	 * Its the callback method. It is called from a given component of the 
	 * view in order to perform some action. It should call first to
	 * preHandlingView() for cleaning up some information data then
	 * it calls to handleView(..) and finally calls to postHandlingView(...).<br/><br/>
	 * 
	 * Notice that depending on the listener proxied the EventObject should be
	 * casted in order to get the desired information from it.
	 * 
	 * @param view The view where this listener belongs
	 * @param eventObject The event fired by the proxied listener.
	 */
	public void executeHandler(ViewContainer view,EO eventObject);
	
	/**
	 * This method tells the controller the source listener to be proxied. 
	 * 
	 * @return The type of the proxied listener
	 */
	public Class<EL> getSupportedClass();
	
	/**
	 * Returns the application's current view manager
	 * 
	 * @return The current view manager
	 */
	public ViewManager getViewManager();

	/**
	 * This is the method where the logical handling of the data should
	 * be called. Any UI call should be done in post/pre-handling methods.
	 * It is important to notice that the code executed within this method
	 * should be running in other thread than EventDispathThread.
	 * 
	 * @param view
	 * @param eventObject
	 * @throws BackgroundException
	 */
	public void handleView(ViewContainer view,EO eventObject) throws BackgroundException;

	
	/**
	 * Used for some UI updating before the logical code has been
	 * called.
	 * 
	 * @param view
	 * @param eventObject
	 * @throws ViewException
	 */
	public void postHandlingView(ViewContainer view,EO eventObject) throws ViewException;
	
	/**
	 * Used for some UI updating before the logical code has been
	 * called.
	 * 
	 * This method is only called in some exception has been thrown in {@link ViewController#preHandlingView(ViewContainer, EventObject)}
	 * 
	 * @param view
	 * @param eventObject
	 * @param th
	 */
	public void postHandlingViewOnError(ViewContainer view,EO eventObject, BackgroundException be)throws ViewException;
	
	/**
	 * Used for some UI updating once the logical code has been
	 * called.
	 * 
	 * @param view
	 * @param eventObject
	 * @throws ViewException
	 */
	public void preHandlingView(ViewContainer view,EO eventObject) throws ViewException;
	
	
}