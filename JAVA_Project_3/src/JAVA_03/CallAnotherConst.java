package JAVA_03;

class Person1{
	String name;
	int age;
	
	public Person1() {
	this("이름없음",1);
	}
	public Person1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Person1 returnItSelf() {
		return this;
		
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person1 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		


	}

}
