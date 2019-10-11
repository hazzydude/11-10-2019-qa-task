package Main;

public class Results {

	public void markBreakdown(int phys, int chem, int bio) {

		System.out.println("Physics mark: " + phys);
		System.out.println("Chemistry mark: " + chem);
		System.out.println("Biology mark: " + bio);
		int total = phys + chem + bio;
		System.out.println("Total mark: " + total);
	}

	public void percentage(double phys, int chem, int bio) {
		String examNames[] = { "Physics", "Chemistry", "Biology" };
		double total = phys + chem + bio;
		double pper = 100*phys / 150;
		double cper = 100*chem / 150;
		double bper = 100*bio / 150;
		double tper = 100*total / 450;
		double percents[] = { pper, cper, bper };

		boolean passAcheived = true;

		for (int i = 0; i < percents.length; i++) {

			System.out.println("Total percentage for  " + examNames[i] + ": " + percents[i] + "%");

			if (percents[i] < 60) {
				passAcheived = false;
				System.out.println("you have failed this exam");
			} else {
				System.out.println("you have passed this exam");
			}

		}
		System.out.println(" ");
		System.out.println("Average percentage for all exams: " + tper + "%");

		if (passAcheived) {
			System.out.println("you have passed overall");
		} else {
			System.out.println("you have failed overall");
		}

	}
}
