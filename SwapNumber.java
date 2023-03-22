package example.testgenral;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int fistNo=sc.nextInt();
		int secNo=sc.nextInt();
		System.out.println("FirstNo:"+fistNo+"SecNo:"+secNo);
		fistNo=fistNo+secNo;
		secNo=fistNo-secNo;
		fistNo=fistNo-secNo;
		System.out.println("After swaping: \nFirstNo:"+fistNo+"\tSecNo:"+secNo);
	}

}
