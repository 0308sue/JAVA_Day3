package JAVA_03;

class TV {
	String maker;
	int year,inch;
	
	public TV() {
		
	}
	public TV(String maker,int year,int inch) {
		this.maker = maker;
		this.year = year;
		this.inch = inch;
	}
	public TV(String maker,int year) {
		this.maker = maker;
		this.year = year;
	}
	
	public void show() {
		if(inch==0) {
		System.out.println(maker+"에서 만든 "+year+"년도형 TV");
		}else {			
		System.out.println(maker+"에서 만든 "+year+"년도형"+inch+"인치 TV");
		}
		
//		int num;//지역 변수는 반드시 초기값이 있어야함
//		System.out.println(num);
	}
}

public class TVMain {
	

	public static void main(String[] args) {
		TV tv1 = new TV("LG",2021,65);
		tv1.show();
		
		TV tv2 = new TV("삼성",2021);
		tv2.show();
		
		TV tv3 = new TV("LG",2022,55);
		tv3.show();

	}

}
