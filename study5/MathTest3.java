package study5;

import java.util.Arrays;

public class MathTest3 {

	public static void main(String[] args) {
		System.out.println("------------풀어보기 0------------");
		int n1 = 1000;
		int n2 = 1200;
		System.out.println("max: "+Math.max(n1, n2));
		System.out.println("min: "+Math.min(n1, n2));
		
		System.out.println("------------풀어보기 1------------");
		int[] a1 = {90,80,-40};
		int hap = 0;
		int avg = 0;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<0 ) {				
				hap += Math.abs(a1[i]);
			} else {
				hap += a1[i];
			}
			
		}
		avg = hap/a1.length;
		System.out.println("총합 : "+hap+" / 평균 : "+avg);
		
		System.out.println("------------풀어보기 2------------");
		int[] a2 = {5,45,23,2,34,21};
		int c1 = 0;
		int c2 = 0;
		for(int i=0;i<a2.length;i++) {
			c1 = Math.max(c1,a2[i]);
			if(i==0) {
				c2 = a2[i];
			} else {
				c2 = Math.min(c2,a2[i]);
			}
		}
		System.out.println("Max값: "+c1+" Min값: "+c2);
		
		/*System.out.println("------------풀어보기 3------------");		
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
			System.out.print("로또번호 : ");
			for(int k=0;k<lotto.length-1;k++) {			
					System.out.print(lotto[k]+" ");
				}
			System.out.println("보너스번호 : "+lotto[6]);*/
		System.out.println("------------풀어보기 3------------");	
			int lotto[] = new int[6];
			int bonus = 0;
			
			for(int i=0;i<lotto.length+1;i++) {
				if(i==6) {
					int nansu = (int)(Math.random()*45)+1;
					bonus = nansu;
				} else {
					int nansu = (int)(Math.random()*45)+1;
					lotto[i] = nansu;
				}
				for(int j=0;j<i;j++) {
					if(i<6 && lotto[i]==lotto[j]) {
						i--;
						break;
					}else if(i==6 && bonus==lotto[j]) {
						i--;
						break;
					}
				}					
			}
			Arrays.sort(lotto);
			System.out.print("로또번호 : ");
			for(int k=0;k<lotto.length;k++) {			
					System.out.print(lotto[k]+" ");
				}
			System.out.println("보너스번호 : "+bonus);
		
	}	
				
}


