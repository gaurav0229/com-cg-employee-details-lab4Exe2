package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceClass;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Emp Id");
		int empId=sc.nextInt();
		System.out.println("Enter Emp Name");
		String empName=sc.next();
		System.out.println("Enter Emp Salary");
		double empSalary=sc.nextDouble();
		System.out.println("Enter Emp Designation");
		System.out.println("Choose option: \n"
				+ "1 Associate \n"
				+ "2 Programmer \n"
				+ "3 Manager \n"
				+ "4 Clerk");
		String empDesignation=sc.next();
		sc.close();
		
		EmployeeService empSer= new EmployeeServiceClass();
		
		String empInsuranceScheme = null;
		Employee emp = empSer.getEmployeeDetails(empId, empName, empSalary,empDesignation,empInsuranceScheme);
		
		empSer.findInsuranceScheme(emp);
		
		empSer.displayAllDetails(emp);
	}

	}


