package com.mylearning.org;

public class ConstructorScenario {
	
	public static void main(String args[]) {
		
		
		Employee emp = new Employee(100,"TDP",10000.00);
		
		System.out.println(emp);
		
		Employee emp1= new Employee();
		
		emp1.setEmpname("logan");
		emp1.setEmpno(001);
		emp1.setSalary(5000);
		
		System.out.println(emp1);
		
		
		
	}

}
