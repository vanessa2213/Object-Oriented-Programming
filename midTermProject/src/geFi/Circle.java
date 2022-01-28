package geFi;

import java.awt.Graphics;

public class Circle extends GeometricFigure{
	
	private int radio;
	
	public int getRadio() {
		return radio;
	}


	public Circle(int x, int y, int radio) {
		super(x, y);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	float getPerimeter() {
		
		return (float) (Math.PI*2*r);
	}
	
	
	@Override
	float getArea() {
		
		return (float) (Math.PI*r*r);
	}

	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawOval(x, y, 2r, 2r);
	}

	
	

}
