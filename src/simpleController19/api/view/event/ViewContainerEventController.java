package simpleController19.api.view.event;





//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/event/ViewContainerEventController.java#L4
public interface ViewContainerEventController {

	public void onViewClose(ViewContainerEvent event);
	
	public void onViewInit(ViewContainerEvent event);
	
	public void onViewInitUIState(ViewContainerEvent event);
	
	public void onViewInitBackActions(ViewContainerEvent event);
	
	public void onViewFinalUIState(ViewContainerEvent event);
	
}
