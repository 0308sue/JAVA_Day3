package JAVA_03;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.addr = "부산";
		p1.tel = "010-1111-2222";
		p1.showInfo();
		
		Person p2 = new Person("이순신","서울","010-3333-4444");
		p2.showInfo();
		
		

	}

}
