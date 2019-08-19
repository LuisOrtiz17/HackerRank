package com.apx.estudio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		En el siguiente ejemplo a partir de una lista de números enteros se imprime: 
			los números pares, los números mayores a 5 y los impares.
		*/
		
		//PREDICADOS
		List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Numeros pares: ");
		evaluar(listNumbers, (n) -> n%2 == 0);
		
		System.out.println("Numeros Impares");
		evaluar(listNumbers, (n) -> n%2 ==1);
		
		System.out.println("Numeros Mayores a 5");
		evaluar(listNumbers, (n) -> n > 5);
		
		System.out.println("Evaluacion de cadena");
		cadena("Paris", (s) -> s.length() > 6);
		
		
		//FUNCIONES CON LAMBDAS Function<T,R>
		Function<String, Integer> sizeString = str -> str.length();
		String cad = "Lambdas tipo funciones";
		System.out.println("Numeros de caracteres es: " + sizeString.apply(cad));
		
		
		//PROVEEDORES
		//Las expresiones Lambda de este tipo no tiene parámetros de entrada, pero si devuelven un resultado, utilizan la interface Supplier<T>
		//se crea un proveedor de tipo Persona, el cual obtiene una persona
		Supplier<Persona> supplier = LambdaDos :: llenarPersona;
		//obtiene desde el proveedor la persona y la asigna a per
		Persona per = supplier.get();
		//Imprime el nombre
		System.out.println(per.getName() + " " + per.getSurname());
		
		
		//CONSUMIDOR
		//Utilizan la interfaz Consumer<T>, tienen un sólo argumento de entrada y no devuelven ningún valor.
		Consumer<Persona> perso = (p) -> System.out.println("Hola, " + p.getName());
		perso.accept(new Persona("Angel", "Zamudio", "Zacatecas"));
		
		
		
	}
	
	public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
		for(Integer n: listaNumeros)  {
			if(predicado.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
	
	public static void cadena(String st, Predicate<String> pred) {
		if(pred.test(st)) {
			System.out.println("CADENA MUY EXTENSA");
		}else {
			System.out.println("CADENA NORMAL");
		}
	}
	
	public static Persona llenarPersona() {
		return new Persona("Luis", "Ortiz", "Aculco, Edo Mex");
	}

}
