package JAVA_03;

public class java_03 {
	public static void main(String[] args) {
		
		java_02 b1 = new java_02();
//		b1.name="홍길순";
		b1.setName("홍길순");
		b1.smile();
		
		java_02 b2 = new java_02();
		b2.setName("이순신");
		b2.setAge(30);
		
		System.out.println(b1.getAge());
		System.out.println(b2.getAge());
		
		
	}

}
