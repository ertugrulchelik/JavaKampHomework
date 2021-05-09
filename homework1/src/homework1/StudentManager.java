package homework1;

public class StudentManager {
	public void add(Student student) {
		System.out.println("yeni ogrenci :"+ student.firstName+" eklendi");
	}
	
	public void delete(Student student) {
		System.out.println("ekli olan ogrenci silindi :"+ student.firstName);
	}

}
