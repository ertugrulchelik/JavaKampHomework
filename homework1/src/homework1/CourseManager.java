package homework1;

public class CourseManager {
	public void add(Course course) {
		System.out.println("yeni kurs:"+course.courseName+" eklendi");
	}
	
	public void delete(Course course) {
		System.out.println("ekli olan kurs silindi:"+course.courseName);
	}

}
