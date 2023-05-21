package simpleController19.swing.swing.builder.component;

import javax.swing.JComponent;

import simpleController19.swing.swing.builder.SwingBuilder;


/**
 * @author mgg
 *
 * @param <T>
 */
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/component/ComponentBuilderAbstract.java#L12
public abstract class ComponentBuilderAbstract<T extends JComponent> implements ComponentBuilder<T>{

	private SwingBuilder rootBuilder;
	
	/**
	 * @param swingBuilder
	 */
	public ComponentBuilderAbstract(SwingBuilder swingBuilder){
		this.rootBuilder = swingBuilder;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.SwingBuilderAware#swingBuilder()
	 */
	public SwingBuilder swingBuilder() {
		return this.rootBuilder;
	}	
}