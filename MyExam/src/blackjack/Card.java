package blackjack;

public class Card {
  String color, value;
  String[] colors = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  String[] values = {"Clubs", "Diamonds", "Hearts", "Spades"};

  public Card() {
    color = colors[(int)(Math.random()*colors.length)];
    value = values[(int)(Math.random()*values.length)];
  }

  @Override
  public String toString() {
    return color + " " + value;
  }
}
