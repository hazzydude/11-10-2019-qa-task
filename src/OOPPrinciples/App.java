package OOPPrinciples;


import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person("hayden",21,"Profesional dog walker");
		Person person2 = new Person("Gnanga",21,"Trainee consultant");
		Person person3 = new Person("Jack",22,"Musician");
		
		
		ArrayList <Person> people = new ArrayList<>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		for (Person p : people) {
			System.out.println(p.toString());
		}
		

		String searchedName = "Gnanga";
			for (Person p : people) {
				String name = p.getName();
				if (searchedName==name) {
					System.out.println(p.toString()); 
				}
			}
		
		
			
	}
}
