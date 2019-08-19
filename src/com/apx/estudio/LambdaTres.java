package com.apx.estudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//REFERENCIA A METODOS
			//Con esta funcionalidad no sólo se puede utilizar expresiones lambda 
			//sino que se puede hacer referencia a los métodos del objeto utilizando el operador ::
		
		//METODO ESTATICO
		List<String> names = new ArrayList<String>();		
	      names.add("Andrea");
	      names.add("Luisa");
	      names.add("Diego");
	      names.add("Paúl");
	      names.add("Dario");
	      names.forEach(System.out :: println);
	      
	    //recibe un objeto Usuario y devuelve la impresión de sus propiedades.
	      Function<Usuario, String> ftoString= Usuario::toString;
	      System.out.println(
	    		  ftoString.apply(
	    				  new Usuario("Santiago","Pardo",18,new Direccion("Nueva Dirección"))));
		
	   // referencia a mensajes
			LinkedList<Integer> lista = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
			Supplier<Integer> funcion3 = lista::removeLast;
			System.out.println(funcion3.get()); // 3
			lista.forEach(System.out::println);
	      
			//referencia a constructores
			Supplier<Usuario> usu= Usuario::new;
			//Construye un objeto de tipo usuario que es devuelto por método get();
			Usuario usuario=usu.get();	

	}

}
