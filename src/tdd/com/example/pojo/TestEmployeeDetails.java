package tdd.com.example.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
* @author Krishna Bhat
*
*/

public class TestEmployeeDetails {
	EmployeeDetails employeeDetails = new EmployeeDetails();
	EmployeeBusiness employeeBusiness = new EmployeeBusiness();
	
	//test yearly salary
	@Test
	public void testCalculateYearlySalary(){
		employeeDetails.setName("Krishna");
		employeeDetails.setAge(28);
		employeeDetails.setMonthlySalary(8000);
		
		double salary = employeeBusiness.calculateYearlySalary(employeeDetails);
		assertEquals(96000, salary, 0.0);
	}
	
	//test appraisal 
	@Test
	public void testCalculateAppraisal(){
		employeeDetails.setName("Krishna");
		employeeDetails.setAge(28);
		employeeDetails.setMonthlySalary(8000);
		
		double appraisal = employeeBusiness.calculateAppraisal(employeeDetails);
		assertEquals(500, appraisal, 0.0);
	}
}
