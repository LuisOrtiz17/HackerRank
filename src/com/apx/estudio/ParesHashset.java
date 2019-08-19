package com.apx.estudio;

import java.util.ArrayList;
import java.util.List;

public class ParesHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pair_left = {"john", "john", "john", "mary", "mary"};
		String[] pair_right = {"tom", "mary", "tom", "anna", "anna"};
		
		int np = 1;
		String[] arrayPairs = new String[5];
		
		for(int w = 0; w <5;w++) {
			String pairA = pair_left[w] + " " + pair_right[w];
			arrayPairs[w] = pairA;
//			System.out.println(pairA);
		}
		
		List<String> arrX = new ArrayList<String>();
		int aux = 0;
		for(int r =0;r<arrayPairs.length;r++) {
//			System.out.println(arrayPairs[r] );
			arrX.add(arrayPairs[r]);
			int indicador = search(arrX, arrayPairs[r]);
			if(indicador != 0) {
				np += 1;
			}
			System.out.println(np);
		}
		
		
		

	}
	
	static int search(List<String> array, String item) {
		int e = 0;
		for(int p=0;p < array.size()-1;p++) {
			if(array.get(p).equals(item)) {
				e = 0;
				break;
			}else {
				e+=1;
			}
		}
		return e;
	}

}
