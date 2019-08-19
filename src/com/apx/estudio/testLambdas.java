package com.apx.estudio;

public class testLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10;
		int y =5;
		String ss = "Angel";
		//Se implementa el metodo de la interfaz con la exprecion lambda
//		IFuncionaLambda iflambda = (a,b) -> {
//			System.out.println(a + b);
//		};
		
		//
		IFuncionaLambda lambda = (n) ->{
			String saludo = "Welcome " + n;
			return saludo;
		};
		
		//Se utiliza el metodo con la implementación y se le envia los valores de x e y
//		iflambda.suma(x, y);
		String msj = lambda.saluda(ss);
		System.out.println(msj);

	}

}
