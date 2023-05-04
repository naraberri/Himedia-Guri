package study6;

public class MyTv {
	
	public static void main(String[] args) {
		//TV 객체 생성
		TvControl tv = new TvControl();
		//TV 전원을 켠다
		tv.power();
		//TV채널을 11번으로 직접 세팅한다
		tv.channel = 11;
		//TV채널을 내린다
		tv.channelDown();
		//TV현재의 채널과 전원을 출력한다
		System.out.println("TV전원 : "+tv.power);
		System.out.println("TV채널 : "+tv.channel);
		//채널을 두번 올린다
		tv.channelUp();
		tv.channelUp();
		//변수의 값들을 출력해본다
		System.out.println("TV전원 : "+tv.power);
		System.out.println("TV채널 : "+tv.channel);
		//TV 전원을 끈다
		tv.power();
		
		System.out.println("TV전원 : "+tv.power);	
		System.out.println("TV채널 : "+tv.channel);
	}
} 