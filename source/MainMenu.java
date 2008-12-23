import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;

public class MainMenu {
		
		public static void main(String args[])
		{
			OutputTesting();
			
			System.out.println("****************************************");
			
			InputTesting();
		}
		
		public static void InputTesting()
		{
			String curDir = System.getProperty("user.dir");
			System.out.println(curDir);
			
			FileInputStream fstream;

			
			try
			{


				fstream = new FileInputStream("testinput.xml");
				
				DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();			
				DocumentBuilder builder = builderFactory.newDocumentBuilder();
				
				Document inputXML = builder.parse(fstream);
				fstream.close();
				
				NodeList tagList = inputXML.getElementsByTagName("tag");
				
				for(int x = 0; x < tagList.getLength(); x++)
				{
					Node tagNode = tagList.item(x);
					Text result = (Text) tagNode.getFirstChild();
					System.out.println(result.getNodeValue());
				}

			}
			catch(FileNotFoundException e)
			{
				System.err.println("The file was not found.");
			}
			catch(Exception e)
			{
				System.err.println("Something terrible has happened.");
			}
			
		}
		
		public static void OutputTesting()
		{
			FlashCards deck = new FlashCards();
			System.out.println(deck.WriteXML(""));
			System.out.println("I am done writing the output of the first test.");
			
			FlashCard nextCard = new FlashCard();
			nextCard.front = "This is the front.";
			nextCard.back = "This is the back.";
			deck.addCard(nextCard);
			
			System.out.println(deck.WriteXML(""));
			System.out.println("I am done writing the output of the second test.");
			
			nextCard.addTag("this is a tag");
			nextCard.addTag("this is another!");
			
			System.out.println(deck.WriteXML(""));
			System.out.println("I am done writing the output of the third test.");
			
			nextCard = new FlashCard();
			nextCard.front = "second card";
			nextCard.back = "back of second card";
			deck.addCard(nextCard);
			
			nextCard.addTag("second card's first tag");
			nextCard.addTag("second card's second tag");
			nextCard.addTag("second card's third tag");
			
			System.out.println(deck.WriteXML(""));
			System.out.println("I am done writing the output of the fourth test.");
		}
}
