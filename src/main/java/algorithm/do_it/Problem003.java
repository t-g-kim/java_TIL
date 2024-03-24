package algorithm.do_it;

import java.util.*;
// p59, 문제007 1940번
public class Problem003 {
  public static void main(String[] args) {
    
    int[] dataArr = {2, 7, 4, 1, 5, 3};
    Arrays.sort(dataArr);
    int target = 9;
    int min = 0;
    int max = dataArr.length - 1;
    int count = 0;
    while(min < max) {
      if (dataArr[min] + dataArr[max] < target) {
        min++;
      } else if (dataArr[min] + dataArr[max] > target) {
        max--;
      } else {
        min++;
        max--;
        count++;
      }
    }
    System.out.println(count);
  }
}
