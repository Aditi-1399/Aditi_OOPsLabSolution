package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Aditi","Amdekar");
		System.out.println("Please enter the department from the following :");
		System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		Scanner scr = new Scanner(System.in);
		int option = scr.nextInt();
		Department department = new Department();
		CredentialService service = new CredentialService();
		switch (option) {
		
			case 1 :{
				department.setDepartmentName("tech");
				String email = service.generateEmail(employee, department);
				String password = service.generatePassword();
				String name = employee.getFirstName();
				service.showCredentials(email,password,name);
				break;
			}
			
			case 2 :{
				department.setDepartmentName("admin");
				String email = service.generateEmail(employee, department);
				String password = service.generatePassword();
				String name = employee.getFirstName();
				service.showCredentials(email,password,name);
				break;
			}
			
			case 3 :{
				department.setDepartmentName("hr");
				String email = service.generateEmail(employee, department);
				String password = service.generatePassword();
				String name = employee.getFirstName();
				service.showCredentials(email,password,name);
				break;
			}
			
			case 4 :{
				department.setDepartmentName("legal");
				String email = service.generateEmail(employee, department);
				String password = service.generatePassword();
				String name = employee.getFirstName();
				service.showCredentials(email,password,name);
				break;
			}
			
			default :
				System.out.println("Wrong option.");
		}
	}

}