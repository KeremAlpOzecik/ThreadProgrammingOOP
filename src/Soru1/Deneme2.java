/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru1;

import java.util.Random;

/**
 *
 * @author kerem alp
 */
public class Deneme2 {

    public static int[] ArrGenarator() {
        int[] arr = new int[60];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long beginTime = 0, endTime = 0;
        beginTime = System.nanoTime();
        Context context = new Context(new QuickSort());

        context.executeStrategy(ArrGenarator());
        endTime = System.nanoTime();
        System.out.println("Çalışma Süresi(NanoTime) : " + ((double) (endTime - beginTime)));
        System.out.println("--------------------------------------------------");

        beginTime = 0;
        endTime = 0;
        beginTime = System.nanoTime();
        Context context2 = new Context(new BubbleSort());
        context2.executeStrategy(ArrGenarator());
        endTime = System.nanoTime();
        System.out.println("Çalışma Süresi(NanoTime) : " + ((double) (endTime - beginTime)));
                System.out.println("--------------------------------------------------");


        beginTime = 0;
        endTime = 0;
        beginTime = System.nanoTime();
        Context context3 = new Context(new InsertionSort());
        context3.executeStrategy(ArrGenarator());
        endTime = System.nanoTime();
        System.out.println("Çalışma Süresi(NanoTime) : " + ((double) (endTime - beginTime)));

    }

}
