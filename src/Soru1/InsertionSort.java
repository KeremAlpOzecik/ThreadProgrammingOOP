/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru1;

/**
 *
 * @author kerem alp
 */
public class InsertionSort implements Strategy {

    @Override
    public void doSort(int[] arr) {
        System.out.println("Dizi:");
        printArray(arr);
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort Yapıldı");
    }

    @Override
    public void printArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

}
