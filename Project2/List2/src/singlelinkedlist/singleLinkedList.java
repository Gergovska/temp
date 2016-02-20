package singlelinkedlist;

import linkedlist.LinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Oleksandra Gergovska
 */
class singleLinkedList {
    public static void main(String[] args) throws Exception {
    /* String List creation */
        LinkedList<Integer> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Initial length of list: "+ list.size());
      /* Filling the Single Linked List to test the revertList() method */

           System.out.println("Enter 5 digit numbers: ");

           for (int i = 0; i<5; i++) {
               try {
                  int n = in.nextInt();
                   list.add(n);
               }
         catch (InputMismatchException e){
               System.out.println("You've entered not a digit, please try again.");
             i--;
           }
             in.nextLine();
           }
        System.out.println("Current length of list: "+ list.size());
        System.out.println("Initial Single Linked List:");
        System.out.println(list.toString());
        System.out.println();
        list.revertList();
        System.out.println("Reversed Single Linked List:");
        System.out.println(list.toString());

    }
}
