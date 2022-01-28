package geFi;

import java.awt.Graphics;

public class Triangle extends GeometricFigure {
	
	private int w,h,x2,y2,x3,y3;
	
	
	
	public int getW() {
		return w;
	}


	public int getH() {
		return h;
	}


	public Triangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	float getPerimeter() {
		// TODO Auto-generated method stub
		return (3*w);
	}
	
	
	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return ((w*h)/2);
	}

	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x, y, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x, y);
		
	}


}
