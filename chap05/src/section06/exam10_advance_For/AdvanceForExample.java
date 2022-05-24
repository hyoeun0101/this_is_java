package section06.exam10_advance_For;

public class AdvanceForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score: scores)
		{
			sum += score;
		}
		System.out.println("Че: "+sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("ЦђБе: "+avg);
	}

}
