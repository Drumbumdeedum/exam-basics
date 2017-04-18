package odd.avg;

import java.util.ArrayList;
import java.util.List;

public class OddAvg {

  public static void main(String[] args) {

  }

  public static int oddAverage(List<Integer> inputList) {

    int averageOfOdds = 0;
    int divideBy = 0;

    if (inputList.size() == 0) {
      return 0;
    } else {
      for (int i = 0; i < inputList.size(); i++) {
        if ((inputList.get(i) % 2 != 0)) {
          averageOfOdds += i;
          divideBy++;
        }
      }
      if (divideBy != 0) {
        return averageOfOdds / divideBy;
      } else {
        return 0;
      }
    }
  }
}
