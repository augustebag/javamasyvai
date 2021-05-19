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
public class Rusiavimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RUSIAVIMAS
    int[] masyvas = {123, -1, 5, -7};
    
    /*
    masyvas --------> 0: 123
                      1: -1
                      2:  5
                      3: -7
                 length:  4
    
    i: 0
    j: 1
    tmp: 123
    */
 
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) {
                    int tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }
        }
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
        System.out.println("--------");
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) {
                    int tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }
        }
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }
    
}
