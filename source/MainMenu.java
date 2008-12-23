

public class MainMenu {
		
		public static void main(String args[])
		{
			testing();
		}
		
		
		public static void testing()
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
