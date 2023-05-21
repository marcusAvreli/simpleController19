package simpleController19.api.view;

public interface Delegator {
	
	public void inject(ViewContainer viewContainer) throws ViewException;
	public void clean(ViewContainer viewContainer)throws ViewException;

}