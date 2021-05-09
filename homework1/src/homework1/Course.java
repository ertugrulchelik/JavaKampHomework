package homework1;

public class Course {

	int id;
	String courseName;
	String instructorName;
	String detail;
	
	public Course() {
		
	}
	
	public Course(int id, String courseName, String instructorName, String detail) {
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	

}
