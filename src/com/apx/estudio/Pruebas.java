package com.apx.estudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double x = 3.85;
//		double y = 3.62;
//		
////		int r = (int)y - (int)x;
//		double r = y - x;
//		
//		System.out.println("RESULTADO: " + r);
		
//		List<Student> studentList = new ArrayList<Student>();
//		Student st = new Student(33, "Rumpa", 3.68);
//		studentList.add(st);
//		Student st1 = new Student(85, "Ashis", 3.85);
//		studentList.add(st1);
//		Student st2 = new Student(56, "Samiha", 3.75);
//		studentList.add(st2);
//		Student st3 = new Student(19, "Samara", 3.75);
//		studentList.add(st3);
//		Student st4 = new Student(22, "Fahim", 3.76);
//		studentList.add(st4);
//		Student st5 = new Student(20, "Samiha", 3.75);
//		studentList.add(st5);
//		
//		if(st2.getFname().equals(st5.getFname())) {
////		if(st2.getFname() == st4.getFname()) {
//			System.out.println("SON IGUALES");
//		}else {
//			System.out.println("SON DISTINTOS ");
//		}

		
		//##########################################################
//		String message = "Hi!";
		  
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		 //Recorrido Normal
//		 for(int t : list) {
//			 System.out.println(t + " ");
//		 }
		 
		 //recorrido con lamdas
		 list.forEach(n -> System.out.print(n + " "));
//		 list.forEach(n -> multiplica(n));
		
		 //Otra forma utilizando lambdas
//		 list.forEach(System.out :: println);
		 
		 
		 //FILTRAR LOS NUMEROS MAYORES A 5 Y AÑADIRLOS A UNA NUEVA LISTA
		     //versiones anteriores
		 /*
		 List<Integer> menor  = new ArrayList<Integer>();
		 for(int r : list) {
			 if(r > 5) {
				 menor.add(r);
			 }
		 }
		 
		 for(int e : menor) {
			 System.out.print(e + " ");
		 }
		 */
		   //Utilizando expreciones lambda
		 /*
		 ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays
				 .asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		 .stream().filter(x -> x > 5)
		 .collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
		 
		 mayores.forEach(e -> System.out.println(e));
		 
		 */
		 
//FIN METODO MAIN		 
	}
	
	
	
	//METODO PARA PRUBAS
	static void multiplica(int k) {
		int res = 5 * k;
		
//		res -> System.out.println(res);
		System.out.println(res);
	}

}
