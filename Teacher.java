package HW6EntryExam;

public class Teacher {

	public static int examCheck(Exam exam) {
		int mark = 0;
		for (boolean answer : exam.answers) {
			if (answer) {
				mark += 5;
			}
		}
		return mark / exam.answers.length;
	}

}
