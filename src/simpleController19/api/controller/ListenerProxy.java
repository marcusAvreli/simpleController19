package simpleController19.api.controller;

import java.lang.reflect.InvocationHandler;
import java.util.EventListener;
import java.util.EventObject;

/**
 * This interface allows proxys to give some information about the listeners the proxy is
 * facing.
 * 
 * @author mario
 *
 * @param <EL>
 * @param <EO>
 */
public interface ListenerProxy<EL extends EventListener,EO extends EventObject> extends InvocationHandler {

	/**
	 * Returns the listener the proxy is carrying.
	 * 
	 * @return
	 */
	public ViewController<EL, EO> getTargetController();
	
}