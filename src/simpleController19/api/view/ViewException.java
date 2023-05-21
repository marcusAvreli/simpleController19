package simpleController19.api.view;

/**
 * This class will be thrown anytime something goes wrong in
 * a view related process.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */
public class ViewException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public ViewException(){
		super();
	}
	
	public ViewException(String message){
		super(message);
	}

}