package JAVA_03;

public class AccountMain {

	public static void main(String[] args) {
		Account ac1= new Account("홍길동",600);
		ac1.inputMoney(5000);
		ac1.outputMoney(7000);
		ac1.getMoney();
//		System.out.println(ac1.name);
		System.out.println(ac1.getName());
	}

}
