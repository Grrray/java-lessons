package ru.tn.courses.eklyuchkin.v2.task1;
import java.util.ArrayList;
public class Subtask1 {
    private static int[] getArray(int ... nums) {
        ArrayList<Integer> arrNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) arrNums.add(i);
        }

        int arr[] = new int[arrNums.size()];

        for (int i = 0; i < arrNums.size(); i++) arr[i] = arrNums.get(i);

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = getArray(1, 2, 3, 4, 0, 0, 5, 0, 6, 0);

        for (int anArr : arr) System.out.print(anArr + " ");
    }
}
