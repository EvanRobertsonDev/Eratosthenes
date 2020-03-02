/*
 * Evan Robertson
 * March 2nd 2020
 * Eratosthenes.java
 * This program outputs all prime numbers in the first 1000 numbers
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
        //Create booleans for checking whether a number is prime
        boolean isPrime = false;
        boolean numbers[] = new boolean[1000];
        //1 to 3 are always prime, start at 4
        numbers[0] = true;
        numbers[1] = true;
        System.out.println(1);
        numbers[2] = true;
        System.out.println(2);
        numbers[3] = true;
        System.out.println(3);
        //Nested loops to find if a number is prime
        for (int i = 4; i < numbers.length; i++) {
            for (int k = 2; k < i; k++) {
                //If i modulus k is 0 then that means there is another factor 
                //of i, therefore it is not prime 
                if(i%(k) == 0) {
                    isPrime = false;
                    break;
                }
                else {
                    isPrime = true;
                }
            }
            // If the number is prime, print it
            if(isPrime == true) {
            numbers[i] = true;
            System.out.println(i);
            }
        }
        
    }
    
}
