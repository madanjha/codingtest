package example.testgenral;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Output:"+convert(num));
	}

	private static String convert(int num) {
		// TODO Auto-generated method stub
		if(num<20)return "";
	}

}
