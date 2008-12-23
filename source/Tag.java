

public class Tag implements XMLWriteable{
	
	String tag;
	
	public Tag(String s)
	{
		tag = s;
	}
	
	public String WriteXML(String tabbing)
	{
		String returnValue =
			tabbing + "<tag>" + tag + "</tag>\n";
		
		return returnValue;
	}
}