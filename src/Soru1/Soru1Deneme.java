/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author kerem alp
 */
public class Soru1Deneme {

    public static int[][] DosyaOku(File file, ArrayList<String[]> matrix) throws FileNotFoundException, IOException {//Matrixleri doldurmak için fonksiyon
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String satir = reader.readLine();

        while (satir != null) {
            String[] arrOfStr = satir.split(" ");
            matrix.add(arrOfStr);
            // System.out.println(satir);
            satir = reader.readLine();
        }
        int[][] matris1 = new int[matrix.size()][matrix.get(0).length];
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).length; j++) {
                matris1[i][j] = Integer.parseInt(matrix.get(i)[j]);

            }
        }
        return matris1;

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Main de matris1 ve matris2 oluşturuluyor diğer classlarda işleme gönderiliyor.
        ArrayList<String[]> matrix = new ArrayList<>();
        ArrayList<String[]> matrix2 = new ArrayList<>();

        int[][] matris1 = DosyaOku(new File("Matris1.txt"), matrix);
        int[][] matris2 = DosyaOku(new File("Matris2.txt"), matrix2);
     
      
        Buffer buffer = new Buffer(matris1.length, matris2[0].length, matris2);
        ArrayList<MultiplyWorker> thread=new ArrayList<>();
        for (int i = 0; i < matris1.length; i++) {//matris1 satır sayısı kadar thread ekleniyor arrayliste
            thread.add(new MultiplyWorker(i, buffer, matris1[i],matris2)); 
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < thread.size(); i++) {//arraylistden alınan threadler execute ediliyor.

        executorService.execute(thread.get(i));
            
        }

         executorService.shutdown();
    

       

        try {
            // wait 1 minute for both writers to finish executing
            boolean tasksEnded
                    = executorService.awaitTermination(1, TimeUnit.MINUTES);

            if (tasksEnded) {
                System.out.print(Arrays.deepToString(matris1)+" X");
                System.out.println(" "+Arrays.deepToString(matris2));

                buffer.printResult();//sonuç matrisi print ediliyor

            } else {
                System.out.println(
                        "Timed out while waiting for tasks to finish.");
            }
        } catch (InterruptedException ex) {
            System.out.println(
                    "Interrupted while waiting for tasks to finish.");
        }

    }
}
