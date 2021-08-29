package service;

import java.util.Random;

import model.Department;
import model.Employee;

public class CredentialService {

		public String generateEmail(Employee employee, Department department) {
			String email = employee.getFirstName()+employee.getLastName()+"@"+department.getDepartmentName()+".company.com";
			return email;
		}
		
		public String generatePassword() {
			String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallLetters = "abcdefghijklmnopqrstuvwxyz";
			String numbers = "0123456789";
			String specialCharacters = "!@#$%^&*_=+-/.?<>)";

			String values = capitalLetters + smallLetters + numbers + specialCharacters;
			Random obj = new Random();
			char password[]= new char[8];
			for(int i = 0;i<8;i++) {
				password[i] = values.charAt(obj.nextInt(values.length()));
			}
			return password.toString();
		}
		
		public void showCredentials(String email, String password, String firstName) {
			System.out.println("Dear "+firstName+" your generated credentials are as follows :");
			System.out.println("Email --> "+email);
			System.out.println("Password --> "+password);
		}
}