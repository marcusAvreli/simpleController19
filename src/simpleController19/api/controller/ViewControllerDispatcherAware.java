package simpleController19.api.controller;


//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/controller/ViewControllerDispatcherAware.java#L32
/**
 * This interface should be implemented by those classes which are going
 * to hold the view listeners. Right now only the <code>Application</code>
 * is responsible for that. In the future each view could receive this
 * responsability in orden to make the application more modular.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */
public interface ViewControllerDispatcherAware {
	
	/**
	 * This method sets the application controller dispatcher. There is only one
	 * ViewControllerDispatcher by application. 
	 * 
	 * @param dispatcher Sets the ViewControllerDispatcher. If a controller dispatcher
	 * has been already set then an exception should be thrown.
	 * @throws
	 */
	public abstract void setControllerDispatcher(ViewControllerDispatcher dispatcher);

	/**
	 * This method returns the controller dispatcher. The controller
	 * dispatcher knows about what action should be called depending
	 * on what component has launched the event.
	 * 
	 * @return The ViewControllerDispatcher
	 */
	public abstract ViewControllerDispatcher getControllerDispatcher();
	
}