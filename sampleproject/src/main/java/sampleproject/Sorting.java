package sampleproject;

import java.util.*;

public class Sorting {
	
	public static void main(String[] args)
	{
		
		String input[] = { "January", "February", "March", "April", "May", "June", "July",
				"august", "September", "October", "november", "December" } ;
		
		int k = input.length;
				
		String temp="";
		
		List<String> list = new ArrayList<String>();
		
		for( int i=0;i<k;i++)
		{
			for(int j =i+1;j<k;j++)
			{
			if(input[i].compareTo(input[j])>0)
				{
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				//System.out.println("after swap: "+input[j]);
				
				}
			//list.add(input[i]);
			}
			list.add(input[i]);	
		}
		
		System.out.println("after sort: " + list);
		
	
		
	}
}
