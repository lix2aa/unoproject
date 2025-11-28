package uno;

public class WildCard extends Card implements Actionable {

    public WildCard() {
        super(null); // Les Wild n’ont pas de couleur à la base
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
