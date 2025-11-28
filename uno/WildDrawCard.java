package uno;

import uno.constants.Color;

public class WildDrawCard extends WildCard {

    public WildDrawCard(Color color) {
        super(color);
    }

    
    public String toString() {
        return "WildDrawCard";
    }
    
    public boolean canBePlayedOn(Card CurrentCard) {//anytime 
        return true;
    }
    
    public void applyEffect(Game game) {
        Player nextPlayer = game.getNextPlayer( player);
        for (int i = 0; i < 4; i++) {
            nextPlayer.Draw(game);
        }
        game.skipNextPlayer();

    }
}
