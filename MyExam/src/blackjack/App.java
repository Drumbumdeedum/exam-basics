package blackjack;

public class App {

  public static void main(String[] args) {

    Deck deck1 = new Deck(12);

    for (int i=0; i < 12; i++) {
      System.out.println(deck1.cardsInDeck.get(i));
    }
  }
}
