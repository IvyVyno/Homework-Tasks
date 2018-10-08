package HW6EntryExam;

public class Exam {

	public boolean firstAnswer;
	public boolean secondAnswer;
	public boolean thirdAnswer;
	public boolean fourthAnswer;
	public boolean fifthAnswer;
	public boolean[] answers;

	public Exam(boolean firstAnswer, boolean secondAnswer, boolean thirdAnswer, boolean fourthAnswer,
			boolean fifthAnswer) {
		this.firstAnswer = firstAnswer;
		this.secondAnswer = secondAnswer;
		this.thirdAnswer = thirdAnswer;
		this.fourthAnswer = fourthAnswer;
		this.fifthAnswer = fifthAnswer;
		this.answers = new boolean[] { firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, fifthAnswer };
	}

}
