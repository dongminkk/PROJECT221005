package 연습문제6장;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이 있어도되고 영어 한글 모두 됩니다.");
		String str=sc.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++) {
			System.out.print(str.substring(i+1,len));
			System.out.print(str.substring(0,i+1));
			System.out.println();
		}
	}
 
}
