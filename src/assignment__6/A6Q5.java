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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // input scanner for user input
        Scanner input = new Scanner(System.in);

        // ask user the number of marks they want to input to determine the size of array needed
        System.out.println("How many marks do you want to enter");
        int number = input.nextInt();

        // creating an array 
        int[] people = new int[number];

        // ask user to enter in the marks and filling the array with marks inputted by user
        System.out.println("Please enter in your marks:");
        for (int x = 0; x < people.length; x++) {
            people[x] = input.nextInt();
        }
        // Using the method of bubble sorting to arrange variables in ascending order
        // starting at a spot and comparing every element after that spot --> if number is smaller, than swap numbers 
        int remaining = people.length - 1;
        for (int x = 0; x < (people.length - 1); x++) {
            for (int y = 0; y < (remaining); y++) {
                int temp;
                if (people[y] > people[y + 1]) {
                    temp = people[y + 1];
                    people[y + 1] = people[y];
                    people[y] = temp;

                }
            }
            remaining--;
        }
        // outprint the order in ascending order to the user
        System.out.println("In ascending order:");
        for (int x = 0; x < people.length; x++) {
            System.out.println(people[x]);

        }
        // calculating the median of the marks if the array length is is even
        if (people.length % 2 == 0){
           int mid = people.length / 2; 
           int mid2 = mid - 1;
           double median = (people [mid] + people[mid2]) / 2;
            
            System.out.println("The median of the students marks are:" + median);
        }
        
        //calculating the median if the array length is odd
        else {
            int  mid = people.length / 2;
            double median = people [mid];
            System.out.println("The median of the marks" + median);
        }
    
}
}