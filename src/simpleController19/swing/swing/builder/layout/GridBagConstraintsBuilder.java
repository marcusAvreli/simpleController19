package simpleController19.swing.swing.builder.layout;

import java.awt.GridBagConstraints;
import java.awt.Insets;

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/layout/GridBagConstraintsBuilder.java#L10
public class GridBagConstraintsBuilder {

	private GridBagConstraints constraints;
	
	public GridBagConstraintsBuilder(){
		this.constraints = new GridBagConstraints();
		this.constraints.fill = GridBagConstraints.HORIZONTAL;
	}
	
	public GridBagConstraintsBuilder fill(int fill){
		this.constraints.fill = fill;
		return this;
	}
	
	public GridBagConstraintsBuilder col(int gridx){
		this.constraints.gridx = gridx;
		return this;
	}
	
	public GridBagConstraintsBuilder row(int gridy){
		this.constraints.gridy = gridy;
		return this;
	}
	
	public GridBagConstraintsBuilder weightx(double weightx){
		this.constraints.weightx = weightx;
		return this;
	}
	
	public GridBagConstraintsBuilder insets(int top,int right,int bottom,int left){
		this.constraints.insets = new Insets(top,left,bottom,right);
		return this;
	}
	
	public GridBagConstraintsBuilder ipadx(int paddingx){
		this.constraints.ipadx = paddingx;
		return this;
	}
	
	public GridBagConstraintsBuilder ipady(int paddingy){
		this.constraints.ipady = paddingy;
		return this;
	}
	
	public GridBagConstraintsBuilder anchor(int anchor){
		this.constraints.anchor = anchor;
		return this;
	}
	
	public GridBagConstraintsBuilder weighty(double weighty){
		this.constraints.weighty = weighty;
		return this;
	}
	
	public GridBagConstraintsBuilder gridWidth(int cols){
		this.constraints.gridwidth = cols;
		return this;
	}
	
	public GridBagConstraintsBuilder gridHeight(int rows){
		this.constraints.gridheight = rows;
		return this;
	}
	
	public GridBagConstraints build(){
		return this.constraints;
	}
}