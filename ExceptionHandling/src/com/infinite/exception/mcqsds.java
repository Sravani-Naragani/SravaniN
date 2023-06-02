package com.infinite.exception;

public class mcqsds {

	public static void main(String[] args) {
//		int arr[] = { 120, 200, 178, 014 }; //016 is equal to 14
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		int[] x = {1,2,3,4};
//		int[] y = x;
//		x= new int[2];
//				for(int i =0; i<x.length;i++)
//					System.out.println(y[i]);
		int sum = 0;
        for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
            sum += i;
        System.out.println(sum);
		

	}

}
