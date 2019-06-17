package com.apx.estudio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RelojArena {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int[][] reloj;
    	
    	int recoridoF = 0;
    	int recoridoC = 0;
    	
    	for(int t = 0;t<4;t++) {
    		reloj = new int[3][3];
    		int rf =0;
        	
    		for(int f=0;f < arr.length;f++) {
    			int rc=0;
        		if(rf < 3) {
        			for(int c= 0 + recoridoC;c<arr[f].length;c++) {
            			
            			if(rc < 3) {
            				reloj[f][c-recoridoC] = arr[f][c];
            				rc++;
            			}else {
            				break;
            			}
            			
//            			System.out.print(arr[f][c] + " ");
            			
            		}
        			rf++;
        		}else {
        			break;
        		}
        		
//        		System.out.println();
        	}
        	
        	//IMPRIME RELOJ
    		for(int i =0;i<reloj.length;i++) {
    			for(int j=0;j<reloj[i].length;j++) {
    				System.out.print(reloj[i][j] + " ");
    			}
    			System.out.println();
    		}
    		System.out.println("#########################");
    		recoridoC++;
    	}
    	
    	return 9;
    }

    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int[][] arr = new int[6][6];
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
        int [][] arr= {
        		{1,1,1,0,0,0},
        		{0,1,0,0,0,0},
        		{1,1,1,0,0,0},
        		{0,0,2,4,4,0},
        		{0,0,0,2,0,0},
        		{0,0,1,2,4,0}
        		}; 

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        
        System.out.println("Resultado: " + result);

        scanner.close();

	}

}
