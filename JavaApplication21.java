/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Random;

/**
 *
 * @author cardo
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand=new Random();
        
            for (int i = 0; i < 245; i++) {
            System.out.print(rand.nextInt(2));
        }
        
        System.out.println();
    }
}
