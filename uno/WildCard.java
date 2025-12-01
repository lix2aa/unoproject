package uno;
import uno.constants.Color;

public class WildCard extends Card implements Actionable {

    public WildCard(Color color) {
        super(color); 
    }
  

    @Override
    public boolean canBePlayedOn(Card other) {
        return true; // Jouable sur tout
    }

    @Override
    public void applyEffect(Game game) {
        game.setCurrentColor(game.getCurrentPlayer());
    }

    @Override
    public String toString() {
        return "WildCard";
    }

}
