// package uno;
// import java.util.Collections;
// import java.util.List;

// public class Deck {

//     private Stack<Card> cards;

//     public Deck(List<Card> cards) {
//         this.cards = cards;
//     }

//     public Card Draw() {
//         if (cards.isEmpty()) return null;
//         return cards.remove(0);
//     }

//     public Card Draw(Card card) {
//         return card;//pop et eneleevz args ce st juste pour pas quil yait derreur ;
//     }

//     public void Shuffle() {
//         Collections.shuffle(cards);
//     }

//     public void refill(List<Card> newCards) {
//         cards.addAll(newCards);
//     }
// }


























package uno;
import java.util.Collection;
import java.util.Random;
import java.util.Stack;

public class Deck {
  private Stack<Card> deck;
  private boolean isEmpty;

  public Deck(){
    //contructor
    deck = new Stack<>();//we dont use this.deck cause we have only one deck
    Createpacket();
    isEmpty = false;
  }
  public void Createpacket(){
    //
    // we create the stack then we push in it the cards 
    // as follows :
    // a loop we will enter rendomly picked cards into a stack , (numbers )
    // a second loop to enter special gards with the first one (randomly)
    //then we have a stack full of everything
    
  }
  public Card drawing(){
    //check is the deck isnt empty 
    // if not then pop a card from the stack
    //a card + (we take -1 from the list)
    
  }
  public void Melanger(){
    //(sugggests we use collections(chatgpt))
    Collections.shuffle(deck);
  }
  public boolean EmptyDeck(){
    //if the stack is null then the deck is empty and we change the boolean
    // that is isEmpty
    return isEmpty;
  }

}
