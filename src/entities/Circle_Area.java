package entities;

import entities.enums.Color;

public class Circle_Area extends Shape {

	private Double radius;
	
	public Circle_Area() {
		super();
	}

	public Circle_Area(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
