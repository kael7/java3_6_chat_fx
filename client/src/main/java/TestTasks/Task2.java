package TestTasks;

public class Task2 {
    public static boolean getNumsOnly14(int[] arr) {
        boolean num1 = false;
        boolean num4 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                num1 = true;
            } else if (arr[i] == 4) {
                num4 = true;
            } else {
                return false;
            }
        }
        return num1 && num4;
    }
}
