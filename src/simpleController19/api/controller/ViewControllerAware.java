package simpleController19.api.controller;

import java.util.EventListener;
import java.util.EventObject;
import java.util.List;
import java.util.Map;

/**
 * @author Mario Garcia
 * @since 1.0
 *
 */
public interface ViewControllerAware {

	/**
	 * @param viewModelMap
	 */
	public void setViewControllerMap(Map<String,List<ViewController<? extends EventListener,? extends EventObject>>> viewControllerMap);
	
	/**
	 * @return
	 */
	public Map<String,List<ViewController<? extends EventListener,? extends EventObject>>> getViewControllerMap();
	
}