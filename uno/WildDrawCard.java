package uno;

import uno.constants.Color;

public class WildDrawCard extends WildCard {

    public WildDrawCard(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "WildDrawCard";
    }
    
    @Override
    public boolean canBePlayedOn(Card CurrentCard) {//anytime 
        return true;
    }
    @Override
    public void applyEffect(Game game) {
        Player nextPlayer = game.getNextPlayer();
        for (int i = 0; i < 4; i++) {
            nextPlayer.Draw(game);
        }
        game.nextPlayer();

    }
}
