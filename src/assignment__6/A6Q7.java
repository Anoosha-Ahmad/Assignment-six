/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment__6;

import java.util.Scanner;

/**
 *
 * @author Anoosha
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // input scanner for user input
        Scanner input = new Scanner(System.in);

        // create an array - the size of the array is 1001 (until 1000, but the array begins at position 0)
        int[] A = new int[1001];

        // fill the array 
        for (int i = 0; i < A.length; i++) {
            A[i] = i;
        }

        // create a counter 
        int number = 2;

        // 
        while (number <= 7) {

            // replacing any number that is not a prime number by -1 
            // need half of the length of the array
            for (int i = 2; i < (A.length / 2); i++) {
                int multiple = number * i;
                if (multiple < A.length) {

                    //change that spot to negative one 
                    A[multiple] = -1;
                }
            }

            // keep adding one to the number to find the next prime number -- changing the original variable
            number++;

            while (A[number] == -1) {

                // continously add one 
                number++;
            }
        }

        // re - checking the variables to see if they are prime 
        for (int i = 2; i < A.length; i++) {
            if (A[i] != -1) {
                System.out.println(A[i]);
            }
        }

    }
}
