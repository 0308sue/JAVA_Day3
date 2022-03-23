package JAVA_03;

public class java_01 {

	public static void main(String[] args) {
		//1~45 까지 6개 
		//난수를 발생시켜 6개의 수를 배열에 넣어 출력(중복 허용 불가)
		
		int[]lotto = new int[6];
		for(int i = 0;i<lotto.length;i++){
			int t =(int)(Math.random()*45)+1;
			if(t==lotto[i]) {
			i--;
			continue;}
			lotto[i]=t;
			}
		for(int i = 0;i<lotto.length;i++){
			System.out.println("lotto["+i+"]="+lotto[i]);
			}
		
		int n=0;
		while(n<lotto.length) {
			int f =(int)(Math.random()*45)+1;
			lotto[n]=f;
			for(int i = 0;i<n;i++)
			if(f==lotto[n]) {
				n--;
				break;
			}
		}
		for(int i = 0;i<lotto.length;i++){
		System.out.println("lotto["+i+"]="+lotto[i]);
		}

	}

}
