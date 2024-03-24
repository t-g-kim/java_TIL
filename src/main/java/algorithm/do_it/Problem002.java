package algorithm.do_it;

import java.util.*;
// P182, 29번 1920번
public class Problem002 {
  public static void main(String[] args) {
     int[] target = {1, 3, 7, 9, 5};
     int[] arr = {4, 1, 5, 2, 3};
     Arrays.sort(arr);

     for (int i = 0; i < target.length; i++) {
      int start = 0;
      int end = arr.length -1;
      boolean findFlag = false;
      int targetValue = target[i];
      while(start <= end) {
        int midIndex = (start + end) / 2;
        int midValue = arr[midIndex];
        if (midValue < targetValue) {
          start = midValue + 1;
        } else if (midValue > targetValue) {
          end = midValue - 1;
        } else {
          findFlag = true;
          break;
        }
      }
      if (findFlag) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
     }
  }
}
