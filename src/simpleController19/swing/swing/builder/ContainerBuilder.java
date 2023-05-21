package simpleController19.swing.swing.builder;

import java.awt.Container;
import java.awt.LayoutManager;

import simpleController19.swing.swing.builder.component.ComponentBuilder;


/**
 * @author mgg
 *
 * @param <T>
 */

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/container/ContainerBuilder.java#L13
public interface ContainerBuilder<T extends Container> extends ComponentBuilder<T>{

	/**
	 * @param layout
	 * @return
	 */
	public ContainerBuilder<T> layout(LayoutManager layout);

}