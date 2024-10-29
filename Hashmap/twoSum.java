package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoS(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        twoSum solution = new twoSum();
        int[] nums = {2, 4, 3, 5, 7};
        int target = 9;
        try {
            int[] result = solution.twoS(nums, target);
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
