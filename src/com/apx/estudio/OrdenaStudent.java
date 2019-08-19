package com.apx.estudio;

import java.util.Comparator;

public class OrdenaStudent implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		//JAVA 7
		if(s1.getCgpa() == s2.getCgpa() && s1.getFname().equals(s2.getFname())) {
			return s1.getId() - s2.getId();
		}
		else if(s1.getCgpa() == s2.getCgpa()) {
			return s1.getFname().compareTo(s2.getFname());
			
		}
		else {
		double r = s2.getCgpa() - s1.getCgpa();
		int n = 0;
		if(r > 0) {
			n = 1;
		}else if(r < 0) {
			n= -1;
		}else if(r == 0) {
			n = 0;
		}
		return n;
		}
	}

}
