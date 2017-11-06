package pl.atena.edu.akademia6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;



public class PoliczSlowa<Komparator, T> 
{
	
	HashMap<String, Integer> map = new  HashMap<String, Integer>();
	int i = 1;
	int j = 0;
	String sl2;
	
	public void policz(ArrayList<String> TablicaSlow)
	{
		Collections.sort(TablicaSlow);
		
		for (String sl : TablicaSlow)
		{
			
			Integer counter = map.get(sl);
			if (counter == null) 
			{
				counter = 0;
			}
			map.put(sl, ++counter);
		}
		
		List<Map.Entry<String, Integer>> lista2 = new Vector<Map.Entry<String, Integer>>(map.entrySet()); 
		
		Collections.sort(lista2, new Comparator<Map.Entry<String, Integer>>() 
		{
			//@Override
			public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry1) 
			{
				// TODO Auto-generated method stub
				return (entry.getValue().equals(entry1.getValue()) ? 0 : (entry.getValue() < entry1.getValue() ? 1 : -1));
			}
		
		});
		
		System.out.println(lista2);
	}

}
