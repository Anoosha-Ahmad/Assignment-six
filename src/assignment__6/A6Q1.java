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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a scanner for user input
        Scanner input = new Scanner(System.in);

        // ask user the number of students there are in their class
        System.out.println("How many students in the class?");
        int students = input.nextInt();

        //create a list of numbers corresponding to the number of students inputed by user
        int[] marks = new int[students];

        //scan in some marks
        System.out.println("Please enter in your marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        // for loop to determine the sum
        //accumulator
        double sum = 0;

        //loop to go through each number 
        for (int i = 0; i < marks.length; i++) {
            // add whatever number i'm on to the sum
            sum = sum + marks[i];
        }

        //calculate average
        double avg = sum / marks.length;

        //output the calculation of the average to the user
        System.out.println("The class average is " + avg + "%");
    }
    
}
