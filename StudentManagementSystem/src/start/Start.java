package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management System");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to ADD student");
			System.out.println("press 2 to DELETE student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit App");
			int c =Integer.parseInt(br.readLine()) ;
			if(c==1) {
				System.out.println("Enter the student name:");
				String name = br.readLine();
				
				System.out.println("Enter the student phone:");
				String phone = br.readLine();
				
				System.out.println("Enter the student city:");
				String city = br.readLine();
				
				// create the object of the student for the storing the data
				Student st = new Student(name,phone,city);
				boolean answer =StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("student added successfully...");
				}
				else {
					System.out.println("something went wrong try again...");
				}
				
				System.out.println(st);

			}
			else if(c==2) {
				// delete student code
			}
			else if(c==3) {
				// display student code
			}
			else if(c==4) {
				// exit form the code
				break;
			}
			else {
				
			}
			
		}
		System.out.println("Thank You for Using my Student Application....");
		System.out.println("See You Soon ....");
		
	}

}
