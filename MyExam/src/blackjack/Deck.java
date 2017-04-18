package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  List<Card> cardsInDeck;

  public Deck(int nrOfCards) {
    cardsInDeck = new ArrayList<>();
    for (int i=0; i < nrOfCards; i++) {
      Card newCard = new Card();
      cardsInDeck.add(newCard);
    }
  }

  public Card drawCard() {
    System.out.println(this.cardsInDeck.get(this.cardsInDeck.size()-1));
    return this.cardsInDeck.remove(this.cardsInDeck.size()-1);
  }

  public void shuffleDeck(Deck deckToShuffle) {
    Collections.shuffle(deckToShuffle.cardsInDeck);
  }

  @Override
  public String toString() {
    int nrOfHearts = 0;
    int nrOfDiamonds = 0;
    int nrOfSpades = 0;
    int nrOfClubs = 0;

    for (int i=0; i < this.cardsInDeck.size(); i++) {
      if (this.cardsInDeck.get(i).value.equals("Hearts")) {
        nrOfHearts ++;
      }
      if (this.cardsInDeck.get(i).value.equals("Diamonds")) {
        nrOfDiamonds ++;
      }
      if (this.cardsInDeck.get(i).value.equals("Spades")) {
        nrOfSpades ++;
      }
      if (this.cardsInDeck.get(i).value.equals("Clubs")) {
        nrOfClubs ++;
      }
    }
    return cardsInDeck.size() + " cards - " + " " + nrOfClubs + " Clubs, "  + nrOfDiamonds + " Diamonds, "  + nrOfHearts + " Hearts, "  + nrOfSpades + " Spades";
  }
}