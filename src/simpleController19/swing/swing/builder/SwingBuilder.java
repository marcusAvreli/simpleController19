package simpleController19.swing.swing.builder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import simpleController19.swing.swing.builder.component.ButtonBuilder;
import simpleController19.swing.swing.builder.component.ComponentBuilderAware;
import simpleController19.swing.swing.builder.component.JComponentBuilder;
import simpleController19.swing.swing.builder.component.LabelBuilder;


/**
 * @author mgg
 *
 */
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/SwingBuilder.java#L27
public class SwingBuilder implements ContainerBuilder<JPanel>,ComponentBuilderAware{

	private JPanel mainPanel;
	
	public SwingBuilder(){
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BorderLayout());
		this.mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	}
	
	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilderAware#button()
	 */
	
	public ButtonBuilder button() {
		ButtonBuilder builder = new ButtonBuilder(this);
		this.mainPanel.add(builder.getTarget());
		return builder;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilderAware#button(java.lang.Object)
	 */
	
	public ButtonBuilder button(Object constraints) {
		ButtonBuilder builder = new ButtonBuilder(this);
		this.mainPanel.add(builder.getTarget(),constraints);
		return builder;
	}

	/*
	public <T extends JComponent> JComponentBuilder<T> component(T component,Class<T> clazz,Object constraints) {
		JComponentBuilder<T> builder = 
			new JComponentBuilder<T>(this,component,clazz);
		this.mainPanel.add(builder.getTarget(),constraints);
		return builder;
	}
*/
	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilderAware#datePicker()
	 */
	/*
	public DatePickerBuilder datePicker() {
		DatePickerBuilder builder = new DatePickerBuilder(this);
		this.mainPanel.add(builder.getTarget());
		return builder;
	}
*/
	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilderAware#datePicker(java.lang.Object)
	 */
	
	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.Builder#getTarget()
	 */
	public JPanel getTarget() {		
		return this.mainPanel;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.Builder#getType()
	 */
	public Class<JPanel> getType() {
		return JPanel.class;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilderAware#label()
	 */
	public LabelBuilder label() {
		LabelBuilder labelBuilder = new LabelBuilder(this);
		this.mainPanel.add(labelBuilder.getTarget());
		return labelBuilder;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilderAware#label(java.lang.Object)
	 */
	public LabelBuilder label(Object constraints) {
		LabelBuilder labelBuilder = new LabelBuilder(this);
		this.mainPanel.add(labelBuilder.getTarget(),constraints);
		return labelBuilder;	
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.container.ContainerBuilder#layout(java.awt.LayoutManager)
	 */
	public SwingBuilder layout(LayoutManager layout) {
		this.mainPanel.setLayout(layout);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setEnabled(boolean)
	 */
	public SwingBuilder setEnabled(boolean enabled) {
		this.mainPanel.setEnabled(enabled);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setFont(java.awt.Font)
	 */
	public SwingBuilder setFont(Font font) {
		this.mainPanel.setFont(font);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setName(java.lang.String)
	 */
	public SwingBuilder setName(String name) {
		this.mainPanel.setName(name);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setPreferredSize(java.awt.Dimension)
	 */
	public SwingBuilder setPreferredSize(Dimension dimension) {
		this.mainPanel.setPreferredSize(dimension);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.Builder#setTarget(java.lang.Object)
	 */
	public void setTarget(JPanel target) {
		this.mainPanel = target;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilderAware#spinner()
	 */

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.SwingBuilderAware#swingBuilder()
	 */
	public SwingBuilder swingBuilder() {
		return this;
	}
	public <T extends JComponent> JComponentBuilder<T> component(T component,Class<T> clazz,Object constraints) {
		JComponentBuilder<T> builder = 
			new JComponentBuilder<T>(this,component,clazz);
		this.mainPanel.add(builder.getTarget(),constraints);
		return builder;
	}

	
}