
public class StringManipulator {
	
	public String NoVowels(String word) {
		
		word = "";
		
		for (int i = 0; i< word.length(); i++)
		{
			
		    char letter = word.charAt(i);
			if (letter == 'a' ||letter == 'i' ||letter == 'e' ||letter == 'o' ||letter == 'u'||letter == 'A'||letter =='O'||letter =='I'||letter =='E'||letter =='U')
			{
				
				letter = '*';
				word += letter;
				
				
			}
		}
		
		return word;
	}
	
	public String reverse(String word)
	{
        word = "";
		
		for (int i = 0; i< word.length(); i--)
		{
			
		}
		
	}

}
