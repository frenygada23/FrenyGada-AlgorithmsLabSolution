package com.greatlearning.dsa.driver;


import java.util.Scanner;
import java.util.*;
import com.greatlearning.service.MergeSortImpl;
import com.greatlearning.service.NotesCount;

public class NotesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MergeSortImpl mergeSortImpl = new MergeSortImpl();
    		 NotesCount notesCount = new NotesCount();
     int size;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of Currency denominations: ");
     size = sc.nextInt();
     System.out.println("Enter the currency denomination values: ");
     int noteDenomination[] = new int[size];
     //in.close();
     for(int i =0;i<size;i++)
     {
     noteDenomination[i] = sc.nextInt();
     }
     System.out.println("Please enter the amount you want to pay:");
     int amt= sc.nextInt();
     
     mergeSortImpl.mergeSort(noteDenomination,0,noteDenomination.length-1);
     for (int i=0;i<noteDenomination.length;i++)
     {
    	 System.out.print(noteDenomination[i]+ " ");
     }
     notesCount.implementNotesCount(noteDenomination,amt);
     }
}

      