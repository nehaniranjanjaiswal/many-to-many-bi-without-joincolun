package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s1=new Student();
	s1.setName("Neha");
	s1.setEmail("asdfgh2345");
	
	Student s2=new Student();
	s2.setName("aanchal");
	s2.setEmail("asdfgh2345");
	
	Course c1=new Course();
	c1.setName("SQL");
	c1.setDuration(45);
	
	Course c2=new Course();
	c2.setName("java");
	c2.setDuration(55);
	
	Course c3=new Course();
	c3.setName("html");
	c3.setDuration(30);
	
	ArrayList<Course> course=new ArrayList<Course>();
	course.add(c1);
	course.add(c2);
	course.add(c3);
	
	ArrayList<Student> Student=new ArrayList<Student>();
	Student.add(s1);
	Student.add(s2);
	
	s1.setCourse(course);
	s1.setCourse(course);
	
	c1.setStudent(Student);
	c2.setStudent(Student);
	c3.setStudent(Student);
	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(c1);
	em.persist(c2);
	em.persist(c3);
	et.commit();
}
}
