package homework1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "C# Kursu";
		course1.instructorName = "Engin Demirog";
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Java Kursu";
		course2.instructorName = "Engin Demirog";
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Ertugrul";
		student1.lastName = "CELIK";
		student1.email = "ertgrl_23@hotmail.com";
		
		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Eren";
		student2.lastName = "CELIK";
		student2.email = "celikeren23@hotmail.com";
		
		Course[] courses = {course1, course2};
		Student[] students = {student1, student2};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		for(Student student : students) {
			System.out.println(student.firstName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);

		
	}

}
