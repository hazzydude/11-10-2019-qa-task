package Paint_Wizard;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
	
	
	Paint CheapoMax = new Paint("CheapoMax",21,19.99, 10);
	Paint ThatOneWithTheDog = new Paint("ThatOneWithTheDog",40,34.38,12);
	Paint AverageJoes = new Paint("AverageJoes",16,17.99,11);
	Paint DuluxourousPaints = new Paint(" DuluxourousPaints",10,25.00,22);
	
	ArrayList <Paint> paints = new ArrayList<>();
	paints.add(CheapoMax);
	paints.add(ThatOneWithTheDog);
	paints.add(AverageJoes);
	paints.add(DuluxourousPaints);

	System.out.println("Summary of available paints:");
	for (Paint p : paints) {
		System.out.println(p.toString());
	}
	System.out.println(" ");
	PaintRoom blueRoom = new PaintRoom(215, paints);
	
	Paint bestPaintForLessWaste = blueRoom.leastWaste();
	System.out.println("Best paint for least percentage waste:");
	System.out.println(bestPaintForLessWaste);
	System.out.println(" ");
	
	
	Paint bestPaintForLessCost = blueRoom.leastCost();
	System.out.println("Best paint for least total cost:");
	System.out.println(bestPaintForLessCost); 
	
	
	
	
	}
}
