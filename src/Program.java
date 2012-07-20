import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.masudio.spellchecker.IAmADictionary;
import org.masudio.spellchecker.WordList;


public class Program
{
	private static IAmADictionary dictionary;
	
	public static void main(String[] args)
	{
		System.out.println(System.getProperty("user.dir"));
		dictionary = new WordList(System.getProperty("user.dir") + "/lib/lower");
		run();
	}
	
	public static void run()
	{
		Map<LetterMap,ArrayList<String>> anagramMap = new HashMap<LetterMap,ArrayList<String>>();
		
		for(Object word : dictionary)
        {
			LetterMap letterMap = LetterMap.getInstanceFor((String)word);
			
			if(null == anagramMap.get(letterMap)) 
			{
				ArrayList<String> anagramList = new ArrayList<String>();
				anagramList.add((String)word);
				anagramMap.put(letterMap, anagramList);
			}
			else
			{
				ArrayList<String> anagramList = anagramMap.get(letterMap);
				anagramList.add((String)word);
			}
        }
		
		Collection<ArrayList<String>> anagramLists = anagramMap.values();
		
		for(ArrayList<String> arrayList : anagramLists)
        {
	        for(String word : arrayList)
            {
	        	System.out.print(word + " ");
            }
	        System.out.println();
        }
	}
}
