package com.apx.estudio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RelojArena {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	ArrayList<Integer> sumasReloj = new ArrayList<>();
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
        				System.out.print(reloj[i][j] + " ");
        			}
        			
        			System.out.println();
        		}
        		sumAct += reloj[1][1];
        		sumasReloj.add(sumAct);
        		
        		System.out.println("######################### suma reloj: " + sumAct);
        		recoridoC++;
        	}//fin ciclo recorre reloj primeras 3 filas
    		
    	}//end ciclo inicial 
    	 
    	System.out.println("Suma mayor: " + sumMax);
    	System.out.println("Arreglo con valores sin ordenar:");
    	for(int t:sumasReloj) {
    		System.out.println(t);
    	}
    	
    	System.out.println("---------------------ORDENADO--------------------------");
    	int[] valOri = new int[sumasReloj.size()];
    	for(int r=0;r<valOri.length;r++) {
    		valOri[r] = sumasReloj.get(r).intValue();
    	}
    	int[] valordenados = new int[valOri.length]; 
    	int auxiliar;
        for(int i = 1; i < valOri.length; i++)
        {
          for(int j = 0;j < valOri.length-i;j++)
          {
            if(valOri[j] > valOri[j+1])
            {
              auxiliar = valOri[j];
              valOri[j] = valOri[j+1];
              valOri[j+1] = auxiliar;
            }   
          }
        }
        valordenados = valOri;
        
        for(int i = 0; i < valordenados.length;i++) {
        	System.out.println(valordenados[i]);
        }
	        sumMax = valordenados[valordenados.length -1];
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
