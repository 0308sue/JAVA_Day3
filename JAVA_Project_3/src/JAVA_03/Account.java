package JAVA_03;

public class Account {
  private String name;
  private int money;
	public Account(String name,int money) {
		this.name = name;
		this.money = money;
	}
	public void inputMoney(int money) {
		this.money += money;
	}
	public void outputMoney(int money) {
		if(this.money<money) {
			System.out.println(name+"님 잔액부족");
			return;//종료
	}
		this.money -= money;
//		if(this.money<money) {
//			System.out.println(name+"님 잔액부족");
//		}else {
//			this.money-=money;
//		}
	}
	public void getMoney() {
		System.out.println(name+"님의 잔액은"+money+"입니다.");
	}	
	
	//getter;
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		
		
	}
}
