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
public class Masinytes {
    public static void main(String[] args) {
        int[] masinytes = new int[8];
 
        int laimetojas = -1;
        int n = 1;
        do {
            int lyderis = 0;
            for (int i = 0; i < masinytes.length; i++) {
                masinytes[i] += (int) (Math.random() * 5) + 1;
                if (masinytes[i] > masinytes[lyderis]) {
                    lyderis = i;
                }
            }
            if (masinytes[lyderis] / 100 >= n) {
                System.out.println(lyderis);
                System.out.println(masinytes[lyderis]);
                System.out.println("----");
                n++;
            }
            for (int i = 0; i < masinytes.length; i++) {
                if (masinytes[i] > 1000) {
                    if (laimetojas < 0 || masinytes[laimetojas] < masinytes[i]) {
                        laimetojas = i;
                    }
                }
            }
        } while (laimetojas == -1);
        System.out.println("pabaiga");
        for (int i = 0; i < masinytes.length; i++) {
            System.out.println(masinytes[i]);
        }
        System.out.println("laimetojas");
        System.out.println(laimetojas);
        System.out.println(masinytes[laimetojas]);
    }
}
