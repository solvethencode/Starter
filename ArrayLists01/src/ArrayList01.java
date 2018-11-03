import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public ArrayList01() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if its constant or fixed array use arrays
		//if your array grows or shrins in runtime use arraylist
		
		String[] days= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		
//		System.out.println("First day"+days[0]);
//		System.out.println("Number of days:"+days.length);
		
		//
		String[] patients=new String[10];
		
		patients =new String[] {"sdfd","sdfsd","sdfsd","sffgf","sdfsd","dfsdfs","hgfhf"};
		System.out.println("Patient 5 :"+patients[5]);
		System.out.println("Patient 6 :"+patients[6]);
		
		
		ArrayList students=new ArrayList();
		students.add("First");
		students.add("Second");
		students.add(0, "El");
		students.set(0, "NewStudent");
		for(Object s: students)
		{
			System.out.println(s);
		}
		
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
		
		
		System.out.println("Number of Students :"+students.size());
		System.out.println("Student at position 1 :"+students.get(0));
		System.out.println(students.isEmpty());
		
		ArrayList list=new ArrayList();
		Integer i=10;
		int in=10;
		list.add(Integer.valueOf(in));
		
		
		
	}

}
