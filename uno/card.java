package uno;
import uno.constants.Color;

public abstract class Card {
    private Color color;

    public abstract String toString();

    public Card(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract boolean canBePlayedOn(Card currentCard);
}
