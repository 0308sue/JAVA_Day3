package JAVA_03;

import java.util.Scanner;

class Triangle{
	
	
	double width,height;
	public Triangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height/2;
	}
	
	public void setBottom(double width) {
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
}

public class TriangleMain {

	public static void main(String[] args) {
//		Triangle tr1 = new Triangle(10.2,17.3);
//		System.out.println("삼각형의 넓이 : "+tr1.getArea());
//		tr1.setBottom(7.5);
//		tr1.setHeight(11.2);
		
//		밑변과 높이를 입력 받아 삼각형의 넓이 구하기 
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변과 높이를 입력 하세요 >>");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
//		Triangle tr = new Triangle(width,height);
		Triangle tr ;//선언 
		tr = new Triangle(width,height);//생성 
		System.out.println("삼각형의 넓이 : "+tr.getArea());

	}

}
