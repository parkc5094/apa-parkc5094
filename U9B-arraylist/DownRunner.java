//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class DownRunner
{
  public static void main( String args[] )
  {
	ArrayList<Integer> nums;
	nums = new ArrayList<Integer>();

	nums.add(-99);
	nums.add(1);
	nums.add(2);
	nums.add(3);
	nums.add(4);
	nums.add(5);
	nums.add(6);
	nums.add(7);
	nums.add(8);
	nums.add(9);
	nums.add(10);
	nums.add(12345);

	System.out.println(ListDown.go(nums));
									
  }
}
