package com.apx.estudio;

public class GenericsSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsPrinter myPrinter = new GenericsPrinter();
		Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

	}

}
