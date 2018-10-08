package HW6;

public class SimilarClockDigits {

	public static void main(String[] args) {
		String hours = "00";
		String minutes = "00";
		searchForSimilarDigits(hours, minutes);
	}

	private static void searchForSimilarDigits(String hours, String minutes) {
		int counter = 0;
		for (int i = 0; i <= 23; i++) {
			if (i != 0) {
				if (i < 10) {
					hours = hours.charAt(0)
							+ (Integer.toString(Integer.parseInt(Character.toString(hours.charAt(1))) + 1));
				} else {
					hours = Integer.toString(Integer.parseInt(hours) + 1);
				}
				
			} else {
				counter++;
				System.out.println(hours+":"+minutes);
			}
			minutes = "00";
			for (int j = 1; j <= 59; j++) {
				if (j < 10) {
					minutes = minutes.charAt(0)
							+ (Integer.toString(Integer.parseInt(Character.toString(minutes.charAt(1))) + 1));
				} else {
					minutes = Integer.toString(Integer.parseInt(minutes) + 1);
				}
				if(hours.equals(new StringBuffer(minutes).reverse().toString())) {
					counter++;
					System.out.println(hours +":"+minutes);
				}
			}
		}
		System.out.println("Similar digits count is: " + counter);
	}
}
