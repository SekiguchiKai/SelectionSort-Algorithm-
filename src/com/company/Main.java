package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // 入力される数
            int n = Integer.parseInt(bufferedReader.readLine());

            String[] numbers = bufferedReader.readLine().split(" ");
            int[] numArray = new int[n];

            for (int i = 0; i < numbers.length; i++) {
                numArray[i] = Integer.parseInt(numbers[i]);
            }

            selectSort(numArray);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 整列し直したint型の配列を返す
     *
     * @param numArray
     * @return
     */
    private static void selectSort(int[] numArray) {
        int flag = 0;
        for (int i = 0; i < numArray.length; i++) {
            int minJ = i;
            // ここのループがまわりきったら、1回分の整列が完了
            for (int j = i; j < numArray.length; j++) {
                if (numArray[j] < numArray[minJ]) {
                    minJ = j;
                }
            }

            if (minJ != i) {
                int temp = numArray[i];
                numArray[i] = numArray[minJ];
                numArray[minJ] = temp;
                flag++;
            }
        }
        for (int k = 0; k < numArray.length; k++) {
            if (k == numArray.length - 1) {
                System.out.println(numArray[k]);
            } else {
                System.out.print(numArray[k] + " ");
            }
        }
        System.out.println(flag);
    }
}
