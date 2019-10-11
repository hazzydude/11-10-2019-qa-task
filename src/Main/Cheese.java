package Main;

public class Cheese {

	
String type;
int weight;
int age;

public Cheese(String type, int w, int a) {
	
	this.type = type;
	this.weight=w;
	this.age = a;
	
	
}
	
	
public void age() {
	this.age ++;
}
	public void characteristics() {
		System.out.println(type);
		System.out.println(weight);
		System.out.println(age);
	}
	
	
	
}
