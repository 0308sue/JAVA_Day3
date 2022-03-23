package JAVA_03;

public class Sachik2 {
	int num1,num2;
	
	public Sachik2() {	
		
	}
	
	public Sachik2(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//메소드 오버로딩
	public void sum() {
		System.out.println("덧셈 : "+(num1+num2));//매개변수,파라미터 
	}
	public void sum(int num1,int num2) {
		System.out.println("더하기 : "+(num1+num2));
	}
	
	public void sub() {
		System.out.println("뺄셈 : "+(num1-num2));
	}
	
	public void mul() {
		System.out.println("곱셈 : "+num1*num2);
	}
	
	public void div() {
		System.out.println("나눗셈 : "+num1/num2);
	}
	public int divide() {
		 
		return num1/num2;
		 
	}
	
	public static void main(String[] args) {
		Sachik2 sa1= new Sachik2(20,10);
		sa1.sum();
		sa1.sub();
		sa1.mul();
		sa1.div();
		
		Sachik2 sa2= new Sachik2(56,8);
		sa2.sum();
		System.out.println("나눗셈 : "+sa2.divide());
		
		Sachik2 sa3= new Sachik2();
		sa3.sum(5,7);//인수,아규먼트
		
	}

}
