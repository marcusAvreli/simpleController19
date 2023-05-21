package simpleController19.swing.swing.builder.component;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;

import simpleController19.swing.swing.builder.SwingBuilder;


/**
 * @author mgg
 *
 * @param <T>
 */

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/component/JComponentBuilder.java#L15
public class JComponentBuilder<T extends JComponent> extends ComponentBuilderAbstract<T>{

	private T component;
	private Class<T> componentClass;
	
	/**
	 * @param swingBuilder
	 * @param component
	 * @param clazz
	 */
	public JComponentBuilder(SwingBuilder swingBuilder,T component,Class<T> clazz){
		super(swingBuilder);
		this.component = component;
		this.componentClass = clazz;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setName(java.lang.String)
	 */
	public ComponentBuilder<T> setName(String name) {
		this.component.setName(name);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setFont(java.awt.Font)
	 */
	public ComponentBuilder<T> setFont(Font font) {
		this.component.setFont(font);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setEnabled(boolean)
	 */
	public ComponentBuilder<T> setEnabled(boolean enabled) {
		this.component.setEnabled(enabled);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setPreferredSize(java.awt.Dimension)
	 */
	public ComponentBuilder<T> setPreferredSize(Dimension dimension) {
		this.component.setPreferredSize(dimension);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.Builder#getTarget()
	 */
	public T getTarget() {
		return this.component;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.Builder#getType()
	 */
	public Class<T> getType() {
		return this.componentClass;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.Builder#setTarget(java.lang.Object)
	 */
	public void setTarget(T target) {
		this.component = target;
	}
}