package be.intecbrussel;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {

        int[] nums = {2, 1, 7, 3, 5, 2, 1, 2, 3, 4, 5, 5, 6 ,7, 9, 10, 11, 12, 13};
        char[] characters = {'v', '(', 'r', 'a', 'b', '?'};

        System.out.println(" INTEGERS");
        System.out.println("\nArray : " + Arrays.toString(nums));
        System.out.println("Is sorted (up) : " + IntArrayTools.isSorted(nums, true));
        System.out.println("Is sorted (down) : " + IntArrayTools.isSorted(nums, false));

        System.out.println("\nSort (up) : " + Arrays.toString(IntArrayTools.sort(nums, true)));
        System.out.println("Is sorted (up) : " +IntArrayTools.isSorted(nums, true));
        System.out.println("Is sorted (down) : " +IntArrayTools.isSorted(nums, false));

        System.out.println("\nSort (down) : " + Arrays.toString(IntArrayTools.sort(nums, false)));
        System.out.println("Is sorted (up) : " +IntArrayTools.isSorted(nums, true));
        System.out.println("Is sorted (down) : " +IntArrayTools.isSorted(nums, false));

        System.out.println("\nSearch 2 : " + IntArrayTools.chopSearch(nums, 2));
        System.out.println("Search 8 : " + IntArrayTools.chopSearch(nums, 8));


        System.out.println("\n CHARACTERS");
        System.out.println("\nArray : " + Arrays.toString(characters));
        System.out.println("Sorted (up) : " + Arrays.toString(CharArrayTools.sort(characters)));
        System.out.println("Only letters : " + Arrays.toString(CharArrayTools.filterAlphabet(characters)));

        System.out.println("\nDictionary :");
        char[][] dico = Dictionary.generateDictionary(3);
        for (char[] word : dico) {
            System.out.println(Arrays.toString(word));
        }


    }
}
