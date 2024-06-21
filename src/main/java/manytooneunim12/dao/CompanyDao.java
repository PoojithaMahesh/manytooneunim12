package manytooneunim12.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunim12.dto.Company;

public class CompanyDao {
public EntityManager getEntityManager() {
	return Persistence.createEntityManagerFactory("vinod").createEntityManager();
}

public void updateCompany(int id,Company company) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Company dbCompany=entityManager.find(Company.class, id);
	if(dbCompany!=null) {
//		company is present you can update the data
		entityTransaction.begin();
		company.setId(id);
		entityManager.merge(company);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry Id is not present");
	}
}

public void findCompany(int id) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Company dbCompany=entityManager.find(Company.class, id);
	if(dbCompany!=null) {
//		company is present you can update the data
		System.out.println(dbCompany);
	}else {
		System.out.println("Sorry Id is not present");
	}
}

public void deleteCompany(int id) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Company dbCompany=entityManager.find(Company.class, id);
	if(dbCompany!=null) {
//		company is present you can update the data
		entityTransaction.begin();
		entityManager.remove(dbCompany);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry Id is not present");
	}
}
}
