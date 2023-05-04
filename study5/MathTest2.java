package study5;

public class MathTest2 {

	public static void main(String[] args) {
		int lotto[] = new int[7];
		
		for(int i=0;i<lotto.length;i++) {
			int nansu = (int)(Math.random()*45)+1;
			lotto[i] = nansu;
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}				
			}
			
		}
		for(int k=0;k<lotto.length;k++) {
			if(k==0) {
				System.out.print("로또번호: "+lotto[k]+" ");
			} else if(k==6) {
				System.out.print("보너스번호: "+lotto[k]);
			} else {
				System.out.print(lotto[k]+" ");
			}
		}

	}

}
