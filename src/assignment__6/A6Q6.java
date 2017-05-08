/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment__6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Anoosha
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create scanner for user input
        Scanner input = new Scanner(System.in);

        // ask how mnay students are in the class to determine the size of the array
        System.out.println("How many students in the class?");
        int students = input.nextInt();

        // creating the  array 
        int[] marks = new int[students];

// ask user to enter in the marks and filling the array with marks inputted by user
        System.out.println("Please enter in your marks");
        for (int x = 0; x < marks.length; x++) {
            marks[x] = input.nextInt();
        }

        // Using the method of bubble sorting to arrange variables in ascending order
        // starting at a spot and comparing every element after that spot --> if number is smaller, than swap numbers 
        int remaining = marks.length - 1;
        for (int x = 0; x < (marks.length - 1); x++) {
            for (int y = 0; y < (remaining); y++) {
                int temp;
                if (marks[y] > marks[y + 1]) {
                    temp = marks[y + 1];
                    marks[y + 1] = marks[y];
                    marks[y] = temp;

                }
            }
            remaining--;

        }

        // // outprint the order in ascending order to the user
        System.out.println("In ascending order:");
        for (int x = 0; x < marks.length; x++) {
            System.out.println(marks[x]);
        }

        // calculating the average of the marks
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double avg = sum / marks.length;

        // rounding  ( for format) 
        DecimalFormat round = new DecimalFormat("###.##");

        // outputting the average of the marks
        System.out.println(" ");
        System.out.println("The average is " + round.format(avg) + "%");

        // outputting the lowest mark by getting the mark at position 0 (after being arranged in ascending order)
        System.out.println(" ");
        System.out.println(" The lowest mark is" + marks[0] + "%");

        // outputting the highest mark by getting the mark at the last position on the array (after being arranged in ascending order)
        System.out.println(" ");
        // subtract 1 from the array length, since the arrasy begins at position 0       
        System.out.println("The highest mark is " + marks[marks.length - 1] + "%");

    }
}
