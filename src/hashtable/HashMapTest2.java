package hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> num = new HashMap<>();
    int complement = 0;
    for (int i = 0; i < nums.length; i++) {
      num.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      complement = target - nums[i];
      if (num.containsKey(complement) && num.get(complement) != i) {
        return new int[]{i, num.get(complement)};
      }
    }
    return null;
  }
}




