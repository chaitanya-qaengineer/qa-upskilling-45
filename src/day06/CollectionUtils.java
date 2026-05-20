package day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CollectionUtils {
	  // Sum array
    static int sumArray(int[] numbers) {

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    // Find duplicates
    static HashSet<Integer> findDuplicates(int[] numbers) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    // Group words by length
    static HashMap<Integer, List<String>> groupWordsByLength(
            String[] words) {

        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String word : words) {

            int length = word.length();

            map.putIfAbsent(length, new ArrayList<>());

            map.get(length).add(word);
        }

        return map;
    }

    // Sort map by value
    static List<Map.Entry<String, Integer>> sortByValue(
            HashMap<String, Integer> map) {

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        return list;
    }

    // Two Sum
    static boolean twoSum(int[] nums, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            int complement = target - num;

            if (set.contains(complement)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
