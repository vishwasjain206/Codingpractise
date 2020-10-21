package vishwas;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//Following program is for finding count of each letter in string from hashmap
public class abc {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
HashMap <Character,Integer> hashmap = new HashMap<> ();
String abc1 = "data";

for (int i=0;i < abc1.length() ;i++)
{
	if (hashmap.containsKey(abc1.charAt(i)))
	{
		hashmap.put(abc1.charAt(i),hashmap.get(abc1.charAt(i)) + 1);
		
				
				
	}
	else
	{
		hashmap.put(abc1.charAt(i), 1);
	}
}
	

Set<Entry<Character, Integer>> retrun = hashmap.entrySet();
retrun.forEach(System.out::println);
	}
	
	
	

}
