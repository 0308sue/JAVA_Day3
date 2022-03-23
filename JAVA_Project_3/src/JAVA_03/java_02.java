package JAVA_03;

public class java_02 {

	private String name;
	private int age;
	
	//디폴트 생성자 : 생략 가능
	//생성자 : 객체가 생성될때 멤버 변수 값 초기화(값넣기)
	public java_02() {
		System.out.println("생성자");
		
	}
	public void smile() {
		System.out.println(name+"웃는다");

	}
	
	public void cry() {
		System.out.println(name+"운다");

	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//getter
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		java_02 b1 = new java_02();
		b1.name="홍길동";
		b1.smile();
		b1.age = 10;
		
		java_02 b2 = new java_02();
		b2.name="홍길동";
		b2.cry();
		b2.age = 5;
		System.out.println(b2.age);
		
		java_02 b3 = new java_02();
		b3.name="강감찬";
		b3.age = 30;
		b3.smile();
		System.out.println(b3.age);
		
		
		
		
	}
}
