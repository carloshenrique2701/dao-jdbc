package application;

import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===Teste 1: Department findById===");
		Department d1 = departmentDao.findById(2);
		System.out.println("Department found! " + d1);
		

	}

}
