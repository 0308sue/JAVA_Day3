package JAVA_03;

public class Sachik {
	
	public void sum(int num1,int num2) {
		System.out.println("덧셈 : "+(num1+num2));
	}
	
	public void sub(int num1,int num2) {
		System.out.println("뺄셈 : "+(num1-num2));
	}
	
	public void mul(int num1,int num2) {
		System.out.println("곱셈 : "+num1*num2);
	}
	
	public int div(int num1,int num2) {
//		System.out.println("나눗셈 : "+num1/num2);
		int avg = num1/num2;
		return avg;
	}
	public int mul2(int num1,int num2) {
 
		return num1*num2;
		 
	}
	
	public static void main(String[] args) {
		Sachik s1= new Sachik();
		s1.sum(20,10);
		s1.sub(20,10);
		s1.mul(20,10);
		System.out.println("곱셈 main : "+s1.mul2(20,10));
//		s1.div(20,10);
		System.out.println("나눗셈 : "+s1.div(20,10));
		
		
	}

}
