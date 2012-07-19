import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


public class Spikes
{
//	@Test
//	public void setEquality______actuallyDoesntWorkForThisCauseDeletesDuplicates()
//	{
//		Set<Character> set1 = new HashSet<Character>();
//		Set<Character> set2 = new HashSet<Character>();
//		String anagramWord1 = "pinkishs";
//		String anagramWord2 = "kinship";
//		char[] set1Array = anagramWord1.toCharArray();
//		char[] set2Array = anagramWord2.toCharArray();
//		
//		for(char c : set1Array)
//        {
//	        set1.add(c);
//        }
//		for(char c : set2Array)
//        {
//	        set2.add(c);
//        }
//		
//		assertEquals(set1, set2);
//	}
//	
//	@Test
//	public void setNonEquality()
//	{
//		Set<Character> set1 = new HashSet<Character>();
//		Set<Character> set2 = new HashSet<Character>();
//		String anagramWord1 = "pinkish";
//		String anagramWord2 = "kinship";
//		char[] set1Array = anagramWord1.toCharArray();
//		char[] set2Array = anagramWord2.toCharArray();
//		
//		for(char c : set1Array)
//        {
//	        set1.add(c);
//        }
//		for(char c : set2Array)
//        {
//	        set2.add(c);
//        }
//		
//		set2.add('z');
//		
//		assertFalse(set1.equals(set2));
//	}
	
	@Test
	public void tryHashTableOfLettersAndOccurrences()
	{
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2 = new HashMap<Character,Integer>();
		String word1 = "pinkish";
		String word2 = "kinship";
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		
		for(char c : word1Array)
        {
	        if(null == map1.get(c)) map1.put(c, 1);
	        else map1.put(c, ((Integer)map1.get(c)) + 1);
        }
		
		for(char c : word2Array)
        {
	        if(null == map2.get(c)) map2.put(c, 1);
	        else map2.put(c, ((Integer)map2.get(c)) + 1);
        }
		
		assertTrue(map1.equals(map2));
	}
	
	@Test
	public void should_Pass()
	{
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2 = new HashMap<Character,Integer>();
		String word1 = "pinkishz";
		String word2 = "kinshipy";
		
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		
		for(char c : word1Array)
        {
	        if(null == map1.get(c)) map1.put(c, 1);
	        else map1.put(c, ((Integer)map1.get(c)) + 1);
        }
		
		for(char c : word2Array)
        {
	        if(null == map2.get(c)) map2.put(c, 1);
	        else map2.put(c, ((Integer)map2.get(c)) + 1);
        }
		
		assertFalse(map1.equals(map2));
	}
	
	@Test
	public void should_also_pass()
	{
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2 = new HashMap<Character,Integer>();
		String word1 = "pinkishz";
		String word2 = "kinship";
		
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		
		for(char c : word1Array)
        {
	        if(null == map1.get(c)) map1.put(c, 1);
	        else map1.put(c, ((Integer)map1.get(c)) + 1);
        }
		
		for(char c : word2Array)
        {
	        if(null == map2.get(c)) map2.put(c, 1);
	        else map2.put(c, ((Integer)map2.get(c)) + 1);
        }
		
		assertFalse(map1.equals(map2));
	}
	
	@Test
	public void should_pass_again()
	{
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2 = new HashMap<Character,Integer>();
		String word1 = "pinkishs";
		String word2 = "kinship";
		
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		
		for(char c : word1Array)
        {
	        if(null == map1.get(c)) map1.put(c, 1);
	        else map1.put(c, ((Integer)map1.get(c)) + 1);
        }
		
		for(char c : word2Array)
        {
	        if(null == map2.get(c)) map2.put(c, 1);
	        else map2.put(c, ((Integer)map2.get(c)) + 1);
        }
		
		assertFalse(map1.equals(map2));
	}
}
