package Paint_Wizard;

import java.util.ArrayList;

public class PaintRoom {
	
	private int areaOfRoom;
	private ArrayList<Paint> paints;

	public PaintRoom(int areaOfRoom, ArrayList<Paint> paints) {

		this.areaOfRoom = areaOfRoom;
		this.paints = paints;

	}

	public Paint leastWaste() {

		double leastPercentageWasted = 100;
		Paint bestPaint = null;

		for (Paint p : paints) {
			double noOfCansDec = (double) areaOfRoom / p.getTotalCoverage();
			double wholeCans = Math.ceil(noOfCansDec);
			//System.out.println(wholeCans);

			double percentageWasted = 100 * (wholeCans - noOfCansDec);
			//System.out.println(Math.round(percentageWasted * 100.0) / 100.0);
			if (percentageWasted < leastPercentageWasted) {
				leastPercentageWasted = percentageWasted;
				bestPaint = p;
			}
		}

		return bestPaint;
	}

	
	
	public Paint leastCost() {
		
		double leastTotalCost = 100000000;
		Paint bestPaint = null;

		for (Paint p : paints) {
			double noOfCansDec = (double) areaOfRoom / p.getTotalCoverage();
			double wholeCans = Math.ceil(noOfCansDec);
			//System.out.println(wholeCans);
			double totalCost = p.getCost()*wholeCans;
			//System.out.println(Math.round(totalCost * 100.0) / 100.0);
			if (totalCost<leastTotalCost) {
				leastTotalCost = totalCost;
				bestPaint = p;
			}
		
			
		}
		return bestPaint;
	}
}
