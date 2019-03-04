//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		
	}
	public static void shiftEm(int[] array)
	{
		int a=0;
		int original = array.size();
		for(int i=0; i< array.size(); i++){
			if(array.get(i) ==7){
				array.add(a, 7);
				a++;
			}
		}
		for (int i=array.size(); i> array.size() - original; i--){
			array.remove(i);
		}
	}
}
