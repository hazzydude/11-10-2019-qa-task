package Main;

import java.util.ArrayList;
import java.util.Collections;

public class BlackJack {

	
	
	
	
	public int play(int playerA, int playerB) {
		ArrayList<Integer> scores= new ArrayList<>();
		scores.add(22);
		scores.add(playerA);
		scores.add(playerB);
		Collections.sort(scores);
		
		int ind22 = scores.indexOf(22);
		
		if (ind22==0) {
			//both are bigger than 21
			System.out.println("Both bust");
			return 0;
		} else {
			return scores.get(ind22-1);
		}
		
	}
	
}
