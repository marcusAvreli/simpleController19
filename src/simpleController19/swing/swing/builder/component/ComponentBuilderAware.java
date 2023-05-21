package simpleController19.swing.swing.builder.component;

import javax.swing.JComponent;

/**
 * @author mgg
 *
 */
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/component/ComponentBuilderAware.java#L28
public interface ComponentBuilderAware {

	/**
	 * @return
	 */
	public LabelBuilder label();
	/**
	 * @param constraints
	 * @return
	 */
	public LabelBuilder label(Object constraints);
	
	public <T extends JComponent> JComponentBuilder<T> component(T component,Class<T> clazz,Object constraints);

}