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

//   
// }

package uno;

import java.util.Stack;
import uno.constants.Color;

public class Deck {
  private Stack<Card> deck;
  boolean isEmpty;

  public void Createpacket() {
    Color[] colors = Color.values();

    for (int i = 0; i < colors.length; i++) {

      Color color = colors[i];

      for (int j = 1; j < 10; j++) {
        Card card1 = new NumberCard(color, j);
        Card card2 = new NumberCard(color, j);
        deck.push(card1);
        deck.push(card2);
      }

      for (int k = 0; k < 2; k++) {
        Card skip = new SkipCard(color);
        Card draw2 = new Draw2Card(color);
        Card reverse = new ReverseCard(color);
        deck.push(draw2);
        deck.push(skip);
        deck.push(reverse);
      }
    }

    for (int i = 0; i < 4; i++) {
      Card wild = new WildCard(Color.NONE);
      Card draw4 = new WildDrawCard(Color.NONE);
      deck.push(wild);
      deck.push(draw4);
    }

  }

  public Card drawing() {
    if (!EmptyDeck()) {
      Card c = deck.pop();
      return c;
    }
    return null;
  
  }

  public void Shuffle() {
    Stack<Card> shuffledDeck = new Stack<>();
    while (!deck.isEmpty()) {
      int randomIndex = (int) (Math.random() * deck.size());
      Stack<Card> tempStack = new Stack<>();
      for (int i = 0; i < randomIndex; i++) {
        tempStack.push(deck.pop());
      }
      shuffledDeck.push(deck.pop());
      while (!tempStack.isEmpty()) {
        deck.push(tempStack.pop());
      }
    }
    deck = shuffledDeck;
  }

  public boolean EmptyDeck() {
    if (deck == null) {
      return true;
    } else {
      return false;
    }
  }
  // refill
  public void refillDeck(Stack<Card> discardPile) {
    Card topCard = discardPile.pop();
    while (!discardPile.isEmpty()) {
      deck.push(discardPile.pop());
    }
    discardPile.push(topCard);
  }
  // melanger avec random
  public void melanger(Stack<Card> deck) {

    Stack<Card> s1 = new Stack<>();
    Stack<Card> s2 = new Stack<>();
    Random rand = new Random();

    // Séparer  dans s1 et s2
    while (!deck.isEmpty()) {
        if (rand.nextBoolean()) {
            s1.push(deck.pop());
        } else {
            s2.push(deck.pop());
        }
    }

    // Étape 2 : mélanger encore une fois
    while (!s1.isEmpty() || !s2.isEmpty()) {
        // Choisir aléatoirement une pile
        if (!s1.isEmpty() && rand.nextBoolean()) {
            deck.push(s1.pop());
        } else if (!s2.isEmpty()) {
            deck.push(s2.pop());
        }
    }
}

}
