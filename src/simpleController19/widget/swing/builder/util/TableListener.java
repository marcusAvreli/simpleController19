package simpleController19.widget.swing.builder.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleController19.core.view.event.DefaultViewContainerEventController;


public class TableListener implements ActionListener{
	private static final Logger logger = LoggerFactory.getLogger(TableListener.class);
	private void debugJustInCase(String message) {
		if (logger.isInfoEnabled()) {
			logger.info(message);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		logger.info("action_listener");
	}

}
