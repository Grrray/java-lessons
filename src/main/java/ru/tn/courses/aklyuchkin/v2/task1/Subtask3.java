package ru.tn.courses.aklyuchkin.v2.task1;

public class Subtask3 {
    public static void main(String[] args) {
        chooseBank();
    }

    private static void chooseBank() {
        int[] iArr = {2,5,4,6,89};
        System.out.print("Первоначальный массив ");
        for (int anArr : iArr) System.out.print(anArr + " ");
        int count = 0;
        System.out.print("счетчик равен ");
        System.out.print(count);
        for (int i = 0; i < iArr.length - 1; i++)
            for (int j = 0; j < iArr.length - i - 1; j++)
                if (iArr[j] > iArr[j+1])
                {
                    int temp = iArr[j];
                    iArr[j] = iArr[j+1];
                    iArr[j+1] = temp;
                    count++;
                }
        System.out.print(" Массив изимененный ");
        for (int anArr : iArr) System.out.print(anArr + " ");
        System.out.print("счетчик равен ");
        System.out.print(count);
    }
}
