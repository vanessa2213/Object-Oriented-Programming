package geFi;

import java.awt.Graphics;

public abstract class GeometricFigure {
	protected int x, y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public GeometricFigure(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	abstract float getPerimeter();
	abstract float getArea();
	abstract void draw(Graphics g);
	
}
