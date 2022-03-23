package JAVA_03;

public class Bank {
	
	String name;
	int money;
	
	public Bank() {
		
	}
	public Bank(String name) {
		this.name = name;
	}
	public Bank(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void intputMoney(int money) {
		this.money+=money;
	}
	public void outMoney(int money) {
		if(this.money<money) {
			System.out.println(name+" 잔액부족");
		}else {			
			this.money-=money;
		}
		
	}
	public void getMoney() {
		System.out.println(name+"잔액"+money);
		
	}
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.name="홍길동";
		b1.getMoney();
		b1.intputMoney(5000);
		b1.getMoney();
		b1.outMoney(7000);
		b1.getMoney();
		
		Bank b2=new Bank();
		b2.name="강감찬 ";
		b2.getMoney();
		b2.intputMoney(4000);
		b2.getMoney();
		b2.outMoney(3000);
		b2.getMoney();
		
		Bank b3=new Bank("이순신");
		Bank b4=new Bank("홍길순",5000);
		b3.getMoney();
		b4.getMoney();
	}
}
