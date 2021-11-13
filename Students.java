package week3.day1;

import org.student.Student;

public class Students {
	
	public void studentinfo(int id) {
		System.out.println("iD="+id);

	}
	
	public void studentinfo(String name , int id) {
		System.out.println("Name="+name);
		System.out.println("ID="+id);
	
	}
	public void studentinfo(long no ,String email) {
		System.out.println("MOB_NO=" +no);
		System.out.println("EMAIL="+email);
		
	}
	
	public static void main(String[] args) {
		
		Students stu = new Students();
		
		stu.studentinfo(9980);
		stu.studentinfo("Stalin" ,9980);
		stu.studentinfo(908048951 , "stalinmech1997@gmail.com");
	}
	
	
}
