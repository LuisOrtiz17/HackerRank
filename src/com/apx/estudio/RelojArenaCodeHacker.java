package com.apx.estudio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RelojArenaCodeHacker {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int[][] reloj;
    	int sumMax = 0;
    	
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
                			
                		}
            			rf++;
            		}else {
            			break;
            		}
            		
            	}
            	
            	//IMPRIME RELOJ
        		for(int i =0;i<reloj.length;i++) {
        			for(int j=0;j<reloj[i].length;j++) {
        				if(i != 1) {
        					sumAct += reloj[i][j];
        				}
        			}
        		}
        		sumAct += reloj[1][1];
        		if(sumAct > sumMax) {
        			sumMax = sumAct;
        		}
        		recoridoC++;
        	}//fin ciclo recorre reloj primeras 3 filas
    		
    		
    	}//end ciclo inicial 
    	return sumMax;
    }

    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();

	}

}
