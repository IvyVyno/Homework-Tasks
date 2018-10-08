package HW6EntryExam;

public class Enrollee {

	public String name;
	public String surname;
	public int age;
	public Faculty faculty;
	public Exam exam;

	public Enrollee(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void examPass(Exam exam) {
		this.exam = exam;
	}

}
