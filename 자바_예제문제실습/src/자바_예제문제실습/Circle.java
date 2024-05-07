package 자바_예제문제실습;

import java.io.Serializable;

public class Circle implements Serializable {
	public static final double PI = 3.14;
	public double radius;
	
	//    Alt Shift S O
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Getter Setter
	public static double getPi() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}

	public static void main(String[] args) {
		Circle 원  = new Circle(2.5);
		원.draw();
	}


}





