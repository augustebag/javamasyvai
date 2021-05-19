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
public class Masyvai {
    public static void main(String[] args) {
        
        int[] masyvas = {7, 10};
           
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
        
        masyvas = new int[4];
        masyvas[0] = 123;
        masyvas[1] = -1;
        masyvas[2] = 5;
        masyvas[3] = -7;
//        masyvas[3] = 35;
//        masyvas[4] = 45;
//        masyvas[5] = 55;
        
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }
}