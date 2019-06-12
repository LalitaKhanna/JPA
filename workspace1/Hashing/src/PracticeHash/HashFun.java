package PracticeHash;

import java.util.HashMap;
import java.util.*;


public class HashFun {
	public static void printarr(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	
	}
	public static void convert (int arr[], int n)
	{
		int temp[] = arr.clone();//copy array into new array
		Arrays.sort(temp);//sort the array
		Map<Integer,Integer> hf = new HashMap<Integer,Integer>();
		int value = 0;
		for(int i=0; i<n;i++)
			hf.put(temp[i],value++);
		for (int i=0;i<n;i++)
			arr[i] = hf.get(arr[i]); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {4322, 1334, 1471, 9679, 1989, 6171, 6173, 4199};
	      int n = arr.length;
	      System.out.println("size of array " +n);
	      System.out.println("orignal array");
	      printarr(arr,n);
	      convert(arr,n);
	      System.out.println("converted array");
	      printarr(arr,n);
	      
	}

}
