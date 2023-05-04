package study2;

public class Test5 {

	public static void main(String[] args) {
		//배열안에 배열이 들어가 있음
		int[][] engs = {{30,80,90},{60,70,90}};
		System.out.println(engs[0][0]);
		System.out.println(engs[0][1]);
		System.out.println(engs[0][2]);
		System.out.println(engs[1][0]);
		System.out.println(engs[1][1]);
		System.out.println(engs[1][2]);
		
		System.out.println("---------------------------------");
		
		int[][] kors = {{30,80,90},{60,70,90},{50,20,70,50}};
		
		/*
		 * 1차원 배열
		 */
		int[] jumsu = {30,90,90};
		
		/*
		 * 2차원 배열
		 */
		int[][] grader1 = {{30,80,90},{50,20,70}};
		
		/*
		 * 3차원 배열
		 * 예) 전교 -> 1학년 2개반,		2학년 3개반 세팅
		 * 			{ { {},{} }  ,   { {},{},{} } }
		 **/
		int[][][] school = { 
							{ {30,80,90},{50,20,70} },
							{ {70,90,50},{80,90,40},{70,90,80} } };
		//2학년 2반 1번 학생 점수
		System.out.println(school[1][1][0]);
		//1학년 1반 3번 학생 점수
		System.out.println(school[0][0][2]);
		//2학년 3반 2번 학생 점수
		System.out.println(school[1][2][1]);

	}

}
