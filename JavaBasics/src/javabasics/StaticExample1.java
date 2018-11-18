package javabasics;

public class StaticExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 =new Student();
		student1.setFirstName("Adnan");
		student1.setLastName("Prljaca");
		student1.setStudentId("123456");
		Student.schoolName="Your School";
		System.out.println("Firstname :"+student1.getFirstName()+
				", Lastname :"+student1.getLastName()+
				", StudentID :"+student1.getStudentId()+
				", School :"+ student1.schoolName+
				", Address :"+Student.getSchoolAddress());
		
		Student student2 =new Student("Aysenur","Prljaca","324324342");
		System.out.println("Firstname :"+student2.getFirstName()+
				", Lastname :"+student2.getLastName()+
				", StudentID :"+student2.getStudentId()+
				", School :"+ student2.schoolName+
				", Address :"+Student.getSchoolAddress());

		

	}

}
