package _01_Arrayproblems;

import java.util.HashMap;

public class Example3gfgCountPairWithSum {
    static int countPairs(int [] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int needed = target - num;

            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
