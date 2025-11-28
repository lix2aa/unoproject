package uno;

import java.util.List;
import java.util.Stack;
import uno.constants.Color;

public class Game {

    private int direction;
    private List<Player> players;
    private int currentPlayerIndex;
    private Card currentCard;
    private Color currentColor;
    private Deck deck;
    private Stack<Card> discardPile;

    public Card getCurrentCard() {
        return currentCard;
    }
   
    public void setCurrentCard(Card topCard) {
        this.currentCard = topCard;

    }
    public void setCurrentColor(Player player) {
        if (this.currentCard instanceof WildCard) {
            this.currentColor = player.getChoiceColor();
            return;
        }
        this.currentColor = currentCard.getColor();
    }
    
    public Player getWinner() {
        // À compléter
        return null;
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    public void playCard(Card card) {
        // À compléter
    }
 
    public void reverseDirection() {
        this.direction *= -1;
    }

    public Player getNextPlayer(Player player) {
        return player;// pour pas d erreur
    }
    public void nextPlayer(){
        
    }
    public void skipNextPlayer() {
        // À compléter ////currentplayer recoit lindex du suivant(++)
    }

    public Card drawCard() {
        return deck.Draw();
    }
}
