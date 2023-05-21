package simpleController19.swing.swing.builder;

/**
 * @author mgg
 *
 * @param <T>
 */

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/Builder.java#L9
public interface Builder<T> {

	/**
	 * @return
	 */
	public T getTarget();
	/**
	 * @return
	 */
	public Class<T> getType();
	/**
	 * @param target
	 */
	public void setTarget(T target);
}