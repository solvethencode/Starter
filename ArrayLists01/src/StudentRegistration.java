import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentRegistration {

	public StudentRegistration() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		String firstName="Adnan";
//		String lastName="Prljaca";		
//		List<Student> students=new ArrayList<Student>();		
//		Student myStudent = new Student();		
//		myStudent.setFirstName(firstName);
//		myStudent.setLastName(lastName);
//		myStudent=new Student(firstName,lastName);
		
		
		List<Student> students=new ArrayList<Student>();		
		Student myStudent;//default value is null;
		myStudent=new Student();
		Student anyStudent =new Student();
		System.out.println(Student.school);
		Scanner input =new Scanner(System.in);
		boolean moreInputs=true;
		while(moreInputs)
		{	
			
			
			//myStudent = new Student();
			System.out.println("First Name :");
			String firstName=input.next();						
//			myStudent.setFirstName(input.next());
			System.out.println("Last Name :");
			String lastName=input.next();
//			myStudent.setLastName(input.next());
			System.out.println("Student Id :");
			String studentId=input.next();
//			myStudent.setStudentId(input.next());
						
			myStudent =new Student(firstName,lastName,studentId);
			myStudent.school="YOUR SCHOOL";
			
			students.add(myStudent);
			System.out.println("More students to enter : [YES/NO]");
			moreInputs= "YES".equalsIgnoreCase(input.next())?true:false;
			String[] a= {"aaa","fdfd"};
			String b=Arrays.toString(a);
			System.out.println(a);
		}
		
		System.out.println("Student List :");
		for (Student s:students)
		{
			System.out.println("Student : Firstname :"+s.getFirstName()+", Last name :"+s.getLastName()+", Student Id:"+s.getStudentId()+",Schhol Name: "+Student.school);
			
		}
		
	}

}
