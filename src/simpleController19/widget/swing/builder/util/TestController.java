package simpleController19.widget.swing.builder.util;

import simpleController19.core.util.ComponentFinder;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleController19.api.controller.BackgroundException;
import simpleController19.api.view.ViewContainer;
import simpleController19.api.view.ViewException;
import simpleController19.api.view.event.ViewContainerEventController;
import simpleController19.core.controller.AbstractViewController;

/**
 * @author Mario Garcia
 * @since 1.0.2
 * 
 */

///https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/core/src/test/java/org/viewaframework/common/TestController.java#L19
public class TestController extends AbstractViewController<ActionListener, ActionEvent> {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.viewaframework.controller.ViewController#getSupportedClass()
	 */
	public Class<ActionListener> getSupportedClass() {
		return ActionListener.class;
	}

	private void debugJustInCase(String message) {
		if (logger.isInfoEnabled()) {
			logger.info(message);
		}
	}
	public void handleView(ViewContainer view, ActionEvent eventObject) throws BackgroundException{
		debugJustInCase("handleView_called");
		Map<String,List<Component>> map = view.getNamedComponents();
		debugJustInCase("handleView_called"+map);
		Map<Object,ViewContainer> viewMap = view.getApplication().getViewManager().getViews();
		debugJustInCase("view_container_map:"+viewMap);
		ViewContainer viewContainer = viewMap.get("TableViewId");
		Map<String,List<Component>> map2 = viewContainer.getNamedComponents();
		JLabel field = ComponentFinder.find(JLabel.class).in(viewContainer).named("toLabel");
		field.setText("hello");
		
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.viewaframework.controller.AbstractViewController#postHandlingView
	 * (org.viewaframework.view.ViewContainer, java.util.EventObject)
	 */
	@Override
	public void postHandlingView(ViewContainer view, ActionEvent eventObject) throws ViewException {
		String actionCommand = eventObject.getActionCommand();
		List<ViewContainerEventController> listeners = view.getViewContainerListeners();
		if (null != listeners && !listeners.isEmpty()) {
			debugJustInCase("listeners:" + listeners.size());
			ViewContainerEventController listener = listeners.get(0);

		} else {
			debugJustInCase("listeners_is_empty");
		}

		debugJustInCase(actionCommand);
		Object object = eventObject.getSource();
		if (null != object) {
			debugJustInCase("post_handling_view:" + object.getClass().getSimpleName());
		}
		debugJustInCase("post_handling_view:" + view.getNamedComponents());
		// JTextField field =
		// ComponentFinder.find(JTextField.class).in(view).named("text");
		// field.setText("Hey it worked");
	}
}