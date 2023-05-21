package simpleController19.api.view;

import java.awt.Component;
import java.util.List;
import java.util.Map;

/**
 * This interface helps ViewContainer to handle visual components in
 * an easy way.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */
public interface ComponentsAware 
{
	/**
	 * This method retrieves components by its name. If the component doesn't exist
	 * it returns an empty List.
	 * 
	 * @param name The name of the component we want to retrieve
	 * @return The Component
	 */
	public abstract List<Component> getComponentsByName(String name);
	
	/**
	 * This method retrieves components by its name. If the component doesn't exist
	 * it returns <code>null</code>.
	 * 
	 * @param name The name of the component we want to retrieve
	 * @return The Component
	 */	
	public abstract Component getComponentByName(String name);
	
	/**
	 * It retrieves all the named components within the main Container
	 * returned by this view.
	 * 
	 * @return A map with all the named components
	 */
	public abstract Map<String,List<Component>> getNamedComponents();
	
	/**
	 * NamedComponents should be filled by an external delegator. It should inspect
	 * the rootPane of the view and retrieve all named java.awt.Component components.
	 * 
	 * @param namedComponents
	 */
	public abstract void setNamedComponents(Map<String,List<Component>> namedComponents);
}