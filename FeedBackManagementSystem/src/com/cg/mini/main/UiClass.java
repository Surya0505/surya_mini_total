package com.cg.mini.main;

import java.util.Scanner;

import com.cg.mini.exceptions.FMSException;
import com.cg.mini.service.FMSService;
import com.cg.mini.service.FMSServiceImpl;

public class UiClass {

	public static void main(String[] args) throws FMSException {
		Scanner scanner = new Scanner(System.in);
		boolean result1 = false;

		do {
			System.out.println("Enter Username");
			String username = scanner.nextLine();
			System.out.println("Enter Password");
			
			String password = scanner.nextLine();

			FMSService service = new FMSServiceImpl();

			result1 = service.validateFields(username, password);

			if (result1 == true) {
				System.out.println("=====Training Admin Console=====");
				System.out.println("1.Faculty Skill Maintenance");
				System.out.println("2.Course Maintenance");
				System.out.println("3.View Feedback Report");

			} else {
				System.out.println("Unauthorized access");
			}

		} while (!result1 == true);
		scanner.close();
	}

}
