package springmvcm2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvcm2.dto.Student;

@Repository
public class StudentDao {
	@Autowired
	private EntityManager entityManager;
	
	public Student saveStudent(Student student) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	public List<Student> getAllSTudents() {
		Query query=entityManager.createQuery("select s from Student s");
		
		return query.getResultList();
	}

}
