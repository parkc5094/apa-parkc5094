//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
  public static boolean go( List<Integer> ray )
  {
    int a=0; b=0;
        for(int i=0; i< ray.size(); i++){
                if (ray.get(i) %2 != 0){
                        a = ray.get(i);
                        for(int j=i; j< ray.size(); j++){
                                if(ray.get(j) %2 ==0){
                                        b=0;
                                }
                        }
                }
        }
        if( a==0 || b==0)
                return -1;
        else
                return b-a;
        }

  }
}
