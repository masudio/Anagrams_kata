import static org.junit.Assert.*;

import org.junit.Test;


public class LetterMapSpecs
{
	private LetterMap sut;
	
	@Test
	public void whenAskedForRepresentedWord_shouldReturnRepresentedWordAsString()
	{
		String word = "kinship";
		sut = LetterMap.getInstanceFor(word);
		
		String result = sut.toString();
		
		assertEquals(word,result);
	}

	@Test
	public void whenEqualityOf2LetterMapsChecked_andTheyAreTheSameMap_equalsShouldReturnTrue()
	{
		String word1 = "kinship";
		String word2 = "pinkish";
		sut = LetterMap.getInstanceFor(word1);
		LetterMap otherMap = LetterMap.getInstanceFor(word2);
		
		boolean result = sut.equals(otherMap);
		
		assertTrue(result);
	}
}
