import java.util.*;


public class Tags implements XMLWriteable{
	
	private ArrayList<Tag> tags;
	
	public Tags()
	{
		tags = new ArrayList<Tag>();
	}
	
	public void addTag(String s)
	{
		if(getIndex(s) == -1)
		{
			Tag newTag = new Tag(s);
			tags.add(newTag);
		}
	}
	
	private int getIndex(String s)
	{
		for(int x = 0; x < tags.size(); x++){
			if( tags.get(x).tag.equals(s) )
			{
				return x;
			}
		}
		return -1;
	}
	
	public String WriteXML(String tabbing)
	{
		String returnValue =
			tabbing + "<tags>\n";
		
		for(int x = 0; x < tags.size(); x++)
		{
			returnValue += tags.get(x).WriteXML(tabbing + "\t");
		}
		
		returnValue +=
			tabbing + "</tags>\n";
		
		return returnValue;
	}
}