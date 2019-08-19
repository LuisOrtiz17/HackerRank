package com.apx.estudio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		Student st = new Student(33, "Rumpa", 3.68);
		studentList.add(st);
		Student st1 = new Student(85, "Ashis", 3.85);
		studentList.add(st1);
		Student st2 = new Student(56, "Samiha", 3.75);
		studentList.add(st2);
		Student st3 = new Student(19, "Samara", 3.75);
		studentList.add(st3);
		Student st4 = new Student(22, "Fahim", 3.76);
		studentList.add(st4);
		Student st5 = new Student(20, "Samiha", 3.75);
		studentList.add(st5);
		Student st6 = new Student(1, "PdeLwCYcXHBUyDovShzHKI", 1.85);
		studentList.add(st6);
		Student st7 = new Student(13, "XHjqMumVZfSW", 0.18);
		studentList.add(st7);
		Student st8 = new Student(8, "HYasEeNIkTsDSnuMXQGDuFIZuGen", 2.01);
		studentList.add(st8);
		Student st9 = new Student(11, "PnfTXKEvdJeLaciXAIooDmqlTuBxJL", 1.30);
		studentList.add(st9);
		Student st10 = new Student(7, "XHjqMumVZfSW", 0.18);
		studentList.add(st10);
		
//		OrdenaStudent orde = new OrdenaStudent();
//		Collections.sort(studentList, orde);
		Collections.sort(studentList,
				Comparator.comparing(Student :: getCgpa).reversed().
				thenComparing(Student :: getFname).
				thenComparing(Student :: getId)); //JAVA 8
		
		for(Student ss: studentList){
			System.out.println(ss.getId() + " " + ss.getFname() + " " + ss.getCgpa());
		}
		

	}

}
