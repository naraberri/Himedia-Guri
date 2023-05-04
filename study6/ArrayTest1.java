package study6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] score = {66,77,88,22,33,44,55,11,99};
		System.out.println(Arrays.toString(score));
		System.out.println("MAX 값 : "+ArrayBig(score));
		System.out.println("MIN 값 : "+ArraySmall(score));
		System.out.println("MIDDLE 값 : "+ArrayCenter(score));
		System.out.println();
		System.out.println("숫자를 입력해주세요");
		double a1 = scn.nextDouble();
		System.out.println("확인할 소수점 자리수를 입력해주세요");
		int a2 = scn.nextInt();
		double result1 = MyPoint(a1,a2);
		System.out.println(result1);
		

	}
	
	public static int ArrayBig(int[] big) {
		int max = big[0];
		for(int i=0;i<big.length;i++) {
			max = Math.max(max, big[i]);
		}
		
		return max;
	}
	
	public static int ArraySmall(int[] small) {
		int min = small[0];
		for(int i=0;i<small.length;i++) {
			min = Math.min(min, small[i]);
		}
		
		return min;
	}
	
	public static int ArrayCenter(int[] center) {
		Arrays.sort(center);
		int a1 = Math.round(center.length/2);
		int mid = center[a1];
		
		return mid;
	}
	
	public static double MyPoint(double a1,int p1) {
		int a2 = (int)(a1*Math.pow(10,p1));		
		double a3 = a2/(double)Math.pow(10,p1);
		
		return a3;		
	}

}
