package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.utilities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		DepartmentDao departmentDao= DaoFactory.createDepartmentDao();
		System.out.println("TEST 1: department insert");
		Department newDepartment= new Department();
		newDepartment.setName("Marketing");
		departmentDao.insert(newDepartment);
		System.out.println("Department inserted");
		
		System.out.println("TEST 2: department update");
		newDepartment.setName("HumanResources");
		departmentDao.update(newDepartment);
		
		System.out.println("TEST 3: department delete");
		System.out.println("Select which department id you want to delete");
		departmentDao.deleteById(sc.nextInt());
        

	}

}
