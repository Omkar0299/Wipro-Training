package com.school;
import com.example.school.entities.*;
public class School
{
public static void main(String[] str) {
	Student obj1 = new Student();
	Teacher obj2 = new Teacher();
	Course obj3 = new Course();
	obj1.studentMethod();
	obj2.teacherMethod();
	obj3.courseMethod();
}
}
