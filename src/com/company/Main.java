package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //宣告整數陣列
        int[] a = new int[5];
        Scanner scn = new Scanner(System.in);
        //從鍵盤接收資料，為陣列賦予元素
        for (int i = 0; i < a.length; i++) {
            System.out.println("請輸入第" + (i + 1) + "個元素");
            a[i] = scn.nextInt();
        }
        System.out.println("陣列元素內容為 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "  ");
        }

        //求陣列元素的累加和
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println();
        System.out.println("陣列元素的累加和為:" + sum);
    }
}
