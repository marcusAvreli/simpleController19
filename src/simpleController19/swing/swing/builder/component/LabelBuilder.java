package simpleController19.swing.swing.builder.component;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

import simpleController19.swing.swing.builder.SwingBuilder;


/**
 * @author mgg
 *
 */
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/SwingBuilder.java#L115
public class LabelBuilder extends ComponentBuilderAbstract<JLabel>{

	private JLabel label;
	
	/**
	 * @param swingBuilder
	 */
	public LabelBuilder(SwingBuilder swingBuilder){
		super(swingBuilder);
		this.label = new JLabel();
		this.label.setFont(new Font("",Font.PLAIN,12));
	}
	
	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.Builder#getTarget()
	 */
	public JLabel getTarget() {
		return this.label;
	}
	
	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.Builder#getType()
	 */
	public Class<JLabel> getType() {
		return JLabel.class;
	}
	
	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setName(java.lang.String)
	 */
	public LabelBuilder setName(String name){
		this.label.setName(name);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.Builder#setTarget(java.lang.Object)
	 */
	public void setTarget(JLabel target) {
		this.label = target;
	}

	/**
	 * @param text
	 * @return
	 */
	public LabelBuilder setText(String text){
		this.label.setText(text);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setFont(java.awt.Font)
	 */
	public LabelBuilder setFont(Font font) {
		this.label.setFont(font);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setEnabled(boolean)
	 */
	public LabelBuilder setEnabled(boolean enabled) {
		this.label.setEnabled(enabled);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.examples.viewaframework.swing.component.ComponentBuilder#setPreferredSize(java.awt.Dimension)
	 */
	public LabelBuilder setPreferredSize(Dimension dimension) {
		this.label.setPreferredSize(dimension);
		return this;
	}
}