package com.graphicobject;

public abstract class GraphicObject {

	int x, y;

	void moveTo(int newX, int newY) {
		System.out.println("GraphicObject.moveTo()");
	}

	abstract void draw();

	abstract void resize();
}

class Circle extends GraphicObject {
	void draw() {

		System.out.println("Circle.draw()");
	}

	void resize() {
		System.out.println("Circle.resize()");
	}
}

class Rectangle extends GraphicObject {
	void draw() {
		System.out.println("Rectangle.draw()");
	}

	void resize() {
		System.out.println("Rectangle.resize()");
	}
}

class Driver{
	public static void main(String[] args) {
		GraphicObject go = new Rectangle();
		go.draw();
		go.moveTo(8,90);
		go.resize();
		
	//.out.println("Driver.main()");
		
		System.out.println("**********************************************");
		
		GraphicObject go1 = new Circle();
		go1.draw();
		go1.moveTo(8,90);
		go1.resize();
	}
}