package Paint_Wizard;

public class Paint {

	private int size;
	private double cost;
	private int coveragePerLitre;
	private int totalCoverage;
	private double totalCoveragePerCost;
	private String name;
	
	public Paint() {
		
	}

	public Paint(String name,int size, double cost, int coverage) {
		
		this.name = name;
		this.size = size;
		this.cost = cost;
		this.coveragePerLitre = coverage;
		this.totalCoverage = size*coverage;
		this.totalCoveragePerCost = totalCoverage/cost;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getTotalCoverage() {
		return totalCoverage;
	}

	public void setTotalCoverage(int coverage) {
		this.totalCoverage = coverage;
	}

	public int getCoveragePerLitre() {
		return coveragePerLitre;
	}

	public void setCoveragePerLitre(int coveragePerLitre) {
		this.coveragePerLitre = coveragePerLitre;
	}

	public double getTotalCoveragePerCost() {
		return totalCoveragePerCost;
	}

	public void setTotalCoveragePerCost(double totalCoveragePerCost) {
		this.totalCoveragePerCost = totalCoveragePerCost;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", size=" + size + ", cost=" + cost + ", totalCoverage=" + totalCoverage + "]";
	}

	

}
