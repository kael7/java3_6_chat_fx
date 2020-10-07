package TestTasks;

import java.util.Arrays;

public class Task1 {
    public static int[] getNumsAfter4(int[] arr) throws RuntimeException {
        int j = 0;
        String s = Arrays.toString(arr);

        if (s.indexOf(String.valueOf(4)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    j = i;
                }
            }

            int[] newArr = new int[arr.length - j - 1];
            System.arraycopy(arr, j + 1, newArr, 0, newArr.length);
            return newArr;
        } else {
            throw new RuntimeException("Ошибка");
        }
    }
}
