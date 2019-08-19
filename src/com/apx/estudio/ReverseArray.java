package com.apx.estudio;

public class ReverseArray {
	
	static int[] reverseArray(int[] a) {
		int[] reverse = new int[a.length];
		for(int i =0;i<a.length;i++) {
			reverse[i] = a[a.length-1 - i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a= {1,4,3,2};
		int[] a= {7,4,0,1};
		
		int[]res = reverseArray(a);
		
		for(int t=0; t<res.length;t++) {
			System.out.print(res[t] + " ");
		}

	}

}
