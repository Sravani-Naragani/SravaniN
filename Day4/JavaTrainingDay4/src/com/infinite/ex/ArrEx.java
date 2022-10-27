package com.infinite.ex;

public class ArrEx {
	public static void main(String[] args) {
		try {
			int[] a ={12,45};
			a[10] = 90;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ARRAY SIZE IS SMALL");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

    }
}