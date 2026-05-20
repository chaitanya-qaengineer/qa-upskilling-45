package day06;

import java.util.HashMap;

public class CollectionUtilsTest {
	 public static void main(String[] args) {

	        int[] numbers = {1, 2, 3, 4};

	        System.out.println(
	            CollectionUtils.sumArray(numbers)
	        );

	        int[] duplicates = {1, 2, 2, 3, 4, 4};

	        System.out.println(
	            CollectionUtils.findDuplicates(duplicates)
	        );

	        String[] words = {
	            "java",
	            "api",
	            "selenium",
	            "sql"
	        };

	        System.out.println(
	            CollectionUtils.groupWordsByLength(words)
	        );

	        HashMap<String, Integer> scores =
	                new HashMap<>();

	        scores.put("John", 90);
	        scores.put("Sam", 70);
	        scores.put("Alex", 85);

	        System.out.println(
	            CollectionUtils.sortByValue(scores)
	        );

	        int[] nums = {2, 7, 11, 15};

	        System.out.println(
	            CollectionUtils.twoSum(nums, 9)
	        );
	    }
}
