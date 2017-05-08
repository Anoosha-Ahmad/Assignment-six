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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        //creating a temporary variable to allow the conversion of integers later on for ascending order
        int temp;

        // create a scanner for user input
        Scanner input = new Scanner(System.in);

        //create a list of two numbers
        int[] A = new int[2];

        // scanning in user's integers
        System.out.println("Please eneter two integers: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        // loop to rearrange the variables in ascending order
        for (int i = 0; i < A.length; i++) {
            for (int n = i + 1; n < A.length; n++) {
                if (A[i] > A[n]) {
                    temp = A[i];
                    A[i] = A[n];
                    A[n] = temp;

                }

            }
        }

        // output the user's integers that they inputted in ascending order
        System.out.println("Ascending Order:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
    
