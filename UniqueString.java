package example.testgenral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		boolean result=false;
		Scanner sc=new Scanner(System.in);
		String inputstring=sc.next();
		System.out.println("String method 4 answer "+ method4(inputstring));
	}

	/*static boolean method1(String input){
		HashSet < Character> uniquecharset= new HashSet();
		for(int i=0;i < inputstring.length();i++)
		{
			result=uniquecharset.add(inputstring.charAt(i));
			if (result == false)
				break;
		}
		System.out.println(result); 
	}*/
	public static boolean method2(String input)
	{
		for(int i=0; i < input.length();i++)
		{
			char charcterofinputstring=input.charAt(i);
			int count=0;
			for(int j=i; j < input.length();j++)
			{
				if (charcterofinputstring==input.charAt(j))
					count++;
			}
			if(count > 1)
				return false;
		}
		return true;
	}
	public static boolean method3(String input)
	{
		ArrayList ar= new ArrayList();
		for (int i=0; i < input.length() ; i++ )
		{
			int j = input.indexOf(input.charAt(i));
			ar.add(j);
		}
		Collections.sort(ar);
		for (int i=0;i < (ar.size()-1);i++)
		{
			if (ar.get(i) == ar.get(i+1))
				return false;
		}
		return true;
	}
	public static boolean method4(String input)
	{
		boolean result=false;
		for (char ch: input.toCharArray())
		{
			if(input.indexOf(ch)== input.lastIndexOf(ch))
				result= true;
			else
			{
				result=false;
				break;
			}
		}
		return result;
	}

}