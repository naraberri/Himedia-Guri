package study13;

public class Test101 {

	int a;
	int b;
	
	public static void main(String[] args) {
		Test101 t1 = new Test101();
		Test101 t2 = new Test101();
		t1.a = 100;
		t2.b = 200;
		t2 = t1;// t2주소가 t1으로 바뀜
		System.out.println(t1.a);
		System.out.println(t2.a);
		
	}
}
