package hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      int complement = 0;
      for (int i = 0; i < nums.length; i++) {
        complement = target - nums[i];
        if (map.containsKey(complement)) {
          return new int[]{i, map.get(complement)};
        }
        map.put(nums[i], i);
      }
      return null;
     }
    }


