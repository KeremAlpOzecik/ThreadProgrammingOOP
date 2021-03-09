/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru1;

import java.util.Arrays;

/**
 *
 * @author kerem alp
 */
public class Buffer {
    public int row;
    public int column;
    private final int[][] result;
    private final int[][] secondMatris;

    public Buffer(int row, int column, int[][] secondMatris) {//Buffer için consturactor
        this.row = row;
        this.column = column;
        result = new int[row][column];
        this.secondMatris = secondMatris;
    }
    
    public synchronized void put(int row,int column,int value ){
        result[row][column]+=value;//workerdan gelen value verisi ile sonuç matrisi oluşturulacak.
       
    }
    
    public void printResult(){
        System.out.println("Result Matrix");
        System.out.println("-------------");
        System.out.println(Arrays.deepToString(result));
        System.out.println("");
        for (int[] result1 : result) {//2D matrix print ediliyor
          
            for (int j = 0; j < result1.length; j++) {
               
                System.out.print(result1[j] + " ");
            }
            System.out.println(); 
        }

         
    
    
    
}}


