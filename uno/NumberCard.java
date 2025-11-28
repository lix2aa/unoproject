package uno;


import uno.constants.Color;

public class NumberCard extends Card {

    private int number;

    @Override
    public String toString() {
        return ("color=" + getColor() + ", number=" + number);
    }

    public NumberCard(Color color, int number) {
        super(color);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean canBePlayedOn(Card currentCard) {
        if (currentCard==null) return true;//makach aucune carte sur table mais y en a toujours une normalement?

        if (this.getColor() == currentCard.getColor() ) {// same color (sapplique aussi avec le wild car on va changer currentclor of current card)
            return true;
        }
        if (currentCard instanceof NumberCard ) { // si ils ont meme num
            NumberCard nc=(NumberCard)currentCard;
            // si ils ont meme num
            return (this.number == nc.getNumber()); // boolean check
        }
        return false;
    }
// currentcard va etre virtuelle (contient current color )donc avec le choix du joueur je vais changer la couleur de la carte courante et non la vraie carte elle meme//
}
