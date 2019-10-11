package Main;

public class UniqueSum {

	public int unique3sum(int a, int b, int c) {
		int total=0;
		if (a!=b & a!=c) {
			total = total + a;
		}
		if (b!=a & b!=c) {
			total = total + b;
		}
		if (c!=a & c!=b) {
			total = total + c;
		}
		
		return total;
	}
	
}
