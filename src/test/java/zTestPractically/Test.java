package zTestPractically;

import java.util.Arrays;
import java.util.Scanner;

public class Test 
{
		
	public static void main(String[] args) 
	{
		int [] num = {3,2,1,6,8,9,9};
		int temp;
		System.out.println(Arrays.toString(num));
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		for(int i=(num.length)-2; i>=0; i--)
		{
			if(num[i]!=num[num.length-1])
			{
				System.out.println(num[i]);
				break;
			}
		}		
	}
}