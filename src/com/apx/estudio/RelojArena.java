package com.apx.estudio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RelojArena {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
//    	ArrayList<Integer> sumasReloj = new ArrayList<Integer>();
    	int[][] reloj;
    	int sumMax = 0;
    	
    	
    	int recoridoF = 0;
    	
    	for(int fi =0;fi <arr.length - 2;fi++) {//Ciclo inicial 
    		System.out.println("***   FILA "+ fi +"***");
    		int recoridoC = 0;
    		for(int t = 0;t<4;t++) { //fin ciclo recorre reloj primeras 3 filas
        		reloj = new int[3][3];
        		int sumAct = 0;
        		int rf =0;
            	
        		for(int f=0;f < arr.length;f++) {
        			int rc=0;
            		if(rf < 3) {
            			for(int c= 0 + recoridoC;c<arr[f].length;c++) {
                			
                			if(rc < 3) {
                				reloj[f][c-recoridoC] = arr[f + fi][c];
                				rc++;
                			}else {
                				break;
                			}
                			
//                			System.out.print(arr[f][c] + " ");
                			
                		}
            			rf++;
            		}else {
            			break;
            		}
            		
//            		System.out.println();
            	}
            	
            	//IMPRIME RELOJ
        		for(int i =0;i<reloj.length;i++) {
        			for(int j=0;j<reloj[i].length;j++) {
        				if(i != 1) {
        					sumAct += reloj[i][j];
        				}
        				System.out.print(reloj[i][j] + " ");
        			}
        			
        			System.out.println();
        		}
        		sumAct += reloj[1][1];
//        		sumasReloj[] = {sumAct};
//        		if(sumAct < 0) {
//        			
//        		}
        		if(sumAct > sumMax) {
        			sumMax = sumAct;
        		}
        		 
        		System.out.println("######################### suma reloj: " + sumAct);
        		recoridoC++;
        	}//fin ciclo recorre reloj primeras 3 filas
    		
    		
    	}//end ciclo inicial 
    	 
    	System.out.println("Suma mayor: " + sumMax);
    	return sumMax;
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
//        int [][] arr= {
//        		{1,1,1,0,0,0},
//        		{0,1,0,0,0,0},
//        		{1,1,1,0,0,0},
//        		{0,0,2,4,4,0},
//        		{0,0,0,2,0,0},
//        		{0,0,1,2,4,0}
//        		}; 
		
		int [][] arr= {
        		{-1,-1,0,-9,-2,-2},
        		{-2,-1,-6,-8,-2,-5},
        		{-1,-1,-1,-2,-3,-4},
        		{-1,-9,-2,-4,-4,-5},
        		{-7,-3,-3,-2,-9,-9},
        		{-1,-3,-1,-2,-4,-5}
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
