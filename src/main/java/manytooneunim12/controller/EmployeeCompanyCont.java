package manytooneunim12.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunim12.dto.Company;
import manytooneunim12.dto.Employee;

public class EmployeeCompanyCont {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(101);
	company.setName("TYSS");
	company.setGst("ty@123");
	
	
	Employee employee1=new Employee();
	employee1.setId(1);
	employee1.setName("Poojitha");
	employee1.setAddress("Banga");
	employee1.setCompany(company);
	
	Employee employee2=new Employee();
	employee2.setId(2);
	employee2.setName("MHD");
	employee2.setAddress("Chennai");
	employee2.setCompany(company);
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(company);
	entityManager.persist(employee1);
	entityManager.persist(employee2);
	entityTransaction.commit();
	
	
	
	
	
}
}
