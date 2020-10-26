package be.intecbrussel;

import java.util.Arrays;

public class IntArrayTools {

    public static boolean isSorted(int[] nums, boolean ascending) {

        for (int i = 1; i < nums.length; i++) {

            int x, y;

            if (ascending) {
                x = nums [i]; y = nums[i - 1];
            } else {
                x = nums[i - 1]; y = nums [i];
            }

            if (x > y) return false;

        }

        return true;

    }

    public static int[] sort(int[] nums, boolean ascending) {

        for (int i = 1; i < nums.length; i++) {

            int x, y;

            if (ascending) {
                x = nums [i]; y = nums[i - 1];
            } else {
                x = nums[i - 1]; y = nums [i];
            }

            if (x < y) {

                int temp = nums [i];
                nums [i] = nums[i - 1];
                nums[i - 1] = temp;

                if (i > 1) i -= 2;
            }

        }

        return  nums;

    }

    public static int[] quickSort(int[] nums, int first, int last) {
    // Honestly, I need more explanations about this...
        if (first < last) {

            int index = partition(nums, first, last);

            quickSort(nums, first, index - 1);
            quickSort(nums, index + 1, last);

        }

        return  nums;

    }

    public static int partition(int[] nums, int first, int last) {

        int pivot = nums[last];

        int i = first - 1;

        for (int j = first; j < last; j++) {

            if (nums[j] < pivot) {

                i++;

                int temp = nums [i];
                nums [i] = nums[j];
                nums[j] = temp;

            }

        }

        int temp = nums [i + 1];
        nums [i + 1] = nums[last];
        nums[last] = temp;

        return i + 1;


    }


    public static boolean chopSearch(int[] nums, int n) {
//
//        sort(nums, true);
//
//        for (int num : nums) {
//            if (num == n) return true;
//       }
//
//        return false;
//
        nums = sort(nums, true);
        return binarySearch(nums, 0, nums.length - 1, n);
    }

    public static boolean binarySearch(int[] nums, int start, int end, int n) {

        int mid = (start + end) / 2;

        if (start > end) return false;

        if (nums[mid] == n) {
            return true;
        } else if (nums[mid] < n) {
            return binarySearch(nums, mid + 1, end, n);
        } else {
            return binarySearch(nums, start, mid - 1, n);
        }

    }


}
