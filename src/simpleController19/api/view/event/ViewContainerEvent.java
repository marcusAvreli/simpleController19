package simpleController19.api.view.event;

import simpleController19.api.view.ViewContainer;


//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/event/ViewContainerEvent.java#L10
public class ViewContainerEvent {
	
	private ViewContainer source;

	/**
	 * @param view
	 */
	public ViewContainerEvent(ViewContainer view){
		this.source = view;;
	}
	
	/**
	 * @return
	 */
	public ViewContainer getSource() {
		return source;
	}

	/**
	 * @param source
	 */
	public void setSource(ViewContainer source) {
		this.source = source;
	}

}