package simpleController19.api.view.event;

import java.util.List;

public interface ViewContainerEventControllerAware {

	public abstract void addViewContainerListener(ViewContainerEventController listener);
	public abstract void removeViewContainerListener(ViewContainerEventController listener);
	public abstract void setViewContainerListeners(List<ViewContainerEventController> listeners);
	public abstract List<ViewContainerEventController> getViewContainerListeners();
}