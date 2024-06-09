package question_two;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Teacher teacher1=new Teacher(2, "aliee", 5000);
		Teacher teacher2=new Teacher(2, "bob",7000);
		Student student1=new Student(1, "charlie",4);
		Student student2=new Student(2, "david",12);
		ArrayList<Teacher>teacherList=new ArrayList<Teacher>();
		
				teacherList.add(teacher1);
				teacherList.add(teacher2);
		
		ArrayList<Student>studentList=new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		
		School school=new School(teacherList,studentList);
		student1.payfees(5000);
		student2.payfees(6000);
		teacher1.recievesalary(teacher1.getSalary());
		teacher2.recievesalary(teacher1.getSalary());
		System.out.println("Total money earned by School: "+school.getTotalMoneyEarned());
		System.out.println("Total money spent by School: "+school.getTotalMoneySpent());
	}

}
