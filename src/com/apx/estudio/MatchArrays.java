package com.apx.estudio;

public class MatchArrays {
 // https://www.hackerrank.com/challenges/sparse-arrays/problem    -> eJECRCICIO COMPLETO
	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] result = new int[queries.length];
		
		for(int i=0; i<result.length;i++) {
			int aux = 0;
			
			for(int e =0;e<strings.length;e++) {
				if(strings[e].equals(queries[i])) {
					aux += 1;
				}
				result[i] = aux;
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strings = {"aba","baba","aba","xzxb"};
		String[] strings = {"def","de","fgh"};
		
//		String[] queries = {"aba","xzxb","ab"};
		String[] queries = {"de","lmn","fgh"};
		
		int[] res = matchingStrings(strings, queries);
		
		for(int t=0;t<res.length;t++) {
			System.out.println(res[t] + " ");
		}

	}

}
