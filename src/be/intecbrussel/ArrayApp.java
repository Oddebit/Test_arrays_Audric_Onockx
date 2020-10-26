package be.intecbrussel;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {

        int[] nums = {2, 1, 7, 3, 8, 5, 2, 1, 2, 3, 4, 5, 5, 6 ,7, 9, 10, 11, 12, 13};
        char[] chas = {'v', '(', 'r', 'a', '?'};


        System.out.println(IntArrayTools.isSorted(nums, true));
        System.out.println(Arrays.toString(IntArrayTools.quickSort(nums,0, nums.length -1)));
        System.out.println(Arrays.toString(IntArrayTools.sort(nums, false)));

        System.out.println("15 : " + IntArrayTools.chopSearch(nums, 15));
        System.out.println("8 : " + IntArrayTools.chopSearch(nums, 8));

        char[][] dico = CharArrayTools.generateDictionary(3);

        for (char[] word : dico) {
            System.out.println(Arrays.toString(word));
        }


    }
}
