package com.apx.estudio;

import java.util.ArrayList;
import java.util.List;

public class ParesAPX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pair_left = {"john", "john", "john", "mary", "mary","id", "he","ei","he","john", "john", "john", "mary"};
		String[] pair_right = {"tom", "mary", "tom", "anna", "anna", "aee", "fjd","ijh","fjd","tom", "mary", "tom", "anna"};
		
		int np = 1;
		String[] arrayPairs = new String[13];
		
		for(int w = 0; w <13;w++) {
			String pairA = pair_left[w] + " " + pair_right[w];
			arrayPairs[w] = pairA;
			System.out.println(pairA);
		}
		
		List<String> arrX = new ArrayList<String>();
		int indicador = 0;
		for(int r =0;r<arrayPairs.length;r++) {
//			System.out.println(arrayPairs[r] );
			arrX.add(arrayPairs[r]);
			//
			for(int p=0;p < arrX.size()-1;p++) {
				if(arrX.get(p).equals(arrayPairs[r])) {
					indicador = 0;
					break;
				}else {
					indicador+=1;
				}
			}
			
			//
			if(indicador != 0) {
				np += 1;
			}
			System.out.println(np);
		}

	}

}
