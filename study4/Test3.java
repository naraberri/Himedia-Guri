package study4;

public class Test3 {

	public static void main(String[] args) {
		
		int[][] classA = { {90,80,70},{50,100,100} };
		int[] hap = new int[2];
		
		for(int i=0; i<classA.length; i++) {
			for(int j=0; j<classA[i].length; j++) {
				System.out.println(classA[i][j]);
				hap[i] += classA[i][j];
			}
		}
		
		int len1 = classA[0].length;
		int len2 = classA[1].length;
		
		System.out.println("1반 총점:"+hap[0]+"점/평균:"+(hap[0]/len1)+"점");
		System.out.println("1반 총점:"+hap[1]+"점/평균:"+(hap[1]/len2)+"점");
		System.out.println("전체평균:"+(hap[0]+hap[1])/(len1+len2)+"점");
	}

}
