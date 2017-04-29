package tdd.com.example.pojo;

/**
 * @author Krishna Bhat
 *
 */

public class EmployeeBusiness {
	// calculate yearly salary
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	// calculate the appraisal amount of an employee
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if (employeeDetails.getMonthlySalary() < 10000)
			appraisal = 500;
		else
			appraisal = 1000;

		return appraisal;
	}
}
