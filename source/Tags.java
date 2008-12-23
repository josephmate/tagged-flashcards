import java.util.*;


public class Tags implements XMLWriteable{
	
	public ArrayList<Tag> tags;
	
	public String WriteXML(String tabbing)
	{
		String returnValue =
			tabbing + "<tags>\n";
		
		for(int x = 0; x < tags.size(); x++)
		{
			returnValue += tags.get(x).WriteXML(tabbing + "\t");
		}
		
		returnValue =
			tabbing + "</tags>\n";
		
		return returnValue;
	}
}