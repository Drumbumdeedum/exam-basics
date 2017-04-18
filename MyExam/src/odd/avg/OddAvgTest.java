package odd.avg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class OddAvgTest {

  OddAvg testCase = new OddAvg();
  List<Integer> list1;
  int expectedValue;

  @Test
  public void testEmpty() {
    list1 = new ArrayList<>();
    expectedValue = 0;
    assertEquals(expectedValue, testCase.oddAverage(list1));
  }

  @Test
  public void testZeroToNine() {
    list1 = new ArrayList<>();
    for (int i=0; i < 10; i++) {
      list1.add(i);
    }
    expectedValue = 5;
    assertEquals(expectedValue, testCase.oddAverage(list1));
  }

  @Test
  public void testNoOddNumbersInList() {
    list1 = new ArrayList<>();
    list1.add(2);
    list1.add(4);
    list1.add(6);
    list1.add(8);
    expectedValue = 0;
    assertEquals(expectedValue, testCase.oddAverage(list1));
  }
}
