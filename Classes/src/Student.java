
public class Student {
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university;

	public Student (String name, int age, char gender, int year, String course, String university) {
		this.name =name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
		
	}
	public void attendLecture() {
		System.out.println(name+ " is attending class");
	}
	public void submitAssign() {
		System.out.println(name + " is submitting assignments");
	}
	public void attendLab() {
		System.out.println(name + " is attending Lab");
	}
}
