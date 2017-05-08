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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // input scanner for user input
        Scanner input = new Scanner(System.in);

        // creaating an array filled with 10 spots 
        int[] A = new int[10];

        // asking user to input their marks, and filling the array with marks inputted by user in the for loop
        System.out.println("Please enter in your marks:");
        for (int x = 0; x < A.length; x++) {
            A[x] = input.nextInt();
        }
        // Using the method of bubble sorting to arrange variables in ascending order
        // starting at a spot and comparing every element after that spot --> if number is smaller, than swap numbers 
        int remaining = A.length - 1;
        for (int x = 0; x < (A.length - 1); x++) {
            for (int y = 0; y < (remaining); y++) {
                int temp;
                if (A[y] > A[y + 1]) {
                    temp = A[y + 1];
                    A[y + 1] = A[y];
                    A[y] = temp;

                }
            }
            remaining--;
        }
        // outputting the numbers in ascending order to the user
        System.out.println("In ascending order:");
        for (int x = 0; x < A.length; x++) {
            System.out.println(A[x]);
        }
    }
}
    
