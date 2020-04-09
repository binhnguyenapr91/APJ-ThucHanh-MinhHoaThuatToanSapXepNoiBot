package app;

import java.io.*;

public class BubbleSortByStep {
	public static int[] bubbleSortByStep(int[] arr) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
		return arr;
	}
	public static void main(String[] args) throws RuntimeException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter list size:");
		int size = Integer.parseInt(br.readLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());;
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        int[] arr = bubbleSortByStep(list);
        
        for(int item: arr) {
        	System.out.print(item);
        }
        
	}
	
	

}
