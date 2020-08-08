/*
 * import java.util.*;
 

public class StudentMain {

	public static void main(String[] args) {
		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	Set<Student> set = new HashSet<>();

	public void runApp() {

		Student student1 = new Student(12, "ank123");
		set.add(student1);
		Student student2 = new Student(134, "antila123");
		set.add(student2);
		Student student3 = new Student(13, "ankur123");
		set.add(student3);
		Student student4 = new Student(12, "a123");
		set.add(student4);
		List<Student> list = toList(set);

	}

	public List<Student> toList(Set<Student> set) {
		List<Student> list = new ArrayList<>();
		for (Student student : set) {
			if (student.getAge() > 21) {
				list.add(student);
			}
		}
		return list;
		
	

	}
}
*/