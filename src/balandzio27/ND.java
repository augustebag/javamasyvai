/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balandzio27;

/**
 *
 * @author auguste
 */
public class ND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] staciakampis = {
            {4, 7, 14, -5},
            {1, 2, 3, 4, 5, 6, 7, 8},
            {9, 9},
            {1},
            {},
            {9, 3, 9, 3}
        };
        
        for (int[] staciakampi : staciakampis) {
            for (int j = 0; j < staciakampi.length; j++) {
                System.out.println(staciakampi[j]);
                System.out.println("\t");
            }
            System.out.println();
        }
        
        //////////////////////////////
                   //ND
                   
        int[] m = {1, 2, 3};
 
        int[][] kv = new int[m.length][m.length];
 
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                kv[i][(j + i) % m.length] = m[j];
            }
        }
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                System.out.print(kv[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("------");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                kv[i][j] = m[(j + i) % m.length];
            }
        }
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                System.out.print(kv[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
}
