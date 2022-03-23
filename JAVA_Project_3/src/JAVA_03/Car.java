package JAVA_03;

public class Car {
	
	String carName;
	String carColor;
	int speed;
	//생성자 오버로딩
	public Car() {
		
	}
	public Car(String carName,String carColor) {
		this.carName = carName;
		this.carColor = carColor;
	}
	public Car(String carColor) {
//		carName = "미정";
//		this.carColor = carColor;
		this("미정",carColor);
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void stop() {
		speed = 0;
		
	}
	public void getSpeed() {
		System.out.println(carName+":"+speed);
		
	}
	public void infor() {
		System.out.println("차종 :"+carName);
		System.out.println("색깔 :"+carColor);
		System.out.println("속도 :"+speed);
		
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speedUp(30);
		System.out.println(c1.speed);
		c1.speedUp(50);
		c1.speedUp(70);
		System.out.println(c1.speed);
		c1.stop();
		System.out.println(c1.speed);
		c1.speedUp(100);
		System.out.println(c1.speed);
		c1.carName="제네시스";
		c1.getSpeed();
		
		Car c2 = new Car("제네시스 2","흰색");
		c2.getSpeed();
		
		Car c3 = new Car("Black");
		System.out.println(c3.carColor);
		
		c1.infor();
		c2.infor();
		c3.infor();
	}
}
