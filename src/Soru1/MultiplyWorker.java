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

public class MultiplyWorker implements Runnable{

    private final Buffer buffer;
    public int rowNumber;
    public int[] matrisRow;
    public int [][] secondMatris;
    
    public MultiplyWorker(int rowNumber,Buffer buffer,int[] matrisRow,int [][] secodMatris) {//Worker için consturactor.
        this.rowNumber = rowNumber;
        this.buffer = buffer;
        this.matrisRow = matrisRow;
        this.secondMatris=secodMatris;
    }
    int value;
    @Override
    public void run() {//1.matrisin satırı ve 2.matrisin tamamının işlenerek sonuç matrisinin oluşturulduğu method.
        for (int i = 0; i < matrisRow.length; i++) {
           
            for (int j = 0; j<secondMatris[0].length; j++) {
                
                value = matrisRow[i]*secondMatris[i][j];
                buffer.put(rowNumber, j,value );//veriler put methoduna gönderiliyor ve sonuç matrisi oluşuyor.
                
               
            }
          
        }
    }
    
}

