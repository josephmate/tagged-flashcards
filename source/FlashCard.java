


public class FlashCard implements XMLWriteable{
	
	private Tags tags;
	public String front;
	public String back;
	
	public FlashCard()
	{
		tags = new Tags();
	}
	
	public void addTag(String s)
	{
		tags.addTag(s);
	}
	
	public String WriteXML(String tabbing)
	{
		String returnVal = 
			tabbing + "<flashcard>\n";
		
		returnVal +=
			tabbing + "\t<front>" + front + "</front>" + "\n";
		
		returnVal +=
			tabbing + "\t<back>" + back + "</back>"+ "\n";
		
		returnVal += tags.WriteXML(tabbing + "\t");
		
		returnVal += 
			tabbing + "</flashcard>\n";
		
		return returnVal;
	}
}