import java.util.HashMap;
import java.util.Map;


public class LetterMap
{
	private String word;
	private Map<Character,Integer> map;
	
	public static LetterMap getInstanceFor(String word)
    {
		return new LetterMap(word);
    }
	
	private LetterMap(String word)
	{
		this.word = word;
		initialize();
	}
	
	private void initialize()
	{
		char[] wordArray = ((String)word).toCharArray();
		map = new HashMap<Character,Integer>();
    	
		for(char c : wordArray)
        {
	        if(null == map.get(c)) map.put(c, 1);
	        else map.put(c, ((Integer)map.get(c)) + 1);
        }
	}
	
	@Override
	public String toString()
	{
		return word;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(null == obj) return false;
		if(getClass() != obj.getClass()) return false;
		else return map.equals(((LetterMap)obj).getMap());
	}
	
	@Override
	public int hashCode()
	{
		return map.hashCode();
	}

	private Map<Character,Integer> getMap()
    {
		return map;
    }
}
