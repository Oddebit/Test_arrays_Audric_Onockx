package be.intecbrussel;

public class Dictionary {

    public static char[][] generateDictionary(int n) {

        char[][] dictionary = new char[(int) Math.pow(26, n)][n];

        for (int i = 0; i < n; i++) {

            dictionary[0][i] = 'a';
        }


        for (int i = 1; i < dictionary.length; i++) {

            for (int j = 0; j < n; j++) {

                dictionary[i][j] = dictionary[i - 1][j];
            }

            dictionary[i][n - 1] = (char) (dictionary[i - 1][n - 1] + 1);

            for (int j = n - 1; j >= 0; j--) {

                if (dictionary[i][j] == 'z' + 1) {

                    dictionary[i][j] = 'a';
                    dictionary[i][j - 1] += 1;
                }
            }
        }

        return dictionary;

    }
}