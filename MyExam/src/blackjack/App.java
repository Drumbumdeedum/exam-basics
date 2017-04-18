package blackjack;

public class App {

  public static void main(String[] args) {

    Deck deck = new Deck(12);
    System.out.println(deck);

    Card drawn = deck.drawCard();
    System.out.println(drawn);
    System.out.println(deck);
  }
}
