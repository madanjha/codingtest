package example.testgenral;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int remnd, flag=0;
		remnd=num/2;
		for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.println("Number is not prime number");
				flag=1;
				break;
			}
			}
			 if(flag==0)    
		     System.out.println("Number is prime");
			
		/*
		int i,m=0,flag=0;    
		  int n=18;//it is the number to be checked  
		  m=n/2;    
		  for(i=2;i<=m;i++){    
		   if(n%i==0){    
		   System.out.println("Number is not prime");    
		   flag=1;    
		   break;    
		   }    
		  }    
		  if(flag==0)    
		  System.out.println("Number is prime");    */
		 

	}

}
