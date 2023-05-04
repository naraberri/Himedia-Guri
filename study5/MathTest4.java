package study5;

public class MathTest4 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int idx = 0;
		while(true) {
			boolean b1 = false;
			int number = (int)(Math.random()*45)+1;
			for(int i=0;i<6;i++) {
				if(number==lotto[i]) b1 = true;				
			}
			if(b1==false) {
				lotto[idx] = number;			
			} else {
				continue;
			}
			idx++;
			if(idx==6)break;
		}
		for(int i : lotto) {
			System.out.print(i+" ");
		}

	}

}
