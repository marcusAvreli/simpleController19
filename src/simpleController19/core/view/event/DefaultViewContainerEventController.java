package simpleController19.core.view.event;

import simpleController19.api.view.event.ViewContainerEvent;
import simpleController19.api.view.event.ViewContainerEventController;

/**
 * Default implementation of the {@link ViewContainerEventController}
 * 
 * @author mgg
 *
 */
public class DefaultViewContainerEventController implements ViewContainerEventController{
	
	/* (non-Javadoc)
	 * @see org.viewaframework.view.event.ViewContainerEventController#onViewClose(org.viewaframework.view.event.ViewContainerEvent)
	 */
	@Override
	public void onViewClose(ViewContainerEvent event) {}

	/* (non-Javadoc)
	 * @see org.viewaframework.view.event.ViewContainerEventController#onViewInit(org.viewaframework.view.event.ViewContainerEvent)
	 */
	@Override
	public void onViewInit(ViewContainerEvent event) {}

	/* (non-Javadoc)
	 * @see org.viewaframework.view.event.ViewContainerEventController#onViewInitUIState(org.viewaframework.view.event.ViewContainerEvent)
	 */
	@Override
	public void onViewInitUIState(ViewContainerEvent event) {}

	/* (non-Javadoc)
	 * @see org.viewaframework.view.event.ViewContainerEventController#onViewInitBackActions(org.viewaframework.view.event.ViewContainerEvent)
	 */
	@Override
	public void onViewInitBackActions(ViewContainerEvent event) {}

	/* (non-Javadoc)
	 * @see org.viewaframework.view.event.ViewContainerEventController#onViewFinalUIState(org.viewaframework.view.event.ViewContainerEvent)
	 */
	@Override
	public void onViewFinalUIState(ViewContainerEvent event) {}
}