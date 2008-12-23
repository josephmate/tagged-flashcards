import java.util.*;


public class FlashCards implements XMLWriteable{

	public static String FLASHCARDS_DTD = "flashcards.dtd";
	public static String ROOT_XML_ELEMENT = "flashcards";
	private ArrayList<FlashCard> flashCards;
	
	public FlashCards()
	{
		flashCards = new ArrayList<FlashCard>();
	}
	
	public void addCard(FlashCard c)
	{
		flashCards.add(c);
	}
	
	public String WriteXML(String tabbing)
	{
		String returnValue = 
			tabbing + "<?xml version=\"1.0\"?>\n" +
			tabbing + "<!DOCTYPE " + ROOT_XML_ELEMENT + " SYSTEM \"" + FLASHCARDS_DTD + "\">\n";
		
		
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
