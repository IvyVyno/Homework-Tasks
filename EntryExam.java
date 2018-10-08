package HW6EntryExam;

public class EntryExam {
	public static void main (String[] args) {
		Enrollee firstEnrollee = new Enrollee("Ilya", "Vinogradov", 21);
		Enrollee secondEnrollee = new Enrollee("Vasya", "Zakidushkin", 19);
		firstEnrollee.examPass(new Exam(true, true, true, true, true));
		secondEnrollee.examPass(new Exam(true, false, true, true, false));
		int firstEnrolleesAverageMark = Teacher.examCheck(firstEnrollee.exam);
		int secondEnrolleesAverageMark = Teacher.examCheck(secondEnrollee.exam);
		Faculty.facultyJoin(firstEnrollee, firstEnrolleesAverageMark);
		Faculty.facultyJoin(secondEnrollee, secondEnrolleesAverageMark);
		AnotherFaculty.facultyJoin(firstEnrollee, firstEnrolleesAverageMark);
		AnotherFaculty.facultyJoin(secondEnrollee, secondEnrolleesAverageMark);
		
	}
}
