package geFi;

import java.awt.Graphics;

public class Rectangle extends GeometricFigure {
	
	private int w,h;

	
	public float getW() {
		return w;
	}



	public float getH() {
		return h;
	}



	public Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	float getPerimeter() {
		// TODO Auto-generated method stub
		return (2*w+2*h);
	}

	
	
	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return (w*h);
	}

	
	@Override
	public void draw(Graphics g) {
		
		g.drawRect(x, y, w, h);
		
	}

	

}
