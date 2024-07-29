package com.wipro.collection;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		/*Student stud1 = (Student) o1;
		Student stud2 = (Student) o2;*/
		
		return o2.getStudentName().compareTo(o1.getStudentName());
	}

}
