//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		a=0;
		for(int i=0; i<sentence.length(); i++){
			if(sentence.charAt(i) == ' '){
				wordRay.add( sentence.substring(a,i);
				a=i;
			}
		}
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output= "";

		for(int i=0; i<wordRay.size(); i++){
			output = wordRay.get(i) + " ";
		}
		return output+"\n\n";
	}
}
