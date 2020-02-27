/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes;

/**
 *
 * @author Evan
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean isPrime = false;
        boolean numbers[] = new boolean[1000];
        numbers[0] = true;
        numbers[1] = true;
        numbers[2] = true;
        numbers[3] = true;
        for (int i = 4; i < numbers.length; i++) {
            for (int k = 2; k < i; k++) {
                if(i%(i-k) == 0) {
                    isPrime = false;
                    System.out.println("HEY IM NOT PRIME");
                    break;
                }
                else {
                    isPrime = true;
                    System.out.println("HEY IM STILL PRIME");
                }
            }
            if(isPrime == true) {
            numbers[i] = true;
            System.out.println(i);
            }
        }
        
    }
    
}
