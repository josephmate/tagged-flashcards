import java.util.*;


public class FlashCards implements XMLWriteable{

	public static  String FLASHCARDS_DTD = "flashcards.dtd";
	public ArrayList<FlashCard> flashCards;
	
	public String WriteXML(String tabbing)
	{
		String returnValue = 
			tabbing + "<?xml version=\"1.0\"?>\n" +
			tabbing + "<!DOCTYPE note SYSTEM \"note.dtd\">\n";
		
		
		returnValue += 
			tabbing + "<flashcards>\n";
		
		for(int x = 0; x < flashCards.size(); x++)
		{
			returnValue += flashCards.get(x).WriteXML(tabbing + "\t");
		}
		
		returnValue += 
			tabbing + "</flashcards>\n";
		
		return returnValue;
	}
}
