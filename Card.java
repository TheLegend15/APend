public class Card {
  
  private String suit;     
  private String rank;     
  private int pointValue;  
  
  public Card(String cardRank, String cardSuit, int cardPointValue) {
    suit = cardSuit;
    rank = cardRank;
    pointValue = cardPointValue;
  }
  
  public String suit() {
    return suit;
  }
  
  public String rank() {
    return rank;
  }
  
  public int pointValue() {
    return pointValue;
  }
  
  public boolean matches(Card otherCard) {
    if(otherCard.suit().equals(this.suit()) && otherCard.rank().equals(this.rank()) && otherCard.pointValue() == this.pointValue())
      return true;
    else
      return false;
  }
  
  @Override
  public String toString() {
    return rank + " of " + suit + " (point value = " + pointValue + ")";
  }
  
   public static void main(String[] args) {
  Card one = new Card("3", "Spades", 3);
  Card two = new Card("4", "Spades",3);
  Card three = new Card("2", "Hearts", 3);
  
  System.out.println("One matches with two?" + one.matches(two));
  System.out.println("One matches with three?" + one.matches(three));    
  System.out.println("Suit of Card One is: " + one.suit());
  System.out.println("Card one is: " + one.toString());
 }
}
