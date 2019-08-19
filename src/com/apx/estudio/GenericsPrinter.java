package com.apx.estudio;

import java.util.Arrays;
import java.util.List;

public class GenericsPrinter {
	
	public <T> void printArray(T[] items ){
//		List<T> list = Arrays.asList(items);
		for(int i=0;i<items.length;i++) {
//		for(T item : list) {
			System.out.println(items[i]);
		}
	}

}
