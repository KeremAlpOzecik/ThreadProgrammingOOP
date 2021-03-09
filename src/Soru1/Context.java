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
public class Context {
     private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

  public void executeStrategy(int[] arr){//interface methodları execute edildi.
       strategy.doSort(arr);
       strategy.printArray(arr);
       
    
}
}