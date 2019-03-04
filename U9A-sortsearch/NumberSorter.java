//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		ArrayList<Integer> num = ArrayList<Integer> ();
		//567891
		int a = number,b;
		for(int i=0; i<number.length(); i++){
			
			if(a%10 > 0){
				b = a%10;
				sorted[i] = b;
				a=a/10
			}
		}
		return sorted;
	}
}
