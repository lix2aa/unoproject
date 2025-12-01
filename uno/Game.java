package uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import uno.constants.Color;


public class Game {

    private List<Player> players = new ArrayList<>();
    private Deck deck;
    private int currentPlayerIndex;
    private int direction;
    private Card currentCard;
    private Color currentColor;
    private Stack<Card> discardPile;

    // constructeur
    public Game(List<Player> players) {
        this.players = players;
        this.direction = 1; 
        this.currentPlayerIndex = 0;
        this.deck = new Deck();
        this.discardPile = new Stack<>();
        this.currentCard = deck.drawing();
        currentCard.getColor();
    }

    // startGame
    public void startGame() {
        createPlayers();
        createHand();
        startDiscard();
        diplayRules();
    }

    private void createHand() {
        for (Player p : players) {
            for (int i = 0; i < 7; i++) {
                p.setHand(deck.drawing());
            }
        }
    }//refaire//

    private void createPlayers() {
        for (int i = 1; i <= 4; i++) {
            players.add(new Player("Player " + i, new ArrayList<>()));
        }
    }

    private void startDiscard() {
        Card first = deck.drawing();
        discardPile.push(first);
        System.out.println("Première carte dans la défausse : " + first);
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card topCard) {
        this.currentCard = topCard;

    }

    public void setCurrentColor(Player player) {
        if (this.currentCard instanceof WildCard) {
            player.getChoiceColor();
            return;
        }
        currentCard.getColor();
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
        System.err.println("Direction reversed");
    }

    public Player getNextPlayer() {
        return players.get((this.currentPlayerIndex + this.direction + players.size()) % players.size());

    }

    public List<Player> getListPlayers() {
        return this.players;
    }


    public Card drawCard() {
        return deck.drawing();
    }
    public Deck getDeck() {
        return deck;
    }

    private void diplayRules() {
        System.out.println("Bienvenue dans le jeu UNO !");
        System.out.println("Règles du jeu :");
        System.out.println("1. Chaque joueur commence avec 7 cartes.");
        System.out.println("2. Le but est de se débarrasser de toutes ses cartes.");
        System.out.println("3. Les cartes spéciales ont des effets particuliers.");
        System.out.println("4. Lorsque vous jouez une carte, assurez-vous qu'elle correspond à la couleur ou au numéro de la carte sur le dessus de la pile de défausse.");
        System.out.println("5. Si vous ne pouvez pas jouer, piochez une carte.");
        System.out.println("6. N'oubliez pas de dire 'UNO' lorsque vous n'avez plus qu'une seule carte !");
        System.out.println("Amusez-vous bien !");

    }

    // emptydeck

    public void refillDeckIfNeeded() {
        if (deck.EmptyDeck()) {
            deck.refillDeck(this.discardPile);
            deck.Shuffle();
        }
    }
}
