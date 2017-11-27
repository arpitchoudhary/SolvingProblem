package datastructure.strings;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

    Set<String> permutationSet = new HashSet<String>();

    void permutationUtil(char[] input, int start, int end) {

        if (start == end) {
            String str = String.valueOf(input);
            System.out.println(str);
            permutationSet.add(str);
        } else {
            char temp;

            for (int j = start; j <= end; j++) {

                temp = input[j];
                input[j] = input[start];
                input[start] = temp;

                permutationUtil(input, start + 1, end);

                temp = input[j];
                input[j] = input[start];
                input[start] = temp;
            }
        }

    }


    public static void main(String... args) {

        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.permutationUtil(new String("AAB").toCharArray(), 0, "AAB".length() - 1);

//        System.out.println("\n");
//
//        for (String s : stringPermutation.permutationSet) {
//            System.out.println(s);
//        }

    }

}
