package ru.tn.courses.aklyuchkin.v2.task1;

public class Subtask2 {
    public static void main(String args[]) {
        int arr[] = {1, 206, 10, 2, 3, 333, 7, 56, 32, 3, 14};
        int max = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i;
            }
        }
        System.out.println("Лучший курс ");
        System.out.println(max);
        System.out.println("Номер банка ");
        System.out.println(num);
    }
}
