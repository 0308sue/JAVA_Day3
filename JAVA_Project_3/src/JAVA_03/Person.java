package JAVA_03;

public class Person {
	String name;
	String addr;
	String tel;
	
	public Person() {	
		
	}
	
	public Person(String name,String addr,String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	
	public void showInfo() {
		System.out.println(name+"의 주소:"+addr);
		System.out.println(name+"의 주소:"+tel);
	}

}
