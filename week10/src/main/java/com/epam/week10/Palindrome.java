package com.epam.week10;
import java.util.*;
/**
 * Hello world!
 *
 */

public class Palindrome 
{
	interface Palindrom
	{
		public List<String> palin();
	}
	public static boolean check(String word)
	{
		int i1=0;
		int i2=word.length()-1;
		while(i2>i1){
		    if(word.charAt(i1)!=word.charAt(i2)){
		        return false;
		    }
		    i1++;
		    i2--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Palindrom p=()->{
		System.out.println("Enter no of Strings");
		int n=sc.nextInt();
		List<String> s=new ArrayList<>();
		System.out.println("Enter "+n+"strings to be added");
		for(int i=0;i<n;i++)
		{
			s.add(sc.next());
		}
		List<String> result=new ArrayList<>();
		for(int i=0;i<s.size();i++)
		{
			String x=s.get(i);
			if(check(x)==true)
				result.add(x);
		}
		return result;
	  };
	  System.out.println("Palindrome strings from given input:"+p.palin());
	 sc.close();
	}

}