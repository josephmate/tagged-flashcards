


public class FlashCard implements XMLWriteable{
	
	public Tag tags;
	public String front;
	public String back;
	
	public String WriteXML(String tabbing)
	{
		String returnVal = 
			tabbing + "<flashcard>\n";
		
		returnVal +=
			tabbing + "<front>" + front + "</front>";
		
		returnVal +=
			tabbing + "<back>" + back + "</back>";
		
		returnVal += tags.WriteXML(tabbing + "\t");
		
		returnVal += 
			tabbing + "</flashcard>\n";
		
		return returnVal;
	}
}