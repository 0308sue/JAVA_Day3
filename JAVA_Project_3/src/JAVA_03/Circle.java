package JAVA_03;


public class Circle {
	
		String name;
		int r;
		
		public Circle() {
		this("이름없음",1);
		}
		public Circle(String name,int r) {
			this.name=name;
			this.r=r;
		}
		public double getArea() {
			return r*r*3.14;
			
		}


	public static void main(String[] args) {
		Circle c1;
		c1 = new Circle("피자",10);
		System.out.println(c1.name+"크기"+c1.getArea());
		
		Circle c2 = new Circle();
		c2.name = "도넛";
		c2.r = 5;
		System.out.println(c2.name+"크기"+c2.getArea());
		System.out.println("총면적 : "+(c1.getArea()+c2.getArea()));
		
	}
}
