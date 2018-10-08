package HW6EntryExam;

public class AnotherFaculty {

	public static final int passMark = 3;

	public static void facultyJoin(Enrollee enrollee, int averageMark) {
		if (averageMark < passMark) {
			System.out.println(
					"Mark for " + enrollee.name + " " + enrollee.surname + " is not high enough for that faculty!");
		} else {
			System.out.println(enrollee.name + " " + enrollee.surname + " has succsessfuly joined that faculty");
		}
	}
}
