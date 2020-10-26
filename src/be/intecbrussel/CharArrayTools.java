package be.intecbrussel;

public class CharArrayTools {

    public static char[] filterAlphabet(char[] input) {

        int count = 0;
        for (int i = 0; i < input.length; i++) {

            if ('a' > input[i] || input[i] > 'z') {
                input[i] = 0;
                count++;
            }
        }

        char[] output = new char[input.length - count];
        int index = 0;
        for (char cha : input) {

            if (cha != 0) {
                output[index] = cha;
                index++;
            }
        }

        return output;

    }

    public static char[] sort(char[] input) {

        for (int i = 1; i < input.length; i++) {

            if (input[i] < input[i - 1]) {

                char temp = input[i];
                input[i] = input[i - 1];
                input[i - 1] = temp;

                if (i > 1) i -= 2;
            }

        }

        return input;

    }

    public static char[][] generateDictionary(int n) {

        char[][] dictionary = new char[(int) Math.pow(26, n)][];

        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = dictionary(n, i);
        }

        return dictionary;

    }

    public static char[] dictionary(int length,int index) {

        char[] word = new char[length];

        for (int j = length - 1; j >= 0; j--) {
            word[length - 1 - j] = toChar((int) (index / Math.pow(26, j)));
            index %= Math.pow(26, j);
        }

        return word;

    }


    public static char toChar(int i) {
        return (char) (97 + i);
    }

}