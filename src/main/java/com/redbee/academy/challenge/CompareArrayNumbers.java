package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<>();
    List<Integer> shorterList;
    List<Integer> longerList;
    if (a.size() > b.size()) {
      shorterList = b;
      longerList = a;
    } else {
      shorterList = a;
      longerList = b;
    }
    for (int i = 0; i < longerList.size(); ++i) {
      try {
        result.add((shorterList.get(i) < longerList.get(i))
                ? longerList.get(i)
                : shorterList.get(i));
      } catch (IndexOutOfBoundsException e) {
        result.add(longerList.get(i));
      }
    }
    return result;
  }
}

