package uno;


import uno.constants.Color;

public class SkipCard extends Card implements Actionable {

    public SkipCard(Color color) {
        super(color);
    }

    @Override
    public boolean canBePlayedOn(Card currentCard) {
        return this.getColor() == currentCard.getColor() || currentCard instanceof SkipCard;
    }

    @Override
    public String toString() {
        return "SkipCard{color=" + getColor() + "}";
    }

    @Override
    public void applyEffect(Game game) {
        game.nextPlayer(); // saute le prochain joueur
    }

}
