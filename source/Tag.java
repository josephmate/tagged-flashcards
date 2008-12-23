

public class Tag implements XMLWriteable{
	
	String tag;
	
	public String WriteXML(String tabbing)
	{
		String returnValue =
			tabbing + "<tag>" + tag + "</tag>\n";
		
		return returnValue;
	}
}