package uno;


import uno.constants.Color;

public class ReverseCard extends Card implements Actionable {

    public ReverseCard(Color color) {
        super(color);
    }

    @Override
    public boolean canBePlayedOn(Card other) {
        return this.getColor() == other.getColor() || other instanceof ReverseCard;
    }

    @Override
    public String toString() {
        return "ReverseCard{color=" + getColor() + "}";
    }

    @Override
    public void applyEffect(Game game) {
        game.reverseDirection();// change le sens du jeu
    }

}
