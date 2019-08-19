package com.apx.estudio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pair_left = {"john", "john", "john", "mary", "mary"};
		String[] pair_right = {"tom", "mary", "tom", "anna", "anna"};
		
		
		int np = 0;
String[] arrayPairs = new String[5];
		
		for(int w = 0; w <5;w++) {
			String pairA = pair_left[w] + " " + pair_right[w];
			arrayPairs[w] = pairA;
//			System.out.println(pairA);
		}
		
		List<String> listConj = Arrays.asList(arrayPairs);
		Set<String> conjunto = new HashSet<String>();
		
		for(String it : listConj) {
//			System.out.println(np);
			
			if(!conjunto.contains(it)) {
				conjunto.add(it);
				np += 1;
			}
			System.out.println(np);
		}
	}

}
