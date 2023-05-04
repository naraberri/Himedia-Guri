package study1;

public class Test7 {

	public static void main(String[] args) {
		
		int a = 1;
		++a;
		++a;
		a++;
		System.out.println(a);
		System.out.println("-----------");
		
		int b = 1;
		++b;
		//int c = ++b; 3
		int c = b++;	//++우선순위가 낮아서 값은 그대로 넘어가고 본인은 ++받음
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("-----------");
		
		int num = 1;
		//1증가
		num++;
		++num;
		num = num+1;
		num += 1;
		//2증가
		num = num+2;
		num += 2;
		//2곱셈
		num = num*2;
		num *= 2;
		//2나누기
		num = num/2;
		num /= 2;
		
	}	
}
